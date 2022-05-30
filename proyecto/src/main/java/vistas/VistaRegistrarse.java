package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.upload.Upload;

/**
 * A Designer generated component for the vista-registrarse template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registrarse")
@JsModule("./src/vistas/vista-registrarse.ts")
public class VistaRegistrarse extends LitTemplate {


	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutFoto")
	private Element layoutFoto;
	@Id("fotoPerfil")
	private Image fotoPerfil;
	@Id("layoutFormulario")
	private Element layoutFormulario;
	@Id("nick")
	private TextField nick;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("botonIniciarSesion")
	private Button botonIniciarSesion;
	@Id("botonCrearCuenta")
	private Button botonCrearCuenta;
	@Id("botonCancelar")
	private Button botonCancelar;
	@Id("repetirContrasena")
	private PasswordField repetirContrasena;
	@Id("contrasena")
	private PasswordField contrasena;
	@Id("subidaDeFoto")
	private Upload subidaDeFoto;
	@Id("eMail")
	private TextField eMail;
	@Id("botonFoto")
	private Button botonFoto;

	/**
     * Creates a new VistaRegistrarse.
     */
    public VistaRegistrarse() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public Element getLayoutFoto() {
		return layoutFoto;
	}

	public void setLayoutFoto(Element layoutFoto) {
		this.layoutFoto = layoutFoto;
	}

	public Image getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(Image fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	public Element getLayoutFormulario() {
		return layoutFormulario;
	}

	public void setLayoutFormulario(Element layoutFormulario) {
		this.layoutFormulario = layoutFormulario;
	}

	public TextField geteMail() {
		return eMail;
	}

	public void seteMail(TextField eMail) {
		this.eMail = eMail;
	}

	public TextField getNick() {
		return nick;
	}

	public void setNick(TextField nick) {
		this.nick = nick;
	}

	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}

	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}

	public Button getBotonIniciarSesion() {
		return botonIniciarSesion;
	}

	public void setBotonIniciarSesion(Button botonIniciarSesion) {
		this.botonIniciarSesion = botonIniciarSesion;
	}

	public Button getBotonCrearCuenta() {
		return botonCrearCuenta;
	}

	public void setBotonCrearCuenta(Button botonCrearCuenta) {
		this.botonCrearCuenta = botonCrearCuenta;
	}

	public Button getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(Button botonCancelar) {
		this.botonCancelar = botonCancelar;
	}

	public PasswordField getRepetirContrasena() {
		return repetirContrasena;
	}

	public void setRepetirContrasena(PasswordField repetirContrasena) {
		this.repetirContrasena = repetirContrasena;
	}

	public PasswordField getContrasena() {
		return contrasena;
	}

	public void setContrasena(PasswordField contrasena) {
		this.contrasena = contrasena;
	}

	public Upload getSubidaDeFoto() {
		return subidaDeFoto;
	}

	public void setSubidaDeFoto(Upload subidaDeFoto) {
		this.subidaDeFoto = subidaDeFoto;
	}

	public Button getBotonFoto() {
		return botonFoto;
	}

	public void setBotonFoto(Button botonFoto) {
		this.botonFoto = botonFoto;
	}


}
