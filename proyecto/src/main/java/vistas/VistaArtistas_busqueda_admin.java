package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaArtista_admin;

/**
 * A Designer generated component for the vista-artistas_busqueda_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artistas_busqueda_admin")
@JsModule("./src/vistas/vista-artistas_busqueda_admin.ts")
public class VistaArtistas_busqueda_admin extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaArtista_admin")
	private VistaArtista_admin vistaArtista_admin;
	@Id("vistaArtista_admin1")
	private VistaArtista_admin vistaArtista_admin1;

	/**
     * Creates a new VistaArtistas_busqueda_admin.
     */
    public VistaArtistas_busqueda_admin() {
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

	public VistaArtista_admin getVistaArtista_admin() {
		return vistaArtista_admin;
	}

	public void setVistaArtista_admin(VistaArtista_admin vistaArtista_admin) {
		this.vistaArtista_admin = vistaArtista_admin;
	}

	public VistaArtista_admin getVistaArtista_admin1() {
		return vistaArtista_admin1;
	}

	public void setVistaArtista_admin1(VistaArtista_admin vistaArtista_admin1) {
		this.vistaArtista_admin1 = vistaArtista_admin1;
	}

}
