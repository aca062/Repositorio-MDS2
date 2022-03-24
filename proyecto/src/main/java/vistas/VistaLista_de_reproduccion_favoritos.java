package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaCancion;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-lista_de_reproduccion_favoritos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_favoritos")
@JsModule("./src/vistas/vista-lista_de_reproduccion_favoritos.ts")
public class VistaLista_de_reproduccion_favoritos extends LitTemplate {

    @Id("vistaCancion")
	private VistaCancion vistaCancion;
	@Id("vistaCancion1")
	private VistaCancion vistaCancion1;
	@Id("vistaCancion2")
	private VistaCancion vistaCancion2;
	@Id("h1")
	private H1 h1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaLista_de_reproduccion_favoritos.
     */
    public VistaLista_de_reproduccion_favoritos() {
        // You can initialise any data required for the connected UI components here.
    }

}
