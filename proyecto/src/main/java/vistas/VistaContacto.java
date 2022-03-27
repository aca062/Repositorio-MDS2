package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-contacto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-contacto")
@JsModule("./src/vistas/vista-contacto.ts")
public class VistaContacto extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("h2")
	private H2 h2;
	@Id("asunto")
	private TextField asunto;
	@Id("vaadinMessageInput")
	private MessageInput vaadinMessageInput;
	@Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaContacto.
     */
    public VistaContacto() {
        // You can initialise any data required for the connected UI components here.
    }

}
