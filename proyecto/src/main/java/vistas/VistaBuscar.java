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

}
