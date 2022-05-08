package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRecuperar_contrasena;

public class Recuperar_contrasena  extends VistaRecuperar_contrasena{
	/*private Label _tituloL;
	private Label _instruccionesL;
	private TextField _emailTF;
	private Button _confirmarB;*/
	public Login_cibernauta _loginCibernauta;
	public Introducir_nueva_contrasena _introducirNuevaContrasena;
	
	public Recuperar_contrasena() {
		Inicializar();
		this.getBotonConfirmarCorreo().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});
	}

	protected void Confirmar() {
		if (this.getTextFieldCorreo().getValue().toString().isEmpty()) {
			ControladorVistas.PopUpBasico("No se ha introducido ningún correo");
		}else {
			_introducirNuevaContrasena = new Introducir_nueva_contrasena();
			_introducirNuevaContrasena.getStyle().set("width", "100%");
			ControladorVistas.CambiarContenido(_introducirNuevaContrasena);
		}
	}

	public void Enviar_link() {
		throw new UnsupportedOperationException();
	}
	
	void Inicializar() {
	}
}