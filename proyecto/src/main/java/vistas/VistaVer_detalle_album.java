package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaAlbum;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCancion;
import vistas.VistaLista_de_canciones;

/**
 * A Designer generated component for the vista-ver_detalle_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_detalle_album")
@JsModule("./src/vistas/vista-ver_detalle_album.ts")
public class VistaVer_detalle_album extends LitTemplate {

    @Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vistaCancion")
	private VistaCancion vistaCancion;
	@Id("vistaCancion1")
	private VistaCancion vistaCancion1;
	@Id("vistaCancion2")
	private VistaCancion vistaCancion2;
	@Id("vistaLista_de_canciones")
	private VistaLista_de_canciones vistaLista_de_canciones;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("h5")
	private H5 h5;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vistaAlbum")
	private VistaAlbum vistaAlbum;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	/**
     * Creates a new VistaVer_detalle_album.
     */
    public VistaVer_detalle_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
