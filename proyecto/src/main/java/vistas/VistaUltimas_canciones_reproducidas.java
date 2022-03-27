package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCancion;

/**
 * A Designer generated component for the vista-ultimas_canciones_reproducidas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ultimas_canciones_reproducidas")
@JsModule("./src/vistas/vista-ultimas_canciones_reproducidas.ts")
public class VistaUltimas_canciones_reproducidas extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaCancion")
	private VistaCancion vistaCancion;
	@Id("vistaCancion1")
	private VistaCancion vistaCancion1;
	@Id("vistaCancion2")
	private VistaCancion vistaCancion2;

	/**
     * Creates a new VistaUltimas_canciones_reproducidas.
     */
    public VistaUltimas_canciones_reproducidas() {
        // You can initialise any data required for the connected UI components here.
    }

}
