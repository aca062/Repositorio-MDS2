package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-canciones_busqueda template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_busqueda")
@JsModule("./src/vistas/vista-canciones_busqueda.ts")
public class VistaCanciones_busqueda extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;

	/**
     * Creates a new VistaCanciones_busqueda.
     */
    public VistaCanciones_busqueda() {
        // You can initialise any data required for the connected UI components here.
    }

}
