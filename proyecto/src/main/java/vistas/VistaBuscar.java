package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import vistas.VistaCanciones_busqueda;
import vistas.VistaCancion;
import vistas.VistaListas_de_reproduccion_busqueda;
import vistas.VistaArtistas_busqueda;
import vistas.VistaArtista_elemento;

/**
 * A Designer generated component for the vista-buscar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar")
@JsModule("./src/vistas/vista-buscar.ts")
public class VistaBuscar extends LitTemplate {

	@Id("layoutPrincipal")
	private HorizontalLayout layoutPrincipal;
	@Id("layoutCanciones")
	private Element layoutCanciones;
	@Id("vistaCanciones_busqueda")
	private Element vistaCanciones_busqueda;
	@Id("layoutListas")
	private Element layoutListas;
	@Id("vistaListas_de_reproduccion_busqueda")
	private Element vistaListas_de_reproduccion_busqueda;
	@Id("layoutArtistas")
	private Element layoutArtistas;
	@Id("vistaArtistas_busqueda")
	private Element vistaArtistas_busqueda;

	/**
     * Creates a new VistaBuscar.
     */
    public VistaBuscar() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(HorizontalLayout layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public Element getLayoutCanciones() {
		return layoutCanciones;
	}

	public void setLayoutCanciones(Element layoutCanciones) {
		this.layoutCanciones = layoutCanciones;
	}

	public Element getVistaCanciones_busqueda() {
		return vistaCanciones_busqueda;
	}

	public void setVistaCanciones_busqueda(Element vistaCanciones_busqueda) {
		this.vistaCanciones_busqueda = vistaCanciones_busqueda;
	}

	public Element getLayoutListas() {
		return layoutListas;
	}

	public void setLayoutListas(Element layoutListas) {
		this.layoutListas = layoutListas;
	}

	public Element getVistaListas_de_reproduccion_busqueda() {
		return vistaListas_de_reproduccion_busqueda;
	}

	public void setVistaListas_de_reproduccion_busqueda(Element vistaListas_de_reproduccion_busqueda) {
		this.vistaListas_de_reproduccion_busqueda = vistaListas_de_reproduccion_busqueda;
	}

	public Element getLayoutArtistas() {
		return layoutArtistas;
	}

	public void setLayoutArtistas(Element layoutArtistas) {
		this.layoutArtistas = layoutArtistas;
	}

	public Element getVistaArtistas_busqueda() {
		return vistaArtistas_busqueda;
	}

	public void setVistaArtistas_busqueda(Element vistaArtistas_busqueda) {
		this.vistaArtistas_busqueda = vistaArtistas_busqueda;
	}

}
