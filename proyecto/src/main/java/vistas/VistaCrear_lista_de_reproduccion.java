package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

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
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;
    @Id("h5")
    private H5 h5;
    @Id("vaadinTextArea")
    private TextArea vaadinTextArea;

	/**
     * Creates a new VistaCrear_lista_de_reproduccion.
     */
    public VistaCrear_lista_de_reproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public H2 getH2Titulo() {
		return h2Titulo;
	}

	public void setH2Titulo(H2 h2Titulo) {
		this.h2Titulo = h2Titulo;
	}

	public Element getLayoutLista() {
		return layoutLista;
	}

	public void setLayoutLista(Element layoutLista) {
		this.layoutLista = layoutLista;
	}

	public TextField getNombre() {
		return nombre;
	}

	public void setNombre(TextField nombre) {
		this.nombre = nombre;
	}

	public TextArea getVaadinTextArea() {
        return vaadinTextArea;
    }

    public void setVaadinTextArea(TextArea vaadinTextArea) {
        this.vaadinTextArea = vaadinTextArea;
    }

    public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}

	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}

	public Button getCancelar() {
		return cancelar;
	}

	public void setCancelar(Button cancelar) {
		this.cancelar = cancelar;
	}

	public Button getConfirmar() {
		return confirmar;
	}

	public void setConfirmar(Button confirmar) {
		this.confirmar = confirmar;
	}

}
