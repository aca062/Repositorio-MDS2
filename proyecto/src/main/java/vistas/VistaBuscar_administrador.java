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

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutCanciones() {
		return layoutCanciones;
	}

	public void setLayoutCanciones(HorizontalLayout layoutCanciones) {
		this.layoutCanciones = layoutCanciones;
	}

	public Element getVistaCanciones_busqueda_admin() {
		return vistaCanciones_busqueda_admin;
	}

	public void setVistaCanciones_busqueda_admin(Element vistaCanciones_busqueda_admin) {
		this.vistaCanciones_busqueda_admin = vistaCanciones_busqueda_admin;
	}

	public HorizontalLayout getLayoutAlbumes() {
		return layoutAlbumes;
	}

	public void setLayoutAlbumes(HorizontalLayout layoutAlbumes) {
		this.layoutAlbumes = layoutAlbumes;
	}

	public Element getVistaAlbumes_busqueda_admin() {
		return vistaAlbumes_busqueda_admin;
	}

	public void setVistaAlbumes_busqueda_admin(Element vistaAlbumes_busqueda_admin) {
		this.vistaAlbumes_busqueda_admin = vistaAlbumes_busqueda_admin;
	}

	public HorizontalLayout getLayoutListas() {
		return layoutListas;
	}

	public void setLayoutListas(HorizontalLayout layoutListas) {
		this.layoutListas = layoutListas;
	}

	public Element getVistaListas_de_reproduccion_busqueda_admin() {
		return vistaListas_de_reproduccion_busqueda_admin;
	}

	public void setVistaListas_de_reproduccion_busqueda_admin(Element vistaListas_de_reproduccion_busqueda_admin) {
		this.vistaListas_de_reproduccion_busqueda_admin = vistaListas_de_reproduccion_busqueda_admin;
	}

	public HorizontalLayout getLayoutArtistas() {
		return layoutArtistas;
	}

	public void setLayoutArtistas(HorizontalLayout layoutArtistas) {
		this.layoutArtistas = layoutArtistas;
	}

	public Element getVistaArtistas_busqueda_admin() {
		return vistaArtistas_busqueda_admin;
	}

	public void setVistaArtistas_busqueda_admin(Element vistaArtistas_busqueda_admin) {
		this.vistaArtistas_busqueda_admin = vistaArtistas_busqueda_admin;
	}

	public HorizontalLayout getLayoutUsuarios() {
		return layoutUsuarios;
	}

	public void setLayoutUsuarios(HorizontalLayout layoutUsuarios) {
		this.layoutUsuarios = layoutUsuarios;
	}

	public Element getVistaUsuarios_busqueda_admin() {
		return vistaUsuarios_busqueda_admin;
	}

	public void setVistaUsuarios_busqueda_admin(Element vistaUsuarios_busqueda_admin) {
		this.vistaUsuarios_busqueda_admin = vistaUsuarios_busqueda_admin;
	}

	public HorizontalLayout getLayoutEstilos() {
		return layoutEstilos;
	}

	public void setLayoutEstilos(HorizontalLayout layoutEstilos) {
		this.layoutEstilos = layoutEstilos;
	}

	public Element getVistaEstilos_busqueda_admin() {
		return vistaEstilos_busqueda_admin;
	}

	public void setVistaEstilos_busqueda_admin(Element vistaEstilos_busqueda_admin) {
		this.vistaEstilos_busqueda_admin = vistaEstilos_busqueda_admin;
	}
}
