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

public class ArtistaDAO {
	public static Artista loadArtistaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadArtistaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getArtistaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadArtistaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getArtistaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Artista) session.load(Artista.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Artista) session.get(Artista.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Artista) session.load(Artista.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Artista) session.get(Artista.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryArtista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryArtista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Artista as Artista");
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
	
	public static List queryArtista(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Artista", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryArtista(session, condition, orderBy);
			return (Artista[]) list.toArray(new Artista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryArtista(session, condition, orderBy, lockMode);
			return (Artista[]) list.toArray(new Artista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Artista[] artistas = listArtistaByQuery(session, condition, orderBy);
		if (artistas != null && artistas.length > 0)
			return artistas[0];
		else
			return null;
	}
	
	public static Artista loadArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Artista[] artistas = listArtistaByQuery(session, condition, orderBy, lockMode);
		if (artistas != null && artistas.length > 0)
			return artistas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Artista as Artista");
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
	
	public static java.util.Iterator iterateArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Artista", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista createArtista() {
		return new Artista();
	}
	
	public static boolean save(Artista artista) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Artista artista) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Artista artista)throws PersistentException {
		try {
			Cancion[] lCancionss = artista.cancions.toArray();
			for(int i = 0; i < lCancionss.length; i++) {
				lCancionss[i].artistas.remove(artista);
			}
			Estadistica[] lEstadisticass = artista.estadisticas.toArray();
			for(int i = 0; i < lEstadisticass.length; i++) {
				lEstadisticass[i].artistas.remove(artista);
			}
			Evento[] lEventoss = artista.eventos.toArray();
			for(int i = 0; i < lEventoss.length; i++) {
				lEventoss[i].setArtista(null);
			}
			Estilo[] lEstiloss = artista.estilos.toArray();
			for(int i = 0; i < lEstiloss.length; i++) {
				lEstiloss[i].artistas.remove(artista);
			}
			Album[] lAlbumss = artista.albums.toArray();
			for(int i = 0; i < lAlbumss.length; i++) {
				lAlbumss[i].setArtista(null);
			}
			if (artista.getAcceso_Dato() != null) {
				artista.getAcceso_Dato().setUsuario(null);
			}
			
			if (artista.getEstadistica() != null) {
				artista.getEstadistica().setUsuario(null);
			}
			
			Lista_de_reproduccion[] lListas_de_reproduccion_propiass = artista.listas_de_reproduccion_propias.toArray();
			for(int i = 0; i < lListas_de_reproduccion_propiass.length; i++) {
				lListas_de_reproduccion_propiass[i].setCreador(null);
			}
			Actor_Comun[] lSeguidos = artista.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(artista);
			}
			Cancion[] lCancion_favoritas = artista.cancion_favorita.toArray();
			for(int i = 0; i < lCancion_favoritas.length; i++) {
				lCancion_favoritas[i].usuario.remove(artista);
			}
			Lista_de_reproduccion[] lListas_de_reproduccion_seguidass = artista.listas_de_reproduccion_seguidas.toArray();
			for(int i = 0; i < lListas_de_reproduccion_seguidass.length; i++) {
				lListas_de_reproduccion_seguidass[i].seguidor.remove(artista);
			}
			Evento[] lNotificacioness = artista.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].usuario.remove(artista);
			}
			Actor_Comun[] lSeguidors = artista.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguido.remove(artista);
			}
			return delete(artista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Artista artista, org.orm.PersistentSession session)throws PersistentException {
		try {
			Cancion[] lCancionss = artista.cancions.toArray();
			for(int i = 0; i < lCancionss.length; i++) {
				lCancionss[i].artistas.remove(artista);
			}
			Estadistica[] lEstadisticass = artista.estadisticas.toArray();
			for(int i = 0; i < lEstadisticass.length; i++) {
				lEstadisticass[i].artistas.remove(artista);
			}
			Evento[] lEventoss = artista.eventos.toArray();
			for(int i = 0; i < lEventoss.length; i++) {
				lEventoss[i].setArtista(null);
			}
			Estilo[] lEstiloss = artista.estilos.toArray();
			for(int i = 0; i < lEstiloss.length; i++) {
				lEstiloss[i].artistas.remove(artista);
			}
			Album[] lAlbumss = artista.albums.toArray();
			for(int i = 0; i < lAlbumss.length; i++) {
				lAlbumss[i].setArtista(null);
			}
			if (artista.getAcceso_Dato() != null) {
				artista.getAcceso_Dato().setUsuario(null);
			}
			
			if (artista.getEstadistica() != null) {
				artista.getEstadistica().setUsuario(null);
			}
			
			Lista_de_reproduccion[] lListas_de_reproduccion_propiass = artista.listas_de_reproduccion_propias.toArray();
			for(int i = 0; i < lListas_de_reproduccion_propiass.length; i++) {
				lListas_de_reproduccion_propiass[i].setCreador(null);
			}
			Actor_Comun[] lSeguidos = artista.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(artista);
			}
			Cancion[] lCancion_favoritas = artista.cancion_favorita.toArray();
			for(int i = 0; i < lCancion_favoritas.length; i++) {
				lCancion_favoritas[i].usuario.remove(artista);
			}
			Lista_de_reproduccion[] lListas_de_reproduccion_seguidass = artista.listas_de_reproduccion_seguidas.toArray();
			for(int i = 0; i < lListas_de_reproduccion_seguidass.length; i++) {
				lListas_de_reproduccion_seguidass[i].seguidor.remove(artista);
			}
			Evento[] lNotificacioness = artista.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].usuario.remove(artista);
			}
			Actor_Comun[] lSeguidors = artista.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguido.remove(artista);
			}
			try {
				session.delete(artista);
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
	
	public static boolean refresh(Artista artista) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Artista artista) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByCriteria(ArtistaCriteria artistaCriteria) {
		Artista[] artistas = listArtistaByCriteria(artistaCriteria);
		if(artistas == null || artistas.length == 0) {
			return null;
		}
		return artistas[0];
	}
	
	public static Artista[] listArtistaByCriteria(ArtistaCriteria artistaCriteria) {
		return artistaCriteria.listArtista();
	}
}
