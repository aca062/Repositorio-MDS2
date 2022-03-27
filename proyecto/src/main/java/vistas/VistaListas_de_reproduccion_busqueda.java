package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import vistas.VistaLista_de_reproduccion_ajena;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_busqueda template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_busqueda")
@JsModule("./src/vistas/vista-listas_de_reproduccion_busqueda.ts")
public class VistaListas_de_reproduccion_busqueda extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vistaLista_de_reproduccion_ajena")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena;
	@Id("vistaLista_de_reproduccion_ajena1")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena1;
	@Id("vistaLista_de_reproduccion_ajena2")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena2;

	/**
     * Creates a new VistaListas_de_reproduccion_busqueda.
     */
    public VistaListas_de_reproduccion_busqueda() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public VistaLista_de_reproduccion_ajena getVistaLista_de_reproduccion_ajena() {
		return vistaLista_de_reproduccion_ajena;
	}

	public void setVistaLista_de_reproduccion_ajena(VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena) {
		this.vistaLista_de_reproduccion_ajena = vistaLista_de_reproduccion_ajena;
	}

	public VistaLista_de_reproduccion_ajena getVistaLista_de_reproduccion_ajena1() {
		return vistaLista_de_reproduccion_ajena1;
	}

	public void setVistaLista_de_reproduccion_ajena1(VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena1) {
		this.vistaLista_de_reproduccion_ajena1 = vistaLista_de_reproduccion_ajena1;
	}

	public VistaLista_de_reproduccion_ajena getVistaLista_de_reproduccion_ajena2() {
		return vistaLista_de_reproduccion_ajena2;
	}

	public void setVistaLista_de_reproduccion_ajena2(VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena2) {
		this.vistaLista_de_reproduccion_ajena2 = vistaLista_de_reproduccion_ajena2;
	}

}
