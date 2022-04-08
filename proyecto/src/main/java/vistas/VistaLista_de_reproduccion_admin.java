package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-lista_de_reproduccion_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_admin")
@JsModule("./src/vistas/vista-lista_de_reproduccion_admin.ts")
public class VistaLista_de_reproduccion_admin extends LitTemplate {

    
	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutLista")
	private HorizontalLayout layoutLista;
	@Id("imgLista")
	private Image imgLista;
	@Id("h4Nombre")
	private H4 h4Nombre;
	@Id("editar")
	private Button editar;

	/**
     * Creates a new VistaLista_de_reproduccion_admin.
     */
    public VistaLista_de_reproduccion_admin() {
        // You can initialise any data required for the connected UI components here.
    }

	

}
