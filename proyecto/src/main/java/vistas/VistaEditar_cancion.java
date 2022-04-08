package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-editar_cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar_cancion")
@JsModule("./src/vistas/vista-editar_cancion.ts")
public class VistaEditar_cancion extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutCancion")
	private Element layoutCancion;
	@Id("título")
	private TextField título;
	@Id("títuloÁlbum")
	private TextField títuloÁlbum;
	@Id("compositores")
	private TextField compositores;
	@Id("productores")
	private TextField productores;
	@Id("interpretes")
	private TextField interpretes;
	@Id("estilo")
	private Select estilo;
	@Id("listaEstilos")
	private Element listaEstilos;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("layoutFichero")
	private HorizontalLayout layoutFichero;
	@Id("h4Titulo")
	private H4 h4Titulo;
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
     * Creates a new VistaEditar_cancion.
     */
    public VistaEditar_cancion() {
        // You can initialise any data required for the connected UI components here.
    }


}
