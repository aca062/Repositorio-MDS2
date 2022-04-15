package interfaz;

import java.util.Vector;
import interfaz.Cancion;
import vistas.VistaCanciones_recomendadas;

public class Canciones_recomendadas extends VistaCanciones_recomendadas{
	//private Label _tituloL;
	public Actor_comun _actorComun;
	public Vector<Cancion> _cancion = new Vector<Cancion>();
	
	void Inicializar() {
		_cancion.add(new Cancion());
		for(int  i = 0;i<3;i++) {
			this.getLayoutPrincipal().add(_cancion.get(i));
		}
		this.getH1Titulo().setVisible(true);
		this.getLayoutPrincipal().setVisible(true);
		this.getVistaCancion().setVisible(true);
		this.getVistaCancion1().setVisible(true);
	}
}