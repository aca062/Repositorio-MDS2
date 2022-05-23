package bbdd;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Acceso_Dato;
import orm.bbdd.Acceso_DatoDAO;
import orm.bbdd.MDS2PersistentManager;

public class BD_Acceso_Datos {
	public BDPrincipal _bd_prin_acceso_datos;
	public Vector<Acceso_Dato> _contiene_acceso_datos = new Vector<Acceso_Dato>();

	public String inicioDeSesion(String aEmail, String aContrasena) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Acceso_Dato acceso = Acceso_DatoDAO.loadAcceso_DatoByQuery("Email = '" + aEmail + "' AND Contrasena = '" + aContrasena + "'", "Email");
			if (acceso == null) {
				return "fallo";
			}
			return acceso.getTipoUsuario();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "fallo";
	}

	public void recuperarContrasena(String aEmail) {
		throw new UnsupportedOperationException();
	}
}