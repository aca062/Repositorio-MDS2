package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaUsuario_admin;

/**
 * A Designer generated component for the vista-usuarios_busqueda_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuarios_busqueda_admin")
@JsModule("./src/vistas/vista-usuarios_busqueda_admin.ts")
public class VistaUsuarios_busqueda_admin extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Usuarios")
	private H1 h1Usuarios;
	@Id("layoutUsuarios")
	private HorizontalLayout layoutUsuarios;
	@Id("vistaUsuario_admin")
	private Element vistaUsuario_admin;
	@Id("vistaUsuario_admin1")
	private Element vistaUsuario_admin1;

	/**
     * Creates a new VistaUsuarios_busqueda_admin.
     */
    public VistaUsuarios_busqueda_admin() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public H1 getH1Usuarios() {
		return h1Usuarios;
	}

	public void setH1Usuarios(H1 h1Usuarios) {
		this.h1Usuarios = h1Usuarios;
	}

	public HorizontalLayout getLayoutUsuarios() {
		return layoutUsuarios;
	}

	public void setLayoutUsuarios(HorizontalLayout layoutUsuarios) {
		this.layoutUsuarios = layoutUsuarios;
	}

	public Element getVistaUsuario_admin() {
		return vistaUsuario_admin;
	}

	public void setVistaUsuario_admin(Element vistaUsuario_admin) {
		this.vistaUsuario_admin = vistaUsuario_admin;
	}

	public Element getVistaUsuario_admin1() {
		return vistaUsuario_admin1;
	}

	public void setVistaUsuario_admin1(Element vistaUsuario_admin1) {
		this.vistaUsuario_admin1 = vistaUsuario_admin1;
	}

}
