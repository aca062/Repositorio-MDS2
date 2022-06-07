package interfaz;

import java.util.Vector;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import vistas.VistaCanciones_recomendadas;

public class Canciones_recomendadas extends VistaCanciones_recomendadas {
    // private Label _tituloL;
    public Actor_comun _actorComun;
    public Vector<Cancion> _cancion = new Vector<Cancion>();
    iActor_comun bd = new BDPrincipal();

    public Canciones_recomendadas() {
        Inicializar();
    }

    void Inicializar() {
        this.getVistaCancion().setVisible(false);
        this.getVistaCancion1().setVisible(false);
        this.getH1Titulo().setVisible(true);

        int i = 0;

        for (orm.bbdd.Cancion cancion : bd.cargarCancionRecomendada(0)) {
            i++;
            _cancion.add(new Cancion());
            _cancion.lastElement().setCancion(cancion);
            this.getLayoutPrincipal().add(_cancion.lastElement());
            if (i == 3) {
                break;
            }
        }
    }
}