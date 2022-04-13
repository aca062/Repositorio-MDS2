package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaLista_de_reproduccion_propia;

/**
 * A Designer generated component for the vista-paginacion_listas_propias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-paginacion_listas_propias")
@JsModule("./src/vistas/vista-paginacion_listas_propias.ts")
public class VistaPaginacion_listas_propias extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutListas")
	private HorizontalLayout layoutListas;
	@Id("lista1")
	private Element lista1;
	@Id("lista2")
	private Element lista2;
	@Id("lista3")
	private Element lista3;

	/**
     * Creates a new VistaPaginacion_listas_propias.
     */
    public VistaPaginacion_listas_propias() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutListas() {
		return layoutListas;
	}

	public void setLayoutListas(HorizontalLayout layoutListas) {
		this.layoutListas = layoutListas;
	}

	public Element getLista1() {
		return lista1;
	}

	public void setLista1(Element lista1) {
		this.lista1 = lista1;
	}

	public Element getLista2() {
		return lista2;
	}

	public void setLista2(Element lista2) {
		this.lista2 = lista2;
	}

	public Element getLista3() {
		return lista3;
	}

	public void setLista3(Element lista3) {
		this.lista3 = lista3;
	}

}
