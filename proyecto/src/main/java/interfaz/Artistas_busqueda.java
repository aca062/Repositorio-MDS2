package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaArtistas_busqueda;

public class Artistas_busqueda extends VistaArtistas_busqueda{
	//private Label _tituloL;
	public Buscar _buscar;
	public Vector<Artista_elemento> _artistaElemento = new Vector<Artista_elemento>();
	
	public Artistas_busqueda() {
		Inicializar();
	}
	void Inicializar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		this.getH1Titulo().setVisible(true);
		_artistaElemento.add(new Artista_elemento());
		_artistaElemento.add(new Artista_elemento());
		_artistaElemento.add(new Artista_elemento());
		for(int i=0;i<3;i++) {
			v1.add(_artistaElemento.get(i));
		}
	}
}