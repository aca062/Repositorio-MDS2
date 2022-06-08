package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLista_album;

public class Lista_album extends VistaLista_album{
	//private Label _tituloL;
	public Perfil_artista_comun _perfilArtistaComun;
	public Vector<Album> _album = new Vector<Album>();
	public Ver_todos_los_albumes _verTodosLosAlbumes = new Ver_todos_los_albumes();

	public Lista_album() {
		Inicializar();
		this.getVerMas().addClickListener(new ComponentEventListener() {
			@Override
            public void onComponentEvent(ComponentEvent event) {
				VerMas();
			}
		});
	}

	void Inicializar() {
		this.getVerMas().setVisible(true);
		this.getH1Titulo().setVisible(true);
		for(int i=0;i<3;i++) {
			this.getLayoutAlbumes().add(_album.get(i));
		}
	}

	public void VerMas() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_verTodosLosAlbumes);
	}
}