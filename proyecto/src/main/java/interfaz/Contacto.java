package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

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
		
	}
}