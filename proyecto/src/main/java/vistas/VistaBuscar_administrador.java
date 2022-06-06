package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-buscar_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar_administrador")
@JsModule("./src/vistas/vista-buscar_administrador.ts")
public class VistaBuscar_administrador extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;

	/**
     * Creates a new VistaBuscar_administrador.
     */
    public VistaBuscar_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}
}
