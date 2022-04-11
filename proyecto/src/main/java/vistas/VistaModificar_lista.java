package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-modificar_lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar_lista")
@JsModule("./src/vistas/vista-modificar_lista.ts")
public class VistaModificar_lista extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layout")
	private Element layout;
	@Id("textFieldNombre")
	private TextField textFieldNombre;
	@Id("selectorCanciones")
	private Select selectorCanciones;
	@Id("desplegable")
	private Element desplegable;
	@Id("vaadinItem3")
	private Element vaadinItem3;
	@Id("vaadinItem4")
	private Element vaadinItem4;
	@Id("vaadinItem5")
	private Element vaadinItem5;
	@Id("layoutListaCanciones")
	private HorizontalLayout layoutListaCanciones;
	@Id("listaCanciones")
	private Element listaCanciones;
	@Id("itemEliminarCancion1")
	private Element itemEliminarCancion1;
	@Id("botonEliminar1")
	private Button botonEliminar1;
	@Id("itemEliminarCancion2")
	private Element itemEliminarCancion2;
	@Id("botonEliminar2")
	private Button botonEliminar2;
	@Id("itemEliminarCancion3")
	private Element itemEliminarCancion3;
	@Id("botonEliminar3")
	private Button botonEliminar3;
	@Id("botonCancelar")
	private Button botonCancelar;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("botonConfirmar")
	private Button botonConfirmar;

	/**
     * Creates a new VistaModificar_lista.
     */
    public VistaModificar_lista() {
        // You can initialise any data required for the connected UI components here.
    }

}
