package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCancion_admin;

/**
 * A Designer generated component for the vista-canciones_busqueda_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_busqueda_admin")
@JsModule("./src/vistas/vista-canciones_busqueda_admin.ts")
public class VistaCanciones_busqueda_admin extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaCancion_admin")
	private VistaCancion_admin vistaCancion_admin;
	@Id("vistaCancion_admin1")
	private VistaCancion_admin vistaCancion_admin1;

	/**
     * Creates a new VistaCanciones_busqueda_admin.
     */
    public VistaCanciones_busqueda_admin() {
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

	public VistaCancion_admin getVistaCancion_admin() {
		return vistaCancion_admin;
	}

	public void setVistaCancion_admin(VistaCancion_admin vistaCancion_admin) {
		this.vistaCancion_admin = vistaCancion_admin;
	}

	public VistaCancion_admin getVistaCancion_admin1() {
		return vistaCancion_admin1;
	}

	public void setVistaCancion_admin1(VistaCancion_admin vistaCancion_admin1) {
		this.vistaCancion_admin1 = vistaCancion_admin1;
	}

}
