package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEditar_estilo;

public class Editar_estilo extends VistaEditar_estilo{
	/*private Label _editarEstiloL;
	private Label _nombreEstiloL;
	private TextField _nombreEstiloTF;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Estilo_admin _estiloAdmin;
	
	public Editar_estilo() {
		Inicializar();
		this.getConfirmar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});
		this.getCancelar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
	}

	public void Confirmar() {
		//Más cosas
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Buscar_administrador());
	}
	
	public void Cancelar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Buscar_administrador());
	}
	
	void Inicializar() {
		this.getConfirmar().setVisible(true);
		this.getCancelar().setVisible(true);
		this.getNombreDelEstilo().setVisible(true);
	}
}