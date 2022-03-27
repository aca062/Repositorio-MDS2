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

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaUsuario_admin")
	private VistaUsuario_admin vistaUsuario_admin;
	@Id("vistaUsuario_admin1")
	private VistaUsuario_admin vistaUsuario_admin1;

	/**
     * Creates a new VistaUsuarios_busqueda_admin.
     */
    public VistaUsuarios_busqueda_admin() {
        // You can initialise any data required for the connected UI components here.
    }

}
