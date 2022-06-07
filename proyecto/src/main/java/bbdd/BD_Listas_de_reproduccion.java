package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Lista_de_reproduccion;
import orm.bbdd.Lista_de_reproduccionCriteria;
import orm.bbdd.Lista_de_reproduccionDAO;
import orm.bbdd.MDS2PersistentManager;

public class BD_Listas_de_reproduccion {
	public BDPrincipal _bd_prin_listas_de_reproduccion;
	public Vector<Lista_de_reproduccion> _contiene_listas_de_reproduccion = new Vector<Lista_de_reproduccion>();

	public void editarLista(String aNombre, int aIdLista) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void anadir(String aNombre) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public boolean eliminarLista(int aIdListas) throws PersistentException{
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

	public void crearLista(String aNombre) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion cargarLista(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion[] cargarListaRecomendada(int aIdUsuario) throws PersistentException{
		Lista_de_reproduccion[] listas = new Lista_de_reproduccion[0];

		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			listas = Lista_de_reproduccionDAO.listLista_de_reproduccionByQuery(null, null);
			//TODO Decidir forma de elegir albumes recomendados
			t.commit();
		} catch(Exception e) {
			t.rollback();
		}
		return listas;
	}

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

}