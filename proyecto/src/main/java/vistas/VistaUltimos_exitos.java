package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

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

}
