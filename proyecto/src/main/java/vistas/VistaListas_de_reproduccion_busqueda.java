package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_busqueda template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_busqueda")
@JsModule("./src/vistas/vista-listas_de_reproduccion_busqueda.ts")
public class VistaListas_de_reproduccion_busqueda extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("h1")
	private H1 h1;

	/**
     * Creates a new VistaListas_de_reproduccion_busqueda.
     */
    public VistaListas_de_reproduccion_busqueda() {
        // You can initialise any data required for the connected UI components here.
    }

}
