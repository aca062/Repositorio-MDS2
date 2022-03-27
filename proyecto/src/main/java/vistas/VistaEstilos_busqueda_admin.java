package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaEstilo_admin;

/**
 * A Designer generated component for the vista-estilos_busqueda_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-estilos_busqueda_admin")
@JsModule("./src/vistas/vista-estilos_busqueda_admin.ts")
public class VistaEstilos_busqueda_admin extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaEstilo_admin")
	private VistaEstilo_admin vistaEstilo_admin;
	@Id("vistaEstilo_admin1")
	private VistaEstilo_admin vistaEstilo_admin1;

	/**
     * Creates a new VistaEstilos_busqueda_admin.
     */
    public VistaEstilos_busqueda_admin() {
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

	public VistaEstilo_admin getVistaEstilo_admin() {
		return vistaEstilo_admin;
	}

	public void setVistaEstilo_admin(VistaEstilo_admin vistaEstilo_admin) {
		this.vistaEstilo_admin = vistaEstilo_admin;
	}

	public VistaEstilo_admin getVistaEstilo_admin1() {
		return vistaEstilo_admin1;
	}

	public void setVistaEstilo_admin1(VistaEstilo_admin vistaEstilo_admin1) {
		this.vistaEstilo_admin1 = vistaEstilo_admin1;
	}

}
