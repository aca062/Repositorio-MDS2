package bbdd;

import java.util.Vector;

import org.orm.PersistentException;

import orm.bbdd.Lista_de_reproduccion;

public class BD_Listas_de_reproduccion {
	public BDPrincipal _bd_prin_listas_de_reproduccion;
	public Vector<Lista_de_reproduccion> _contiene_listas_de_reproduccion = new Vector<Lista_de_reproduccion>();

	public void editarLista(String aNombre, int aIdLista) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void anadir(String aNombre) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void eliminar(int aId) {
		throw new UnsupportedOperationException();
	}

	public void crearLista(String aNombre) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion cargarLista(int aIdLista) {
		throw new UnsupportedOperationException();
	}
}