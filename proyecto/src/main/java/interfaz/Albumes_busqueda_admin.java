package interfaz;

import java.util.Vector;
import interfaz.Album_admin;
import vistas.VistaAlbumes_busqueda_admin;


public class Albumes_busqueda_admin extends VistaAlbumes_busqueda_admin{
	//private Label _tituloL;
	public Buscar_administrador _buscarAdministrador;
	public Vector<Album_admin> _albumAdmin = new Vector<Album_admin>();
	Album_admin _alb = new Album_admin();
	
	public Albumes_busqueda_admin() {
		Inicializar();
	}
	void Inicializar() {
		this.getLayoutLista().add(_alb);
	}
}