package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLista_albumes;

public class Lista_albumes extends VistaLista_albumes{
	//private Label _tituloL;
	public Ver_todos_los_albumes _verTodosLosAlbumes;
	public Vector<Album> _album = new Vector<Album>();

	public Lista_albumes() {
		Inicializar();
	}
	void Inicializar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		this.getH1Titulo().setVisible(true);
		for(int i=0;i<3;i++) {
			v1.add(_album.get(i));
		}
	}
}