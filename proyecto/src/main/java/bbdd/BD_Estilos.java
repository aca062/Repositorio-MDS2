package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Estilo;
import orm.bbdd.EstiloDAO;
import orm.bbdd.MDS2PersistentManager;

public class BD_Estilos {
	public BDPrincipal _bd_prin_estilos;
	public Vector<Estilo> _contiene_estilos = new Vector<Estilo>();

	public int altaEstilo(String aNombre, int aIdEstilo) throws PersistentException{
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

	public void editarEstilo(String aNombre, int aIdEstilo) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void eliminar(int aId) {
		throw new UnsupportedOperationException();
	}

	public Estilo cargarEstilo(int aIdEstilo) {
		throw new UnsupportedOperationException();
	}

	public void altaCancion(String aEstilos) {
		throw new UnsupportedOperationException();
	}

	public void editarCancion(String aEstilos) {
		throw new UnsupportedOperationException();
	}
}