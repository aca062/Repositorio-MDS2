package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-estilo_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-estilo_admin")
@JsModule("./src/vistas/vista-estilo_admin.ts")
public class VistaEstilo_admin extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutEstilo")
	private HorizontalLayout layoutEstilo;
	@Id("estilo")
	private H4 estilo;
	@Id("eliminar")
	private Button eliminar;
	@Id("editar")
	private Button editar;

	/**
     * Creates a new VistaEstilo_admin.
     */
    public VistaEstilo_admin() {
        // You can initialise any data required for the connected UI components here.
    }

	

}
