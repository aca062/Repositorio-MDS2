package interfaz;

import java.util.Vector;

import com.example.test.ControladorVistas;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import vistas.VistaCanciones_favoritas;

public class Canciones_favoritas extends VistaCanciones_favoritas{
	/*private Label _tituloL;
	private Button _verMasB;*/
	public Actor_comun _actorComun;
	public Vector<Cancion> _cancion = new Vector<Cancion>();
	public Vector<Ver_mas_canciones_favoritas> _verMasCancionesFavoritas = new Vector<Ver_mas_canciones_favoritas>();
    iActor_comun bd = new BDPrincipal();

	public Canciones_favoritas() {
		Inicializar();
	}

	void Inicializar() {
	    int i = 0;

        for (orm.bbdd.Cancion cancion : bd.cargarCancionesFavoritas(ControladorVistas.getUsuario().getId())) {
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