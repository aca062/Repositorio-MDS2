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

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutMensaje")
	private Element layoutMensaje;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("asunto")
	private TextField asunto;
	@Id("mensaje")
	private MessageInput mensaje;
	@Id("cancelar")
	private Button cancelar;

	/**
     * Creates a new VistaContacto.
     */
    public VistaContacto() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public Element getLayoutMensaje() {
		return layoutMensaje;
	}

	public void setLayoutMensaje(Element layoutMensaje) {
		this.layoutMensaje = layoutMensaje;
	}

	public H2 getH2Titulo() {
		return h2Titulo;
	}

	public void setH2Titulo(H2 h2Titulo) {
		this.h2Titulo = h2Titulo;
	}

	public TextField getAsunto() {
		return asunto;
	}

	public void setAsunto(TextField asunto) {
		this.asunto = asunto;
	}

	public MessageInput getMensaje() {
		return mensaje;
	}

	public void setMensaje(MessageInput mensaje) {
		this.mensaje = mensaje;
	}

	public Button getCancelar() {
		return cancelar;
	}

	public void setCancelar(Button cancelar) {
		this.cancelar = cancelar;
	}

	

}
