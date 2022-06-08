package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import bbdd.BDPrincipal;
import bbdd.iCibernauta;
import orm.bbdd.Actor_Comun;
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
			@Override
            public void onComponentEvent(ComponentEvent event) {
				OlvidadoContrasena();
			}
		});
		this.getBotonIniciarSesion().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				try {
                    IniciarSesion();
                } catch (PersistentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
			}
		});
		this.getBotonRegistrarse().addClickListener(new ComponentEventListener(){
			@Override
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
			@Override
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

	protected void IniciarSesion() throws PersistentException {
		//Hay que comprobar el usuario
		String correo = this.getTextFieldCorreo().getValue();
		String contrasena = this.getTextFieldContrasena().getValue();
		Cabecera_pagina cab = new Cabecera_pagina();
		Actor_Comun usuario = cib.getUsuarioCorreo(correo);
		switch(cib.inicioDeSesion(correo, contrasena)){
			case("admin"):
			    ControladorVistas.CambiarUsuario(usuario);
				Administrador admin = new Administrador();
				admin.getStyle().set("width", "100%");
				cab.getStyle().set("width", "100%");
				ControladorVistas.CambiarTipoUsuario("admin");
				ControladorVistas.CambiarContenido(admin);
				ControladorVistas.CambiarCabecera(cab);
				break;
			case("usuario"):
			    ControladorVistas.CambiarUsuario(usuario);
				Usuario_registrado user = new Usuario_registrado();
				user.getStyle().set("width", "100%");
				cab.getStyle().set("width", "100%");
				ControladorVistas.CambiarTipoUsuario("usuario");
				ControladorVistas.CambiarContenido(user);
				ControladorVistas.CambiarCabecera(cab);
				break;
			case("artista"):
			    ControladorVistas.CambiarUsuario(usuario);
				Artista artista = new Artista();
				artista.getStyle().set("width", "100%");
				cab.getStyle().set("width", "100%");
				ControladorVistas.CambiarTipoUsuario("artista");
				ControladorVistas.CambiarContenido(artista);
				ControladorVistas.CambiarCabecera(cab);
				break;
			default:
				ControladorVistas.PopUpBasico("El usuario o la contraseña son incorrectos");
				break;
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