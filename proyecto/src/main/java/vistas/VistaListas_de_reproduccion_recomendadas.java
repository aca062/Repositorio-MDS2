package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import vistas.VistaLista_de_reproduccion_ajena;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_recomendadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_recomendadas")
@JsModule("./src/vistas/vista-listas_de_reproduccion_recomendadas.ts")
public class VistaListas_de_reproduccion_recomendadas extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("Titulo")
	private H1 titulo;
	@Id("vistaLista_de_reproduccion_ajena")
	private Element vistaLista_de_reproduccion_ajena;
	@Id("vistaLista_de_reproduccion_ajena1")
	private Element vistaLista_de_reproduccion_ajena1;
	@Id("vistaLista_de_reproduccion_ajena2")
	private Element vistaLista_de_reproduccion_ajena2;

	/**
     * Creates a new VistaListas_de_reproduccion_recomendadas.
     */
    public VistaListas_de_reproduccion_recomendadas() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public H1 getTitulo() {
		return titulo;
	}

	public void setTitulo(H1 titulo) {
		this.titulo = titulo;
	}

	public Element getVistaLista_de_reproduccion_ajena() {
		return vistaLista_de_reproduccion_ajena;
	}

	public void setVistaLista_de_reproduccion_ajena(Element vistaLista_de_reproduccion_ajena) {
		this.vistaLista_de_reproduccion_ajena = vistaLista_de_reproduccion_ajena;
	}

	public Element getVistaLista_de_reproduccion_ajena1() {
		return vistaLista_de_reproduccion_ajena1;
	}

	public void setVistaLista_de_reproduccion_ajena1(Element vistaLista_de_reproduccion_ajena1) {
		this.vistaLista_de_reproduccion_ajena1 = vistaLista_de_reproduccion_ajena1;
	}

	public Element getVistaLista_de_reproduccion_ajena2() {
		return vistaLista_de_reproduccion_ajena2;
	}

	public void setVistaLista_de_reproduccion_ajena2(Element vistaLista_de_reproduccion_ajena2) {
		this.vistaLista_de_reproduccion_ajena2 = vistaLista_de_reproduccion_ajena2;
	}

	

}
