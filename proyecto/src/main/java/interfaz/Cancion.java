package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H6;

import bbdd.BDPrincipal;
import bbdd.BD_Canciones;
import bbdd.iActor_comun;
import vistas.VistaCancion;

public class Cancion extends VistaCancion {
    /*
     * private event _imagen_reproducir; private Image _imagen; private Button
     * _tituloCancionB;
     */
    public Canciones_busqueda _cancionesBusqueda;
    public Canciones_favoritas _cancionesFavoritas;
    public Canciones_recomendadas _cancionesRecomendadas;
    public Ultimas_canciones_reproducidas _ultimasCancionesReproducidas;
    public Lista_de_canciones _listaDeCanciones;
    public Ver_detalle_cancion _verDetalleCancion;
    orm.bbdd.Cancion cancion;
    iActor_comun bd = new BDPrincipal();
    boolean favorita = false;
    BD_Canciones bdCanciones = new BD_Canciones();

    public Cancion() {
        Inicializar();
        Button meGusta = this.getMeGusta();
        H6 numRep = this.getNumeroRep();

        this.getBotonNombre().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                DetalleCancion();
            }
        });

        this.getBotonCancion().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                ControladorVistas.GetReproductor().setSource(cancion.getArchivoMultimedia());
                try {
                    numRep.setText(Integer.toString(bdCanciones.aumentarRep(cancion.getIdCancion())));
                } catch (PersistentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        this.getMeGusta().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                if (favorita) {
                    bd.desmarcarFavorita(cancion, ControladorVistas.getUsuario());
                    meGusta.getStyle().set("background-image", "url('https://e7.pngegg.com/pngimages/507/757/png-clipart-computer-icons-heart-like-button-like-share-comment-love-logo.png')");
                }else {
                    bd.marcarFavorito(cancion, ControladorVistas.getUsuario());
                    meGusta.getStyle().set("background-image", "url('https://img.freepik.com/vector-gratis/me-gusta-icono-corazon-estilo-contorno-plano-transmision-video-vivo-chat-me-gusta-redes-sociales-como-botones-web-corazon-rojo-aisladas-sobre-fondo-blanco-dia-san-valentin-illustaration-vector_175838-2893.jpg?w=360')");
                }
            }
        });
    }

    protected void DetalleCancion() {
        _verDetalleCancion = new Ver_detalle_cancion();
        _verDetalleCancion.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_verDetalleCancion);
    }

    public void Imagen_reproducir() {
        throw new UnsupportedOperationException();
    }

    void setCancion(orm.bbdd.Cancion cancion) {
        this.cancion = cancion;
        if (ControladorVistas.getUsuario().cancion_favorita.contains(cancion)) {
            favorita = true;
        }
        if (favorita) {
            this.getMeGusta().getStyle().set("background-image",
                    "url('https://img.freepik.com/vector-gratis/me-gusta-icono-corazon-estilo-contorno-plano-transmision-video-vivo-chat-me-gusta-redes-sociales-como-botones-web-corazon-rojo-aisladas-sobre-fondo-blanco-dia-san-valentin-illustaration-vector_175838-2893.jpg?w=360')");
        }
        this.getBotonNombre().setText(cancion.getTitulo());
        this.setId(Integer.toString(cancion.getIdCancion()));
        this.getNumeroRep().setText(Integer.toString(cancion.getNumReproducciones()));
        if (cancion.getRutaImagen() != null && !cancion.getRutaImagen().equals("")) {
            this.getBotonCancion().getStyle().set("background-image", cancion.getRutaImagen());
        } else {
            this.getBotonCancion().getStyle().set("background-image",
                    "url('https://m.media-amazon.com/images/I/214zIZyXvVL._AC_SY450_.jpg')");
        }
    }

    void Inicializar() {
        this.getBotonCancion().setVisible(true);
        this.getMeGusta().setVisible(true);
        this.getNumeroRep().setVisible(true);
    }
}