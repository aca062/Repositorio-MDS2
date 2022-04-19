package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaIntroducir_nueva_contrasena;

public class Introducir_nueva_contrasena extends VistaIntroducir_nueva_contrasena{
	/*private Label _tituloL;
	private TextField _nuevaPassTF;
	private TextField _confirmarNuevaPassTF;
	private Label _confirmarL;
	private Button _confirmarB;
	private Button _cancelarB;*/
	public Recuperar_contrasena _recuperarContrasena;
	
	public Introducir_nueva_contrasena() {
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

	void Inicializar() {
		
	}
	
	public void Cancelar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_recuperarContrasena = new Recuperar_contrasena());
	}
	
	public void Confirmar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Actor_comun());
	}
}