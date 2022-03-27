package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaLista_de_reproduccion_ajena;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_ajenas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_ajenas")
@JsModule("./src/vistas/vista-listas_de_reproduccion_ajenas.ts")
public class VistaListas_de_reproduccion_ajenas extends LitTemplate {

    @Id("vistaLista_de_reproduccion_ajena")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena;
	@Id("vistaLista_de_reproduccion_ajena1")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena1;
	@Id("vistaLista_de_reproduccion_ajena2")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena2;
	@Id("vistaLista_de_reproduccion_ajena3")
	private VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena3;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("h1")
	private H1 h1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaListas_de_reproduccion_ajenas.
     */
    public VistaListas_de_reproduccion_ajenas() {
        // You can initialise any data required for the connected UI components here.
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

	public VistaLista_de_reproduccion_ajena getVistaLista_de_reproduccion_ajena3() {
		return vistaLista_de_reproduccion_ajena3;
	}

	public void setVistaLista_de_reproduccion_ajena3(VistaLista_de_reproduccion_ajena vistaLista_de_reproduccion_ajena3) {
		this.vistaLista_de_reproduccion_ajena3 = vistaLista_de_reproduccion_ajena3;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

}
