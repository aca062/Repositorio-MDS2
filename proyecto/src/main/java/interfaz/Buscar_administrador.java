package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Div;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import orm.bbdd.Actor_Comun;
import orm.bbdd.Actor_ComunDAO;
import orm.bbdd.AlbumDAO;
import orm.bbdd.ArtistaDAO;
import orm.bbdd.CancionDAO;
import orm.bbdd.Estilo;
import orm.bbdd.EstiloDAO;
import orm.bbdd.Lista_de_reproduccion;
import orm.bbdd.Lista_de_reproduccionDAO;
import orm.bbdd.Usuario_RegistradoDAO;
import vistas.VistaBuscar_administrador;


public class Buscar_administrador extends VistaBuscar_administrador {
    // private Label _tituloL;
    public Buscar_elemento _buscarElemento;
    public Vector<Albumes_busqueda_admin> _albumesBusquedaAdmin = new Vector<Albumes_busqueda_admin>();
    public Vector<Canciones_busqueda_admin> _cancionesBusquedaAdmin = new Vector<Canciones_busqueda_admin>();
    public Vector<Cancion_admin> _cancionAdmin = new Vector<Cancion_admin>();
    public Vector<Estilos_busqueda_admin> _estilosBusquedaAdmin = new Vector<Estilos_busqueda_admin>();
    public Vector<Listas_de_reproduccion_busqueda_admin> _listasDeReproduccionBusquedaAdmin = new Vector<Listas_de_reproduccion_busqueda_admin>();
    public Vector<Usuarios_busqueda_admin> _usuariosBusquedaAdmin = new Vector<Usuarios_busqueda_admin>();
    public Vector<Artistas_busqueda_admin> _artistasBusquedaAdmin = new Vector<Artistas_busqueda_admin>();
    private String paramBusqueda;
    private iAdministrador adm = new BDPrincipal();
    public Buscar_administrador() {
        Inicializar("");
    }

    public Buscar_administrador(String buscado) {
        Inicializar(buscado);
    }

