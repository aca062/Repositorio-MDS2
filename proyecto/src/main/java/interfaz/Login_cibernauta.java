package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

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
		this.getLogo().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Logo();
			}
		});
	}
	
	private void Inicializar() {
		
	}

	protected void Registrarse() {
		_registrarse = new Registrarse();
		_registrarse.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_registrarse);
	}

	protected void IniciarSesion() {
		//Hay que comprobar el usuario
		String correo = this.getTextFieldCorreo().getValue();
		if (correo.toString().equals("admin")) {
			Administrador admin = new Administrador();
			admin.getStyle().set("width", "100%");
			//ControladorVistas.CambiarContenido(admin);
			/*VerticalLayout popupContent = new VerticalLayout();
			popupContent.addComponent(new TextField("Textfield"));
			popupContent.addComponent(new Button("Button"));*/
			ControladorVistas.PopUpError("Hola");
		}
	}

	protected void OlvidadoContrasena() {
		_recuperarContrasena = new Recuperar_contrasena();
		_recuperarContrasena.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_recuperarContrasena);
	}
	
	private void Logo() {
		Cibernauta _cibernauta = new Cibernauta();
		_cibernauta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_cibernauta);
	}
}