package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Estadistica;
import orm.bbdd.EstadisticaDAO;
import orm.bbdd.MDS2PersistentManager;

public class BD_Estadisticas {
	public BDPrincipal _bd_prin_estadisticas;
	public Vector<Estadistica> _contiene_estadisticas = new Vector<Estadistica>();

	public Estadistica cargarEstadisticas(int aIdEstadisticas) {
		throw new UnsupportedOperationException();
	}

    public boolean eliminarEstadistica(int id) throws PersistentException {
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        boolean correcto = false;
        try {
            Estadistica estadistica = EstadisticaDAO.getEstadisticaByORMID(id);
            correcto = EstadisticaDAO.delete(estadistica);
            t.commit();
        } catch (Exception e) {
            correcto = false;
            t.rollback();
        }
        return correcto;

    }
}