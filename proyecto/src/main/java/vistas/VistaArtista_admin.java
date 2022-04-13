package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H4;

/**
 * A Designer generated component for the vista-artista_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artista_admin")
@JsModule("./src/vistas/vista-artista_admin.ts")
public class VistaArtista_admin extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutArtista")
	private HorizontalLayout layoutArtista;
	@Id("h4Nombre")
	private H4 h4Nombre;
	@Id("imgArtista")
	private Image imgArtista;
	@Id("editar")
	private Button editar;
	@Id("eliminar")
	private Button eliminar;

	/**
     * Creates a new VistaArtista_admin.
     */
    public VistaArtista_admin() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutArtista() {
		return layoutArtista;
	}

	public void setLayoutArtista(HorizontalLayout layoutArtista) {
		this.layoutArtista = layoutArtista;
	}

	public H4 getH4Nombre() {
		return h4Nombre;
	}

	public void setH4Nombre(H4 h4Nombre) {
		this.h4Nombre = h4Nombre;
	}

	public Image getImgArtista() {
		return imgArtista;
	}

	public void setImgArtista(Image imgArtista) {
		this.imgArtista = imgArtista;
	}

	public Button getEditar() {
		return editar;
	}

	public void setEditar(Button editar) {
		this.editar = editar;
	}

	public Button getEliminar() {
		return eliminar;
	}

	public void setEliminar(Button eliminar) {
		this.eliminar = eliminar;
	}

}
