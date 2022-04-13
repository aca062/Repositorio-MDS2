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

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutAlbum")
	private Element layoutAlbum;
	@Id("vistaAlbum")
	private Element vistaAlbum;
	@Id("botonArtista")
	private Button botonArtista;
	@Id("h5FechaAlbum")
	private H5 h5FechaAlbum;
	@Id("layoutCancionesAlbum")
	private HorizontalLayout layoutCancionesAlbum;
	@Id("vistaLista_de_canciones")
	private Element vistaLista_de_canciones;

	/**
     * Creates a new VistaVer_detalle_album.
     */
    public VistaVer_detalle_album() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public Element getLayoutAlbum() {
		return layoutAlbum;
	}

	public void setLayoutAlbum(Element layoutAlbum) {
		this.layoutAlbum = layoutAlbum;
	}

	public Element getVistaAlbum() {
		return vistaAlbum;
	}

	public void setVistaAlbum(Element vistaAlbum) {
		this.vistaAlbum = vistaAlbum;
	}

	public Button getBotonArtista() {
		return botonArtista;
	}

	public void setBotonArtista(Button botonArtista) {
		this.botonArtista = botonArtista;
	}

	public H5 getH5FechaAlbum() {
		return h5FechaAlbum;
	}

	public void setH5FechaAlbum(H5 h5FechaAlbum) {
		this.h5FechaAlbum = h5FechaAlbum;
	}

	public HorizontalLayout getLayoutCancionesAlbum() {
		return layoutCancionesAlbum;
	}

	public void setLayoutCancionesAlbum(HorizontalLayout layoutCancionesAlbum) {
		this.layoutCancionesAlbum = layoutCancionesAlbum;
	}

	public Element getVistaLista_de_canciones() {
		return vistaLista_de_canciones;
	}

	public void setVistaLista_de_canciones(Element vistaLista_de_canciones) {
		this.vistaLista_de_canciones = vistaLista_de_canciones;
	}

}
