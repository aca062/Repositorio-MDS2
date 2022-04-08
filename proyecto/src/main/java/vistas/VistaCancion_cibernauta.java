package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-cancion_cibernauta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_cibernauta")
@JsModule("./src/vistas/vista-cancion_cibernauta.ts")
public class VistaCancion_cibernauta extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutCancionCibernauta")
	private HorizontalLayout layoutCancionCibernauta;
	@Id("imgCancionCIbernauta")
	private Image imgCancionCIbernauta;
	@Id("h5Titulo")
	private H5 h5Titulo;

	/**
     * Creates a new VistaCancion_cibernauta.
     */
    public VistaCancion_cibernauta() {
        // You can initialise any data required for the connected UI components here.
    }

}
