package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaAlbum;

/**
 * A Designer generated component for the vista-lista_albumes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_albumes")
@JsModule("./src/vistas/vista-lista_albumes.ts")
public class VistaLista_albumes extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("layoutAlbumes")
	private HorizontalLayout layoutAlbumes;
	@Id("vistaAlbum")
	private Element vistaAlbum;
	@Id("vistaAlbum1")
	private Element vistaAlbum1;

	/**
     * Creates a new VistaLista_albumes.
     */
    public VistaLista_albumes() {
        // You can initialise any data required for the connected UI components here.
    }


}
