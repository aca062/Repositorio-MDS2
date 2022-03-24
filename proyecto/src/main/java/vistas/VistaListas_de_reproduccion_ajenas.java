package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaLista_de_reproduccion_ajena;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_ajenas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_ajenas")
@JsModule("./src/vistas/vista-listas_de_reproduccion_ajenas.ts")
public class VistaListas_de_reproduccion_ajenas extends LitTemplate {

    @Id("vistaLista_de_reproduccion_ajena")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena;
	@Id("vistaLista_de_reproduccion_ajena1")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena1;
	@Id("vistaLista_de_reproduccion_ajena2")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena2;
	@Id("vistaLista_de_reproduccion_ajena3")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena3;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("h1")
	private H1 h1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaListas_de_reproduccion_ajenas.
     */
    public VistaListas_de_reproduccion_ajenas() {
        // You can initialise any data required for the connected UI components here.
    }

}
