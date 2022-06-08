package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.template.Id;

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
}
