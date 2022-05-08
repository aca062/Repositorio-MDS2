package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;

/**
 * A Designer generated component for the vista-pie_de_pagina template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pie_de_pagina")
@JsModule("./src/vistas/vista-pie_de_pagina.ts")
public class VistaPie_de_pagina extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h3")
	private H3 h3;
	@Id("layoutInformacion")
	private Element layoutInformacion;
	@Id("h4Telefono")
	private H4 h4Telefono;
	@Id("h41Correo")
	private H4 h41Correo;

	/**
     * Creates a new VistaPie_de_pagina.
     */
    public VistaPie_de_pagina() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

}
