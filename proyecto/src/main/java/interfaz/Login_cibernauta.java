package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import bbdd.BDPrincipal;
import bbdd.iCibernauta;
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
	iCibernauta cib = new BDPrincipal();
	
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
				try {
					Registrarse();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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

	protected void Registrarse() throws PersistentException {
		_registrarse = new Registrarse();
		_registrarse.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_registrarse);
	}

	protected void IniciarSesion() {
		//Hay que comprobar el usuario
		String correo = this.getTextFieldCorreo().getValue();
		String contrasena = this.getTextFieldContrasena().getValue();
		Cabecera_pagina cab = new Cabecera_pagina();
		switch(cib.inicioDeSesion(correo, contrasena)){
			case("admin"):
				Administrador admin = new Administrador();
				admin.getStyle().set("width", "100%");
				cab.getStyle().set("width", "100%");
				ControladorVistas.CambiarUsuario(correo.toString());
				ControladorVistas.CambiarContenido(admin);
				ControladorVistas.CambiarCabecera(cab);
				break;
			case("usuario"):
				Usuario_registrado user = new Usuario_registrado();
				user.getStyle().set("width", "100%");
				cab.getStyle().set("width", "100%");
				ControladorVistas.CambiarUsuario(correo.toString());
				ControladorVistas.CambiarContenido(user);
				ControladorVistas.CambiarCabecera(cab);
				break;
			case("artista"):
				Artista artista = new Artista();
				artista.getStyle().set("width", "100%");
				cab.getStyle().set("width", "100%");
				ControladorVistas.CambiarUsuario(correo.toString());
				ControladorVistas.CambiarContenido(artista);
				ControladorVistas.CambiarCabecera(cab);
				break;
			default:
				ControladorVistas.PopUpBasico("El usuario o la contraseña son incorrectos");
				break;
		}
		/*
		if (correo.toString().equals("admin") && contrasena.equals("admin")) {
			Administrador admin = new Administrador();
			Cabecera_pagina cab = new Cabecera_pagina();
			admin.getStyle().set("width", "100%");
			cab.getStyle().set("width", "100%");
			ControladorVistas.CambiarUsuario(correo.toString());
			ControladorVistas.CambiarContenido(admin);
			ControladorVistas.CambiarCabecera(cab);
		}else if(correo.toString().equals("usuario") && contrasena.equals("usuario")) {
			Usuario_registrado user = new Usuario_registrado();
			Cabecera_pagina cab = new Cabecera_pagina();
			user.getStyle().set("width", "100%");
			cab.getStyle().set("width", "100%");
			ControladorVistas.CambiarUsuario(correo.toString());
			ControladorVistas.CambiarContenido(user);
			ControladorVistas.CambiarCabecera(cab);
		}else if(correo.toString().equals("artista") && contrasena.equals("artista")) {
			Artista artista = new Artista();
			Cabecera_pagina cab = new Cabecera_pagina();
			artista.getStyle().set("width", "100%");
			cab.getStyle().set("width", "100%");
			ControladorVistas.CambiarUsuario(correo.toString());
			ControladorVistas.CambiarContenido(artista);
			ControladorVistas.CambiarCabecera(cab);
		}else {
			ControladorVistas.PopUpBasico("El usuario o la contraseña son incorrectos");
		}*/
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