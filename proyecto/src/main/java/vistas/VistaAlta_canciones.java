package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H5;

/**
 * A Designer generated component for the vista-alta_canciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-alta_canciones")
@JsModule("./src/vistas/vista-alta_canciones.ts")
public class VistaAlta_canciones extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutCnacion")
	private Element layoutCnacion;
	@Id("titulo")
	private TextField titulo;
	@Id("títuloÁlbum")
	private TextField títuloÁlbum;
	@Id("productores")
	private TextField productores;
	@Id("compositores")
	private TextField compositores;
	@Id("interpretes")
	private TextField interpretes;
	@Id("estilo")
	private Select estilo;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("vaadinItem2")
	private Element vaadinItem2;
	@Id("layoutAnadirCnacion")
	private HorizontalLayout layoutAnadirCnacion;
	@Id("h4Fichero")
	private H4 h4Fichero;
	@Id("anadirCancion")
	private Button anadirCancion;
	@Id("h5Requisitos")
	private H5 h5Requisitos;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;

	/**
     * Creates a new VistaAlta_canciones.
     */
    public VistaAlta_canciones() {
        // You can initialise any data required for the connected UI components here.
    }

}
