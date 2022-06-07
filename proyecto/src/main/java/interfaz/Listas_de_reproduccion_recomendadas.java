package interfaz;

import java.util.Vector;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import vistas.VistaListas_de_reproduccion_recomendadas;

public class Listas_de_reproduccion_recomendadas extends VistaListas_de_reproduccion_recomendadas {
    // private Label _tituloL;
    public Actor_comun _actorComun;
    public Vector<Lista_de_reproduccion_ajena> _listaDeReproduccionAjena = new Vector<Lista_de_reproduccion_ajena>();
    iActor_comun bd = new BDPrincipal();

    public Listas_de_reproduccion_recomendadas() {
        Inicializar();
    }

    void Inicializar() {
        this.getTitulo().setVisible(true);
        this.getVistaLista_de_reproduccion_ajena2().setVisible(false);
        this.getVistaLista_de_reproduccion_ajena1().setVisible(false);
        this.getVistaLista_de_reproduccion_ajena().setVisible(false);

        int i = 0;

        for (orm.bbdd.Lista_de_reproduccion lista : bd.cargarListaRecomendada()) {
            i++;
            _listaDeReproduccionAjena.add(new Lista_de_reproduccion_ajena());
            _listaDeReproduccionAjena.lastElement().setLista(lista);
            this.getLayoutPrincipal().add(_listaDeReproduccionAjena.lastElement());
            if (i == 3) {
                break;
            }
        }
    }
}