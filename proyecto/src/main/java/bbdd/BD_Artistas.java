package bbdd;

import java.util.Vector;
import orm.bbdd.Artista;
import interfaz.Artista_elemento;

public class BD_Artistas {
	public BDPrincipal _bd_prin_artistas;
	public Vector<Artista> _contiene_artistas = new Vector<Artista>();

	public void altaArtistas(String aEmail, String aContrasena, String aNick, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public void editarArtista(String aEmail, String aContrasena, String aNick, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public void editarFoto(String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void eliminar(int aId) {
		throw new UnsupportedOperationException();
	}

	public void darDeBaja() {
		throw new UnsupportedOperationException();
	}

	public void editarE_mail(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public void cargarArtista(Artista_elemento aArtista) {
		throw new UnsupportedOperationException();
	}

	public void seguir_dejarDeSeguirArtista(String aNick) {
		throw new UnsupportedOperationException();
	}

	public void altaAlbum(String aNombreArtista) {
		throw new UnsupportedOperationException();
	}

	public void editarAlbum(String aNombreArtista) {
		throw new UnsupportedOperationException();
	}
}