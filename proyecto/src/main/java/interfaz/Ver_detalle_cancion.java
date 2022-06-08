package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.BD_Canciones;
import bbdd.iActor_comun;
import vistas.VistaVer_detalle_cancion;

public class Ver_detalle_cancion extends VistaVer_detalle_cancion {
    public Cancion _cancion;
    public Reproductor _reproductor;
    public Ver_creditos _verCreditos;
    public Ver_detalle_album _verDetalleAlbum;
    public Perfil_artista_ajeno _perfilArtistaAjeno;
    orm.bbdd.Cancion cancion;
    boolean favorita;
    BD_Canciones bdCanciones = new BD_Canciones();
    iActor_comun bd = new BDPrincipal();

    public Ver_detalle_cancion(orm.bbdd.Cancion cancion, boolean fav) {
        this.cancion = cancion;
        this.favorita = fav;
        com.vaadin.flow.component.button.Button meGusta = this.getBotonMeGusta();
        Inicializar();
        this.getBotonVerCreditos().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                VerCreditos();
            }
        });
        this.getBotonReproducir().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                ControladorVistas.GetReproductor().setSource(cancion.getArchivoMultimedia());
                try {
                    bdCanciones.aumentarRep(cancion.getIdCancion());
                    bd.setUltimaCancionReproducida(ControladorVistas.getUsuario().getId(), cancion.getIdCancion());
                } catch (PersistentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        this.getBotonMeGusta().addClickListener(new ComponentEventListener() {
        	@Override
            public void onComponentEvent(ComponentEvent event) {
                if (favorita) {
                    bd.desmarcarFavorita(cancion.getIdCancion(), ControladorVistas.getUsuario().getId());
                    meGusta.getStyle().set("background-image",
                            "url('https://e7.pngegg.com/pngimages/507/757/png-clipart-computer-icons-heart-like-button-like-share-comment-love-logo.png')");
                    favorita = false;
                } else {
                    bd.marcarFavorito(cancion.getIdCancion(), ControladorVistas.getUsuario().getId());
                    meGusta.getStyle().set("background-image",
                            "url('https://img.freepik.com/vector-gratis/me-gusta-icono-corazon-estilo-contorno-plano-transmision-video-vivo-chat-me-gusta-redes-sociales-como-botones-web-corazon-rojo-aisladas-sobre-fondo-blanco-dia-san-valentin-illustaration-vector_175838-2893.jpg?w=360')");
                    favorita = true;
                }
            }
        });
        this.getBotonAlbum().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                IrAlbum();
            }
        });
        this.getBotonArtista().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                IrArtista();
            }
        });
    }

    protected void IrArtista() {
        _perfilArtistaAjeno = new Perfil_artista_ajeno(cancion.artistas.toArray()[0]);
        _perfilArtistaAjeno.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_perfilArtistaAjeno);
    }

    public void Reproducir() {
        throw new UnsupportedOperationException();
    }

    public void Marcar_como_favorito() {
        throw new UnsupportedOperationException();
    }

    public void Imagen_reproducir() {
        throw new UnsupportedOperationException();
    }

    public void Anadir_a_lista_de_reproduccion() {
        throw new UnsupportedOperationException();
    }

    void Inicializar() {
        this.getAnadirLista().setVisible(false);
        if (favorita) {
            this.getBotonMeGusta().getStyle().set("background-image",
                    "url('https://img.freepik.com/vector-gratis/me-gusta-icono-corazon-estilo-contorno-plano-transmision-video-vivo-chat-me-gusta-redes-sociales-como-botones-web-corazon-rojo-aisladas-sobre-fondo-blanco-dia-san-valentin-illustaration-vector_175838-2893.jpg?w=360')");
        }
        this.getH4NombreCancion().setText(cancion.getTitulo());
        if (cancion.album.size() >= 1) {
            this.getBotonAlbum().setText(cancion.album.toArray()[0].getTitulo());
        } else {
            this.getBotonAlbum().setVisible(false);
        }
        this.getBotonArtista().setText(cancion.artistas.toArray()[0].getNick());
        if (cancion.getRutaImagen() != null) {
            this.getFotoCancion().setSrc(cancion.getRutaImagen());
        } else {
            this.getFotoCancion().setSrc("https://m.media-amazon.com/images/I/214zIZyXvVL._AC_SY450_.jpg");
        }

        /*
         * for (int i = 1; i < cancion.artistas.size(); i++) {
         * this.getLayoutBotones().addComponentAsFirst(_cancion) }
         */

        this.getBotonArtista().setVisible(true);
        this.getBotonMeGusta().setVisible(true);
        this.getBotonReproducir().setVisible(true);
        this.getBotonVerCreditos().setVisible(true);
        this.getAnadirLista().setVisible(true);
        this.getFotoCancion().setVisible(true);
        this.getH4NombreCancion().setVisible(true);
    }

    public void VerCreditos() {
        _verCreditos = new Ver_creditos(cancion);
        ConfirmDialog popup = new ConfirmDialog();
        popup.setHeader("Créditos:");
        popup.add(_verCreditos);
        popup.setConfirmText("Aceptar");
        this.getLayoutPrincipal().as(VerticalLayout.class).add(popup);
        popup.open();
    }

    public void IrAlbum() {
    	_verDetalleAlbum = new Ver_detalle_album(cancion.album.toArray()[0]);
    	_verDetalleAlbum.getStyle().set("width", "100%");
    	ControladorVistas.CambiarContenido(_verDetalleAlbum);
    }

}