package bbdd;

import java.util.Vector;
// import BBDD.Cancion;
import orm.bbdd.Cancion;

public class BD_Canciones {
	public BDPrincipal _bd_prin_canciones;
	public Vector<Cancion> _contiene_canciones = new Vector<Cancion>();

	public void altaCancion(String aTitulo, String aCompositores, String aProductores, String aInterpretes, String aArcMultimedia) {
		throw new UnsupportedOperationException();
	}

	public void editarCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void marcarFavorito(int aIdCancion, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void eliminar(int aId) {
		throw new UnsupportedOperationException();
	}

	public void desmarcarFavorita(int aIdCancion, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Cancion cargarCancion(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void editarNumCancionesCibernauta(int aNumCanciones) {
		throw new UnsupportedOperationException();
	}

	public void editarCancionesMostradas(interfaz.Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	public void altaAlbum(interfaz.Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	public void editarAlbum(interfaz.Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}
}