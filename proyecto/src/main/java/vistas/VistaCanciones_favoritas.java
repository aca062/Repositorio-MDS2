package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.button.Button;
import vistas.VistaCancion;

/**
 * A Designer generated component for the vista-canciones_favoritas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_favoritas")
@JsModule("./src/vistas/vista-canciones_favoritas.ts")
public class VistaCanciones_favoritas extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutTitulo")
	private HorizontalLayout layoutTitulo;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("verMas")
	private Button verMas;
	@Id("layoutCanciones")
	private HorizontalLayout layoutCanciones;
	@Id("vistaCancion")
	private Element vistaCancion;
	@Id("vistaCancion1")
	private Element vistaCancion1;
	@Id("vistaCancion2")
	private Element vistaCancion2;

	/**
     * Creates a new VistaCanciones_favoritas.
     */
    public VistaCanciones_favoritas() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutTitulo() {
		return layoutTitulo;
	}

	public void setLayoutTitulo(HorizontalLayout layoutTitulo) {
		this.layoutTitulo = layoutTitulo;
	}

	public H1 getH1Titulo() {
		return h1Titulo;
	}

	public void setH1Titulo(H1 h1Titulo) {
		this.h1Titulo = h1Titulo;
	}

	public Button getVerMas() {
		return verMas;
	}

	public void setVerMas(Button verMas) {
		this.verMas = verMas;
	}

	public HorizontalLayout getLayoutCanciones() {
		return layoutCanciones;
	}

	public void setLayoutCanciones(HorizontalLayout layoutCanciones) {
		this.layoutCanciones = layoutCanciones;
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

}
