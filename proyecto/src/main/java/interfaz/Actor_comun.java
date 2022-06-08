package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaActor_comun;

public class Actor_comun extends VistaActor_comun {
    public Reproductor _reproductor;
    public Canciones_favoritas _cancionesFavoritas;
    public Canciones_recomendadas _cancionesRecomendadas;
    public Ultimas_canciones_reproducidas _ultimasCancionesReproducidas;
    public Estadisticas _estadisticas;
    public Artistas_recomendados _artistasRecomendados;
    public Contacto _contacto;
    public Listas_de_reproduccion_recomendadas _listasDeReproduccionRecomendadas;

    public Actor_comun() {
        Inicializar();
        HorizontalLayout layoutCancionesFav = this.getLayoutCancionesFav();
        VerticalLayout layoutCancionesRecomendadas = this.getLayoutPrueba().as(VerticalLayout.class);
        this.getBotonVerMasEstadisticas().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                Estadisticas();
            }
        });

        /*layoutCancionesFav.addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                _cancionesFavoritas = new Canciones_favoritas();
                layoutCancionesFav.removeAll();
                layoutCancionesFav.add(_cancionesFavoritas);
            }
        });*/

        /*layoutCancionesRecomendadas.addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                layoutCancionesFav.removeAll();
                _cancionesFavoritas = new Canciones_favoritas();
                layoutCancionesFav.add(_cancionesFavoritas);
            }
        });*/
    }

    protected void Estadisticas() {

    }

    void Inicializar() {
        _ultimasCancionesReproducidas = new Ultimas_canciones_reproducidas();
        HorizontalLayout ultimasCanciones = this.getLayoutUltimasCanciones();
        ultimasCanciones.add(_ultimasCancionesReproducidas);

        _cancionesFavoritas = new Canciones_favoritas();
        HorizontalLayout layoutCancionesFav = this.getLayoutCancionesFav();
        layoutCancionesFav.add(_cancionesFavoritas);
        if (_cancionesFavoritas._cancion.size() == 0) {
            H3 string = new H3("No tiene ninguna canción favorita aún");
            string.getStyle().set("align-self", "center");
            layoutCancionesFav.add(string);
        }

        _cancionesRecomendadas = new Canciones_recomendadas();
        VerticalLayout layoutCanciones = this.getLayoutPrueba().as(VerticalLayout.class);
        layoutCanciones.add(_cancionesRecomendadas);

        _artistasRecomendados = new Artistas_recomendados();
        VerticalLayout layoutArtistas = this.getLayoutArtistas().as(VerticalLayout.class);
        layoutArtistas.add(_artistasRecomendados);

        _listasDeReproduccionRecomendadas = new Listas_de_reproduccion_recomendadas();
        VerticalLayout layoutListas = this.getLayoutListas().as(VerticalLayout.class);
        layoutListas.add(_listasDeReproduccionRecomendadas);

        _reproductor = new Reproductor();
        _estadisticas = new Estadisticas();
        _contacto = new Contacto();

    }
}