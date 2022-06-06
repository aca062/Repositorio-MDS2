package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-buscar_elemento template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar_elemento")
@JsModule("./src/vistas/vista-buscar_elemento.ts")
public class VistaBuscar_elemento extends LitTemplate {


	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("buscador")
	private TextField buscador;
	@Id("ironIcon")
	private Element ironIcon;
    @Id("layoutBusqueda")
    private Element layoutBusqueda;

	/**
     * Creates a new VistaBuscar_elemento.
     */
    public VistaBuscar_elemento() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public H1 getH1Titulo() {
		return h1Titulo;
	}

	public void setH1Titulo(H1 h1Titulo) {
		this.h1Titulo = h1Titulo;
	}

	public TextField getBuscador() {
		return buscador;
	}

	public void setBuscador(TextField buscador) {
		this.buscador = buscador;
	}

	public Element getIronIcon() {
		return ironIcon;
	}

	public void setIronIcon(Element ironIcon) {
		this.ironIcon = ironIcon;
	}

    public Element getLayoutBusqueda() {
        return layoutBusqueda;
    }

    public void setLayoutBusqueda(Element layoutBusqueda) {
        this.layoutBusqueda = layoutBusqueda;
    }

}
