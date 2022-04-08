package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import vistas.VistaAlbum;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-lista_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_album")
@JsModule("./src/vistas/vista-lista_album.ts")
public class VistaLista_album extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("vistaAlbum")
	private Element vistaAlbum;
	@Id("vistaAlbum1")
	private Element vistaAlbum1;
	@Id("vistaAlbum2")
	private Element vistaAlbum2;
	@Id("layoutBoton")
	private HorizontalLayout layoutBoton;
	@Id("verMas")
	private Button verMas;

	/**
     * Creates a new VistaLista_album.
     */
    public VistaLista_album() {
        // You can initialise any data required for the connected UI components here.
    }

	

}
