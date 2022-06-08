package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_propias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_propias")
@JsModule("./src/vistas/vista-listas_de_reproduccion_propias.ts")
public class VistaListas_de_reproduccion_propias extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("layoutListasPropias")
	private HorizontalLayout layoutListasPropias;
	@Id("layoutBoton")
	private HorizontalLayout layoutBoton;
	@Id("verTodas")
	private Button verTodas;

	/**
     * Creates a new VistaListas_de_reproduccion_propias.
     */
    public VistaListas_de_reproduccion_propias() {
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

	public HorizontalLayout getLayoutListasPropias() {
		return layoutListasPropias;
	}

	public void setLayoutListasPropias(HorizontalLayout layoutListasPropias) {
		this.layoutListasPropias = layoutListasPropias;
	}

	public HorizontalLayout getLayoutBoton() {
		return layoutBoton;
	}

	public void setLayoutBoton(HorizontalLayout layoutBoton) {
		this.layoutBoton = layoutBoton;
	}

	public Button getVerTodas() {
		return verTodas;
	}

	public void setVerTodas(Button verTodas) {
		this.verTodas = verTodas;
	}



}
