package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCancion_cibernauta;

/**
 * A Designer generated component for the vista-ultimos_exitos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ultimos_exitos")
@JsModule("./src/vistas/vista-ultimos_exitos.ts")
public class VistaUltimos_exitos extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1TituloUltimosExitos")
	private H1 h1TituloUltimosExitos;
	@Id("layoutCanciones")
	private HorizontalLayout layoutCanciones;
	@Id("vistaCancion_cibernauta")
	private Element vistaCancion_cibernauta;
	@Id("vistaCancion_cibernauta1")
	private Element vistaCancion_cibernauta1;
	@Id("vistaCancion_cibernauta2")
	private Element vistaCancion_cibernauta2;

	/**
     * Creates a new VistaUltimos_exitos.
     */
    public VistaUltimos_exitos() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public H1 getH1TituloUltimosExitos() {
		return h1TituloUltimosExitos;
	}

	public void setH1TituloUltimosExitos(H1 h1TituloUltimosExitos) {
		this.h1TituloUltimosExitos = h1TituloUltimosExitos;
	}

	public HorizontalLayout getLayoutCanciones() {
		return layoutCanciones;
	}

	public void setLayoutCanciones(HorizontalLayout layoutCanciones) {
		this.layoutCanciones = layoutCanciones;
	}

	public Element getVistaCancion_cibernauta() {
		return vistaCancion_cibernauta;
	}

	public void setVistaCancion_cibernauta(Element vistaCancion_cibernauta) {
		this.vistaCancion_cibernauta = vistaCancion_cibernauta;
	}

	public Element getVistaCancion_cibernauta1() {
		return vistaCancion_cibernauta1;
	}

	public void setVistaCancion_cibernauta1(Element vistaCancion_cibernauta1) {
		this.vistaCancion_cibernauta1 = vistaCancion_cibernauta1;
	}

	public Element getVistaCancion_cibernauta2() {
		return vistaCancion_cibernauta2;
	}

	public void setVistaCancion_cibernauta2(Element vistaCancion_cibernauta2) {
		this.vistaCancion_cibernauta2 = vistaCancion_cibernauta2;
	}

}
