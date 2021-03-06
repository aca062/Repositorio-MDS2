package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaLista_de_reproduccion_favoritos;

/**
 * A Designer generated component for the vista-ver_mas_canciones_favoritas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_mas_canciones_favoritas")
@JsModule("./src/vistas/vista-ver_mas_canciones_favoritas.ts")
public class VistaVer_mas_canciones_favoritas extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("vistaLista_de_reproduccion_favoritos")
	private Element vistaLista_de_reproduccion_favoritos;

	/**
     * Creates a new VistaVer_mas_canciones_favoritas.
     */
    public VistaVer_mas_canciones_favoritas() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public Element getVistaLista_de_reproduccion_favoritos() {
		return vistaLista_de_reproduccion_favoritos;
	}

	public void setVistaLista_de_reproduccion_favoritos(Element vistaLista_de_reproduccion_favoritos) {
		this.vistaLista_de_reproduccion_favoritos = vistaLista_de_reproduccion_favoritos;
	}
    
}
