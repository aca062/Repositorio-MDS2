package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import vistas.VistaArtista_elemento;

/**
 * A Designer generated component for the vista-artistas_recomendados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artistas_recomendados")
@JsModule("./src/vistas/vista-artistas_recomendados.ts")
public class VistaArtistas_recomendados extends LitTemplate {

   
	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("vistaArtista_elemento")
	private Element vistaArtista_elemento;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("vistaArtista_elemento1")
	private Element vistaArtista_elemento1;
	@Id("vistaArtista_elemento2")
	private Element vistaArtista_elemento2;

	/**
     * Creates a new VistaArtistas_recomendados.
     */
    public VistaArtistas_recomendados() {
        // You can initialise any data required for the connected UI components here.
    }
}
