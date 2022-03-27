package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import vistas.VistaCancion;

/**
 * A Designer generated component for the vista-canciones_mas_escuchadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_mas_escuchadas")
@JsModule("./src/vistas/vista-canciones_mas_escuchadas.ts")
public class VistaCanciones_mas_escuchadas extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vistaCancion")
	private VistaCancion vistaCancion;
	@Id("vistaCancion2")
	private VistaCancion vistaCancion2;
	@Id("vistaCancion1")
	private VistaCancion vistaCancion1;

	/**
     * Creates a new VistaCanciones_mas_escuchadas.
     */
    public VistaCanciones_mas_escuchadas() {
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

	public VistaCancion getVistaCancion() {
		return vistaCancion;
	}

	public void setVistaCancion(VistaCancion vistaCancion) {
		this.vistaCancion = vistaCancion;
	}

	public VistaCancion getVistaCancion2() {
		return vistaCancion2;
	}

	public void setVistaCancion2(VistaCancion vistaCancion2) {
		this.vistaCancion2 = vistaCancion2;
	}

	public VistaCancion getVistaCancion1() {
		return vistaCancion1;
	}

	public void setVistaCancion1(VistaCancion vistaCancion1) {
		this.vistaCancion1 = vistaCancion1;
	}

}
