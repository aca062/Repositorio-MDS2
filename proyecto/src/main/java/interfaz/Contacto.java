package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaContacto;

public class Contacto extends VistaContacto{
	/*private Label _tituloL;
	private Label _asuntoL;
	private TextField _asuntoTF;
	private Label _mensajeL;
	private TextField _mensajeTF;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Actor_comun _actorComun;
	
	public Contacto() {
		Inicializar();
		this.getCancelar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
	}
	
	void Inicializar() {
	}
	
	public void Cancelar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		//Depende del tipo de usuario
		v1.add(_actorComun = new Actor_comun());
	}
}