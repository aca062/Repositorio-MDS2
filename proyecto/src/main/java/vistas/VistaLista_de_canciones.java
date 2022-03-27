package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCancion;

/**
 * A Designer generated component for the vista-lista_de_canciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_canciones")
@JsModule("./src/vistas/vista-lista_de_canciones.ts")
public class VistaLista_de_canciones extends LitTemplate {

    @Id("vistaCancion")
	private VistaCancion vistaCancion;
	@Id("vistaCancion1")
	private VistaCancion vistaCancion1;
	@Id("vistaCancion2")
	private VistaCancion vistaCancion2;
	@Id("vistaCancion3")
	private VistaCancion vistaCancion3;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaLista_de_canciones.
     */
    public VistaLista_de_canciones() {
        // You can initialise any data required for the connected UI components here.
    }

}
