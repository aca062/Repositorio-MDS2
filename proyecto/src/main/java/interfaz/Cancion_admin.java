package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

import vistas.VistaCancion_admin;

public class Cancion_admin extends VistaCancion_admin{
	/*private event _eliminar;
	private Image _imagen;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Canciones_busqueda_admin _cancionesBusquedaAdmin;
	public Editar_cancion _editarCancion = new Editar_cancion();
	
	
	public Cancion_admin() {
		Inicializar();
		this.getEditar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				EditarCancion();
			}
		});
	}
	
	public void Eliminar() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getEditar().setVisible(true);
		this.getEliminar().setVisible(true);
		this.getImgCancion().setVisible(true);
		this.getH4Titulo().setVisible(true);
	}
	public void EditarCancion() {
		this.getLayoutCancion().removeAll();
		this.getLayoutCancion().add(_editarCancion);
	}
}