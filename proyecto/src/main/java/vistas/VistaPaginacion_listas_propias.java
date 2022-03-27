package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaLista_de_reproduccion_propia;

/**
 * A Designer generated component for the vista-paginacion_listas_propias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-paginacion_listas_propias")
@JsModule("./src/vistas/vista-paginacion_listas_propias.ts")
public class VistaPaginacion_listas_propias extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaLista_de_reproduccion_propia")
	private VistaLista_de_reproduccion_propia vistaLista_de_reproduccion_propia;
	@Id("vistaLista_de_reproduccion_propia1")
	private VistaLista_de_reproduccion_propia vistaLista_de_reproduccion_propia1;
	@Id("vistaLista_de_reproduccion_propia2")
	private VistaLista_de_reproduccion_propia vistaLista_de_reproduccion_propia2;

	/**
     * Creates a new VistaPaginacion_listas_propias.
     */
    public VistaPaginacion_listas_propias() {
        // You can initialise any data required for the connected UI components here.
    }

}
