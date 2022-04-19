package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLogin_cibernauta;

public class Login_cibernauta extends VistaLogin_cibernauta{
	/*private Label _emailL;
	private TextField _emailTF;
	private Label _passwordL;
	private TextField _passwordTF;
	private Button _registrarseB;
	private Button _loginB;
	private Button _recuperarPassB;*/
	public Cabecera_cibernauta _cabeceraCibernauta;
	public Recuperar_contrasena _recuperarContrasena;
	public Registrarse _registrarse;
	
	public Login_cibernauta(){
		super();
		Inicializar();
		this.getBotonHasOlvidadoContrasena().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				OlvidadoContrasena();
			}
		});
		this.getBotonIniciarSesion().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				IniciarSesion();
			}
		});
		this.getBotonRegistrarse().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Registrarse();
			}
		});
	}

	protected void Registrarse() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_registrarse = new Registrarse());
	}

	protected void IniciarSesion() {
		//Hay que comprobar el usuario
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Actor_comun());
	}

	protected void OlvidadoContrasena() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_recuperarContrasena = new Recuperar_contrasena());
	}

	private void Inicializar() {
		
	}
}