package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEstilo_admin;

public class Estilo_admin extends VistaEstilo_admin{
	/*private event _eliminar;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Estilos_busqueda_admin _estilosBusquedaAdmin;
	public Editar_estilo _editarEstilo;
	
	public Estilo_admin() {
		Inicializar();
		this.getEditar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				EditarEstilo();
			}
		});
		this.getEliminar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Eliminar();
			}
		});
	}

	public void Eliminar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Buscar_administrador());
	}
	
	void Inicializar() {
		this.getEliminar().setVisible(true);
		this.getEditar().setVisible(true);
		this.getEstilo().setVisible(true);
	}
	
	public void EditarEstilo() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_editarEstilo = new Editar_estilo());
	}
}