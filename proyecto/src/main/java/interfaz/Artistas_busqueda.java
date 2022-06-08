package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import vistas.VistaArtistas_busqueda;

public class Artistas_busqueda extends VistaArtistas_busqueda {
    // private Label _tituloL;
    public Buscar _buscar;
    public Vector<Artista_elemento> _artistaElemento = new Vector<Artista_elemento>();
    private iAdministrador adm = new BDPrincipal();
    String buscado;

    public Artistas_busqueda(String buscado) {
        this.buscado = buscado;
        Inicializar();
    }

    void Inicializar() {
        CargarArtistasBusqueda();
    }

    private void anadirArtista(orm.bbdd.Artista artista) {

        _artistaElemento.add(new Artista_elemento());

        _artistaElemento.lastElement().setArtista(artista);

        this.getLayoutPrincipal().as(VerticalLayout.class).add(_artistaElemento.lastElement());
    }

    private void CargarArtistasBusqueda() {

        orm.bbdd.Artista[] artistas = adm.busquedaArtista(buscado);
        if (artistas == null) {
            return;
        }

        if (artistas.length == 0) {
            this.getH1Titulo().setVisible(false);
        }else {
            for (orm.bbdd.Artista artista : artistas) {
                anadirArtista(artista);
            }
        }
    }
}