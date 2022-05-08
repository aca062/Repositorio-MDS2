package interfaz;

import java.util.Vector;
import interfaz.Cancion;
import vistas.VistaUltimas_canciones_reproducidas;

public class Ultimas_canciones_reproducidas extends VistaUltimas_canciones_reproducidas{
	//private Label _tituloL;
	public Actor_comun _actorComun;
	public Vector<Cancion> _cancion = new Vector<Cancion>();
	
	public Ultimas_canciones_reproducidas() {
		Inicializar();
	}
	
	void Inicializar() {
		this.getH1TituloUltimasCanciones().setVisible(true);
		this.getLayoutCanciones().setVisible(true);
		this.getLayoutPrincipal().setVisible(true);
		_cancion.add(new Cancion());
		_cancion.add(new Cancion());
		_cancion.add(new Cancion());
		this.getVistaCancion().setVisible(false);
		this.getVistaCancion1().setVisible(false);
		this.getVistaCancion2().setVisible(false);
		for(int i = 0; i < 3 ; i++) {
			this.getLayoutCanciones().add(_cancion.get(i));
		}
	}
}