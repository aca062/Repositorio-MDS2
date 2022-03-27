package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaLista_de_reproduccion_admin;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_busqueda_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_busqueda_admin")
@JsModule("./src/vistas/vista-listas_de_reproduccion_busqueda_admin.ts")
public class VistaListas_de_reproduccion_busqueda_admin extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaLista_de_reproduccion_admin")
	private VistaLista_de_reproduccion_admin vistaLista_de_reproduccion_admin;
	@Id("vistaLista_de_reproduccion_admin1")
	private VistaLista_de_reproduccion_admin vistaLista_de_reproduccion_admin1;

	/**
     * Creates a new VistaListas_de_reproduccion_busqueda_admin.
     */
    public VistaListas_de_reproduccion_busqueda_admin() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public VistaLista_de_reproduccion_admin getVistaLista_de_reproduccion_admin() {
		return vistaLista_de_reproduccion_admin;
	}

	public void setVistaLista_de_reproduccion_admin(VistaLista_de_reproduccion_admin vistaLista_de_reproduccion_admin) {
		this.vistaLista_de_reproduccion_admin = vistaLista_de_reproduccion_admin;
	}

	public VistaLista_de_reproduccion_admin getVistaLista_de_reproduccion_admin1() {
		return vistaLista_de_reproduccion_admin1;
	}

	public void setVistaLista_de_reproduccion_admin1(VistaLista_de_reproduccion_admin vistaLista_de_reproduccion_admin1) {
		this.vistaLista_de_reproduccion_admin1 = vistaLista_de_reproduccion_admin1;
	}

}
