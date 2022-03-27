package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.button.Button;
import vistas.VistaLista_de_canciones;

/**
 * A Designer generated component for the vista-ver_detalle_de_lista_comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_detalle_de_lista_comun")
@JsModule("./src/vistas/vista-ver_detalle_de_lista_comun.ts")
public class VistaVer_detalle_de_lista_comun extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("h2")
	private H2 h2;
	@Id("vaadinSelect")
	private Select vaadinSelect;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("vaadinItem2")
	private Element vaadinItem2;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("h21")
	private H2 h21;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vistaLista_de_canciones")
	private VistaLista_de_canciones vistaLista_de_canciones;

	/**
     * Creates a new VistaVer_detalle_de_lista_comun.
     */
    public VistaVer_detalle_de_lista_comun() {
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

	public H2 getH2() {
		return h2;
	}

	public void setH2(H2 h2) {
		this.h2 = h2;
	}

	public Select getVaadinSelect() {
		return vaadinSelect;
	}

	public void setVaadinSelect(Select vaadinSelect) {
		this.vaadinSelect = vaadinSelect;
	}

	public Element getVaadinListBox() {
		return vaadinListBox;
	}

	public void setVaadinListBox(Element vaadinListBox) {
		this.vaadinListBox = vaadinListBox;
	}

	public Element getVaadinItem() {
		return vaadinItem;
	}

	public void setVaadinItem(Element vaadinItem) {
		this.vaadinItem = vaadinItem;
	}

	public Element getVaadinItem1() {
		return vaadinItem1;
	}

	public void setVaadinItem1(Element vaadinItem1) {
		this.vaadinItem1 = vaadinItem1;
	}

	public Element getVaadinItem2() {
		return vaadinItem2;
	}

	public void setVaadinItem2(Element vaadinItem2) {
		this.vaadinItem2 = vaadinItem2;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public H2 getH21() {
		return h21;
	}

	public void setH21(H2 h21) {
		this.h21 = h21;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public VistaLista_de_canciones getVistaLista_de_canciones() {
		return vistaLista_de_canciones;
	}

	public void setVistaLista_de_canciones(VistaLista_de_canciones vistaLista_de_canciones) {
		this.vistaLista_de_canciones = vistaLista_de_canciones;
	}

}
