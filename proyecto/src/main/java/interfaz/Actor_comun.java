package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
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

    /*
     * private Button _cerrarSesionB; private Button _verPerfilB; private TextField
     * _buscadorTF; private Button _buscadorB; private Label _estadisticasL; private
     * Button _estadisticasVerTodosB; private Label _estadisticasArtistaNombreL;
     * private Label _estadisticasArtistaTituloL; private Image
     * _estadisticasArtistaImagen; private Label _estadisticasCancionNombreL;
     * private Label _estadisticasCancionTituloL; private Image
     * _estadisticasCancionImagen; private Label _contactoTituloL; private Button
     * _contactoCorreoB; private Label _contactoTlfnL; private Button _logoB;
     */

    public Actor_comun() {
        Inicializar();
        HorizontalLayout layoutCancionesFav = this.getLayoutCancionesFav();
        this.getBotonVerMasEstadisticas().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                Estadisticas();
            }
        });

        /*this.getLayoutPrincipal().as(VerticalLayout.class).addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                if (ControladorVistas.getUsuario().cancion_favorita.size() > layoutCancionesFav.getChildren().toArray().length) {
                    layoutCancionesFav.removeAll();
                    _cancionesFavoritas = new Canciones_favoritas();
                    layoutCancionesFav.add(_cancionesFavoritas);
                    System.out.println("Cambia");
                }else {
                    System.out.println("no cambia");
                }

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