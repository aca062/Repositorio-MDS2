package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaAlbum;

/**
 * A Designer generated component for the vista-lista_albumes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_albumes")
@JsModule("./src/vistas/vista-lista_albumes.ts")
public class VistaLista_albumes extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaAlbum")
	private VistaAlbum vistaAlbum;
	@Id("vistaAlbum1")
	private VistaAlbum vistaAlbum1;
	@Id("vistaAlbum2")
	private VistaAlbum vistaAlbum2;
	@Id("vistaAlbum3")
	private VistaAlbum vistaAlbum3;

	/**
     * Creates a new VistaLista_albumes.
     */
    public VistaLista_albumes() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public VistaAlbum getVistaAlbum() {
		return vistaAlbum;
	}

	public void setVistaAlbum(VistaAlbum vistaAlbum) {
		this.vistaAlbum = vistaAlbum;
	}

	public VistaAlbum getVistaAlbum1() {
		return vistaAlbum1;
	}

	public void setVistaAlbum1(VistaAlbum vistaAlbum1) {
		this.vistaAlbum1 = vistaAlbum1;
	}

	public VistaAlbum getVistaAlbum2() {
		return vistaAlbum2;
	}

	public void setVistaAlbum2(VistaAlbum vistaAlbum2) {
		this.vistaAlbum2 = vistaAlbum2;
	}

	public VistaAlbum getVistaAlbum3() {
		return vistaAlbum3;
	}

	public void setVistaAlbum3(VistaAlbum vistaAlbum3) {
		this.vistaAlbum3 = vistaAlbum3;
	}

}
