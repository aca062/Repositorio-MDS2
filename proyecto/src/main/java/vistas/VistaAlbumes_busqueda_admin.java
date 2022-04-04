package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaAlbum_admin;

/**
 * A Designer generated component for the vista-albumes_busqueda_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-albumes_busqueda_admin")
@JsModule("./src/vistas/vista-albumes_busqueda_admin.ts")
public class VistaAlbumes_busqueda_admin extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("layoutLista")
	private HorizontalLayout layoutLista;
	@Id("vistaAlbum_admin")
	private Element vistaAlbum_admin;
	@Id("vistaAlbum_admin1")
	private Element vistaAlbum_admin1;

	/**
     * Creates a new VistaAlbumes_busqueda_admin.
     */
    public VistaAlbumes_busqueda_admin() {
        // You can initialise any data required for the connected UI components here.
    }

}
