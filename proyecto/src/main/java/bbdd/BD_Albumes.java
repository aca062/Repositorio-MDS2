package bbdd;

import java.sql.Date;
import java.util.Vector;
import orm.bbdd.Album;
import interfaz.Estilo_admin;

public class BD_Albumes {
	public BDPrincipal _bd_prin_albumes;
	public Vector<Album> _contiene_albumes = new Vector<Album>();

	public void AltaAlbum(String aImagen, String aTitulo, Date aFechaEdicion) {
		throw new UnsupportedOperationException();
	}

	public void editarAlbum(String aTitulo, Date aFechaEdicion, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public void eliminar(int aId) {
		throw new UnsupportedOperationException();
	}

	public void cargarAlbum(Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public void verCreditos(String aTitulo) {
		throw new UnsupportedOperationException();
	}

	public void altaCancion(Estilo_admin[] aEstilos) {
		throw new UnsupportedOperationException();
	}

	public void editarCancion(String aTitulo) {
		throw new UnsupportedOperationException();
	}
}