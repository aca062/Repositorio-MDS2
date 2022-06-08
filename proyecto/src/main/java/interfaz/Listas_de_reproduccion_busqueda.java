package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import vistas.VistaListas_de_reproduccion_busqueda;

public class Listas_de_reproduccion_busqueda extends VistaListas_de_reproduccion_busqueda {
    // private Label _tituloL;
    public Buscar _buscar;
    public Vector<Lista_de_reproduccion_ajena> _listaDeReproduccionAjena = new Vector<Lista_de_reproduccion_ajena>();
    String buscado;
    private iAdministrador adm = new BDPrincipal();

    public Listas_de_reproduccion_busqueda(String buscado) {
        this.buscado = buscado;
        Inicializar();
    }

    private void Inicializar() {
        CargarListasBusqueda();
    }

    private void anadirLista(orm.bbdd.Lista_de_reproduccion lista) {

        _listaDeReproduccionAjena.add(new Lista_de_reproduccion_ajena());

        _listaDeReproduccionAjena.lastElement().setLista(lista);

        this.getLayoutPrincipal().as(VerticalLayout.class).add(_listaDeReproduccionAjena.lastElement());
    }

    private void CargarListasBusqueda() {

        orm.bbdd.Lista_de_reproduccion[] listas = adm.busquedaListas(buscado);
        if (listas == null) {
            return;
        }

        if (listas.length == 0) {
            this.getH1Titulo().setVisible(false);
        } else {
            for (orm.bbdd.Lista_de_reproduccion lista : listas) {
                anadirLista(lista);
            }
        }
    }
}