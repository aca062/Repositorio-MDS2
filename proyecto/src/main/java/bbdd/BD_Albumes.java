package bbdd;

import java.sql.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Album;
import orm.bbdd.AlbumDAO;
import orm.bbdd.Cancion;
import orm.bbdd.CancionDAO;
import orm.bbdd.MDS2PersistentManager;
import interfaz.Estilo_admin;

public class BD_Albumes {
	public BDPrincipal _bd_prin_albumes;
	public Vector<Album> _contiene_albumes = new Vector<Album>();

	public void AltaAlbum(String aImagen, String aTitulo, Date aFechaEdicion, int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void editarAlbum(String aTitulo, Date aFechaEdicion, String aImagen, int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void eliminarAlbum(int aIdAlbum) throws PersistentException{
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Album album = AlbumDAO.getAlbumByORMID(aIdAlbum);
			AlbumDAO.delete(album);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
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
}