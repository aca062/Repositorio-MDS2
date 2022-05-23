package bbdd;

import java.util.Vector;
import orm.bbdd.Acceso_Dato;

public class BD_Acceso_Datos {
	public BDPrincipal _bd_prin_acceso_datos;
	public Vector<Acceso_Dato> _contiene_acceso_datos = new Vector<Acceso_Dato>();

	public boolean inicioDeSesion(String aEmail, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void recuperarContrasena(String aEmail) {
		throw new UnsupportedOperationException();
	}
}