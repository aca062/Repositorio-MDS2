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

	@Id("layoutPrincipal")
	private HorizontalLayout layoutPrincipal;
	@Id("layoutCanciones")
	private Element layoutCanciones;
	@Id("vistaCanciones_busqueda")
	private Element vistaCanciones_busqueda;
	@Id("layoutListas")
	private Element layoutListas;
	@Id("vistaListas_de_reproduccion_busqueda")
	private Element vistaListas_de_reproduccion_busqueda;
	@Id("layoutArtistas")
	private Element layoutArtistas;
	@Id("vistaArtistas_busqueda")
	private Element vistaArtistas_busqueda;

	/**
     * Creates a new VistaBuscar.
     */
    public VistaBuscar() {
        // You can initialise any data required for the connected UI components here.
    }

}
