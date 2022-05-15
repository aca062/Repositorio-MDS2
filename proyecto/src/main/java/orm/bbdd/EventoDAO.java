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

public class EventoDAO {
	public static Evento loadEventoByORMID(int idEvento) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadEventoByORMID(session, idEvento);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento getEventoByORMID(int idEvento) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getEventoByORMID(session, idEvento);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByORMID(int idEvento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadEventoByORMID(session, idEvento, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento getEventoByORMID(int idEvento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getEventoByORMID(session, idEvento, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByORMID(PersistentSession session, int idEvento) throws PersistentException {
		try {
			return (Evento) session.load(Evento.class, Integer.valueOf(idEvento));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento getEventoByORMID(PersistentSession session, int idEvento) throws PersistentException {
		try {
			return (Evento) session.get(Evento.class, Integer.valueOf(idEvento));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByORMID(PersistentSession session, int idEvento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Evento) session.load(Evento.class, Integer.valueOf(idEvento), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento getEventoByORMID(PersistentSession session, int idEvento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Evento) session.get(Evento.class, Integer.valueOf(idEvento), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvento(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryEvento(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvento(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryEvento(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento[] listEventoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listEventoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento[] listEventoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listEventoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvento(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Evento as Evento");
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
	
	public static List queryEvento(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Evento as Evento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Evento", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento[] listEventoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEvento(session, condition, orderBy);
			return (Evento[]) list.toArray(new Evento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento[] listEventoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEvento(session, condition, orderBy, lockMode);
			return (Evento[]) list.toArray(new Evento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadEventoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadEventoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Evento[] eventos = listEventoByQuery(session, condition, orderBy);
		if (eventos != null && eventos.length > 0)
			return eventos[0];
		else
			return null;
	}
	
	public static Evento loadEventoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Evento[] eventos = listEventoByQuery(session, condition, orderBy, lockMode);
		if (eventos != null && eventos.length > 0)
			return eventos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEventoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateEventoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateEventoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Evento as Evento");
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
	
	public static java.util.Iterator iterateEventoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Evento as Evento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Evento", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento createEvento() {
		return new Evento();
	}
	
	public static boolean save(Evento evento) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(evento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Evento evento) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(evento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Evento evento)throws PersistentException {
		try {
			if (evento.getArtista() != null) {
				evento.getArtista().eventos.remove(evento);
			}
			
			Actor_Comun[] lUsuarios = evento.usuario.toArray();
			for(int i = 0; i < lUsuarios.length; i++) {
				lUsuarios[i].notificaciones.remove(evento);
			}
			return delete(evento);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Evento evento, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (evento.getArtista() != null) {
				evento.getArtista().eventos.remove(evento);
			}
			
			Actor_Comun[] lUsuarios = evento.usuario.toArray();
			for(int i = 0; i < lUsuarios.length; i++) {
				lUsuarios[i].notificaciones.remove(evento);
			}
			try {
				session.delete(evento);
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
	
	public static boolean refresh(Evento evento) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(evento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Evento evento) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(evento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByCriteria(EventoCriteria eventoCriteria) {
		Evento[] eventos = listEventoByCriteria(eventoCriteria);
		if(eventos == null || eventos.length == 0) {
			return null;
		}
		return eventos[0];
	}
	
	public static Evento[] listEventoByCriteria(EventoCriteria eventoCriteria) {
		return eventoCriteria.listEvento();
	}
}
