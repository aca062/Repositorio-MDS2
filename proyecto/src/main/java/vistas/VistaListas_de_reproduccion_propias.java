package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaLista_de_reproduccion_propia;
import com.vaadin.flow.component.button.Button;

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
	@Id("vistaLista_de_reproduccion_propia")
	private Element vistaLista_de_reproduccion_propia;
	@Id("vistaLista_de_reproduccion_propia1")
	private Element vistaLista_de_reproduccion_propia1;
	@Id("vistaLista_de_reproduccion_propia3")
	private Element vistaLista_de_reproduccion_propia3;
	@Id("vistaLista_de_reproduccion_propia2")
	private Element vistaLista_de_reproduccion_propia2;
	@Id("vistaLista_de_reproduccion_propia4")
	private Element vistaLista_de_reproduccion_propia4;
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

	public Element getVistaLista_de_reproduccion_propia() {
		return vistaLista_de_reproduccion_propia;
	}

	public void setVistaLista_de_reproduccion_propia(Element vistaLista_de_reproduccion_propia) {
		this.vistaLista_de_reproduccion_propia = vistaLista_de_reproduccion_propia;
	}

	public Element getVistaLista_de_reproduccion_propia1() {
		return vistaLista_de_reproduccion_propia1;
	}

	public void setVistaLista_de_reproduccion_propia1(Element vistaLista_de_reproduccion_propia1) {
		this.vistaLista_de_reproduccion_propia1 = vistaLista_de_reproduccion_propia1;
	}

	public Element getVistaLista_de_reproduccion_propia3() {
		return vistaLista_de_reproduccion_propia3;
	}

	public void setVistaLista_de_reproduccion_propia3(Element vistaLista_de_reproduccion_propia3) {
		this.vistaLista_de_reproduccion_propia3 = vistaLista_de_reproduccion_propia3;
	}

	public Element getVistaLista_de_reproduccion_propia2() {
		return vistaLista_de_reproduccion_propia2;
	}

	public void setVistaLista_de_reproduccion_propia2(Element vistaLista_de_reproduccion_propia2) {
		this.vistaLista_de_reproduccion_propia2 = vistaLista_de_reproduccion_propia2;
	}

	public Element getVistaLista_de_reproduccion_propia4() {
		return vistaLista_de_reproduccion_propia4;
	}

	public void setVistaLista_de_reproduccion_propia4(Element vistaLista_de_reproduccion_propia4) {
		this.vistaLista_de_reproduccion_propia4 = vistaLista_de_reproduccion_propia4;
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
