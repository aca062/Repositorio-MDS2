package interfaz;

import java.util.Vector;

import com.example.test.ControladorVistas;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import vistas.VistaUltimas_canciones_reproducidas;

public class Ultimas_canciones_reproducidas extends VistaUltimas_canciones_reproducidas{
	//private Label _tituloL;
	public Actor_comun _actorComun;
	public Vector<Cancion> _cancion = new Vector<Cancion>();
    iActor_comun bd = new BDPrincipal();


	public Ultimas_canciones_reproducidas() {
		Inicializar();
	}

	void Inicializar() {
		this.getH1TituloUltimasCanciones().setVisible(true);
		this.getLayoutCanciones().setVisible(true);
		this.getLayoutPrincipal().setVisible(true);
		this.getVistaCancion().setVisible(false);
		this.getVistaCancion1().setVisible(false);
		this.getVistaCancion2().setVisible(false);

		int i = 0;
        for (orm.bbdd.Cancion cancion : bd.cargarUltimasCancionesReproducidas(ControladorVistas.getUsuario().getId())) {
            i++;
            _cancion.add(new Cancion());
            _cancion.lastElement().setCancion(cancion);
            this.getLayoutCanciones().add(_cancion.lastElement());
            if (i == 3) {
                break;
            }
        }
	}
}