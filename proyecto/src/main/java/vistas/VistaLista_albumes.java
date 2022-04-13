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

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("layoutAlbumes")
	private HorizontalLayout layoutAlbumes;
	@Id("vistaAlbum")
	private Element vistaAlbum;
	@Id("vistaAlbum1")
	private Element vistaAlbum1;

	/**
     * Creates a new VistaLista_albumes.
     */
    public VistaLista_albumes() {
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

	public HorizontalLayout getLayoutAlbumes() {
		return layoutAlbumes;
	}

	public void setLayoutAlbumes(HorizontalLayout layoutAlbumes) {
		this.layoutAlbumes = layoutAlbumes;
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


}
