package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCancion_admin;

/**
 * A Designer generated component for the vista-canciones_busqueda_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_busqueda_admin")
@JsModule("./src/vistas/vista-canciones_busqueda_admin.ts")
public class VistaCanciones_busqueda_admin extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("layoutCanciones")
	private HorizontalLayout layoutCanciones;
	@Id("vistaCancion_admin")
	private Element vistaCancion_admin;
	@Id("vistaCancion_admin1")
	private Element vistaCancion_admin1;

	/**
     * Creates a new VistaCanciones_busqueda_admin.
     */
    public VistaCanciones_busqueda_admin() {
        // You can initialise any data required for the connected UI components here.
    }

	
}
