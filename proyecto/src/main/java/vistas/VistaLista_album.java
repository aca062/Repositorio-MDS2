package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import vistas.VistaAlbum;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-lista_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_album")
@JsModule("./src/vistas/vista-lista_album.ts")
public class VistaLista_album extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("vistaAlbum")
	private Element vistaAlbum;
	@Id("vistaAlbum2")
	private Element vistaAlbum2;
	@Id("layoutBoton")
	private HorizontalLayout layoutBoton;
	@Id("verMas")
	private Button verMas;
	@Id("layoutAlbumes")
	private VerticalLayout layoutAlbumes;
	@Id("vistaAlbum1")
	private Element vistaAlbum1;

	/**
     * Creates a new VistaLista_album.
     */
    public VistaLista_album() {
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

	public Element getVistaAlbum() {
		return vistaAlbum;
	}

	public void setVistaAlbum(Element vistaAlbum) {
		this.vistaAlbum = vistaAlbum;
	}

	public Element getVistaAlbum1() {
		return vistaAlbum1;
	}

	public void setVistaAlbum1(Element vistaAlbum1) {
		this.vistaAlbum1 = vistaAlbum1;
	}

	public Element getVistaAlbum2() {
		return vistaAlbum2;
	}

	public void setVistaAlbum2(Element vistaAlbum2) {
		this.vistaAlbum2 = vistaAlbum2;
	}

	public HorizontalLayout getLayoutBoton() {
		return layoutBoton;
	}

	public void setLayoutBoton(HorizontalLayout layoutBoton) {
		this.layoutBoton = layoutBoton;
	}

	public Button getVerMas() {
		return verMas;
	}

	public void setVerMas(Button verMas) {
		this.verMas = verMas;
	}

	public VerticalLayout getLayoutAlbumes() {
		return layoutAlbumes;
	}

	public void setLayoutAlbumes(VerticalLayout layoutAlbumes) {
		this.layoutAlbumes = layoutAlbumes;
	}

	

}
