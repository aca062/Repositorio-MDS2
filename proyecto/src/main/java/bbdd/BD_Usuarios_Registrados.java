package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Acceso_Dato;
import orm.bbdd.Acceso_DatoDAO;
import orm.bbdd.Estadistica;
import orm.bbdd.EstadisticaDAO;
import orm.bbdd.MDS2PersistentManager;
import orm.bbdd.Usuario_Registrado;
import orm.bbdd.Usuario_RegistradoDAO;

public class BD_Usuarios_Registrados {
	public BDPrincipal _bd_prin_usuarios_registrados;
	public Vector<Usuario_Registrado> _contiene_usuario_registrados = new Vector<Usuario_Registrado>();

	public void editarUsuario(int aIdUsuario, String aEmail, String aContrasena, String aNick, String aImagen) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void registro(String aEmail, String aContrasena, String aNick, String aImagen) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.createUsuario_Registrado();
			/*BD_Usuarios_Registrados usuarios = new BD_Usuarios_Registrados();
			int id = usuarios._contiene_usuario_registrados.size() + 1;
			usuario.setId(id);*/
			Acceso_Dato accesoD = new Acceso_Dato();
			accesoD.setContrasena(aContrasena);
			accesoD.setEmail(aEmail);
			accesoD.setNumIntentos(0);
			accesoD.setTipoUsuario("usuario");
			accesoD.setFechaBloqueo("");
			Acceso_DatoDAO.save(accesoD);
			Estadistica estadistica = new Estadistica();
			estadistica.setTiempoAnual(0);
			double[] tiempoSemana = new double[7];
			estadistica.setTiempoSemana(tiempoSemana);
			//estadistica.setUsuario(usuario);
			EstadisticaDAO.save(estadistica);
			/*BD_Acceso_Datos accesosDato = new BD_Acceso_Datos();
			Acceso_Dato idAcceso = accesosDato._contiene_acceso_datos.lastElement();
			BD_Estadisticas estadisticas = new BD_Estadisticas();
			Estadistica idEstadistica = estadisticas._contiene_estadisticas.lastElement();*/
			
			usuario.setEmail(aEmail);
			usuario.setContrasena(aContrasena);
			usuario.setNick(aNick);
			usuario.setAcceso_Dato(accesoD);
			usuario.setEstadistica(estadistica);
			usuario.setFoto(aImagen);
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

	public void darDeBaja(String aEmail) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void seguirLista(int aIdLista) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void seguir_dejarDeSeguirUsuario(int aId, int aIdSeguido) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado cargarUsuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
}