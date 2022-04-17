package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_detalle_cancion;

public class Ver_detalle_cancion extends VistaVer_detalle_cancion{
	/*private event _reproducir;
	private event _marcar_como_favorito;
	private event _imagen_reproducir;
	private event _anadir_a_lista_de_reproduccion;
	private Image _imagenCancion;
	private Label _nombreCancionL;
	private Label _nombreArtistaL;
	private Label _nombreAlbumL;
	private Button _anadirFavoritosB;
	private Dropdown _anadirAListaD;
	private Button _verCreditosB;
	private Button _reproducirB;*/
	public Cancion _cancion;
	public Reproductor _reproductor;
	public Ver_creditos _verCreditos = new Ver_creditos();
	
	public Ver_detalle_cancion() {
		Inicializar();
		this.getBotonVerCreditos().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				VerCreditos();
			}
		});
	}
	
	public void Reproducir() {
		throw new UnsupportedOperationException();
	}

	public void Marcar_como_favorito() {
		throw new UnsupportedOperationException();
	}

	public void Imagen_reproducir() {
		throw new UnsupportedOperationException();
	}

	public void Anadir_a_lista_de_reproduccion() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getBotonAlbum().setVisible(true);
		this.getBotonArtista().setVisible(true);
		this.getBotonMeGusta().setVisible(true);
		this.getBotonReproducir().setVisible(true);
		this.getBotonVerCreditos().setVisible(true);
		this.getAnadirLista().setVisible(true);
		this.getFotoCancion().setVisible(true);
		this.getH4NombreCancion().setVisible(true);
	}
	public void VerCreditos() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.add(_verCreditos);
	}
}