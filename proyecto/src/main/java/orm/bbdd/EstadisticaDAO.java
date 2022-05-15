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

public class EstadisticaDAO {
	public static Estadistica loadEstadisticaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadEstadisticaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica getEstadisticaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getEstadisticaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadEstadisticaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica getEstadisticaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getEstadisticaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Estadistica) session.load(Estadistica.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica getEstadisticaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Estadistica) session.get(Estadistica.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estadistica) session.load(Estadistica.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica getEstadisticaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estadistica) session.get(Estadistica.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstadistica(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryEstadistica(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstadistica(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryEstadistica(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica[] listEstadisticaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listEstadisticaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica[] listEstadisticaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listEstadisticaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstadistica(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Estadistica as Estadistica");
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
	
	public static List queryEstadistica(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Estadistica as Estadistica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estadistica", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica[] listEstadisticaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstadistica(session, condition, orderBy);
			return (Estadistica[]) list.toArray(new Estadistica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica[] listEstadisticaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstadistica(session, condition, orderBy, lockMode);
			return (Estadistica[]) list.toArray(new Estadistica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadEstadisticaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadEstadisticaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estadistica[] estadisticas = listEstadisticaByQuery(session, condition, orderBy);
		if (estadisticas != null && estadisticas.length > 0)
			return estadisticas[0];
		else
			return null;
	}
	
	public static Estadistica loadEstadisticaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estadistica[] estadisticas = listEstadisticaByQuery(session, condition, orderBy, lockMode);
		if (estadisticas != null && estadisticas.length > 0)
			return estadisticas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstadisticaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateEstadisticaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstadisticaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateEstadisticaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstadisticaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Estadistica as Estadistica");
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
	
	public static java.util.Iterator iterateEstadisticaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Estadistica as Estadistica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estadistica", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica createEstadistica() {
		return new Estadistica();
	}
	
	public static boolean save(Estadistica estadistica) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(estadistica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Estadistica estadistica) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(estadistica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Estadistica estadistica)throws PersistentException {
		try {
			if (estadistica.getUsuario() != null) {
				estadistica.getUsuario().setEstadistica(null);
			}
			
			Artista[] lArtistass = estadistica.artistas.toArray();
			for(int i = 0; i < lArtistass.length; i++) {
				lArtistass[i].estadisticas.remove(estadistica);
			}
			Cancion[] lCancionss = estadistica.cancions.toArray();
			for(int i = 0; i < lCancionss.length; i++) {
				lCancionss[i].estadisticas.remove(estadistica);
			}
			Lista_de_reproduccion[] lLista_de_reproduccions = estadistica.lista_de_reproduccion.toArray();
			for(int i = 0; i < lLista_de_reproduccions.length; i++) {
				lLista_de_reproduccions[i].estadisticas.remove(estadistica);
			}
			Album[] lAlbumss = estadistica.albums.toArray();
			for(int i = 0; i < lAlbumss.length; i++) {
				lAlbumss[i].estadisticas.remove(estadistica);
			}
			return delete(estadistica);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Estadistica estadistica, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (estadistica.getUsuario() != null) {
				estadistica.getUsuario().setEstadistica(null);
			}
			
			Artista[] lArtistass = estadistica.artistas.toArray();
			for(int i = 0; i < lArtistass.length; i++) {
				lArtistass[i].estadisticas.remove(estadistica);
			}
			Cancion[] lCancionss = estadistica.cancions.toArray();
			for(int i = 0; i < lCancionss.length; i++) {
				lCancionss[i].estadisticas.remove(estadistica);
			}
			Lista_de_reproduccion[] lLista_de_reproduccions = estadistica.lista_de_reproduccion.toArray();
			for(int i = 0; i < lLista_de_reproduccions.length; i++) {
				lLista_de_reproduccions[i].estadisticas.remove(estadistica);
			}
			Album[] lAlbumss = estadistica.albums.toArray();
			for(int i = 0; i < lAlbumss.length; i++) {
				lAlbumss[i].estadisticas.remove(estadistica);
			}
			try {
				session.delete(estadistica);
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
	
	public static boolean refresh(Estadistica estadistica) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(estadistica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Estadistica estadistica) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(estadistica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByCriteria(EstadisticaCriteria estadisticaCriteria) {
		Estadistica[] estadisticas = listEstadisticaByCriteria(estadisticaCriteria);
		if(estadisticas == null || estadisticas.length == 0) {
			return null;
		}
		return estadisticas[0];
	}
	
	public static Estadistica[] listEstadisticaByCriteria(EstadisticaCriteria estadisticaCriteria) {
		return estadisticaCriteria.listEstadistica();
	}
}
