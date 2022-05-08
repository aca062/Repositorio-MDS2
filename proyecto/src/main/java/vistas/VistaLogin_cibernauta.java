package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H5;

/**
 * A Designer generated component for the vista-login_cibernauta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-login_cibernauta")
@JsModule("./src/vistas/vista-login_cibernauta.ts")
public class VistaLogin_cibernauta extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutLogin")
	private Element layoutLogin;
	@Id("logo")
	private Button logo;
	@Id("textFieldCorreo")
	private TextField textFieldCorreo;
	@Id("textFieldContrasena")
	private PasswordField textFieldContrasena;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("botonRegistrarse")
	private Button botonRegistrarse;
	@Id("layoutFacebook")
	private HorizontalLayout layoutFacebook;
	@Id("botonIniciarSesion")
	private Button botonIniciarSesion;
	@Id("botonFacebook")
	private Button botonFacebook;
	@Id("textoFacebook")
	private H5 textoFacebook;
	@Id("layoutGoogle")
	private HorizontalLayout layoutGoogle;
	@Id("textoGoogle")
	private H5 textoGoogle;
	@Id("botonGoogle")
	private Button botonGoogle;
	@Id("botonHasOlvidadoContrasena")
	private Button botonHasOlvidadoContrasena;
	/**
     * Creates a new VistaLogin_cibernauta.
     */
    public VistaLogin_cibernauta() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}
	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}
	public Element getLayoutLogin() {
		return layoutLogin;
	}
	public void setLayoutLogin(Element layoutLogin) {
		this.layoutLogin = layoutLogin;
	}
	public Button getLogo() {
		return logo;
	}
	public void setLogo(Button logo) {
		this.logo = logo;
	}
	public TextField getTextFieldCorreo() {
		return textFieldCorreo;
	}
	public void setTextFieldCorreo(TextField textFieldCorreo) {
		this.textFieldCorreo = textFieldCorreo;
	}
	public PasswordField getTextFieldContrasena() {
		return textFieldContrasena;
	}
	public void setTextFieldContrasena(PasswordField textFieldContrasena) {
		this.textFieldContrasena = textFieldContrasena;
	}
	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}
	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}
	public Button getBotonRegistrarse() {
		return botonRegistrarse;
	}
	public void setBotonRegistrarse(Button botonRegistrarse) {
		this.botonRegistrarse = botonRegistrarse;
	}
	public HorizontalLayout getLayoutFacebook() {
		return layoutFacebook;
	}
	public void setLayoutFacebook(HorizontalLayout layoutFacebook) {
		this.layoutFacebook = layoutFacebook;
	}
	public Button getBotonIniciarSesion() {
		return botonIniciarSesion;
	}
	public void setBotonIniciarSesion(Button botonIniciarSesion) {
		this.botonIniciarSesion = botonIniciarSesion;
	}
	public Button getBotonFacebook() {
		return botonFacebook;
	}
	public void setBotonFacebook(Button botonFacebook) {
		this.botonFacebook = botonFacebook;
	}
	public H5 getTextoFacebook() {
		return textoFacebook;
	}
	public void setTextoFacebook(H5 textoFacebook) {
		this.textoFacebook = textoFacebook;
	}
	public HorizontalLayout getLayoutGoogle() {
		return layoutGoogle;
	}
	public void setLayoutGoogle(HorizontalLayout layoutGoogle) {
		this.layoutGoogle = layoutGoogle;
	}
	public H5 getTextoGoogle() {
		return textoGoogle;
	}
	public void setTextoGoogle(H5 textoGoogle) {
		this.textoGoogle = textoGoogle;
	}
	public Button getBotonGoogle() {
		return botonGoogle;
	}
	public void setBotonGoogle(Button botonGoogle) {
		this.botonGoogle = botonGoogle;
	}
	public Button getBotonHasOlvidadoContrasena() {
		return botonHasOlvidadoContrasena;
	}
	public void setBotonHasOlvidadoContrasena(Button botonHasOlvidadoContrasena) {
		this.botonHasOlvidadoContrasena = botonHasOlvidadoContrasena;
	}
}
