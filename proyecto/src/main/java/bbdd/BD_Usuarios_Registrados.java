package bbdd;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Acceso_Dato;
import orm.bbdd.Acceso_DatoDAO;
import orm.bbdd.Actor_Comun;
import orm.bbdd.Actor_ComunDAO;
import orm.bbdd.Estadistica;
import orm.bbdd.EstadisticaDAO;
import orm.bbdd.Lista_de_reproduccion;
import orm.bbdd.Lista_de_reproduccionDAO;
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

	public void eliminarUsuario(int aIdUsuario) throws PersistentException{
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(aIdUsuario);
			Usuario_RegistradoDAO.delete(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
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
	
	public Usuario_Registrado[] cargarListaSeguidores(int aIdUsuario) throws PersistentException{
		List<Usuario_Registrado> seguidores = new Vector<Usuario_Registrado>();
		
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			
			Actor_Comun usuario = Actor_ComunDAO.getActor_ComunByORMID(aIdUsuario);
			Iterator<Actor_Comun> i = usuario.seguidor.getIterator();
			
			Actor_Comun ac;
			
			while(i.hasNext()) {
				ac = i.next();
				if(ac instanceof Actor_Comun) {
					seguidores.add((Usuario_Registrado)ac);
				}
			}
			
			t.commit();
		} catch(Exception e) {
			t.rollback();
		}
		return seguidores.toArray(new Usuario_Registrado[seguidores.size()]);
	}
	public Usuario_Registrado[] cargarListaSeguidos(int aIdUsuario) throws PersistentException{
		List<Usuario_Registrado> seguidos = new Vector<Usuario_Registrado>();
		
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			
			Actor_Comun usuario = Actor_ComunDAO.getActor_ComunByORMID(aIdUsuario);
			Iterator<Actor_Comun> i = usuario.seguido.getIterator();
			
			Actor_Comun ac;
			
			while(i.hasNext()) {
				ac = i.next();
				if(ac instanceof Actor_Comun) {
					seguidos.add((Usuario_Registrado)ac);
				}
			}
			
			t.commit();
		} catch(Exception e) {
			t.rollback();
		}
		return seguidos.toArray(new Usuario_Registrado[seguidos.size()]);
	}
}