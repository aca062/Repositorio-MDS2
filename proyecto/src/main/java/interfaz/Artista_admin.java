package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaArtista_admin;

public class Artista_admin extends VistaArtista_admin{
	/*private event _eliminar;
	private Image _imagen;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Artistas_busqueda_admin _artistasBusquedaAdmin;
	public Editar_artista _editarArtista = new Editar_artista();
	
	public Artista_admin() {
		Inicializar();
		this.getEditar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				EditarArtista();
			}
		});
	}
	
	public void Eliminar() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getH4Nombre().setVisible(true);
		this.getImgArtista().setVisible(true);
		this.getEliminar().setVisible(true);
		this.getEditar().setVisible(true);
	}
	public void EditarArtista() {
		
	}
}