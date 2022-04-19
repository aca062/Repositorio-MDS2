package interfaz;

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
		this.getBotonIniciarSesion().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				IniciarSesion();
			}
		});
	}

	protected void IniciarSesion() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Login_cibernauta());
	}

	protected void CrearCuenta() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_verificarE_mail = new Verificar_e_mail());
	}

	protected void Cancelar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_loginCibernauta = new Login_cibernauta());
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