package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaArtista_admin;

/**
 * A Designer generated component for the vista-artistas_busqueda_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artistas_busqueda_admin")
@JsModule("./src/vistas/vista-artistas_busqueda_admin.ts")
public class VistaArtistas_busqueda_admin extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("layoutArtistas")
	private HorizontalLayout layoutArtistas;
	@Id("vistaArtista_admin")
	private Element vistaArtista_admin;
	@Id("vistaArtista_admin1")
	private Element vistaArtista_admin1;

	/**
     * Creates a new VistaArtistas_busqueda_admin.
     */
    public VistaArtistas_busqueda_admin() {
        // You can initialise any data required for the connected UI components here.
    }

}
