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

public class EstiloDAO {
	public static Estilo loadEstiloByORMID(int idEstilo) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadEstiloByORMID(session, idEstilo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo getEstiloByORMID(int idEstilo) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getEstiloByORMID(session, idEstilo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByORMID(int idEstilo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadEstiloByORMID(session, idEstilo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo getEstiloByORMID(int idEstilo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getEstiloByORMID(session, idEstilo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByORMID(PersistentSession session, int idEstilo) throws PersistentException {
		try {
			return (Estilo) session.load(Estilo.class, Integer.valueOf(idEstilo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo getEstiloByORMID(PersistentSession session, int idEstilo) throws PersistentException {
		try {
			return (Estilo) session.get(Estilo.class, Integer.valueOf(idEstilo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByORMID(PersistentSession session, int idEstilo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estilo) session.load(Estilo.class, Integer.valueOf(idEstilo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo getEstiloByORMID(PersistentSession session, int idEstilo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estilo) session.get(Estilo.class, Integer.valueOf(idEstilo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstilo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryEstilo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstilo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryEstilo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo[] listEstiloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listEstiloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo[] listEstiloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listEstiloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstilo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Estilo as Estilo");
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
	
	public static List queryEstilo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Estilo as Estilo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estilo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo[] listEstiloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstilo(session, condition, orderBy);
			return (Estilo[]) list.toArray(new Estilo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo[] listEstiloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstilo(session, condition, orderBy, lockMode);
			return (Estilo[]) list.toArray(new Estilo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadEstiloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadEstiloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estilo[] estilos = listEstiloByQuery(session, condition, orderBy);
		if (estilos != null && estilos.length > 0)
			return estilos[0];
		else
			return null;
	}
	
	public static Estilo loadEstiloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estilo[] estilos = listEstiloByQuery(session, condition, orderBy, lockMode);
		if (estilos != null && estilos.length > 0)
			return estilos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstiloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateEstiloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstiloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateEstiloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstiloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Estilo as Estilo");
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
	
	public static java.util.Iterator iterateEstiloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Estilo as Estilo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estilo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo createEstilo() {
		return new Estilo();
	}
	
	public static boolean save(Estilo estilo) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(estilo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Estilo estilo) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(estilo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Estilo estilo)throws PersistentException {
		try {
			Cancion[] lCancioness = estilo.canciones.toArray();
			for(int i = 0; i < lCancioness.length; i++) {
				lCancioness[i].setEstilo(null);
			}
			Artista[] lArtistass = estilo.artistas.toArray();
			for(int i = 0; i < lArtistass.length; i++) {
				lArtistass[i].estilos.remove(estilo);
			}
			return delete(estilo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Estilo estilo, org.orm.PersistentSession session)throws PersistentException {
		try {
			Cancion[] lCancioness = estilo.canciones.toArray();
			for(int i = 0; i < lCancioness.length; i++) {
				lCancioness[i].setEstilo(null);
			}
			Artista[] lArtistass = estilo.artistas.toArray();
			for(int i = 0; i < lArtistass.length; i++) {
				lArtistass[i].estilos.remove(estilo);
			}
			try {
				session.delete(estilo);
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
	
	public static boolean refresh(Estilo estilo) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(estilo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Estilo estilo) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(estilo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByCriteria(EstiloCriteria estiloCriteria) {
		Estilo[] estilos = listEstiloByCriteria(estiloCriteria);
		if(estilos == null || estilos.length == 0) {
			return null;
		}
		return estilos[0];
	}
	
	public static Estilo[] listEstiloByCriteria(EstiloCriteria estiloCriteria) {
		return estiloCriteria.listEstilo();
	}
}
