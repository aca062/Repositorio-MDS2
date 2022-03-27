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
     * Creates a new VistaArtistas_recomendados.
     */
    public VistaArtistas_recomendados() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}
	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	public H1 getH1() {
		return h1;
	}
	public void setH1(H1 h1) {
		this.h1 = h1;
	}
	public VistaArtista_elemento getVistaArtista_elemento() {
		return vistaArtista_elemento;
	}
	public void setVistaArtista_elemento(VistaArtista_elemento vistaArtista_elemento) {
		this.vistaArtista_elemento = vistaArtista_elemento;
	}
	public VistaArtista_elemento getVistaArtista_elemento2() {
		return vistaArtista_elemento2;
	}
	public void setVistaArtista_elemento2(VistaArtista_elemento vistaArtista_elemento2) {
		this.vistaArtista_elemento2 = vistaArtista_elemento2;
	}
	public VistaArtista_elemento getVistaArtista_elemento1() {
		return vistaArtista_elemento1;
	}
	public void setVistaArtista_elemento1(VistaArtista_elemento vistaArtista_elemento1) {
		this.vistaArtista_elemento1 = vistaArtista_elemento1;
	}

}
