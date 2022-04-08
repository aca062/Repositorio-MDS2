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

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("nuevaContraseña")
	private TextField nuevaContraseña;
	@Id("vuelvaAIntroducirLaContraseña")
	private TextField vuelvaAIntroducirLaContraseña;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;

	/**
     * Creates a new VistaIntroducir_nueva_contrasena.
     */
    public VistaIntroducir_nueva_contrasena() {
        // You can initialise any data required for the connected UI components here.
    }

	

}