    void Inicializar(String buscado) {
    	
    	paramBusqueda = buscado;
    	
    	CargarCancionesBusqueda();
    	
    	Div div = new Div();
    	
    	for(Cancion_admin cancion :_cancionAdmin) {
    		div.add(cancion);
    	}
    	
        /*int numero = 0;
        int i = 0;
        _listasDeReproduccionBusquedaAdmin.add(new Listas_de_reproduccion_busqueda_admin());
        this.getLayoutListas().add(_listasDeReproduccionBusquedaAdmin.get(i));
        _albumesBusquedaAdmin.add(new Albumes_busqueda_admin());
        this.getLayoutAlbumes().add(_albumesBusquedaAdmin.get(i));
        _artistasBusquedaAdmin.add(new Artistas_busqueda_admin());
        this.getLayoutArtistas().add(_artistasBusquedaAdmin.get(i));
        _cancionesBusquedaAdmin.add(new Canciones_busqueda_admin());
        this.getLayoutCanciones().add(_cancionesBusquedaAdmin.get(i));
        _estilosBusquedaAdmin.add(new Estilos_busqueda_admin());
        this.getLayoutEstilos().add(_estilosBusquedaAdmin.get(i));
        _usuariosBusquedaAdmin.add(new Usuarios_busqueda_admin());
        this.getLayoutUsuarios().add(_usuariosBusquedaAdmin.get(i));
        try {
            for (Lista_de_reproduccion lista : Lista_de_reproduccionDAO
                    .listLista_de_reproduccionByQuery("nombre LIKE '%" + buscado + "%'", "nombre")) {
                numero++;
                if (numero > 3) {
                    numero = 1;
                    i++;
                    _listasDeReproduccionBusquedaAdmin.add(new Listas_de_reproduccion_busqueda_admin());
                    this.getLayoutListas().add(_listasDeReproduccionBusquedaAdmin.get(i));
                }
                _listasDeReproduccionBusquedaAdmin.get(i)._listaDeReproduccionAdmin.add(new Lista_de_reproduccion_admin(lista));
                _listasDeReproduccionBusquedaAdmin.get(i).getLayoutListas().add(_listasDeReproduccionBusquedaAdmin.get(i)._listaDeReproduccionAdmin.get(numero));
            }
            numero = 0;
            i = 0;
            for (orm.bbdd.Album album : AlbumDAO
                    .listAlbumByQuery("titulo LIKE '%" + buscado + "%'", "titulo")) {
                numero++;
                if (numero > 3) {
                    numero = 1;
                    i++;
                    _albumesBusquedaAdmin.add(new Albumes_busqueda_admin());
                    this.getLayoutAlbumes().add(_albumesBusquedaAdmin.get(i));
                }
                _albumesBusquedaAdmin.get(i)._albumAdmin.add(new Album_admin(album));
                _albumesBusquedaAdmin.get(i).getLayoutLista().add(_albumesBusquedaAdmin.get(i)._albumAdmin.get(numero - 1));
            }
            numero = 0;
            i = 0;
            for (Actor_Comun actor : Actor_ComunDAO
                    .listActor_ComunByQuery("nick LIKE '%" + buscado + "%'", "nick")) {
                numero++;
                for (orm.bbdd.Artista artista : ArtistaDAO.listArtistaByQuery("Actor_ComunId='" + actor.getId() + "'", "Actor_ComunId")) {
                    if (numero > 3) {
                        numero = 1;
                        i++;
                        _artistasBusquedaAdmin.add(new Artistas_busqueda_admin());
                        this.getLayoutArtistas().add(_listasDeReproduccionBusquedaAdmin.get(i));
                    }
                    _artistasBusquedaAdmin.get(i)._artistaAdmin.add(new Artista_admin(actor));
                }
            }
            numero = 0;
            i = 0;
            for (orm.bbdd.Cancion cancion : CancionDAO
                    .listCancionByQuery("titulo LIKE '%" + buscado + "%'", "titulo")) {
                numero++;
                if (numero > 3) {
                    numero = 1;
                    i++;
                    _cancionesBusquedaAdmin.add(new Canciones_busqueda_admin());
                    this.getLayoutCanciones().add(_cancionesBusquedaAdmin.get(i));
                }
                _cancionesBusquedaAdmin.get(i)._cancionAdmin.add(new Cancion_admin(cancion));
            }
            numero = 0;
            i = 0;
            for (Estilo estilo : EstiloDAO
                    .listEstiloByQuery("nombre LIKE '%" + buscado + "%'", "nombre")) {
                numero++;
                if (numero > 3) {
                    numero = 1;
                    i++;
                    _estilosBusquedaAdmin.add(new Estilos_busqueda_admin());
                    this.getLayoutEstilos().add(_estilosBusquedaAdmin.get(i));
                }
                _estilosBusquedaAdmin.get(i)._estiloAdmin.add(new Estilo_admin(estilo));
            }
            numero = 0;
            i = 0;
            for (Actor_Comun actor : Actor_ComunDAO
                    .listActor_ComunByQuery("nick LIKE '%" + buscado + "%'", "nick")) {
                numero++;
                for (orm.bbdd.Usuario_Registrado usuario : Usuario_RegistradoDAO.listUsuario_RegistradoByQuery("Actor_ComunId='" + actor.getId() + "'", "Actor_ComunId")) {
                    if (numero > 3) {
                        numero = 1;
                        i++;
                        _usuariosBusquedaAdmin.add(new Usuarios_busqueda_admin());
                        this.getLayoutUsuarios().add(_usuariosBusquedaAdmin.get(i));
                    }
                    _usuariosBusquedaAdmin.get(i)._usuarioAdmin.add(new Usuario_admin(actor));
                }
            }
        } catch (PersistentException e) {

        }*/

        /*_albumesBusquedaAdmin.add(new Albumes_busqueda_admin());
        _cancionesBusquedaAdmin.add(new Canciones_busqueda_admin());
        _estilosBusquedaAdmin.add(new Estilos_busqueda_admin());
        _usuariosBusquedaAdmin.add(new Usuarios_busqueda_admin());
        _artistasBusquedaAdmin.add(new Artistas_busqueda_admin());
        for (int i = 0; i < 1; i++) {
            this.getLayoutListas().add(_listasDeReproduccionBusquedaAdmin.get(i));
            this.getLayoutAlbumes().add(_albumesBusquedaAdmin.get(i));
            this.getLayoutArtistas().add(_artistasBusquedaAdmin.get(i));
            this.getLayoutCanciones().add(_cancionesBusquedaAdmin.get(i));
            this.getLayoutEstilos().add(_estilosBusquedaAdmin.get(i));
            this.getLayoutUsuarios().add(_usuariosBusquedaAdmin.get(i));
        }*/
    }

	private void CargarCancionesBusqueda() {
		orm.bbdd.Cancion[] canciones = adm.busquedaCancion(paramBusqueda);
		if (canciones == null) {
			return;
		}
		
		Cancion_admin temp;
		
		for(int i = 0; i < 3 && i<canciones.length;i++) {
			temp = new Cancion_admin(canciones[i]);
			temp.setClassName("cancionAdmin");
			
			//_cancionesBusquedaAdmin.add(temp);
			_cancionAdmin.add(temp);
		}
		
	}
}