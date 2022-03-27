package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import vistas.VistaArtista_elemento;

/**
 * A Designer generated component for the vista-artistas_similares template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artistas_similares")
@JsModule("./src/vistas/vista-artistas_similares.ts")
public class VistaArtistas_similares extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vistaArtista_elemento")
	private VistaArtista_elemento vistaArtista_elemento;
	@Id("vistaArtista_elemento2")
	private VistaArtista_elemento vistaArtista_elemento2;
	@Id("vistaArtista_elemento1")
	private VistaArtista_elemento vistaArtista_elemento1;

	/**
     * Creates a new VistaArtistas_similares.
     */
    public VistaArtistas_similares() {
        // You can initialise any data required for the connected UI components here.
    }

}
