package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.MDS2PersistentManager;
import orm.bbdd.Usuario_Registrado;
import orm.bbdd.Usuario_RegistradoDAO;
import interfaz.Usuario_registrado;

public class BD_Usuarios_Registrados {
	public BDPrincipal _bd_prin_usuarios_registrados;
	public Vector<Usuario_Registrado> _contiene_usuario_registrados = new Vector<Usuario_Registrado>();

	public void editarUsuario(String aEmail, String aContrasena, String aNick, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public void registro(String aEmail, String aContrasena, String aNick, String aImagen) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.createUsuario_Registrado();
			usuario.setEmail(aEmail);
			usuario.setContrasena(aContrasena);
			usuario.setNick(aNick);
			if (!(aImagen == null)) {
				usuario.setFoto(aImagen);
			}
			Usuario_RegistradoDAO.save(usuario);
			t.commit();

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar(int aId) {
		throw new UnsupportedOperationException();
	}

	public void darDeBaja(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public void seguirLista(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void seguir_dejarDeSeguirUsuario(String aNick) {
		throw new UnsupportedOperationException();
	}

	public void cargarUsuario(Usuario_registrado aUsuario) {
		throw new UnsupportedOperationException();
	}
}