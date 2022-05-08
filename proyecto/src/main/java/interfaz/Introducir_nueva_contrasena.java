package interfaz;

import com.example.test.ControladorVistas;
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
		_recuperarContrasena = new Recuperar_contrasena();
		_recuperarContrasena.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_recuperarContrasena);
	}
	
	public void Confirmar() {
		if (!this.getNuevaContraseña().getValue().toString().isEmpty() && 
			!this.getVuelvaAIntroducirLaContraseña().getValue().toString().isEmpty()) {
			if (!this.getNuevaContraseña().getValue().toString().equals(this.getVuelvaAIntroducirLaContraseña().getValue().toString())) {
				ControladorVistas.PopUpBasico("Las dos contraseñas no son iguales");
			}else {
				ControladorVistas.CambiarContenido(new Cibernauta());
			}
		}else {
			ControladorVistas.PopUpBasico("Uno de los campos está vacío");
		}
	}
}