package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_cibernauta;
import vistas.VistaUltimos_exitos;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCancion_cibernauta;

/**
 * A Designer generated component for the vista-cibernauta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cibernauta")
@JsModule("./src/vistas/vista-cibernauta.ts")
public class VistaCibernauta extends LitTemplate {

    
	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("cabecera")
	private Element cabecera;
	@Id("vistaUltimos_exitos")
	private Element vistaUltimos_exitos;

	/**
     * Creates a new VistaCibernauta.
     */
    public VistaCibernauta() {
        // You can initialise any data required for the connected UI components here.
    }
	

}
