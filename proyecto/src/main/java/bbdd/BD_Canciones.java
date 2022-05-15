package bbdd;

import java.util.Vector;
import orm.bbdd.Cancion;
// import interfaz.Cancion;

public class BD_Canciones {
	public BDPrincipal _bd_prin_canciones;
	public Vector<Cancion> _contiene_canciones = new Vector<Cancion>();

	public void altaCancion(String aTitulo, String aCompositores, String aProductores, String aInterpretes, String aArcMultimedia) {
		throw new UnsupportedOperationException();
	}

	public void editarCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia) {
		throw new UnsupportedOperationException();
	}

	public void marcarFavorito(int aId) {
		throw new UnsupportedOperationException();
	}

	public void eliminar(int aId) {
		throw new UnsupportedOperationException();
	}

	public void desmarcarFavorita(int aId) {
		throw new UnsupportedOperationException();
	}

	public void cargarCancion(interfaz.Cancion aCancion) {
		throw new UnsupportedOperationException();
	}

	public void editarNumCancionesCibernauta(int aNumCanciones) {
		throw new UnsupportedOperationException();
	}

	public void editarCancionesMostradas(interfaz.Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	public void verCreditos(String aTitulo, String[] aInterpretes, String[] aProductores, String[] aCompositores) {
		throw new UnsupportedOperationException();
	}

	public void altaAlbum(interfaz.Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	public void editarAlbum(interfaz.Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}
}