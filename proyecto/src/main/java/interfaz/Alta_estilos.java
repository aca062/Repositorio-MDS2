package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAlta_estilos;

public class Alta_estilos extends VistaAlta_estilos{
	/*private Label _altaEstilosL;
	private Label _nombreEstiloL;
	private TextField _nombreEstiloTF;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Dar_de_alta _darDeAlta;
	
	public Alta_estilos() {
		Inicializar();
		this.getCancelar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
		this.getConfirmar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});
	}

	protected void Confirmar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_darDeAlta = new Dar_de_alta());
	}

	protected void Cancelar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_darDeAlta = new Dar_de_alta());
		
	}
	
	void Inicializar() {
		this.getConfirmar().setVisible(true);
		this.getCancelar().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getNombreDelEstilo().setVisible(true);
	}
}