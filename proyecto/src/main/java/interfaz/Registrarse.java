package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRegistrarse;

public class Registrarse  extends VistaRegistrarse{
	/*private Label _emailL;
	private TextField _emailTF;
	private Label _nickL;
	private TextField _nickTF;
	private Label _passwordL;
	private TextField _passwordTF;
	private Label _confirmarPassL;
	private TextField _confirmarPassTF;
	private Button _cancelarB;
	private Button _crearCuentaB;
	private Button _loginB;
	private Image _imagen;
	private Button _anadirFotoB;*/
	public Login_cibernauta _loginCibernauta;
	public Verificar_e_mail _verificarE_mail;
	
	public Registrarse() {
		Inicializar();
		this.getBotonIniciarSesion().setVisible(false);
		this.getBotonCancelar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
		this.getBotonCrearCuenta().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				CrearCuenta();
			}
		});
	}

	protected void CrearCuenta() {
		if (this.getNick().getValue().isEmpty() || this.geteMail().getValue().isEmpty() || this.getContraseña().getValue().isEmpty() || this.getRepetirContraseña().getValue().isEmpty()) {
			ControladorVistas.PopUpBasico("Alguno de los campos está vacío");
		}else if (!this.getContraseña().getValue().equals(this.getRepetirContraseña().getValue())) {
			ControladorVistas.PopUpBasico("Las dos contraseñas tienen que ser iguales");
		}else {
			_verificarE_mail = new Verificar_e_mail();
			_verificarE_mail.getStyle().set("width", "100%");
			ControladorVistas.CambiarContenido(_verificarE_mail);
		}
	}

	protected void Cancelar() {
		_loginCibernauta = new Login_cibernauta();
		_loginCibernauta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_loginCibernauta);
	}

	private void Inicializar() {
		// TODO Auto-generated method stub
		
	}

	public void Validar_contrasena() {
		throw new UnsupportedOperationException();
	}

	public void Filtrar_nick_repetido() {
		throw new UnsupportedOperationException();
	}

	public void Filtro_palabras_malsonantes() {
		throw new UnsupportedOperationException();
	}
}