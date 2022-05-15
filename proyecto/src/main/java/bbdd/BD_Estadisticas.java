package bbdd;

import java.util.Vector;
import orm.bbdd.Estadistica;
import interfaz.Estadisticas;

public class BD_Estadisticas {
	public BDPrincipal _bd_prin_estadisticas;
	public Vector<Estadistica> _contiene_estadisticas = new Vector<Estadistica>();

	public void cargarEstadisticas(Estadisticas aEstadisticas) {
		throw new UnsupportedOperationException();
	}
}