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


	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutListas")
	private HorizontalLayout layoutListas;
	@Id("lista1")
	private Element lista1;
	@Id("lista2")
	private Element lista2;
	@Id("lista3")
	private Element lista3;
	@Id("lista4")
	private Element lista4;

	/**
     * Creates a new VistaPaginacion_listas_ajenas.
     */
    public VistaPaginacion_listas_ajenas() {
        // You can initialise any data required for the connected UI components here.
    }

}
