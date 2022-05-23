/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Antonio Jesús Cano Andreu(University of Almeria)
 * License Type: Academic
 */
package orm.bbdd;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Usuario_RegistradoDAO {
	public static Usuario_Registrado loadUsuario_RegistradoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadUsuario_RegistradoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado getUsuario_RegistradoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getUsuario_RegistradoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadUsuario_RegistradoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado getUsuario_RegistradoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getUsuario_RegistradoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Usuario_Registrado) session.load(Usuario_Registrado.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado getUsuario_RegistradoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Usuario_Registrado) session.get(Usuario_Registrado.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_Registrado) session.load(Usuario_Registrado.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado getUsuario_RegistradoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_Registrado) session.get(Usuario_Registrado.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryUsuario_Registrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryUsuario_Registrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listUsuario_RegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listUsuario_RegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Usuario_Registrado as Usuario_Registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Usuario_Registrado as Usuario_Registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_Registrado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_Registrado(session, condition, orderBy);
			return (Usuario_Registrado[]) list.toArray(new Usuario_Registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_Registrado(session, condition, orderBy, lockMode);
			return (Usuario_Registrado[]) list.toArray(new Usuario_Registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadUsuario_RegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadUsuario_RegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_Registrado[] usuario_Registrados = listUsuario_RegistradoByQuery(session, condition, orderBy);
		if (usuario_Registrados != null && usuario_Registrados.length > 0)
			return usuario_Registrados[0];
		else
			return null;
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_Registrado[] usuario_Registrados = listUsuario_RegistradoByQuery(session, condition, orderBy, lockMode);
		if (usuario_Registrados != null && usuario_Registrados.length > 0)
			return usuario_Registrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_RegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateUsuario_RegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_RegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateUsuario_RegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Usuario_Registrado as Usuario_Registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Usuario_Registrado as Usuario_Registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_Registrado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado createUsuario_Registrado() {
		return new Usuario_Registrado();
	}
	
	public static boolean save(Usuario_Registrado usuario_Registrado) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(usuario_Registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Usuario_Registrado usuario_Registrado) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(usuario_Registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Usuario_Registrado usuario_Registrado)throws PersistentException {
		try {
			if (usuario_Registrado.getAcceso_Dato() != null) {
				usuario_Registrado.getAcceso_Dato().setUsuario(null);
			}
			
			if (usuario_Registrado.getEstadistica() != null) {
				usuario_Registrado.getEstadistica().setUsuario(null);
			}
			
			Lista_de_reproduccion[] lListas_de_reproduccion_propiass = usuario_Registrado.listas_de_reproduccion_propias.toArray();
			for(int i = 0; i < lListas_de_reproduccion_propiass.length; i++) {
				lListas_de_reproduccion_propiass[i].setCreador(null);
			}
			Actor_Comun[] lSeguidos = usuario_Registrado.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(usuario_Registrado);
			}
			Cancion[] lCancion_favoritas = usuario_Registrado.cancion_favorita.toArray();
			for(int i = 0; i < lCancion_favoritas.length; i++) {
				lCancion_favoritas[i].usuario.remove(usuario_Registrado);
			}
			Lista_de_reproduccion[] lListas_de_reproduccion_seguidass = usuario_Registrado.listas_de_reproduccion_seguidas.toArray();
			for(int i = 0; i < lListas_de_reproduccion_seguidass.length; i++) {
				lListas_de_reproduccion_seguidass[i].seguidor.remove(usuario_Registrado);
			}
			Evento[] lNotificacioness = usuario_Registrado.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].usuario.remove(usuario_Registrado);
			}
			Actor_Comun[] lSeguidors = usuario_Registrado.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguido.remove(usuario_Registrado);
			}
			return delete(usuario_Registrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Usuario_Registrado usuario_Registrado, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (usuario_Registrado.getAcceso_Dato() != null) {
				usuario_Registrado.getAcceso_Dato().setUsuario(null);
			}
			
			if (usuario_Registrado.getEstadistica() != null) {
				usuario_Registrado.getEstadistica().setUsuario(null);
			}
			
			Lista_de_reproduccion[] lListas_de_reproduccion_propiass = usuario_Registrado.listas_de_reproduccion_propias.toArray();
			for(int i = 0; i < lListas_de_reproduccion_propiass.length; i++) {
				lListas_de_reproduccion_propiass[i].setCreador(null);
			}
			Actor_Comun[] lSeguidos = usuario_Registrado.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(usuario_Registrado);
			}
			Cancion[] lCancion_favoritas = usuario_Registrado.cancion_favorita.toArray();
			for(int i = 0; i < lCancion_favoritas.length; i++) {
				lCancion_favoritas[i].usuario.remove(usuario_Registrado);
			}
			Lista_de_reproduccion[] lListas_de_reproduccion_seguidass = usuario_Registrado.listas_de_reproduccion_seguidas.toArray();
			for(int i = 0; i < lListas_de_reproduccion_seguidass.length; i++) {
				lListas_de_reproduccion_seguidass[i].seguidor.remove(usuario_Registrado);
			}
			Evento[] lNotificacioness = usuario_Registrado.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].usuario.remove(usuario_Registrado);
			}
			Actor_Comun[] lSeguidors = usuario_Registrado.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguido.remove(usuario_Registrado);
			}
			try {
				session.delete(usuario_Registrado);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Usuario_Registrado usuario_Registrado) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(usuario_Registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Usuario_Registrado usuario_Registrado) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(usuario_Registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByCriteria(Usuario_RegistradoCriteria usuario_RegistradoCriteria) {
		Usuario_Registrado[] usuario_Registrados = listUsuario_RegistradoByCriteria(usuario_RegistradoCriteria);
		if(usuario_Registrados == null || usuario_Registrados.length == 0) {
			return null;
		}
		return usuario_Registrados[0];
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByCriteria(Usuario_RegistradoCriteria usuario_RegistradoCriteria) {
		return usuario_RegistradoCriteria.listUsuario_Registrado();
	}
}
