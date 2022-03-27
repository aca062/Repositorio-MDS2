package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.button.Button;
import vistas.VistaCancion;

/**
 * A Designer generated component for the vista-canciones_favoritas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_favoritas")
@JsModule("./src/vistas/vista-canciones_favoritas.ts")
public class VistaCanciones_favoritas extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("h1")
	private H1 h1;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaCancion")
	private VistaCancion vistaCancion;
	@Id("vistaCancion1")
	private VistaCancion vistaCancion1;
	@Id("vistaCancion2")
	private VistaCancion vistaCancion2;

	/**
     * Creates a new VistaCanciones_favoritas.
     */
    public VistaCanciones_favoritas() {
        // You can initialise any data required for the connected UI components here.
    }

}
