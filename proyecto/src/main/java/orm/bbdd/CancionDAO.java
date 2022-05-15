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

public class CancionDAO {
	public static Cancion loadCancionByORMID(int idCancion) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadCancionByORMID(session, idCancion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(int idCancion) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getCancionByORMID(session, idCancion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(int idCancion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadCancionByORMID(session, idCancion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(int idCancion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getCancionByORMID(session, idCancion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(PersistentSession session, int idCancion) throws PersistentException {
		try {
			return (Cancion) session.load(Cancion.class, Integer.valueOf(idCancion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(PersistentSession session, int idCancion) throws PersistentException {
		try {
			return (Cancion) session.get(Cancion.class, Integer.valueOf(idCancion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(PersistentSession session, int idCancion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cancion) session.load(Cancion.class, Integer.valueOf(idCancion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(PersistentSession session, int idCancion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cancion) session.get(Cancion.class, Integer.valueOf(idCancion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryCancion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryCancion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Cancion as Cancion");
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
	
	public static List queryCancion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Cancion as Cancion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cancion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCancion(session, condition, orderBy);
			return (Cancion[]) list.toArray(new Cancion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCancion(session, condition, orderBy, lockMode);
			return (Cancion[]) list.toArray(new Cancion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cancion[] cancions = listCancionByQuery(session, condition, orderBy);
		if (cancions != null && cancions.length > 0)
			return cancions[0];
		else
			return null;
	}
	
	public static Cancion loadCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cancion[] cancions = listCancionByQuery(session, condition, orderBy, lockMode);
		if (cancions != null && cancions.length > 0)
			return cancions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Cancion as Cancion");
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
	
	public static java.util.Iterator iterateCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Cancion as Cancion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cancion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion createCancion() {
		return new Cancion();
	}
	
	public static boolean save(Cancion cancion) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Cancion cancion) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Cancion cancion)throws PersistentException {
		try {
			if (cancion.getEstilo() != null) {
				cancion.getEstilo().canciones.remove(cancion);
			}
			
			Actor_Comun[] lUsuarios = cancion.usuario.toArray();
			for(int i = 0; i < lUsuarios.length; i++) {
				lUsuarios[i].cancion_favorita.remove(cancion);
			}
			Estadistica[] lEstadisticass = cancion.estadisticas.toArray();
			for(int i = 0; i < lEstadisticass.length; i++) {
				lEstadisticass[i].cancions.remove(cancion);
			}
			Lista_de_reproduccion[] lListas_de_reproduccions = cancion.listas_de_reproduccion.toArray();
			for(int i = 0; i < lListas_de_reproduccions.length; i++) {
				lListas_de_reproduccions[i].canciones.remove(cancion);
			}
			Album[] lAlbums = cancion.album.toArray();
			for(int i = 0; i < lAlbums.length; i++) {
				lAlbums[i].canciones.remove(cancion);
			}
			Artista[] lArtistass = cancion.artistas.toArray();
			for(int i = 0; i < lArtistass.length; i++) {
				lArtistass[i].cancions.remove(cancion);
			}
			return delete(cancion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Cancion cancion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (cancion.getEstilo() != null) {
				cancion.getEstilo().canciones.remove(cancion);
			}
			
			Actor_Comun[] lUsuarios = cancion.usuario.toArray();
			for(int i = 0; i < lUsuarios.length; i++) {
				lUsuarios[i].cancion_favorita.remove(cancion);
			}
			Estadistica[] lEstadisticass = cancion.estadisticas.toArray();
			for(int i = 0; i < lEstadisticass.length; i++) {
				lEstadisticass[i].cancions.remove(cancion);
			}
			Lista_de_reproduccion[] lListas_de_reproduccions = cancion.listas_de_reproduccion.toArray();
			for(int i = 0; i < lListas_de_reproduccions.length; i++) {
				lListas_de_reproduccions[i].canciones.remove(cancion);
			}
			Album[] lAlbums = cancion.album.toArray();
			for(int i = 0; i < lAlbums.length; i++) {
				lAlbums[i].canciones.remove(cancion);
			}
			Artista[] lArtistass = cancion.artistas.toArray();
			for(int i = 0; i < lArtistass.length; i++) {
				lArtistass[i].cancions.remove(cancion);
			}
			try {
				session.delete(cancion);
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
	
	public static boolean refresh(Cancion cancion) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Cancion cancion) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByCriteria(CancionCriteria cancionCriteria) {
		Cancion[] cancions = listCancionByCriteria(cancionCriteria);
		if(cancions == null || cancions.length == 0) {
			return null;
		}
		return cancions[0];
	}
	
	public static Cancion[] listCancionByCriteria(CancionCriteria cancionCriteria) {
		return cancionCriteria.listCancion();
	}
}
