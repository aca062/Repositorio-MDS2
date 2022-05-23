package bbdd;

import java.util.Vector;
import orm.bbdd.Artista;

public class BD_Artistas {
	public BDPrincipal _bd_prin_artistas;
	public Vector<Artista> _contiene_artistas = new Vector<Artista>();

	public void altaArtistas(String aEmail, String aContrasena, String aNick, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public void editarArtista(String aEmail, String aContrasena, String aNick, String aImagen, int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public void editarFoto(String aFoto, int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar(int aId) {
		throw new UnsupportedOperationException();
	}

	public void darDeBaja() {
		throw new UnsupportedOperationException();
	}

	public void editarE_mail(String aEmail, int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Artista cargarArtista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public void seguir_dejarDeSeguirArtista(int aId, int aIdSeguido) {
		throw new UnsupportedOperationException();
	}

	public void altaAlbum(String aNombreArtista) {
		throw new UnsupportedOperationException();
	}

	public void editarAlbum(String aNombreArtista) {
		throw new UnsupportedOperationException();
	}
}