package interfaz;

import java.util.Vector;
import interfaz.Cancion;
import vistas.VistaCanciones_recomendadas;

public class Canciones_recomendadas extends VistaCanciones_recomendadas{
	//private Label _tituloL;
	public Actor_comun _actorComun;
	public Vector<Cancion> _cancion = new Vector<Cancion>();
	
	public Canciones_recomendadas() {
		Inicializar();
	}
	
	void Inicializar() {
		this.getH1Titulo().setVisible(true);
		_cancion.add(new Cancion());
		_cancion.add(new Cancion());
		_cancion.add(new Cancion());
		this.getVistaCancion().setVisible(false);
		this.getVistaCancion1().setVisible(false);
		
		for(int i = 0 ; i < 3 ; i++) {
			this.getLayoutPrincipal().add(_cancion.get(i));
		}
	}
}