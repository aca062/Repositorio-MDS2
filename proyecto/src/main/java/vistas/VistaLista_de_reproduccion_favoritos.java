package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaCancion;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H2;

/**
 * A Designer generated component for the vista-lista_de_reproduccion_favoritos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_favoritos")
@JsModule("./src/vistas/vista-lista_de_reproduccion_favoritos.ts")
public class VistaLista_de_reproduccion_favoritos extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutTitulo")
	private HorizontalLayout layoutTitulo;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("opciones")
	private Select opciones;
	@Id("h3Creador")
	private H3 h3Creador;
	@Id("layoutLista")
	private Element layoutLista;
	@Id("layoutNumCanciones")
	private HorizontalLayout layoutNumCanciones;
	@Id("numCanciones")
	private H2 numCanciones;
	@Id("listaCanciones")
	private VerticalLayout listaCanciones;
	@Id("vistaCancion")
	private Element vistaCancion;
	@Id("vistaCancion1")
	private Element vistaCancion1;
	@Id("vistaCancion2")
	private Element vistaCancion2;

	/**
     * Creates a new VistaLista_de_reproduccion_favoritos.
     */
    public VistaLista_de_reproduccion_favoritos() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutTitulo() {
		return layoutTitulo;
	}

	public void setLayoutTitulo(HorizontalLayout layoutTitulo) {
		this.layoutTitulo = layoutTitulo;
	}

	public H1 getH1Titulo() {
		return h1Titulo;
	}

	public void setH1Titulo(H1 h1Titulo) {
		this.h1Titulo = h1Titulo;
	}

	public Select getOpciones() {
		return opciones;
	}

	public void setOpciones(Select opciones) {
		this.opciones = opciones;
	}

	public H3 getH3Creador() {
		return h3Creador;
	}

	public void setH3Creador(H3 h3Creador) {
		this.h3Creador = h3Creador;
	}

	public Element getLayoutLista() {
		return layoutLista;
	}

	public void setLayoutLista(Element layoutLista) {
		this.layoutLista = layoutLista;
	}

	public HorizontalLayout getLayoutNumCanciones() {
		return layoutNumCanciones;
	}

	public void setLayoutNumCanciones(HorizontalLayout layoutNumCanciones) {
		this.layoutNumCanciones = layoutNumCanciones;
	}

	public H2 getNumCanciones() {
		return numCanciones;
	}

	public void setNumCanciones(H2 numCanciones) {
		this.numCanciones = numCanciones;
	}

	public VerticalLayout getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(VerticalLayout listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

	public Element getVistaCancion() {
		return vistaCancion;
	}

	public void setVistaCancion(Element vistaCancion) {
		this.vistaCancion = vistaCancion;
	}

	public Element getVistaCancion1() {
		return vistaCancion1;
	}

	public void setVistaCancion1(Element vistaCancion1) {
		this.vistaCancion1 = vistaCancion1;
	}

	public Element getVistaCancion2() {
		return vistaCancion2;
	}

	public void setVistaCancion2(Element vistaCancion2) {
		this.vistaCancion2 = vistaCancion2;
	}

	

}
