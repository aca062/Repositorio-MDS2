package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.textfield.TextField;
import vistas.VistaBuscar_administrador;

/**
 * A Designer generated component for the vista-buscar_elemento template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar_elemento")
@JsModule("./src/vistas/vista-buscar_elemento.ts")
public class VistaBuscar_elemento extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("vistaBuscar_administrador")
	private VistaBuscar_administrador vistaBuscar_administrador;

	/**
     * Creates a new VistaBuscar_elemento.
     */
    public VistaBuscar_elemento() {
        // You can initialise any data required for the connected UI components here.
    }

}
