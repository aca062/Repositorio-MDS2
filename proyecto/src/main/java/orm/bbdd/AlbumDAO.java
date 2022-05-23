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

public class AlbumDAO {
	public static Album loadAlbumByORMID(int idAlbum) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadAlbumByORMID(session, idAlbum);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album getAlbumByORMID(int idAlbum) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getAlbumByORMID(session, idAlbum);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album loadAlbumByORMID(int idAlbum, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadAlbumByORMID(session, idAlbum, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album getAlbumByORMID(int idAlbum, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getAlbumByORMID(session, idAlbum, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album loadAlbumByORMID(PersistentSession session, int idAlbum) throws PersistentException {
		try {
			return (Album) session.load(Album.class, Integer.valueOf(idAlbum));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album getAlbumByORMID(PersistentSession session, int idAlbum) throws PersistentException {
		try {
			return (Album) session.get(Album.class, Integer.valueOf(idAlbum));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album loadAlbumByORMID(PersistentSession session, int idAlbum, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Album) session.load(Album.class, Integer.valueOf(idAlbum), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album getAlbumByORMID(PersistentSession session, int idAlbum, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Album) session.get(Album.class, Integer.valueOf(idAlbum), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAlbum(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryAlbum(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAlbum(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryAlbum(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album[] listAlbumByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listAlbumByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album[] listAlbumByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listAlbumByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAlbum(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Album as Album");
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
	
	public static List queryAlbum(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Album as Album");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Album", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album[] listAlbumByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAlbum(session, condition, orderBy);
			return (Album[]) list.toArray(new Album[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album[] listAlbumByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAlbum(session, condition, orderBy, lockMode);
			return (Album[]) list.toArray(new Album[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album loadAlbumByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadAlbumByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album loadAlbumByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadAlbumByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album loadAlbumByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Album[] albums = listAlbumByQuery(session, condition, orderBy);
		if (albums != null && albums.length > 0)
			return albums[0];
		else
			return null;
	}
	
	public static Album loadAlbumByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Album[] albums = listAlbumByQuery(session, condition, orderBy, lockMode);
		if (albums != null && albums.length > 0)
			return albums[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAlbumByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateAlbumByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAlbumByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateAlbumByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAlbumByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Album as Album");
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
	
	public static java.util.Iterator iterateAlbumByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Album as Album");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Album", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album createAlbum() {
		return new Album();
	}
	
	public static boolean save(Album album) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(album);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Album album) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(album);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Album album)throws PersistentException {
		try {
			if (album.getArtista() != null) {
				album.getArtista().albums.remove(album);
			}
			
			Cancion[] lCancioness = album.canciones.toArray();
			for(int i = 0; i < lCancioness.length; i++) {
				lCancioness[i].album.remove(album);
			}
			Estadistica[] lEstadisticass = album.estadisticas.toArray();
			for(int i = 0; i < lEstadisticass.length; i++) {
				lEstadisticass[i].albums.remove(album);
			}
			return delete(album);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Album album, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (album.getArtista() != null) {
				album.getArtista().albums.remove(album);
			}
			
			Cancion[] lCancioness = album.canciones.toArray();
			for(int i = 0; i < lCancioness.length; i++) {
				lCancioness[i].album.remove(album);
			}
			Estadistica[] lEstadisticass = album.estadisticas.toArray();
			for(int i = 0; i < lEstadisticass.length; i++) {
				lEstadisticass[i].albums.remove(album);
			}
			try {
				session.delete(album);
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
	
	public static boolean refresh(Album album) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(album);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Album album) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(album);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Album loadAlbumByCriteria(AlbumCriteria albumCriteria) {
		Album[] albums = listAlbumByCriteria(albumCriteria);
		if(albums == null || albums.length == 0) {
			return null;
		}
		return albums[0];
	}
	
	public static Album[] listAlbumByCriteria(AlbumCriteria albumCriteria) {
		return albumCriteria.listAlbum();
	}
}
