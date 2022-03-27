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

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaLista_de_reproduccion_propia")
	private VistaLista_de_reproduccion_propia vistaLista_de_reproduccion_propia;
	@Id("vistaLista_de_reproduccion_propia1")
	private VistaLista_de_reproduccion_propia vistaLista_de_reproduccion_propia1;
	@Id("vistaLista_de_reproduccion_propia2")
	private VistaLista_de_reproduccion_propia vistaLista_de_reproduccion_propia2;

	/**
     * Creates a new VistaPaginacion_listas_propias.
     */
    public VistaPaginacion_listas_propias() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public VistaLista_de_reproduccion_propia getVistaLista_de_reproduccion_propia() {
		return vistaLista_de_reproduccion_propia;
	}

	public void setVistaLista_de_reproduccion_propia(VistaLista_de_reproduccion_propia vistaLista_de_reproduccion_propia) {
		this.vistaLista_de_reproduccion_propia = vistaLista_de_reproduccion_propia;
	}

	public VistaLista_de_reproduccion_propia getVistaLista_de_reproduccion_propia1() {
		return vistaLista_de_reproduccion_propia1;
	}

	public void setVistaLista_de_reproduccion_propia1(
			VistaLista_de_reproduccion_propia vistaLista_de_reproduccion_propia1) {
		this.vistaLista_de_reproduccion_propia1 = vistaLista_de_reproduccion_propia1;
	}

	public VistaLista_de_reproduccion_propia getVistaLista_de_reproduccion_propia2() {
		return vistaLista_de_reproduccion_propia2;
	}

	public void setVistaLista_de_reproduccion_propia2(
			VistaLista_de_reproduccion_propia vistaLista_de_reproduccion_propia2) {
		this.vistaLista_de_reproduccion_propia2 = vistaLista_de_reproduccion_propia2;
	}

}
