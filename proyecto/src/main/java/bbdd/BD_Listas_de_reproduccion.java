package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Actor_Comun;
import orm.bbdd.Actor_ComunDAO;
import orm.bbdd.Cancion;
import orm.bbdd.CancionDAO;
import orm.bbdd.Lista_de_reproduccion;
import orm.bbdd.Lista_de_reproduccionCriteria;
import orm.bbdd.Lista_de_reproduccionDAO;
import orm.bbdd.MDS2PersistentManager;

public class BD_Listas_de_reproduccion {
    public BDPrincipal _bd_prin_listas_de_reproduccion;
    public Vector<Lista_de_reproduccion> _contiene_listas_de_reproduccion = new Vector<Lista_de_reproduccion>();

    public void editarLista(String aNombre, int aIdLista) throws PersistentException {
        throw new UnsupportedOperationException();
    }

    public void anadir(String aNombre) throws PersistentException {
        throw new UnsupportedOperationException();
    }

    public boolean eliminarLista(int aIdListas) throws PersistentException {
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        boolean correcto = false;
        try {
            Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(aIdListas);
            correcto = Lista_de_reproduccionDAO.deleteAndDissociate(lista);
            t.commit();
        } catch (Exception e) {
            correcto = false;
            t.rollback();
        }
        return correcto;
    }

    public int crearLista(String aNombre, String[] canciones, int id) throws PersistentException {
        if (Lista_de_reproduccionDAO.listLista_de_reproduccionByQuery("Nombre = '" + aNombre + "' AND Actor_ComunId = " + id,
                "Nombre").length >= 1) {
            return -2;
        }
        Cancion[] cancions = new Cancion[canciones.length];
        int i = 0;
        for (String cancion : canciones) {
            Cancion j = CancionDAO.listCancionByQuery("titulo='" + cancion.trim() + "'", "titulo")[0];
            cancions[i] = j;
            if (j == null) {
                return -1;
            }
            i++;
        }
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            Lista_de_reproduccion lista = Lista_de_reproduccionDAO.createLista_de_reproduccion();
            lista.setNombre(aNombre);
            Actor_Comun actor = Actor_ComunDAO.getActor_ComunByORMID(id);
            lista.setCreador(actor);
            for (Cancion cancion : cancions) {
                lista.canciones.add(cancion);
            }
            Lista_de_reproduccionDAO.save(lista);

            t.commit();
        } catch (Exception e) {
            t.rollback();
            return -3;
        }
        return 1;
    }

    public Lista_de_reproduccion cargarLista(int aIdLista) {
        throw new UnsupportedOperationException();
    }

<<<<<<< HEAD
    public Lista_de_reproduccion[] cargarListaRecomendada() throws PersistentException {
        Lista_de_reproduccion[] listas = new Lista_de_reproduccion[3];

        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            listas = Lista_de_reproduccionDAO.listLista_de_reproduccionByQuery("true=true", "IdLista DESC");
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        return listas;
    }
=======
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			listas = Lista_de_reproduccionDAO.listLista_de_reproduccionByQuery("true=true", "IdLista DESC");
			t.commit();
		} catch(Exception e) {
			t.rollback();
		}
		return listas;
	}
	public Lista_de_reproduccion[] cargarListaFavorita() throws PersistentException{
		Lista_de_reproduccion[] listas = new Lista_de_reproduccion[3];

		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			listas = Lista_de_reproduccionDAO.listLista_de_reproduccionByQuery("true=true", "IdLista DESC");
			t.commit();
		} catch(Exception e) {
			t.rollback();
		}
		return listas;
	}
>>>>>>> branch 'master' of https://github.com/aca062/Repositorio-MDS2.git

    public Lista_de_reproduccion[] busquedaLista(String paramBusqueda) throws PersistentException {
        Lista_de_reproduccion[] listas = new Lista_de_reproduccion[0];

        Lista_de_reproduccionCriteria criteria = new Lista_de_reproduccionCriteria();
        String criterio = ("%" + paramBusqueda.trim().toLowerCase() + "%");
        criteria.nombre.like(criterio);
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            listas = Lista_de_reproduccionDAO.listLista_de_reproduccionByCriteria(criteria);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        return listas;
    }

    public Lista_de_reproduccion[] cargarListasPropias(int id) {
        Lista_de_reproduccion[] listasPropias;
        try {
            Actor_Comun usuario = Actor_ComunDAO.getActor_ComunByORMID(id);
            listasPropias = new Lista_de_reproduccion[usuario.listas_de_reproduccion_propias.size()];
            int j = 0;
            for (Lista_de_reproduccion lista : usuario.listas_de_reproduccion_propias.toArray()) {
                listasPropias[j] = lista;
                j++;
            }
            return listasPropias;
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public Cancion[] cargarCancionesLista(int idLista) throws PersistentException {
        Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(idLista);
        Cancion[] canciones = new Cancion[lista.canciones.size()];
        int i = 0;
        for (Cancion cancion : lista.canciones.toArray()) {
            canciones[i] = cancion;
            i++;
        }
        return canciones;
    }

}