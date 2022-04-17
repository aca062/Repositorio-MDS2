package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAlbum;

public class Album extends VistaAlbum{
	/*private event _imagen_reproducir;
	private Image _fotoAlbum;
	private Button _nombreAlbumB;*/
	public Lista_album _listaAlbum;
	public Lista_albumes _listaAlbumes;
	public Ver_detalle_album _verDetalleAlbum = new Ver_detalle_album();
	
	public Album() {
		Inicializar();
		this.getTitulo().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				DetallesAlbum();
			}
		});
	}
	
	public void Imagen_reproducir() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getImgAlbum().setVisible(true);
		this.getTitulo().setVisible(true);
	}
	public void DetallesAlbum() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_verDetalleAlbum);
	}
}