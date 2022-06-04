package interfaz;

import java.util.Vector;

import vistas.VistaArtistas_busqueda_admin;

public class Artistas_busqueda_admin extends VistaArtistas_busqueda_admin{
	//private Label _tituloL;
	public Buscar_administrador _buscarAdministrador;
	public Vector<Artista_admin> _artistaAdmin = new Vector<Artista_admin>();

	public Artistas_busqueda_admin() {
		Inicializar();
	}

	void Inicializar() {
		/*_artistaAdmin.add(new Artista_admin());
		_artistaAdmin.add(new Artista_admin());
		_artistaAdmin.add(new Artista_admin());
		this.getH1Titulo().setVisible(true);
		for(int i=0;i<3;i++) {
			this.getLayoutArtistas().add(_artistaAdmin.get(i));
		}*/
	}
}