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

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("h3")
	private H3 h3;
	@Id("h4")
	private H4 h4;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaRecuperar_contrasena.
     */
    public VistaRecuperar_contrasena() {
        // You can initialise any data required for the connected UI components here.
    }

}
