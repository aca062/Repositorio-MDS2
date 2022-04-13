package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;

/**
 * A Designer generated component for the vista-ver_creditos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_creditos")
@JsModule("./src/vistas/vista-ver_creditos.ts")
public class VistaVer_creditos extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutCreditos")
	private Element layoutCreditos;
	@Id("h3VerCreditos")
	private H3 h3VerCreditos;
	@Id("h4TituloCancion")
	private H4 h4TituloCancion;
	@Id("h4TituloAlbum")
	private H4 h4TituloAlbum;
	@Id("h4Compositores")
	private H4 h4Compositores;
	@Id("h4Productores")
	private H4 h4Productores;
	@Id("h4Interpretes")
	private H4 h4Interpretes;

	/**
     * Creates a new VistaVer_creditos.
     */
    public VistaVer_creditos() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public Element getLayoutCreditos() {
		return layoutCreditos;
	}

	public void setLayoutCreditos(Element layoutCreditos) {
		this.layoutCreditos = layoutCreditos;
	}

	public H3 getH3VerCreditos() {
		return h3VerCreditos;
	}

	public void setH3VerCreditos(H3 h3VerCreditos) {
		this.h3VerCreditos = h3VerCreditos;
	}

	public H4 getH4TituloCancion() {
		return h4TituloCancion;
	}

	public void setH4TituloCancion(H4 h4TituloCancion) {
		this.h4TituloCancion = h4TituloCancion;
	}

	public H4 getH4TituloAlbum() {
		return h4TituloAlbum;
	}

	public void setH4TituloAlbum(H4 h4TituloAlbum) {
		this.h4TituloAlbum = h4TituloAlbum;
	}

	public H4 getH4Compositores() {
		return h4Compositores;
	}

	public void setH4Compositores(H4 h4Compositores) {
		this.h4Compositores = h4Compositores;
	}

	public H4 getH4Productores() {
		return h4Productores;
	}

	public void setH4Productores(H4 h4Productores) {
		this.h4Productores = h4Productores;
	}

	public H4 getH4Interpretes() {
		return h4Interpretes;
	}

	public void setH4Interpretes(H4 h4Interpretes) {
		this.h4Interpretes = h4Interpretes;
	}

}
