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

public class Acceso_DatoDAO {
	public static Acceso_Dato loadAcceso_DatoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadAcceso_DatoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato getAcceso_DatoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getAcceso_DatoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato loadAcceso_DatoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadAcceso_DatoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato getAcceso_DatoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getAcceso_DatoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato loadAcceso_DatoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Acceso_Dato) session.load(Acceso_Dato.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato getAcceso_DatoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Acceso_Dato) session.get(Acceso_Dato.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato loadAcceso_DatoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Acceso_Dato) session.load(Acceso_Dato.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato getAcceso_DatoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Acceso_Dato) session.get(Acceso_Dato.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAcceso_Dato(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryAcceso_Dato(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAcceso_Dato(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryAcceso_Dato(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato[] listAcceso_DatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listAcceso_DatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato[] listAcceso_DatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listAcceso_DatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAcceso_Dato(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Acceso_Dato as Acceso_Dato");
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
	
	public static List queryAcceso_Dato(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Acceso_Dato as Acceso_Dato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Acceso_Dato", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato[] listAcceso_DatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAcceso_Dato(session, condition, orderBy);
			return (Acceso_Dato[]) list.toArray(new Acceso_Dato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato[] listAcceso_DatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAcceso_Dato(session, condition, orderBy, lockMode);
			return (Acceso_Dato[]) list.toArray(new Acceso_Dato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato loadAcceso_DatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadAcceso_DatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato loadAcceso_DatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadAcceso_DatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato loadAcceso_DatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Acceso_Dato[] acceso_Datos = listAcceso_DatoByQuery(session, condition, orderBy);
		if (acceso_Datos != null && acceso_Datos.length > 0)
			return acceso_Datos[0];
		else
			return null;
	}
	
	public static Acceso_Dato loadAcceso_DatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Acceso_Dato[] acceso_Datos = listAcceso_DatoByQuery(session, condition, orderBy, lockMode);
		if (acceso_Datos != null && acceso_Datos.length > 0)
			return acceso_Datos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAcceso_DatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateAcceso_DatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAcceso_DatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateAcceso_DatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAcceso_DatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Acceso_Dato as Acceso_Dato");
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
	
	public static java.util.Iterator iterateAcceso_DatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Acceso_Dato as Acceso_Dato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Acceso_Dato", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato createAcceso_Dato() {
		return new Acceso_Dato();
	}
	
	public static boolean save(Acceso_Dato acceso_Dato) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(acceso_Dato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Acceso_Dato acceso_Dato) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(acceso_Dato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Acceso_Dato acceso_Dato)throws PersistentException {
		try {
			if (acceso_Dato.getUsuario() != null) {
				acceso_Dato.getUsuario().setAcceso_Dato(null);
			}
			
			return delete(acceso_Dato);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Acceso_Dato acceso_Dato, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (acceso_Dato.getUsuario() != null) {
				acceso_Dato.getUsuario().setAcceso_Dato(null);
			}
			
			try {
				session.delete(acceso_Dato);
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
	
	public static boolean refresh(Acceso_Dato acceso_Dato) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(acceso_Dato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Acceso_Dato acceso_Dato) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(acceso_Dato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Acceso_Dato loadAcceso_DatoByCriteria(Acceso_DatoCriteria acceso_DatoCriteria) {
		Acceso_Dato[] acceso_Datos = listAcceso_DatoByCriteria(acceso_DatoCriteria);
		if(acceso_Datos == null || acceso_Datos.length == 0) {
			return null;
		}
		return acceso_Datos[0];
	}
	
	public static Acceso_Dato[] listAcceso_DatoByCriteria(Acceso_DatoCriteria acceso_DatoCriteria) {
		return acceso_DatoCriteria.listAcceso_Dato();
	}
}
