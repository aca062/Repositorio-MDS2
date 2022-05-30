package bbdd;

import java.util.Vector;

import org.orm.PersistentException;

import orm.bbdd.Administrador;

public class BD_Administradores {
	public BDPrincipal _bd_prin_administradores;
	public Vector<Administrador> _contiene_administradores = new Vector<Administrador>();

	public void editarFoto(String aFoto, int aIdUsuario) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void editar_e_mail(String aEmail, int aIdUsuario) throws PersistentException{
		throw new UnsupportedOperationException();
	}
}