package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import vistas.VistaPerfil_artista_comun;

public class Perfil_artista_comun extends VistaPerfil_artista_comun {
    /*
     * private Image _fotoPerfil; private Label _nickL; private Label _emailL;
     * private Label _seguidoresL; private Label _nSeguidoresL; private Label
     * _seguidosL; private Label _nSeguidosL; private Label _tituloEventosL; private
     * Image _imagenEvento; private Label _fechaL; private Label _lugarL;
     */
    public Lista_album _listaAlbum;
    public Canciones_mas_escuchadas _cancionesMasEscuchadas;
    public Listas_de_reproduccion_en_las_que_aparece _listasDeReproduccionEnLasQueAparece;
    public Artistas_similares _artistasSimilares;

    public Perfil_artista_comun() {
        InicializarPropio();
        this.getBotonAnadirFestivalConcierto().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                try {
					AnadirEvento();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    public Perfil_artista_comun(orm.bbdd.Artista artista) {
        InicializarAjeno(artista);
    }

    private void InicializarPropio() {
        // TODO Auto-generated method stub

    }

    protected void AnadirEvento() throws PersistentException {
        Anadir_evento anadirEvento = new Anadir_evento();
        anadirEvento.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(anadirEvento);
    }

    private void InicializarAjeno(orm.bbdd.Artista artista) {

        // this.getLayoutFotoPerfil().as(VerticalLayout.class).add(foto);
        this.getH5Nombre().setText(artista.getNick());
        if (artista.getFoto() != null) {
            this.getFoto().setSrc(ControladorVistas.getUsuario().getFoto());
        } else {
            this.getFoto()
                    .setSrc("https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png");
        }
        this.getH5Nombre().setText(artista.getNick());
        this.getH5Correo().setText(artista.getEmail());
        this.getNumeroSeguidos1().setText(Integer.toString(artista.seguido.size()));
        this.getNumeroSeguidos().setText(Integer.toString(artista.seguidor.size()));

        /*Listas_de_reproduccion_propias _listasDeReproduccionPropia = new Listas_de_reproduccion_propias();
        _listasDeReproduccionPropia.getLayoutListasPropias().add(new Lista_de_reproduccion_propia());
        _listasDeReproduccionPropia.getLayoutListasPropias().add(new Lista_de_reproduccion_propia());
        _listasDeReproduccionPropia.getLayoutListasPropias().add(new Lista_de_reproduccion_propia());
        this.getLayoutTusListas().add(_listasDeReproduccionPropia);
        _listasDeReproduccionEnLasQueAparece = new Listas_de_reproduccion_en_las_que_aparece();
        _listasDeReproduccionEnLasQueAparece.getLayoutListas().add(new Lista_de_reproduccion_ajena());
        _listasDeReproduccionEnLasQueAparece.getLayoutListas().add(new Lista_de_reproduccion_ajena());
        _listasDeReproduccionEnLasQueAparece.getLayoutListas().add(new Lista_de_reproduccion_ajena());
        this.getLayoutListasDondeAparece().add(_listasDeReproduccionEnLasQueAparece);
        _cancionesMasEscuchadas = new Canciones_mas_escuchadas();
        _cancionesMasEscuchadas.getLayoutPrincipal().add(new Cancion());
        _cancionesMasEscuchadas.getLayoutPrincipal().add(new Cancion());
        _cancionesMasEscuchadas.getLayoutPrincipal().add(new Cancion());
        this.getLayoutCancionesMasEscuchadas().as(VerticalLayout.class).add(_cancionesMasEscuchadas);
        _artistasSimilares = new Artistas_similares();
        _artistasSimilares.getLayoutPrincipal().add(new Artista_elemento());
        _artistasSimilares.getLayoutPrincipal().add(new Artista_elemento());
        _artistasSimilares.getLayoutPrincipal().add(new Artista_elemento());
        this.getLayoutArtistasSimilares().as(VerticalLayout.class).add(_artistasSimilares);
        _listaAlbum = new Lista_album();
        _listaAlbum.getLayoutAlbumes().add(new Album());
        _listaAlbum.getLayoutAlbumes().add(new Album());
        _listaAlbum.getLayoutAlbumes().add(new Album());
        this.getLayoutAlbumes().as(VerticalLayout.class).add(_listaAlbum);*/
    }
}