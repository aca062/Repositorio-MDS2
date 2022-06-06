package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import vistas.VistaBuscar_administrador;


public class Buscar_administrador extends VistaBuscar_administrador {
    // private Label _tituloL;
    public Buscar_elemento _buscarElemento;
    public Vector<Albumes_busqueda_admin> _albumesBusquedaAdmin = new Vector<Albumes_busqueda_admin>();
    public Vector<Canciones_busqueda_admin> _cancionesBusquedaAdmin = new Vector<Canciones_busqueda_admin>();
    public Vector<Estilos_busqueda_admin> _estilosBusquedaAdmin = new Vector<Estilos_busqueda_admin>();
    public Vector<Listas_de_reproduccion_busqueda_admin> _listasDeReproduccionBusquedaAdmin = new Vector<Listas_de_reproduccion_busqueda_admin>();
    public Vector<Usuarios_busqueda_admin> _usuariosBusquedaAdmin = new Vector<Usuarios_busqueda_admin>();
    public Vector<Artistas_busqueda_admin> _artistasBusquedaAdmin = new Vector<Artistas_busqueda_admin>();
    private String paramBusqueda;

    public Vector<Cancion_admin> _cancionAdmin = new Vector<Cancion_admin>();
    public Vector<Album_admin> _albumAdmin = new Vector<Album_admin>();
    public Vector<Usuario_admin> _usuariosAdmin = new Vector<Usuario_admin>();
    public Vector<Lista_de_reproduccion_admin> _listasAdmin = new Vector<Lista_de_reproduccion_admin>();
    public Vector<Estilo_admin> _estilosAdmin = new Vector<Estilo_admin>();
    public Vector<Artista_admin> _artistasAdmin = new Vector<Artista_admin>();

    private iAdministrador adm = new BDPrincipal();
    public Buscar_administrador() {
        Inicializar("");
    }

    public Buscar_administrador(String buscado) {
        Inicializar(buscado);
    }

    void Inicializar(String buscado) {


        /*_listasDeReproduccionBusquedaAdmin.add(new Listas_de_reproduccion_busqueda_admin());
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
        }*/

        this.getLayoutPrincipal().getStyle().set("width", "100%");

    	paramBusqueda = buscado;

    	CargarCancionesBusqueda();

    	CargarAlbumesBusqueda();

    	CargarArtistasBusqueda();

    	CargarUsuariosBusqueda();

    	CargarListasBusqueda();

    	CargarEstilosBusqueda();

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
        _cancionesBusquedaAdmin.add(new Canciones_busqueda_admin());
        orm.bbdd.Cancion[] canciones = adm.busquedaCancion(paramBusqueda);
        if (canciones == null) {
            return;
        }

        Cancion_admin temp;

        if (canciones.length == 0) {
            _cancionesBusquedaAdmin.get(0).getH1Titulo().setVisible(false);
        }

        for (int i = 0; i < canciones.length; i++) {
            temp = new Cancion_admin();
            temp.setCancion(canciones[i]);
            temp.setClassName("cancionAdmin");

            // _cancionesBusquedaAdmin.add(temp);
            _cancionAdmin.add(temp);
        }

        int nivel = 0;

        for (double i = 0; i < _cancionAdmin.size(); i++) {
            if (i % 3 == 0 && i != 0) {
                _cancionesBusquedaAdmin.add(new Canciones_busqueda_admin());
                nivel++;
            }
            _cancionesBusquedaAdmin.get(nivel).anadirCancion(canciones[(int) i]);
        }

        for (int i = 0; i < _cancionesBusquedaAdmin.size(); i++) {
            Canciones_busqueda_admin lista = _cancionesBusquedaAdmin.get(i);
            if (i != 0) {
                lista.getH1Titulo().setVisible(false);
            }
            this.getLayoutPrincipal().as(VerticalLayout.class).add(lista);
        }
    }

    private void CargarAlbumesBusqueda() {
        _albumesBusquedaAdmin.add(new Albumes_busqueda_admin());
        orm.bbdd.Album[] albumes = adm.busquedaAlbum(paramBusqueda);
        if (albumes == null) {
            return;
        }

        Album_admin temp;

        if (albumes.length == 0) {
            _albumesBusquedaAdmin.get(0).getH1Titulo().setVisible(false);
        }

        for (int i = 0; i < albumes.length; i++) {
            temp = new Album_admin();
            temp.setAlbum(albumes[i]);
            temp.setClassName("albumAdmin");

            // _cancionesBusquedaAdmin.add(temp);
            _albumAdmin.add(temp);
        }

        int nivel = 0;

        for (double i = 0; i < _albumAdmin.size(); i++) {
            if (i % 3 == 0 && i != 0) {
                _albumesBusquedaAdmin.add(new Albumes_busqueda_admin());
                nivel++;
            }
            _albumesBusquedaAdmin.get(nivel).anadirAlbum(albumes[(int) i]);
        }

        for (int i = 0; i < _albumesBusquedaAdmin.size(); i++) {
            Albumes_busqueda_admin lista = _albumesBusquedaAdmin.get(i);
            if (i != 0) {
                lista.getH1Titulo().setVisible(false);
            }
            this.getLayoutPrincipal().as(VerticalLayout.class).add(lista);
        }
    }

