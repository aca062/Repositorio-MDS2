package interfaz;

import java.util.Vector;
import interfaz.Cancion;
import interfaz.Ver_mas_canciones_favoritas;
import vistas.VistaCanciones_favoritas;

public class Canciones_favoritas extends VistaCanciones_favoritas{
	/*private Label _tituloL;
	private Button _verMasB;*/
	public Actor_comun _actorComun;
	public Vector<Cancion> _cancion = new Vector<Cancion>();
	public Vector<Ver_mas_canciones_favoritas> _verMasCancionesFavoritas = new Vector<Ver_mas_canciones_favoritas>();
	
	public Canciones_favoritas() {
		Inicializar();
		//TODO::Funcionamiento Boton
	}
	void Inicializar() {
		this.getH1Titulo().setVisible(true);
		this.getVerMas().setVisible(true);
		_cancion.add(new Cancion());
		for(int i = 0;i<3;i++) {
			this.getLayoutCanciones().add(_cancion.get(i));
		}
	}
}