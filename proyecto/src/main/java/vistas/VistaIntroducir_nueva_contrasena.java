package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-introducir_nueva_contrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-introducir_nueva_contrasena")
@JsModule("./src/vistas/vista-introducir_nueva_contrasena.ts")
public class VistaIntroducir_nueva_contrasena extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("h2")
	private H2 h2;
	@Id("vuelvaAIntroducirLaContraseña")
	private TextField vuelvaAIntroducirLaContraseña;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("nuevaContraseña")
	private TextField nuevaContraseña;

	/**
     * Creates a new VistaIntroducir_nueva_contrasena.
     */
    public VistaIntroducir_nueva_contrasena() {
        // You can initialise any data required for the connected UI components here.
    }

}
