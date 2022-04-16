package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAlbum_admin;

public class Album_admin extends VistaAlbum_admin{
	/*private event _eliminar;
	private Image _imagen;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Albumes_busqueda_admin _albumesBusquedaAdmin;
	public Editar_album _editarAlbum = new Editar_album();
	
	public Album_admin() {
		Inicializar();
		this.getEditar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				EditarAlbum();
			}
		});
	}

	public void Eliminar() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getImgAlbum().setVisible(true);
		this.getH4Titulo().setVisible(true);
		this.getEliminar().setVisible(true);
		this.getEditar().setVisible(true);
	}
	public void EditarAlbum() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_editarAlbum);
	}
}