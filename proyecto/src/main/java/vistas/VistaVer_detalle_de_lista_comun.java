package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.button.Button;
import vistas.VistaLista_de_canciones;

/**
 * A Designer generated component for the vista-ver_detalle_de_lista_comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_detalle_de_lista_comun")
@JsModule("./src/vistas/vista-ver_detalle_de_lista_comun.ts")
public class VistaVer_detalle_de_lista_comun extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("h2")
	private H2 h2;
	@Id("vaadinSelect")
	private Select vaadinSelect;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("vaadinItem2")
	private Element vaadinItem2;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("h21")
	private H2 h21;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vistaLista_de_canciones")
	private VistaLista_de_canciones vistaLista_de_canciones;

	/**
     * Creates a new VistaVer_detalle_de_lista_comun.
     */
    public VistaVer_detalle_de_lista_comun() {
        // You can initialise any data required for the connected UI components here.
    }

}
