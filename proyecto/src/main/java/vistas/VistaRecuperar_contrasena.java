package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-recuperar_contrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-recuperar_contrasena")
@JsModule("./src/vistas/vista-recuperar_contrasena.ts")
public class VistaRecuperar_contrasena extends LitTemplate {



	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutRecuperarContrasena")
	private Element layoutRecuperarContrasena;
	@Id("h3RecuperacionContrasena")
	private H3 h3RecuperacionContrasena;
	@Id("layoutCorreo")
	private HorizontalLayout layoutCorreo;
	@Id("h4Instrucciones")
	private H4 h4Instrucciones;
	@Id("botonConfirmarCorreo")
	private Button botonConfirmarCorreo;
	@Id("textFieldCorreo")
	private TextField textFieldCorreo;

	/**
     * Creates a new VistaRecuperar_contrasena.
     */
    public VistaRecuperar_contrasena() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public Element getLayoutRecuperarContrasena() {
		return layoutRecuperarContrasena;
	}

	public void setLayoutRecuperarContrasena(Element layoutRecuperarContrasena) {
		this.layoutRecuperarContrasena = layoutRecuperarContrasena;
	}

	public H3 getH3RecuperacionContrasena() {
		return h3RecuperacionContrasena;
	}

	public void setH3RecuperacionContrasena(H3 h3RecuperacionContrasena) {
		this.h3RecuperacionContrasena = h3RecuperacionContrasena;
	}

	public HorizontalLayout getLayoutCorreo() {
		return layoutCorreo;
	}

	public void setLayoutCorreo(HorizontalLayout layoutCorreo) {
		this.layoutCorreo = layoutCorreo;
	}

	public H4 getH4Instrucciones() {
		return h4Instrucciones;
	}

	public void setH4Instrucciones(H4 h4Instrucciones) {
		this.h4Instrucciones = h4Instrucciones;
	}

	public Button getBotonConfirmarCorreo() {
		return botonConfirmarCorreo;
	}

	public void setBotonConfirmarCorreo(Button botonConfirmarCorreo) {
		this.botonConfirmarCorreo = botonConfirmarCorreo;
	}

	public TextField getTextFieldCorreo() {
		return textFieldCorreo;
	}

	public void setTextFieldCorreo(TextField textFieldCorreo) {
		this.textFieldCorreo = textFieldCorreo;
	}


}
