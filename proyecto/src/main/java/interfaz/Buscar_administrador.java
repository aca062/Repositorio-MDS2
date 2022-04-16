package interfaz;

import java.util.Vector;
import interfaz.Albumes_busqueda_admin;
import interfaz.Canciones_busqueda_admin;
import interfaz.Estilos_busqueda_admin;
import interfaz.Listas_de_reproduccion_busqueda_admin;
import interfaz.Usuarios_busqueda_admin;
import vistas.VistaBuscar_administrador;
import interfaz.Artistas_busqueda_admin;

public class Buscar_administrador extends VistaBuscar_administrador{
	//private Label _tituloL;
	public Buscar_elemento _buscarElemento;
	public Vector<Albumes_busqueda_admin> _albumesBusquedaAdmin = new Vector<Albumes_busqueda_admin>();
	public Vector<Canciones_busqueda_admin> _cancionesBusquedaAdmin = new Vector<Canciones_busqueda_admin>();
	public Vector<Estilos_busqueda_admin> _estilosBusquedaAdmin = new Vector<Estilos_busqueda_admin>();
	public Vector<Listas_de_reproduccion_busqueda_admin> _listasDeReproduccionBusquedaAdmin = new Vector<Listas_de_reproduccion_busqueda_admin>();
	public Vector<Usuarios_busqueda_admin> _usuariosBusquedaAdmin = new Vector<Usuarios_busqueda_admin>();
	public Vector<Artistas_busqueda_admin> _artistasBusquedaAdmin = new Vector<Artistas_busqueda_admin>();
	
	public Buscar_administrador() {
		Inicializar();
	}
	void Inicializar() {
		_listasDeReproduccionBusquedaAdmin.add(new Listas_de_reproduccion_busqueda_admin());
		_albumesBusquedaAdmin.add(new Albumes_busqueda_admin());
		_cancionesBusquedaAdmin.add(new Canciones_busqueda_admin());
		_estilosBusquedaAdmin.add(new Estilos_busqueda_admin());
		_usuariosBusquedaAdmin.add(new Usuarios_busqueda_admin());
		_artistasBusquedaAdmin.add(new Artistas_busqueda_admin());
		for(int i=0;i<1;i++) {
			this.getLayoutListas().add(_listasDeReproduccionBusquedaAdmin.get(i));
			this.getLayoutAlbumes().add(_albumesBusquedaAdmin.get(i));
			this.getLayoutArtistas().add(_artistasBusquedaAdmin.get(i));
			this.getLayoutCanciones().add(_cancionesBusquedaAdmin.get(i));
			this.getLayoutEstilos().add(_estilosBusquedaAdmin.get(i));
			this.getLayoutUsuarios().add(_usuariosBusquedaAdmin.get(i));
		}
	}
}