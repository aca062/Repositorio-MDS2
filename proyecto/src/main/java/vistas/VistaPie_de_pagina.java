package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H5;

/**
 * A Designer generated component for the vista-pie_de_pagina template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pie_de_pagina")
@JsModule("./src/vistas/vista-pie_de_pagina.ts")
public class VistaPie_de_pagina extends LitTemplate {

	@Id("h5")
	private H5 h5;
	@Id("layoutPrincipal")
	private Element layoutPrincipal;

	/**
     * Creates a new VistaPie_de_pagina.
     */
    public VistaPie_de_pagina() {
        // You can initialise any data required for the connected UI components here.
    }

	public H5 getH5() {
		return h5;
	}

	public void setH5(H5 h5) {
		this.h5 = h5;
	}

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

}
