package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCanciones_busqueda_admin;
import vistas.VistaAlbumes_busqueda_admin;
import vistas.VistaListas_de_reproduccion_busqueda_admin;
import vistas.VistaArtistas_busqueda_admin;
import vistas.VistaUsuarios_busqueda_admin;
import vistas.VistaEstilos_busqueda_admin;

/**
 * A Designer generated component for the vista-buscar_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar_administrador")
@JsModule("./src/vistas/vista-buscar_administrador.ts")
public class VistaBuscar_administrador extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vistaCanciones_busqueda_admin")
	private VistaCanciones_busqueda_admin vistaCanciones_busqueda_admin;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vistaAlbumes_busqueda_admin")
	private VistaAlbumes_busqueda_admin vistaAlbumes_busqueda_admin;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vistaListas_de_reproduccion_busqueda_admin")
	private VistaListas_de_reproduccion_busqueda_admin vistaListas_de_reproduccion_busqueda_admin;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vistaArtistas_busqueda_admin")
	private VistaArtistas_busqueda_admin vistaArtistas_busqueda_admin;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("vistaUsuarios_busqueda_admin")
	private VistaUsuarios_busqueda_admin vistaUsuarios_busqueda_admin;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;
	@Id("vistaEstilos_busqueda_admin")
	private VistaEstilos_busqueda_admin vistaEstilos_busqueda_admin;
	/**
     * Creates a new VistaBuscar_administrador.
     */
    public VistaBuscar_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
