package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCancion;

/**
 * A Designer generated component for the vista-lista_de_canciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_canciones")
@JsModule("./src/vistas/vista-lista_de_canciones.ts")
public class VistaLista_de_canciones extends LitTemplate {

    

	@Id("layoutPrincipal")
	private VerticalLayout layoutPrincipal;
	@Id("vistaCancion")
	private Element vistaCancion;
	@Id("vistaCancion1")
	private Element vistaCancion1;
	@Id("vistaCancion2")
	private Element vistaCancion2;
	@Id("vistaCancion3")
	private Element vistaCancion3;

	/**
     * Creates a new VistaLista_de_canciones.
     */
    public VistaLista_de_canciones() {
        // You can initialise any data required for the connected UI components here.
    }

	public VerticalLayout getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(VerticalLayout layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
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

	public Element getVistaCancion2() {
		return vistaCancion2;
	}

	public void setVistaCancion2(Element vistaCancion2) {
		this.vistaCancion2 = vistaCancion2;
	}

	public Element getVistaCancion3() {
		return vistaCancion3;
	}

	public void setVistaCancion3(Element vistaCancion3) {
		this.vistaCancion3 = vistaCancion3;
	}

	

}
