package interfaz;

import java.util.Vector;
import interfaz.Albumes_busqueda_admin;
import interfaz.Canciones_busqueda_admin;
import interfaz.Estilos_busqueda_admin;
import interfaz.Listas_de_reproduccion_busqueda_admin;
import interfaz.Usuarios_busqueda_admin;
import interfaz.Artistas_busqueda_admin;

public class Buscar_administrador {
	private Label _tituloL;
	public Buscar_elemento _buscarElemento;
	public Vector<Albumes_busqueda_admin> _albumesBusquedaAdmin = new Vector<Albumes_busqueda_admin>();
	public Vector<Canciones_busqueda_admin> _cancionesBusquedaAdmin = new Vector<Canciones_busqueda_admin>();
	public Vector<Estilos_busqueda_admin> _estilosBusquedaAdmin = new Vector<Estilos_busqueda_admin>();
	public Vector<Listas_de_reproduccion_busqueda_admin> _listasDeReproduccionBusquedaAdmin = new Vector<Listas_de_reproduccion_busqueda_admin>();
	public Vector<Usuarios_busqueda_admin> _usuariosBusquedaAdmin = new Vector<Usuarios_busqueda_admin>();
	public Vector<Artistas_busqueda_admin> _artistasBusquedaAdmin = new Vector<Artistas_busqueda_admin>();
}