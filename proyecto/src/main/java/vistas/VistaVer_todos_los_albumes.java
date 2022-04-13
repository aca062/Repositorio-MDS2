package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaLista_albumes;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver_todos_los_albumes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_todos_los_albumes")
@JsModule("./src/vistas/vista-ver_todos_los_albumes.ts")
public class VistaVer_todos_los_albumes extends LitTemplate {

    @Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutAlbumes")
	private HorizontalLayout layoutAlbumes;
	@Id("vistaLista_albumes")
	private Element vistaLista_albumes;
	@Id("layoutNumeroPaginas")
	private Element layoutNumeroPaginas;
	@Id("h5Paginas")
	private H5 h5Paginas;
	@Id("layoutBotonesPaginas")
	private HorizontalLayout layoutBotonesPaginas;
	@Id("botonAtras")
	private Button botonAtras;
	@Id("h5NumeroPaginas")
	private H5 h5NumeroPaginas;
	@Id("botonAdelante")
	private Button botonAdelante;

	/**
     * Creates a new VistaVer_todos_los_albumes.
     */
    public VistaVer_todos_los_albumes() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutAlbumes() {
		return layoutAlbumes;
	}

	public void setLayoutAlbumes(HorizontalLayout layoutAlbumes) {
		this.layoutAlbumes = layoutAlbumes;
	}

	public Element getVistaLista_albumes() {
		return vistaLista_albumes;
	}

	public void setVistaLista_albumes(Element vistaLista_albumes) {
		this.vistaLista_albumes = vistaLista_albumes;
	}

	public Element getLayoutNumeroPaginas() {
		return layoutNumeroPaginas;
	}

	public void setLayoutNumeroPaginas(Element layoutNumeroPaginas) {
		this.layoutNumeroPaginas = layoutNumeroPaginas;
	}

	public H5 getH5Paginas() {
		return h5Paginas;
	}

	public void setH5Paginas(H5 h5Paginas) {
		this.h5Paginas = h5Paginas;
	}

	public HorizontalLayout getLayoutBotonesPaginas() {
		return layoutBotonesPaginas;
	}

	public void setLayoutBotonesPaginas(HorizontalLayout layoutBotonesPaginas) {
		this.layoutBotonesPaginas = layoutBotonesPaginas;
	}

	public Button getBotonAtras() {
		return botonAtras;
	}

	public void setBotonAtras(Button botonAtras) {
		this.botonAtras = botonAtras;
	}

	public H5 getH5NumeroPaginas() {
		return h5NumeroPaginas;
	}

	public void setH5NumeroPaginas(H5 h5NumeroPaginas) {
		this.h5NumeroPaginas = h5NumeroPaginas;
	}

	public Button getBotonAdelante() {
		return botonAdelante;
	}

	public void setBotonAdelante(Button botonAdelante) {
		this.botonAdelante = botonAdelante;
	}

}
