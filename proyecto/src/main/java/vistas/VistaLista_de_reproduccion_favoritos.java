package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaCancion;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H2;

/**
 * A Designer generated component for the vista-lista_de_reproduccion_favoritos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_favoritos")
@JsModule("./src/vistas/vista-lista_de_reproduccion_favoritos.ts")
public class VistaLista_de_reproduccion_favoritos extends LitTemplate {

    @Id("vistaCancion")
	private VistaCancion vistaCancion;
	@Id("vistaCancion1")
	private VistaCancion vistaCancion1;
	@Id("vistaCancion2")
	private VistaCancion vistaCancion2;
	@Id("h1")
	private H1 h1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
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
	@Id("h3")
	private H3 h3;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("h2")
	private H2 h2;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;

	/**
     * Creates a new VistaLista_de_reproduccion_favoritos.
     */
    public VistaLista_de_reproduccion_favoritos() {
        // You can initialise any data required for the connected UI components here.
    }

	public VistaCancion getVistaCancion() {
		return vistaCancion;
	}

	public void setVistaCancion(VistaCancion vistaCancion) {
		this.vistaCancion = vistaCancion;
	}

	public VistaCancion getVistaCancion1() {
		return vistaCancion1;
	}

	public void setVistaCancion1(VistaCancion vistaCancion1) {
		this.vistaCancion1 = vistaCancion1;
	}

	public VistaCancion getVistaCancion2() {
		return vistaCancion2;
	}

	public void setVistaCancion2(VistaCancion vistaCancion2) {
		this.vistaCancion2 = vistaCancion2;
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

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
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

	public H3 getH3() {
		return h3;
	}

	public void setH3(H3 h3) {
		this.h3 = h3;
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

	public H2 getH2() {
		return h2;
	}

	public void setH2(H2 h2) {
		this.h2 = h2;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

}
