package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCancion;

/**
 * A Designer generated component for the vista-ultimas_canciones_reproducidas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ultimas_canciones_reproducidas")
@JsModule("./src/vistas/vista-ultimas_canciones_reproducidas.ts")
public class VistaUltimas_canciones_reproducidas extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1TituloUltimasCanciones")
	private H1 h1TituloUltimasCanciones;
	@Id("layoutCanciones")
	private HorizontalLayout layoutCanciones;
	@Id("vistaCancion")
	private Element vistaCancion;
	@Id("vistaCancion2")
	private Element vistaCancion2;
	@Id("vistaCancion1")
	private Element vistaCancion1;
	/**
     * Creates a new VistaUltimas_canciones_reproducidas.
     */
    public VistaUltimas_canciones_reproducidas() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}
	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}
	public H1 getH1TituloUltimasCanciones() {
		return h1TituloUltimasCanciones;
	}
	public void setH1TituloUltimasCanciones(H1 h1TituloUltimasCanciones) {
		this.h1TituloUltimasCanciones = h1TituloUltimasCanciones;
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
	public Element getVistaCancion2() {
		return vistaCancion2;
	}
	public void setVistaCancion2(Element vistaCancion2) {
		this.vistaCancion2 = vistaCancion2;
	}
	public Element getVistaCancion1() {
		return vistaCancion1;
	}
	public void setVistaCancion1(Element vistaCancion1) {
		this.vistaCancion1 = vistaCancion1;
	}

}
