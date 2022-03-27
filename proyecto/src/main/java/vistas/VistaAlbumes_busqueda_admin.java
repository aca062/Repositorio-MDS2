package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaAlbum_admin;

/**
 * A Designer generated component for the vista-albumes_busqueda_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-albumes_busqueda_admin")
@JsModule("./src/vistas/vista-albumes_busqueda_admin.ts")
public class VistaAlbumes_busqueda_admin extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaAlbum_admin")
	private VistaAlbum_admin vistaAlbum_admin;
	@Id("vistaAlbum_admin1")
	private VistaAlbum_admin vistaAlbum_admin1;

	/**
     * Creates a new VistaAlbumes_busqueda_admin.
     */
    public VistaAlbumes_busqueda_admin() {
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

	public VistaAlbum_admin getVistaAlbum_admin() {
		return vistaAlbum_admin;
	}

	public void setVistaAlbum_admin(VistaAlbum_admin vistaAlbum_admin) {
		this.vistaAlbum_admin = vistaAlbum_admin;
	}

	public VistaAlbum_admin getVistaAlbum_admin1() {
		return vistaAlbum_admin1;
	}

	public void setVistaAlbum_admin1(VistaAlbum_admin vistaAlbum_admin1) {
		this.vistaAlbum_admin1 = vistaAlbum_admin1;
	}

}
