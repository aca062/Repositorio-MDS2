package bbdd;

import java.sql.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Actor_Comun;
import orm.bbdd.Actor_ComunDAO;
import orm.bbdd.Album;
import orm.bbdd.AlbumCriteria;
import orm.bbdd.AlbumDAO;
import orm.bbdd.ArtistaDAO;
import orm.bbdd.Cancion;
import orm.bbdd.MDS2PersistentManager;

public class BD_Albumes {
	public BDPrincipal _bd_prin_albumes;
	public Vector<Album> _contiene_albumes = new Vector<Album>();

	public int AltaAlbum(String aImagen, String aTitulo, Date aFechaEdicion, String aNombreArtista, Cancion[] aCanciones) throws PersistentException{
		int idAlbum = -1;
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Album alb = AlbumDAO.createAlbum();
			alb.setTitulo(aTitulo);
			alb.setFechaEdicion(aFechaEdicion);
			alb.setImagen(aImagen);
            Actor_Comun actor = Actor_ComunDAO.listActor_ComunByQuery("nick='" + aNombreArtista + "'", "nick")[0];
			alb.setArtista(ArtistaDAO.getArtistaByORMID(actor.getId()));
			for(Cancion cancion : aCanciones) {
				alb.canciones.add(cancion);
			}
			AlbumDAO.save(alb);
			idAlbum = alb.getORMID();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return idAlbum;
	}

	public int editarAlbum(String aTitulo, Date aFechaEdicion, String aImagen, String aNombreArtista,Cancion[] aCanciones,int aIdAlbum) throws PersistentException{
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		int idAlbum = -1;
		try {
			Album alb = AlbumDAO.loadAlbumByORMID(aIdAlbum);
			alb.setTitulo(aTitulo);
			alb.setFechaEdicion(aFechaEdicion);
			alb.setImagen(aImagen);
            Actor_Comun actor = Actor_ComunDAO.listActor_ComunByQuery("nick='" + aNombreArtista + "'", "nick")[0];
			alb.setArtista(ArtistaDAO.getArtistaByORMID(actor.getId()));
			alb.canciones.clear();
			for(Cancion cancion : aCanciones) {
				alb.canciones.add(cancion);
			}
			AlbumDAO.save(alb);
			idAlbum = alb.getORMID();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return idAlbum;
	}

	public boolean eliminarAlbum(int aIdAlbum) throws PersistentException{
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		boolean correcto = false;
		try {
			Album album = AlbumDAO.getAlbumByORMID(aIdAlbum);
			correcto = AlbumDAO.delete(album);
			t.commit();
		} catch (Exception e) {
		    correcto = false;
			t.rollback();
		}
		return correcto;
	}

	public Album cargarAlbum(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargarAlbumRecomendado(int aIdUsuario) throws PersistentException{
		Album[] albumes = new Album[0];

		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			albumes = AlbumDAO.listAlbumByQuery(null, null);
			//TODO Decidir forma de elegir albumes recomendados
			t.commit();
		} catch(Exception e) {
			t.rollback();
		}
		return albumes;
	}

	public void altaCancion(String aTituloAlbum) {
		throw new UnsupportedOperationException();
	}

	public void editarCancion(String aTitulo) {
		throw new UnsupportedOperationException();
	}

    public Album[] busquedaAlbum(String paramBusqueda) throws PersistentException {
        Album[] albumes = new Album[0];

        AlbumCriteria criteria = new AlbumCriteria();
        String criterio = ("%" + paramBusqueda.trim().toLowerCase() + "%");
        criteria.titulo.like(criterio);
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            albumes = AlbumDAO.listAlbumByCriteria(criteria);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        return albumes;
    }
}