package interfaz;

import java.util.Vector;
import interfaz.Usuario_admin;
import vistas.VistaUsuarios_busqueda_admin;

public class Usuarios_busqueda_admin extends VistaUsuarios_busqueda_admin{
	//private Label _tituloL;
	public Buscar_administrador _buscarAdministrador;
	public Vector<Usuario_admin> _usuarioAdmin = new Vector<Usuario_admin>();
	Usuario_admin _usa = new Usuario_admin();
	
	public Usuarios_busqueda_admin() {
		Inicializar();
	}
	void Inicializar() {
		this.getLayoutUsuarios().add(_usa);
	}
}