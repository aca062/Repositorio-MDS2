package interfaz;

import java.util.Vector;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import vistas.VistaListas_de_reproduccion_propias;

public class Listas_de_reproduccion_propias extends VistaListas_de_reproduccion_propias {
    /*
     * private Label _tituloL; private Button _verListasPropiasB;
     */
    public Perfil _perfil;
    public Perfil_artista_propio _perfilArtista;
    public Vector<Lista_de_reproduccion_propia> _listaDeReproduccionPropia = new Vector<Lista_de_reproduccion_propia>();
    public Vector<Ver_listas_propias> _verListasPropias = new Vector<Ver_listas_propias>();
    iActor_comun bd = new BDPrincipal();

    public Listas_de_reproduccion_propias() {
        super();
        Inicializar();
        this.getVerTodas().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                VerTodas();
            }
        });
    }

    protected void VerTodas() {
        Paginacion_listas_propias paginacion = new Paginacion_listas_propias();
        paginacion.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(paginacion);
    }

    private void Inicializar() {
        this.getLayoutListasPropias().add(new Lista_de_reproduccion_propia());
        this.getLayoutListasPropias().add(new Lista_de_reproduccion_propia());
        this.getLayoutListasPropias().add(new Lista_de_reproduccion_propia());

        int i = 0;

        for (orm.bbdd.Lista_de_reproduccion lista : bd.cargarListasPropias(ControladorVistas.getUsuario().getId())) {
            i++;
            _listaDeReproduccionPropia.add(new Lista_de_reproduccion_propia());
            _listaDeReproduccionPropia.lastElement().setLista(lista);
            this.getLayoutPrincipal().as(VerticalLayout.class).add(_listaDeReproduccionPropia.lastElement());
            if (i == 3) {
                break;
            }
        }
    }

}