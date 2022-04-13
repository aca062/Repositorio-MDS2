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

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public Element getVistaArtista_elemento() {
		return vistaArtista_elemento;
	}

	public void setVistaArtista_elemento(Element vistaArtista_elemento) {
		this.vistaArtista_elemento = vistaArtista_elemento;
	}

	public H1 getH1Titulo() {
		return h1Titulo;
	}

	public void setH1Titulo(H1 h1Titulo) {
		this.h1Titulo = h1Titulo;
	}

	public Element getVistaArtista_elemento1() {
		return vistaArtista_elemento1;
	}

	public void setVistaArtista_elemento1(Element vistaArtista_elemento1) {
		this.vistaArtista_elemento1 = vistaArtista_elemento1;
	}

	public Element getVistaArtista_elemento2() {
		return vistaArtista_elemento2;
	}

	public void setVistaArtista_elemento2(Element vistaArtista_elemento2) {
		this.vistaArtista_elemento2 = vistaArtista_elemento2;
	}
}
