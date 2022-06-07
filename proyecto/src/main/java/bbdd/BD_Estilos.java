package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Estilo;
import orm.bbdd.EstiloCriteria;
import orm.bbdd.EstiloDAO;
import orm.bbdd.MDS2PersistentManager;

public class BD_Estilos {
    public BDPrincipal _bd_prin_estilos;
    public Vector<Estilo> _contiene_estilos = new Vector<Estilo>();

    public int altaEstilo(String aNombre, int aIdEstilo) throws PersistentException {
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            Estilo estilo = EstiloDAO.createEstilo();
            estilo.setNombre(aNombre);
            if (!EstiloDAO.save(estilo)) {
                return -1;
            }
            t.commit();
            return 1;
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return -1;
    }

    public int editarEstilo(String aNombre, int aIdEstilo) throws PersistentException {
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            Estilo estilo = EstiloDAO.loadEstiloByORMID(aIdEstilo);
            estilo.setNombre(aNombre);
            estilo.getIdEstilo();
            if (!EstiloDAO.save(estilo)) {
                return -1;
            }
            t.commit();
            return 1;
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return -1;
    }

    public boolean eliminarEstilo(int aIdEstilo) throws PersistentException {
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        boolean correcto = false;
        try {
            Estilo estilo = EstiloDAO.getEstiloByORMID(aIdEstilo);
            if (estilo.artistas.size() == 0 && estilo.canciones.size() == 0) {
                correcto = EstiloDAO.delete(estilo);
                t.commit();
            }
        } catch (Exception e) {
            correcto = false;
            t.rollback();
        }
        return correcto;
    }

    public Estilo[] cargarEstilo() throws PersistentException {
        Estilo[] estilos = null;

        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {

            estilos = EstiloDAO.listEstiloByQuery("true=true", "Nombre");

            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

        return estilos;
    }

    public void altaCancion(String aEstilos) {
        throw new UnsupportedOperationException();
    }

    public void editarCancion(String aEstilos) {
        throw new UnsupportedOperationException();
    }

    public Estilo[] busquedaEstilos(String paramBusqueda) throws PersistentException {
        Estilo[] estilos = new Estilo[0];

        EstiloCriteria criteria = new EstiloCriteria();
        String criterio = ("%" + paramBusqueda.trim().toLowerCase() + "%");
        criteria.nombre.like(criterio);
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            estilos = EstiloDAO.listEstiloByCriteria(criteria);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        return estilos;
    }
}