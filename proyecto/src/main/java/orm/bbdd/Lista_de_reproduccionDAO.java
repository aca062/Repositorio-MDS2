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

public class Lista_de_reproduccionDAO {
	public static Lista_de_reproduccion loadLista_de_reproduccionByORMID(int idLista) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadLista_de_reproduccionByORMID(session, idLista);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion getLista_de_reproduccionByORMID(int idLista) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getLista_de_reproduccionByORMID(session, idLista);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByORMID(int idLista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadLista_de_reproduccionByORMID(session, idLista, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion getLista_de_reproduccionByORMID(int idLista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getLista_de_reproduccionByORMID(session, idLista, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByORMID(PersistentSession session, int idLista) throws PersistentException {
		try {
			return (Lista_de_reproduccion) session.load(Lista_de_reproduccion.class, Integer.valueOf(idLista));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion getLista_de_reproduccionByORMID(PersistentSession session, int idLista) throws PersistentException {
		try {
			return (Lista_de_reproduccion) session.get(Lista_de_reproduccion.class, Integer.valueOf(idLista));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByORMID(PersistentSession session, int idLista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lista_de_reproduccion) session.load(Lista_de_reproduccion.class, Integer.valueOf(idLista), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion getLista_de_reproduccionByORMID(PersistentSession session, int idLista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lista_de_reproduccion) session.get(Lista_de_reproduccion.class, Integer.valueOf(idLista), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_de_reproduccion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryLista_de_reproduccion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_de_reproduccion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryLista_de_reproduccion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listLista_de_reproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listLista_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_de_reproduccion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Lista_de_reproduccion as Lista_de_reproduccion");
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
	
	public static List queryLista_de_reproduccion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Lista_de_reproduccion as Lista_de_reproduccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lista_de_reproduccion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLista_de_reproduccion(session, condition, orderBy);
			return (Lista_de_reproduccion[]) list.toArray(new Lista_de_reproduccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLista_de_reproduccion(session, condition, orderBy, lockMode);
			return (Lista_de_reproduccion[]) list.toArray(new Lista_de_reproduccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadLista_de_reproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadLista_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Lista_de_reproduccion[] lista_de_reproduccions = listLista_de_reproduccionByQuery(session, condition, orderBy);
		if (lista_de_reproduccions != null && lista_de_reproduccions.length > 0)
			return lista_de_reproduccions[0];
		else
			return null;
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Lista_de_reproduccion[] lista_de_reproduccions = listLista_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		if (lista_de_reproduccions != null && lista_de_reproduccions.length > 0)
			return lista_de_reproduccions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLista_de_reproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateLista_de_reproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLista_de_reproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateLista_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Lista_de_reproduccion as Lista_de_reproduccion");
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
	
	public static java.util.Iterator iterateLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Lista_de_reproduccion as Lista_de_reproduccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lista_de_reproduccion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion createLista_de_reproduccion() {
		return new Lista_de_reproduccion();
	}
	
	public static boolean save(Lista_de_reproduccion lista_de_reproduccion) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(lista_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Lista_de_reproduccion lista_de_reproduccion) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(lista_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Lista_de_reproduccion lista_de_reproduccion)throws PersistentException {
		try {
			Actor_Comun[] lSeguidors = lista_de_reproduccion.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].listas_de_reproduccion_seguidas.remove(lista_de_reproduccion);
			}
			Cancion[] lCancioness = lista_de_reproduccion.canciones.toArray();
			for(int i = 0; i < lCancioness.length; i++) {
				lCancioness[i].listas_de_reproduccion.remove(lista_de_reproduccion);
			}
			Estadistica[] lEstadisticass = lista_de_reproduccion.estadisticas.toArray();
			for(int i = 0; i < lEstadisticass.length; i++) {
				lEstadisticass[i].lista_de_reproduccion.remove(lista_de_reproduccion);
			}
			if (lista_de_reproduccion.getCreador() != null) {
				lista_de_reproduccion.getCreador().listas_de_reproduccion_propias.remove(lista_de_reproduccion);
			}
			
			return delete(lista_de_reproduccion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Lista_de_reproduccion lista_de_reproduccion, org.orm.PersistentSession session)throws PersistentException {
		try {
			Actor_Comun[] lSeguidors = lista_de_reproduccion.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].listas_de_reproduccion_seguidas.remove(lista_de_reproduccion);
			}
			Cancion[] lCancioness = lista_de_reproduccion.canciones.toArray();
			for(int i = 0; i < lCancioness.length; i++) {
				lCancioness[i].listas_de_reproduccion.remove(lista_de_reproduccion);
			}
			Estadistica[] lEstadisticass = lista_de_reproduccion.estadisticas.toArray();
			for(int i = 0; i < lEstadisticass.length; i++) {
				lEstadisticass[i].lista_de_reproduccion.remove(lista_de_reproduccion);
			}
			if (lista_de_reproduccion.getCreador() != null) {
				lista_de_reproduccion.getCreador().listas_de_reproduccion_propias.remove(lista_de_reproduccion);
			}
			
			try {
				session.delete(lista_de_reproduccion);
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
	
	public static boolean refresh(Lista_de_reproduccion lista_de_reproduccion) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(lista_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Lista_de_reproduccion lista_de_reproduccion) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(lista_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByCriteria(Lista_de_reproduccionCriteria lista_de_reproduccionCriteria) {
		Lista_de_reproduccion[] lista_de_reproduccions = listLista_de_reproduccionByCriteria(lista_de_reproduccionCriteria);
		if(lista_de_reproduccions == null || lista_de_reproduccions.length == 0) {
			return null;
		}
		return lista_de_reproduccions[0];
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByCriteria(Lista_de_reproduccionCriteria lista_de_reproduccionCriteria) {
		return lista_de_reproduccionCriteria.listLista_de_reproduccion();
	}
}
