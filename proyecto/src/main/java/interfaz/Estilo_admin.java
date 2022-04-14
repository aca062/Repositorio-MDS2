package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import vistas.VistaEstilo_admin;

public class Estilo_admin extends VistaEstilo_admin{
	/*private event _eliminar;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Estilos_busqueda_admin _estilosBusquedaAdmin;
	public Editar_estilo _editarEstilo = new Editar_estilo();
	
	public Estilo_admin() {
		Inicializar();
		this.getEditar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				EditarEstilo();
			}
		});
	}

	public void Eliminar() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getEliminar().setVisible(true);
		this.getEditar().setVisible(true);
		this.getEstilo().setVisible(true);
	}
	public void EditarEstilo() {
		
	}
}