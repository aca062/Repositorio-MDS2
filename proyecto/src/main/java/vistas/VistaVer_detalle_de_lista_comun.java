package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-ver_detalle_de_lista_comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_detalle_de_lista_comun")
@JsModule("./src/vistas/vista-ver_detalle_de_lista_comun.ts")
public class VistaVer_detalle_de_lista_comun extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutTituloOpciones")
	private HorizontalLayout layoutTituloOpciones;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("botonUsuario")
	private Button botonUsuario;
	@Id("layoutListaCanciones")
	private Element layoutListaCanciones;
	@Id("layoutCanciones")
	private Element layoutCanciones;
	@Id("vistaLista_de_canciones")
	private Element vistaLista_de_canciones;
    @Id("eliminar")
    private Button eliminar;
	/**
     * Creates a new VistaVer_detalle_de_lista_comun.
     */
    public VistaVer_detalle_de_lista_comun() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}
	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}
	public HorizontalLayout getLayoutTituloOpciones() {
		return layoutTituloOpciones;
	}
	public void setLayoutTituloOpciones(HorizontalLayout layoutTituloOpciones) {
		this.layoutTituloOpciones = layoutTituloOpciones;
	}
	public H2 getH2Titulo() {
		return h2Titulo;
	}
	public void setH2Titulo(H2 h2Titulo) {
		this.h2Titulo = h2Titulo;
	}
	public Button getBotonUsuario() {
		return botonUsuario;
	}
	public void setBotonUsuario(Button botonUsuario) {
		this.botonUsuario = botonUsuario;
	}
	public Element getLayoutListaCanciones() {
		return layoutListaCanciones;
	}
	public void setLayoutListaCanciones(Element layoutListaCanciones) {
		this.layoutListaCanciones = layoutListaCanciones;
	}
	public Element getLayoutCanciones() {
		return layoutCanciones;
	}
	public void setLayoutCanciones(Element layoutCanciones) {
		this.layoutCanciones = layoutCanciones;
	}
	public Element getVistaLista_de_canciones() {
		return vistaLista_de_canciones;
	}
	public void setVistaLista_de_canciones(Element vistaLista_de_canciones) {
		this.vistaLista_de_canciones = vistaLista_de_canciones;
	}
    public Button getEliminar() {
        return eliminar;
    }
    public void setEliminar(Button eliminar) {
        this.eliminar = eliminar;
    }

}
