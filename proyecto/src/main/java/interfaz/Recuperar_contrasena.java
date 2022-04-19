package interfaz;

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
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_introducirNuevaContrasena = new Introducir_nueva_contrasena());
	}

	public void Enviar_link() {
		throw new UnsupportedOperationException();
	}
	
	void Inicializar() {
	}
}