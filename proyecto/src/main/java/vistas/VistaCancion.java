package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.H6;

/**
 * A Designer generated component for the vista-cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion")
@JsModule("./src/vistas/vista-cancion.ts")
public class VistaCancion extends LitTemplate {


	@Id("layoutPrincipal")
	private HorizontalLayout layoutPrincipal;
	@Id("botonCancion")
	private Button botonCancion;
	@Id("layoutCancion")
	private Element layoutCancion;
	@Id("numeroRep")
	private H6 numeroRep;
	@Id("h5Titulo")
	private H5 h5Titulo;
	@Id("meGusta")
	private Button meGusta;

	/**
     * Creates a new VistaCancion.
     */
    public VistaCancion() {
        // You can initialise any data required for the connected UI components here.
    }

}
