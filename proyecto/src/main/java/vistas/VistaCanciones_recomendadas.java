package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import vistas.VistaCancion;

/**
 * A Designer generated component for the vista-canciones_recomendadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_recomendadas")
@JsModule("./src/vistas/vista-canciones_recomendadas.ts")
public class VistaCanciones_recomendadas extends LitTemplate {

    

	@Id("layoutPrincipal")
	private VerticalLayout layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("vistaCancion")
	private Element vistaCancion;
	@Id("vistaCancion1")
	private Element vistaCancion1;

	/**
     * Creates a new VistaCanciones_recomendadas.
     */
    public VistaCanciones_recomendadas() {
        // You can initialise any data required for the connected UI components here.
    }

	public VerticalLayout getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(VerticalLayout layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public H1 getH1Titulo() {
		return h1Titulo;
	}

	public void setH1Titulo(H1 h1Titulo) {
		this.h1Titulo = h1Titulo;
	}

	public Element getVistaCancion() {
		return vistaCancion;
	}

	public void setVistaCancion(Element vistaCancion) {
		this.vistaCancion = vistaCancion;
	}

	public Element getVistaCancion1() {
		return vistaCancion1;
	}

	public void setVistaCancion1(Element vistaCancion1) {
		this.vistaCancion1 = vistaCancion1;
	}

	

}
