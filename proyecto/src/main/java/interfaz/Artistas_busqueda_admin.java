package interfaz;

import java.util.Vector;
import interfaz.Artista_admin;
import vistas.VistaArtistas_busqueda_admin;

public class Artistas_busqueda_admin extends VistaArtistas_busqueda_admin{
	//private Label _tituloL;
	public Buscar_administrador _buscarAdministrador;
	public Vector<Artista_admin> _artistaAdmin = new Vector<Artista_admin>();
	Artista_admin _ard = new Artista_admin();
	
	public Artistas_busqueda_admin() {
		Inicializar();
	}
	void Inicializar() {
		this.getLayoutArtistas().add(_ard);
	}
}