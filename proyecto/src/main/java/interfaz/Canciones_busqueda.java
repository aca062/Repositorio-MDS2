package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion;
import vistas.VistaCanciones_busqueda;

public class Canciones_busqueda extends VistaCanciones_busqueda{
	//private Label _tituloL;
	public Buscar _buscar;
	public Vector<Cancion> _cancion = new Vector<Cancion>();
	
	public Canciones_busqueda() {
		Inicializar();
	}
	void Inicializar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		this.getH1Titulo().setVisible(true);
		_cancion.add(new Cancion());
		_cancion.add(new Cancion());
		_cancion.add(new Cancion());
		for(int  i=0;i<3;i++) {
			v1.add(_cancion.get(i));
		}
	}
}