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

public class Actor_ComunDAO {
	public static Actor_Comun loadActor_ComunByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadActor_ComunByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun getActor_ComunByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getActor_ComunByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun loadActor_ComunByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadActor_ComunByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun getActor_ComunByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getActor_ComunByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun loadActor_ComunByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Actor_Comun) session.load(Actor_Comun.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun getActor_ComunByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Actor_Comun) session.get(Actor_Comun.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun loadActor_ComunByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Actor_Comun) session.load(Actor_Comun.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun getActor_ComunByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Actor_Comun) session.get(Actor_Comun.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActor_Comun(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryActor_Comun(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActor_Comun(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryActor_Comun(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun[] listActor_ComunByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listActor_ComunByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun[] listActor_ComunByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listActor_ComunByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActor_Comun(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Actor_Comun as Actor_Comun");
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
	
	public static List queryActor_Comun(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Actor_Comun as Actor_Comun");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Actor_Comun", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun[] listActor_ComunByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActor_Comun(session, condition, orderBy);
			return (Actor_Comun[]) list.toArray(new Actor_Comun[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun[] listActor_ComunByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActor_Comun(session, condition, orderBy, lockMode);
			return (Actor_Comun[]) list.toArray(new Actor_Comun[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun loadActor_ComunByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadActor_ComunByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun loadActor_ComunByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadActor_ComunByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun loadActor_ComunByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Actor_Comun[] actor_Comuns = listActor_ComunByQuery(session, condition, orderBy);
		if (actor_Comuns != null && actor_Comuns.length > 0)
			return actor_Comuns[0];
		else
			return null;
	}
	
	public static Actor_Comun loadActor_ComunByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Actor_Comun[] actor_Comuns = listActor_ComunByQuery(session, condition, orderBy, lockMode);
		if (actor_Comuns != null && actor_Comuns.length > 0)
			return actor_Comuns[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActor_ComunByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateActor_ComunByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActor_ComunByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateActor_ComunByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActor_ComunByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Actor_Comun as Actor_Comun");
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
	
	public static java.util.Iterator iterateActor_ComunByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Actor_Comun as Actor_Comun");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Actor_Comun", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun createActor_Comun() {
		return new Actor_Comun();
	}
	
	public static boolean save(Actor_Comun actor_Comun) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(actor_Comun);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Actor_Comun actor_Comun) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(actor_Comun);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Actor_Comun actor_Comun)throws PersistentException {
		if (actor_Comun instanceof Administrador) {
			return AdministradorDAO.deleteAndDissociate((Administrador) actor_Comun);
		}
		
		if (actor_Comun instanceof Artista) {
			return ArtistaDAO.deleteAndDissociate((Artista) actor_Comun);
		}
		
		if (actor_Comun instanceof Usuario_Registrado) {
			return Usuario_RegistradoDAO.deleteAndDissociate((Usuario_Registrado) actor_Comun);
		}
		
		try {
			if (actor_Comun.getAcceso_Dato() != null) {
				actor_Comun.getAcceso_Dato().setUsuario(null);
			}
			
			if (actor_Comun.getEstadistica() != null) {
				actor_Comun.getEstadistica().setUsuario(null);
			}
			
			Lista_de_reproduccion[] lListas_de_reproduccion_propiass = actor_Comun.listas_de_reproduccion_propias.toArray();
			for(int i = 0; i < lListas_de_reproduccion_propiass.length; i++) {
				lListas_de_reproduccion_propiass[i].setCreador(null);
			}
			Actor_Comun[] lSeguidos = actor_Comun.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(actor_Comun);
			}
			Cancion[] lCancion_favoritas = actor_Comun.cancion_favorita.toArray();
			for(int i = 0; i < lCancion_favoritas.length; i++) {
				lCancion_favoritas[i].usuario.remove(actor_Comun);
			}
			Lista_de_reproduccion[] lListas_de_reproduccion_seguidass = actor_Comun.listas_de_reproduccion_seguidas.toArray();
			for(int i = 0; i < lListas_de_reproduccion_seguidass.length; i++) {
				lListas_de_reproduccion_seguidass[i].seguidor.remove(actor_Comun);
			}
			Evento[] lNotificacioness = actor_Comun.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].usuario.remove(actor_Comun);
			}
			Actor_Comun[] lSeguidors = actor_Comun.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguido.remove(actor_Comun);
			}
			return delete(actor_Comun);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Actor_Comun actor_Comun, org.orm.PersistentSession session)throws PersistentException {
		if (actor_Comun instanceof Administrador) {
			return AdministradorDAO.deleteAndDissociate((Administrador) actor_Comun, session);
		}
		
		if (actor_Comun instanceof Artista) {
			return ArtistaDAO.deleteAndDissociate((Artista) actor_Comun, session);
		}
		
		if (actor_Comun instanceof Usuario_Registrado) {
			return Usuario_RegistradoDAO.deleteAndDissociate((Usuario_Registrado) actor_Comun, session);
		}
		
		try {
			if (actor_Comun.getAcceso_Dato() != null) {
				actor_Comun.getAcceso_Dato().setUsuario(null);
			}
			
			if (actor_Comun.getEstadistica() != null) {
				actor_Comun.getEstadistica().setUsuario(null);
			}
			
			Lista_de_reproduccion[] lListas_de_reproduccion_propiass = actor_Comun.listas_de_reproduccion_propias.toArray();
			for(int i = 0; i < lListas_de_reproduccion_propiass.length; i++) {
				lListas_de_reproduccion_propiass[i].setCreador(null);
			}
			Actor_Comun[] lSeguidos = actor_Comun.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(actor_Comun);
			}
			Cancion[] lCancion_favoritas = actor_Comun.cancion_favorita.toArray();
			for(int i = 0; i < lCancion_favoritas.length; i++) {
				lCancion_favoritas[i].usuario.remove(actor_Comun);
			}
			Lista_de_reproduccion[] lListas_de_reproduccion_seguidass = actor_Comun.listas_de_reproduccion_seguidas.toArray();
			for(int i = 0; i < lListas_de_reproduccion_seguidass.length; i++) {
				lListas_de_reproduccion_seguidass[i].seguidor.remove(actor_Comun);
			}
			Evento[] lNotificacioness = actor_Comun.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].usuario.remove(actor_Comun);
			}
			Actor_Comun[] lSeguidors = actor_Comun.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguido.remove(actor_Comun);
			}
			try {
				session.delete(actor_Comun);
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
	
	public static boolean refresh(Actor_Comun actor_Comun) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(actor_Comun);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Actor_Comun actor_Comun) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(actor_Comun);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actor_Comun loadActor_ComunByCriteria(Actor_ComunCriteria actor_ComunCriteria) {
		Actor_Comun[] actor_Comuns = listActor_ComunByCriteria(actor_ComunCriteria);
		if(actor_Comuns == null || actor_Comuns.length == 0) {
			return null;
		}
		return actor_Comuns[0];
	}
	
	public static Actor_Comun[] listActor_ComunByCriteria(Actor_ComunCriteria actor_ComunCriteria) {
		return actor_ComunCriteria.listActor_Comun();
	}
}
