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

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h2")
	private H2 h2;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("label")
	private TextField label;
	@Id("vaadinSelect")
	private Select vaadinSelect;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("hr")
	private Hr hr;
	@Id("vaadinItem2")
	private Element vaadinItem2;
	@Id("vaadinItem3")
	private Element vaadinItem3;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinButton1")
	private Button vaadinButton1;

	/**
     * Creates a new VistaCrear_lista_de_reproduccion.
     */
    public VistaCrear_lista_de_reproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

}
