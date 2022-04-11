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


}
