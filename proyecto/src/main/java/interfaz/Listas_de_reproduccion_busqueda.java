package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Lista_de_reproduccion_ajena;
import vistas.VistaListas_de_reproduccion_busqueda;

public class Listas_de_reproduccion_busqueda extends VistaListas_de_reproduccion_busqueda{
	//private Label _tituloL;
	public Buscar _buscar;
	public Vector<Lista_de_reproduccion_ajena> _listaDeReproduccionAjena = new Vector<Lista_de_reproduccion_ajena>();
	
	public Listas_de_reproduccion_busqueda() {
		Inicializar();
	}
	void Inicializar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		this.getH1Titulo().setVisible(true);
		_listaDeReproduccionAjena.add(new Lista_de_reproduccion_ajena());
		_listaDeReproduccionAjena.add(new Lista_de_reproduccion_ajena());
		_listaDeReproduccionAjena.add(new Lista_de_reproduccion_ajena());
		for(int i=0;i<3;i++) {
			v1.add(_listaDeReproduccionAjena.get(i));
		}
	}
}