package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-crear_lista_de_reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crear_lista_de_reproduccion")
@JsModule("./src/vistas/vista-crear_lista_de_reproduccion.ts")
public class VistaCrear_lista_de_reproduccion extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutLista")
	private Element layoutLista;
	@Id("nombre")
	private TextField nombre;
	@Id("listaCanciones")
	private Select listaCanciones;
	@Id("buscadorCanciones")
	private Element buscadorCanciones;
	@Id("vaadinItem4")
	private Element vaadinItem4;
	@Id("vaadinItem5")
	private Element vaadinItem5;
	@Id("vaadinItem6")
	private Element vaadinItem6;
	@Id("listaCancion")
	private Element listaCancion;
	@Id("layoutCancion")
	private HorizontalLayout layoutCancion;
	@Id("nombreCancion")
	private Element nombreCancion;
	@Id("layoutCancion1")
	private HorizontalLayout layoutCancion1;
	@Id("eliminar")
	private Button eliminar;
	@Id("nombre1")
	private Element nombre1;
	@Id("eliminar1")
	private Button eliminar1;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;

	/**
     * Creates a new VistaCrear_lista_de_reproduccion.
     */
    public VistaCrear_lista_de_reproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

	

}
