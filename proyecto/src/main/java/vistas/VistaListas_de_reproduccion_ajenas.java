package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaLista_de_reproduccion_ajena;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_ajenas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_ajenas")
@JsModule("./src/vistas/vista-listas_de_reproduccion_ajenas.ts")
public class VistaListas_de_reproduccion_ajenas extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("layoutListas")
	private HorizontalLayout layoutListas;
	@Id("vistaLista_de_reproduccion_ajena")
	private Element vistaLista_de_reproduccion_ajena;
	@Id("vistaLista_de_reproduccion_ajena1")
	private Element vistaLista_de_reproduccion_ajena1;
	@Id("vistaLista_de_reproduccion_ajena2")
	private Element vistaLista_de_reproduccion_ajena2;
	@Id("layoutBoton")
	private HorizontalLayout layoutBoton;
	@Id("verMas")
	private Button verMas;

	/**
     * Creates a new VistaListas_de_reproduccion_ajenas.
     */
    public VistaListas_de_reproduccion_ajenas() {
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

	public HorizontalLayout getLayoutListas() {
		return layoutListas;
	}

	public void setLayoutListas(HorizontalLayout layoutListas) {
		this.layoutListas = layoutListas;
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

	public HorizontalLayout getLayoutBoton() {
		return layoutBoton;
	}

	public void setLayoutBoton(HorizontalLayout layoutBoton) {
		this.layoutBoton = layoutBoton;
	}

	public Button getVerMas() {
		return verMas;
	}

	public void setVerMas(Button verMas) {
		this.verMas = verMas;
	}

	

}
