package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-registrarse template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registrarse")
@JsModule("./src/vistas/vista-registrarse.ts")
public class VistaRegistrarse extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("img")
	private Image img;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("eMail")
	private TextField eMail;
	@Id("nick")
	private TextField nick;
	@Id("contraseña")
	private TextField contraseña;
	@Id("repetirContraseña")
	private TextField repetirContraseña;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("vaadinButton2")
	private Button vaadinButton2;
	@Id("vaadinButton3")
	private Button vaadinButton3;

	/**
     * Creates a new VistaRegistrarse.
     */
    public VistaRegistrarse() {
        // You can initialise any data required for the connected UI components here.
    }

}
