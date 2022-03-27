package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCancion_cibernauta;

/**
 * A Designer generated component for the vista-ultimos_exitos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ultimos_exitos")
@JsModule("./src/vistas/vista-ultimos_exitos.ts")
public class VistaUltimos_exitos extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaCancion_cibernauta")
	private VistaCancion_cibernauta vistaCancion_cibernauta;
	@Id("vistaCancion_cibernauta1")
	private VistaCancion_cibernauta vistaCancion_cibernauta1;
	@Id("vistaCancion_cibernauta2")
	private VistaCancion_cibernauta vistaCancion_cibernauta2;
	@Id("vistaCancion_cibernauta3")
	private VistaCancion_cibernauta vistaCancion_cibernauta3;

	/**
     * Creates a new VistaUltimos_exitos.
     */
    public VistaUltimos_exitos() {
        // You can initialise any data required for the connected UI components here.
    }

}
