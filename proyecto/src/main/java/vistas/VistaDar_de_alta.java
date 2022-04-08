package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;

/**
 * A Designer generated component for the vista-dar_de_alta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar_de_alta")
@JsModule("./src/vistas/vista-dar_de_alta.ts")
public class VistaDar_de_alta extends LitTemplate {

    
	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("layoutAdministracion")
	private Element layoutAdministracion;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("botonArtistas")
	private Button botonArtistas;
	@Id("botonCanciones")
	private Button botonCanciones;
	@Id("layoutBotones1")
	private HorizontalLayout layoutBotones1;
	@Id("botonAlbumes")
	private Button botonAlbumes;
	@Id("botonEstilos")
	private Button botonEstilos;

	/**
     * Creates a new VistaDar_de_alta.
     */
    public VistaDar_de_alta() {
        // You can initialise any data required for the connected UI components here.
    }
	

}
