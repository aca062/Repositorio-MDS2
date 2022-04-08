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

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutCanciones")
	private HorizontalLayout layoutCanciones;
	@Id("vistaCanciones_busqueda_admin")
	private Element vistaCanciones_busqueda_admin;
	@Id("layoutAlbumes")
	private HorizontalLayout layoutAlbumes;
	@Id("vistaAlbumes_busqueda_admin")
	private Element vistaAlbumes_busqueda_admin;
	@Id("layoutListas")
	private HorizontalLayout layoutListas;
	@Id("vistaListas_de_reproduccion_busqueda_admin")
	private Element vistaListas_de_reproduccion_busqueda_admin;
	@Id("layoutArtistas")
	private HorizontalLayout layoutArtistas;
	@Id("vistaArtistas_busqueda_admin")
	private Element vistaArtistas_busqueda_admin;
	@Id("layoutUsuarios")
	private HorizontalLayout layoutUsuarios;
	@Id("vistaUsuarios_busqueda_admin")
	private Element vistaUsuarios_busqueda_admin;
	@Id("layoutEstilos")
	private HorizontalLayout layoutEstilos;
	@Id("vistaEstilos_busqueda_admin")
	private Element vistaEstilos_busqueda_admin;

	/**
     * Creates a new VistaBuscar_administrador.
     */
    public VistaBuscar_administrador() {
        // You can initialise any data required for the connected UI components here.
    }
}
