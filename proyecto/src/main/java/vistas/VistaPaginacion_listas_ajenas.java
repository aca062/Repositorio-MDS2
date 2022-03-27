package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaLista_de_reproduccion_ajena;

/**
 * A Designer generated component for the vista-paginacion_listas_ajenas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-paginacion_listas_ajenas")
@JsModule("./src/vistas/vista-paginacion_listas_ajenas.ts")
public class VistaPaginacion_listas_ajenas extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaLista_de_reproduccion_ajena")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena;
	@Id("vistaLista_de_reproduccion_ajena1")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena1;
	@Id("vistaLista_de_reproduccion_ajena2")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena2;
	@Id("vistaLista_de_reproduccion_ajena3")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena3;

	/**
     * Creates a new VistaPaginacion_listas_ajenas.
     */
    public VistaPaginacion_listas_ajenas() {
        // You can initialise any data required for the connected UI components here.
    }

}
