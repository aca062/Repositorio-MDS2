package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaAlbum;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCancion;
import vistas.VistaLista_de_canciones;

/**
 * A Designer generated component for the vista-ver_detalle_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_detalle_album")
@JsModule("./src/vistas/vista-ver_detalle_album.ts")
public class VistaVer_detalle_album extends LitTemplate {

    @Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vistaCancion")
	private VistaCancion vistaCancion;
	@Id("vistaCancion1")
	private VistaCancion vistaCancion1;
	@Id("vistaCancion2")
	private VistaCancion vistaCancion2;
	@Id("vistaLista_de_canciones")
	private VistaLista_de_canciones vistaLista_de_canciones;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("h5")
	private H5 h5;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vistaAlbum")
	private VistaAlbum vistaAlbum;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	/**
     * Creates a new VistaVer_detalle_album.
     */
    public VistaVer_detalle_album() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}
	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
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
	public VistaLista_de_canciones getVistaLista_de_canciones() {
		return vistaLista_de_canciones;
	}
	public void setVistaLista_de_canciones(VistaLista_de_canciones vistaLista_de_canciones) {
		this.vistaLista_de_canciones = vistaLista_de_canciones;
	}
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public H5 getH5() {
		return h5;
	}
	public void setH5(H5 h5) {
		this.h5 = h5;
	}
	public Button getVaadinButton() {
		return vaadinButton;
	}
	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}
	public VistaAlbum getVistaAlbum() {
		return vistaAlbum;
	}
	public void setVistaAlbum(VistaAlbum vistaAlbum) {
		this.vistaAlbum = vistaAlbum;
	}
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}
	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}
	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

}
