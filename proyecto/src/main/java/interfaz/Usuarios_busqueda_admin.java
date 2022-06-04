package interfaz;

import java.util.Vector;

import vistas.VistaUsuarios_busqueda_admin;

public class Usuarios_busqueda_admin extends VistaUsuarios_busqueda_admin{
	//private Label _tituloL;
	public Buscar_administrador _buscarAdministrador;
	public Vector<Usuario_admin> _usuarioAdmin = new Vector<Usuario_admin>();

	public Usuarios_busqueda_admin() {
		Inicializar();
	}
	void Inicializar() {
		/*_usuarioAdmin.add(new Usuario_admin());
		_usuarioAdmin.add(new Usuario_admin());
		_usuarioAdmin.add(new Usuario_admin());
		this.getH1Usuarios().setVisible(true);
		for(int i=0;i<3;i++) {
			this.getLayoutUsuarios().add(_usuarioAdmin.get(i));
		}*/
	}
}