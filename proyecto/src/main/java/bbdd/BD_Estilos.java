package bbdd;

import java.util.Vector;

import org.orm.PersistentException;

import orm.bbdd.Estilo;
import interfaz.Estilo_admin;

public class BD_Estilos {
	public BDPrincipal _bd_prin_estilos;
	public Vector<Estilo> _contiene_estilos = new Vector<Estilo>();

	public void altaEstilo(String aNombre, int aIdEstilo) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void editarEstilo(String aNombre, int aIdEstilo) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void eliminar(int aId) {
		throw new UnsupportedOperationException();
	}

	public Estilo cargarEstilo(int aIdEstilo) {
		throw new UnsupportedOperationException();
	}

	public void altaCancion(String aTitulo) {
		throw new UnsupportedOperationException();
	}

	public void editarCancion(Estilo_admin[] aEstilos) {
		throw new UnsupportedOperationException();
	}
}