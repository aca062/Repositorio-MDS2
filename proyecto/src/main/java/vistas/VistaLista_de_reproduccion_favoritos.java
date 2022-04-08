package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaCancion;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
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
	private Element listaCanciones;
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

	

}
