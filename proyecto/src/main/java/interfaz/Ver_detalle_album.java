package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_detalle_album;

public class Ver_detalle_album extends VistaVer_detalle_album{
	/*private event _imagen_reproducir;
	private Label _nombreAlbumL;
	private Button _nombreArtistaB;
	private Label _fechaL;
	private Image _imagenAlbum;*/
	public Perfil_artista_ajeno _artistaAjeno;
	public Album _album = new Album();
	public Lista_de_canciones _listaDeCanciones = new Lista_de_canciones();

	public Ver_detalle_album() {
		Inicializar();
		this.getBotonArtista().addClickListener(new ComponentEventListener() {
			@Override
            public void onComponentEvent(ComponentEvent event) {
				IrArtista();
			}
		});
	}

	public void Imagen_reproducir() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getLayoutAlbum().add(_album);
		this.getBotonArtista().setVisible(true);
		this.getH5FechaAlbum().setVisible(true);
		this.getLayoutCancionesAlbum().add(_listaDeCanciones);
	}
	public void IrArtista() {
	    //DFOAIJFOQIERJFQERPFO
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_artistaAjeno);
	}
}