    private void CargarArtistasBusqueda() {
        _artistasBusquedaAdmin.add(new Artistas_busqueda_admin());
        orm.bbdd.Artista[] artista = adm.busquedaArtista(paramBusqueda);
        if (artista == null) {
            return;
        }

        Artista_admin temp;

        if (artista.length == 0) {
            _artistasBusquedaAdmin.get(0).getH1Titulo().setVisible(false);
        }

        for (int i = 0; i < artista.length; i++) {
            temp = new Artista_admin();
            temp.setArtista(artista[i]);
            temp.setClassName("albumAdmin");

            // _cancionesBusquedaAdmin.add(temp);
            _artistasAdmin.add(temp);
        }

        int nivel = 0;

        for (double i = 0; i < _artistasAdmin.size(); i++) {
            if (i % 3 == 0 && i != 0) {
                _artistasBusquedaAdmin.add(new Artistas_busqueda_admin());
                nivel++;
            }
            _artistasBusquedaAdmin.get(nivel).anadirArtista(artista[(int) i]);
        }

        for (int i = 0; i < _artistasBusquedaAdmin.size(); i++) {
            Artistas_busqueda_admin lista = _artistasBusquedaAdmin.get(i);
            if (i != 0) {
                lista.getH1Titulo().setVisible(false);
            }
            this.getLayoutPrincipal().as(VerticalLayout.class).add(lista);
        }
    }

    private void CargarUsuariosBusqueda() {
        _usuariosBusquedaAdmin.add(new Usuarios_busqueda_admin());
        orm.bbdd.Usuario_Registrado[] usuarios = adm.busquedaUsuarios(paramBusqueda);
        if (usuarios == null) {
            return;
        }

        Usuario_admin temp;

        if (usuarios.length == 0) {
            _usuariosBusquedaAdmin.get(0).getH1Usuarios().setVisible(false);
        }

        for (int i = 0; i < usuarios.length; i++) {
            temp = new Usuario_admin();
            temp.setUsuario(usuarios[i]);
            temp.setClassName("usuarioAdmin");

            // _cancionesBusquedaAdmin.add(temp);
            _usuariosAdmin.add(temp);
        }

        int nivel = 0;

        for (double i = 0; i < _usuariosAdmin.size(); i++) {
            if (i % 3 == 0 && i != 0) {
                _usuariosBusquedaAdmin.add(new Usuarios_busqueda_admin());
                nivel++;
            }
            _usuariosBusquedaAdmin.get(nivel).anadirUsuario(usuarios[(int) i]);
        }

        for (int i = 0; i < _usuariosBusquedaAdmin.size(); i++) {
            Usuarios_busqueda_admin usuario = _usuariosBusquedaAdmin.get(i);
            if (i != 0) {
                usuario.getH1Usuarios().setVisible(false);
            }
            this.getLayoutPrincipal().as(VerticalLayout.class).add(usuario);
        }
    }

    private void CargarEstilosBusqueda() {
        _estilosBusquedaAdmin.add(new Estilos_busqueda_admin());
        orm.bbdd.Estilo[] estilos = adm.busquedaEstilos(paramBusqueda);
        if (estilos == null) {
            return;
        }

        Estilo_admin temp;

        if (estilos.length == 0) {
            _estilosBusquedaAdmin.get(0).getTitulo().setVisible(false);
        }

        for (int i = 0; i < estilos.length; i++) {
            temp = new Estilo_admin();
            temp.setEstilo(estilos[i]);
            temp.setClassName("estiloAdmin");

            _estilosAdmin.add(temp);
        }

        int nivel = 0;

        for (double i = 0; i < _estilosAdmin.size(); i++) {
            if (i % 3 == 0 && i != 0) {
                _estilosBusquedaAdmin.add(new Estilos_busqueda_admin());
                nivel++;
            }
            _estilosBusquedaAdmin.get(nivel).anadirEstilo(estilos[(int) i]);
        }

        for (int i = 0; i < _estilosBusquedaAdmin.size(); i++) {
            Estilos_busqueda_admin estilo = _estilosBusquedaAdmin.get(i);
            if (i != 0) {
                estilo.getTitulo().setVisible(false);
            }
            this.getLayoutPrincipal().as(VerticalLayout.class).add(estilo);
        }
    }

    private void CargarListasBusqueda() {
        _listasDeReproduccionBusquedaAdmin.add(new Listas_de_reproduccion_busqueda_admin());
        orm.bbdd.Lista_de_reproduccion[] listas = adm.busquedaListas(paramBusqueda);
        if (listas == null) {
            return;
        }

        Lista_de_reproduccion_admin temp;

        if (listas.length == 0) {
            _listasDeReproduccionBusquedaAdmin.get(0).getH1Titulo().setVisible(false);
        }

        for (int i = 0; i < listas.length; i++) {
            temp = new Lista_de_reproduccion_admin();
            temp.setLista(listas[i]);
            temp.setClassName("listaAdmin");

            _listasAdmin.add(temp);
        }

        int nivel = 0;

        for (double i = 0; i < _listasAdmin.size(); i++) {
            if (i % 3 == 0 && i != 0) {
                _listasDeReproduccionBusquedaAdmin.add(new Listas_de_reproduccion_busqueda_admin());
                nivel++;
            }
            _listasDeReproduccionBusquedaAdmin.get(nivel).anadirLista(listas[(int) i]);
        }

        for (int i = 0; i < _listasDeReproduccionBusquedaAdmin.size(); i++) {
            Listas_de_reproduccion_busqueda_admin lista = _listasDeReproduccionBusquedaAdmin.get(i);
            if (i != 0) {
                lista.getH1Titulo().setVisible(false);
            }
            this.getLayoutPrincipal().as(VerticalLayout.class).add(lista);
        }
    }
}