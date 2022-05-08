package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion_cibernauta;
import vistas.VistaUltimos_exitos;

public class Ultimos_exitos extends VistaUltimos_exitos{
	//private Label _tituloL;
	public Cibernauta _cibernauta;
	public Vector<Cancion_cibernauta> _cancionCibernauta = new Vector<Cancion_cibernauta>();
	
	public Ultimos_exitos() {
		Inicializar();
	}
	
	void Inicializar() {
		_cancionCibernauta.add(new Cancion_cibernauta());
		_cancionCibernauta.add(new Cancion_cibernauta());
		_cancionCibernauta.add(new Cancion_cibernauta());
		for(int i=0;i<3;i++) {
			this.getLayoutCanciones().add(_cancionCibernauta.get(i));
		}
	}
}