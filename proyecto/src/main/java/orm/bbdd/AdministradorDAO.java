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

public class AdministradorDAO {
	public static Administrador loadAdministradorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getAdministradorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getAdministradorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Administrador) session.load(orm.bbdd.Administrador.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Administrador) session.get(orm.bbdd.Administrador.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrador) session.load(orm.bbdd.Administrador.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrador) session.get(orm.bbdd.Administrador.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.bbdd.Administrador as Administrador");
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
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.bbdd.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy);
			return (Administrador[]) list.toArray(new Administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy, lockMode);
			return (Administrador[]) list.toArray(new Administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Administrador[] administradors = listAdministradorByQuery(session, condition, orderBy);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static Administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Administrador[] administradors = listAdministradorByQuery(session, condition, orderBy, lockMode);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.bbdd.Administrador as Administrador");
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
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.bbdd.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador createAdministrador() {
		return new orm.bbdd.Administrador();
	}
	
	public static boolean save(orm.bbdd.Administrador administrador) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.bbdd.Administrador administrador) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.bbdd.Administrador administrador)throws PersistentException {
		try {
			orm.bbdd.Cancion[] lCancionss = administrador.cancions.toArray();
			for(int i = 0; i < lCancionss.length; i++) {
				lCancionss[i].setAdministrador(null);
			}
			if (administrador.getAcceso_Dato() != null) {
				administrador.getAcceso_Dato().setUsuario(null);
			}
			
			if (administrador.getEstadistica() != null) {
				administrador.getEstadistica().setUsuario(null);
			}
			
			orm.bbdd.Lista_de_reproduccion[] lListas_de_reproduccion_propiass = administrador.listas_de_reproduccion_propias.toArray();
			for(int i = 0; i < lListas_de_reproduccion_propiass.length; i++) {
				lListas_de_reproduccion_propiass[i].setCreador(null);
			}
			orm.bbdd.Actor_Comun[] lSeguidos = administrador.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(administrador);
			}
			orm.bbdd.Cancion[] lCancion_favoritas = administrador.cancion_favorita.toArray();
			for(int i = 0; i < lCancion_favoritas.length; i++) {
				lCancion_favoritas[i].usuario.remove(administrador);
			}
			orm.bbdd.Lista_de_reproduccion[] lListas_de_reproduccion_seguidass = administrador.listas_de_reproduccion_seguidas.toArray();
			for(int i = 0; i < lListas_de_reproduccion_seguidass.length; i++) {
				lListas_de_reproduccion_seguidass[i].seguidor.remove(administrador);
			}
			orm.bbdd.Evento[] lNotificacioness = administrador.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].usuario.remove(administrador);
			}
			orm.bbdd.Actor_Comun[] lSeguidors = administrador.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguido.remove(administrador);
			}
			orm.bbdd.Cancion[] lCanciones_reproducidass = administrador.canciones_reproducidas.toArray();
			for(int i = 0; i < lCanciones_reproducidass.length; i++) {
				lCanciones_reproducidass[i]._usuario.remove(administrador);
			}
			return delete(administrador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.bbdd.Administrador administrador, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.bbdd.Cancion[] lCancionss = administrador.cancions.toArray();
			for(int i = 0; i < lCancionss.length; i++) {
				lCancionss[i].setAdministrador(null);
			}
			if (administrador.getAcceso_Dato() != null) {
				administrador.getAcceso_Dato().setUsuario(null);
			}
			
			if (administrador.getEstadistica() != null) {
				administrador.getEstadistica().setUsuario(null);
			}
			
			orm.bbdd.Lista_de_reproduccion[] lListas_de_reproduccion_propiass = administrador.listas_de_reproduccion_propias.toArray();
			for(int i = 0; i < lListas_de_reproduccion_propiass.length; i++) {
				lListas_de_reproduccion_propiass[i].setCreador(null);
			}
			orm.bbdd.Actor_Comun[] lSeguidos = administrador.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(administrador);
			}
			orm.bbdd.Cancion[] lCancion_favoritas = administrador.cancion_favorita.toArray();
			for(int i = 0; i < lCancion_favoritas.length; i++) {
				lCancion_favoritas[i].usuario.remove(administrador);
			}
			orm.bbdd.Lista_de_reproduccion[] lListas_de_reproduccion_seguidass = administrador.listas_de_reproduccion_seguidas.toArray();
			for(int i = 0; i < lListas_de_reproduccion_seguidass.length; i++) {
				lListas_de_reproduccion_seguidass[i].seguidor.remove(administrador);
			}
			orm.bbdd.Evento[] lNotificacioness = administrador.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].usuario.remove(administrador);
			}
			orm.bbdd.Actor_Comun[] lSeguidors = administrador.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguido.remove(administrador);
			}
			orm.bbdd.Cancion[] lCanciones_reproducidass = administrador.canciones_reproducidas.toArray();
			for(int i = 0; i < lCanciones_reproducidass.length; i++) {
				lCanciones_reproducidass[i]._usuario.remove(administrador);
			}
			try {
				session.delete(administrador);
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
	
	public static boolean refresh(orm.bbdd.Administrador administrador) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.bbdd.Administrador administrador) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
		Administrador[] administradors = listAdministradorByCriteria(administradorCriteria);
		if(administradors == null || administradors.length == 0) {
			return null;
		}
		return administradors[0];
	}
	
	public static Administrador[] listAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
		return administradorCriteria.listAdministrador();
	}
}
