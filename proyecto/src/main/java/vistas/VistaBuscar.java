package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import vistas.VistaCanciones_busqueda;
import vistas.VistaCancion;
import vistas.VistaListas_de_reproduccion_busqueda;
import vistas.VistaArtistas_busqueda;
import vistas.VistaArtista_elemento;

/**
 * A Designer generated component for the vista-buscar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar")
@JsModule("./src/vistas/vista-buscar.ts")
public class VistaBuscar extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vistaCanciones_busqueda")
	private VistaCanciones_busqueda vistaCanciones_busqueda;
	@Id("vistaCancion")
	private VistaCancion vistaCancion;
	@Id("vistaCancion1")
	private VistaCancion vistaCancion1;
	@Id("vistaCancion2")
	private VistaCancion vistaCancion2;
	@Id("vistaCancion3")
	private VistaCancion vistaCancion3;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vistaArtistas_busqueda")
	private VistaArtistas_busqueda vistaArtistas_busqueda;
	@Id("vistaArtista_elemento")
	private VistaArtista_elemento vistaArtista_elemento;
	@Id("vistaArtista_elemento1")
	private VistaArtista_elemento vistaArtista_elemento1;
	@Id("vistaArtista_elemento2")
	private VistaArtista_elemento vistaArtista_elemento2;
	@Id("vistaArtista_elemento3")
	private VistaArtista_elemento vistaArtista_elemento3;
	@Id("vistaArtista_elemento4")
	private VistaArtista_elemento vistaArtista_elemento4;
	@Id("vistaArtista_elemento5")
	private VistaArtista_elemento vistaArtista_elemento5;
	@Id("vistaListas_de_reproduccion_busqueda")
	private VistaListas_de_reproduccion_busqueda vistaListas_de_reproduccion_busqueda;

	/**
     * Creates a new VistaBuscar.
     */
    public VistaBuscar() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public VistaCanciones_busqueda getVistaCanciones_busqueda() {
		return vistaCanciones_busqueda;
	}

	public void setVistaCanciones_busqueda(VistaCanciones_busqueda vistaCanciones_busqueda) {
		this.vistaCanciones_busqueda = vistaCanciones_busqueda;
	}

	public VistaCancion getVistaCancion() {
		return vistaCancion;
	}

	public void setVistaCancion(VistaCancion vistaCancion) {
		this.vistaCancion = vistaCancion;
	}

	public VistaCancion getVistaCancion1() {
		return vistaCancion1;
	}

	public void setVistaCancion1(VistaCancion vistaCancion1) {
		this.vistaCancion1 = vistaCancion1;
	}

	public VistaCancion getVistaCancion2() {
		return vistaCancion2;
	}

	public void setVistaCancion2(VistaCancion vistaCancion2) {
		this.vistaCancion2 = vistaCancion2;
	}

	public VistaCancion getVistaCancion3() {
		return vistaCancion3;
	}

	public void setVistaCancion3(VistaCancion vistaCancion3) {
		this.vistaCancion3 = vistaCancion3;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public VistaArtistas_busqueda getVistaArtistas_busqueda() {
		return vistaArtistas_busqueda;
	}

	public void setVistaArtistas_busqueda(VistaArtistas_busqueda vistaArtistas_busqueda) {
		this.vistaArtistas_busqueda = vistaArtistas_busqueda;
	}

	public VistaArtista_elemento getVistaArtista_elemento() {
		return vistaArtista_elemento;
	}

	public void setVistaArtista_elemento(VistaArtista_elemento vistaArtista_elemento) {
		this.vistaArtista_elemento = vistaArtista_elemento;
	}

	public VistaArtista_elemento getVistaArtista_elemento1() {
		return vistaArtista_elemento1;
	}

	public void setVistaArtista_elemento1(VistaArtista_elemento vistaArtista_elemento1) {
		this.vistaArtista_elemento1 = vistaArtista_elemento1;
	}

	public VistaArtista_elemento getVistaArtista_elemento2() {
		return vistaArtista_elemento2;
	}

	public void setVistaArtista_elemento2(VistaArtista_elemento vistaArtista_elemento2) {
		this.vistaArtista_elemento2 = vistaArtista_elemento2;
	}

	public VistaArtista_elemento getVistaArtista_elemento3() {
		return vistaArtista_elemento3;
	}

	public void setVistaArtista_elemento3(VistaArtista_elemento vistaArtista_elemento3) {
		this.vistaArtista_elemento3 = vistaArtista_elemento3;
	}

	public VistaArtista_elemento getVistaArtista_elemento4() {
		return vistaArtista_elemento4;
	}

	public void setVistaArtista_elemento4(VistaArtista_elemento vistaArtista_elemento4) {
		this.vistaArtista_elemento4 = vistaArtista_elemento4;
	}

	public VistaArtista_elemento getVistaArtista_elemento5() {
		return vistaArtista_elemento5;
	}

	public void setVistaArtista_elemento5(VistaArtista_elemento vistaArtista_elemento5) {
		this.vistaArtista_elemento5 = vistaArtista_elemento5;
	}

	public VistaListas_de_reproduccion_busqueda getVistaListas_de_reproduccion_busqueda() {
		return vistaListas_de_reproduccion_busqueda;
	}

	public void setVistaListas_de_reproduccion_busqueda(
			VistaListas_de_reproduccion_busqueda vistaListas_de_reproduccion_busqueda) {
		this.vistaListas_de_reproduccion_busqueda = vistaListas_de_reproduccion_busqueda;
	}

}
