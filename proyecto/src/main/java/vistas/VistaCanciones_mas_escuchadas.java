package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import vistas.VistaCancion;

/**
 * A Designer generated component for the vista-canciones_mas_escuchadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_mas_escuchadas")
@JsModule("./src/vistas/vista-canciones_mas_escuchadas.ts")
public class VistaCanciones_mas_escuchadas extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vistaCancion")
	private VistaCancion vistaCancion;
	@Id("vistaCancion2")
	private VistaCancion vistaCancion2;
	@Id("vistaCancion1")
	private VistaCancion vistaCancion1;

	/**
     * Creates a new VistaCanciones_mas_escuchadas.
     */
    public VistaCanciones_mas_escuchadas() {
        // You can initialise any data required for the connected UI components here.
    }

}
