package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cabecera_cibernauta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera_cibernauta")
@JsModule("./src/vistas/vista-cabecera_cibernauta.ts")
public class VistaCabecera_cibernauta extends LitTemplate {


	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutCabecera")
	private HorizontalLayout layoutCabecera;
	@Id("logo")
	private Button logo;
	@Id("iniciarSesion")
	private Button iniciarSesion;
	@Id("contacto")
	private HorizontalLayout contacto;

	/**
     * Creates a new VistaCabecera_cibernauta.
     */
    public VistaCabecera_cibernauta() {
        // You can initialise any data required for the connected UI components here.
    }

}
