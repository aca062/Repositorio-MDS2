package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaLista_de_reproduccion_propia;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_propias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_propias")
@JsModule("./src/vistas/vista-listas_de_reproduccion_propias.ts")
public class VistaListas_de_reproduccion_propias extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("layoutListasPropias")
	private HorizontalLayout layoutListasPropias;
	@Id("vistaLista_de_reproduccion_propia")
	private Element vistaLista_de_reproduccion_propia;
	@Id("vistaLista_de_reproduccion_propia1")
	private Element vistaLista_de_reproduccion_propia1;
	@Id("vistaLista_de_reproduccion_propia3")
	private Element vistaLista_de_reproduccion_propia3;
	@Id("vistaLista_de_reproduccion_propia2")
	private Element vistaLista_de_reproduccion_propia2;
	@Id("vistaLista_de_reproduccion_propia4")
	private Element vistaLista_de_reproduccion_propia4;
	@Id("layoutBoton")
	private HorizontalLayout layoutBoton;
	@Id("verTodas")
	private Button verTodas;

	/**
     * Creates a new VistaListas_de_reproduccion_propias.
     */
    public VistaListas_de_reproduccion_propias() {
        // You can initialise any data required for the connected UI components here.
    }

	

}
