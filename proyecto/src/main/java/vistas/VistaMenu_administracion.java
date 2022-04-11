package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Hr;

/**
 * A Designer generated component for the vista-menu_administracion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-menu_administracion")
@JsModule("./src/vistas/vista-menu_administracion.ts")
public class VistaMenu_administracion extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Administracion")
	private H2 h2Administracion;
	@Id("layoutMenuAdmin")
	private Element layoutMenuAdmin;
	@Id("layoutBotonesAdmin")
	private HorizontalLayout layoutBotonesAdmin;
	@Id("botonBuscarElemento")
	private Button botonBuscarElemento;
	@Id("botonDarDeAlta")
	private Button botonDarDeAlta;
	@Id("layoutLimiteCanciones")
	private HorizontalLayout layoutLimiteCanciones;
	@Id("h4TextoLimite")
	private H4 h4TextoLimite;
	@Id("botonEditarLimite")
	private Button botonEditarLimite;
	@Id("layoutCancionesMostradas")
	private HorizontalLayout layoutCancionesMostradas;
	@Id("h4TextoCancionesMostradas")
	private H4 h4TextoCancionesMostradas;
	@Id("botonEditarCanciones")
	private Button botonEditarCanciones;
	@Id("listaCanciones")
	private Element listaCanciones;
	@Id("cancion1")
	private Element cancion1;
	@Id("cancion2")
	private Element cancion2;
	@Id("separador")
	private Hr separador;
	@Id("cancion3")
	private Element cancion3;
	@Id("cancion4")
	private Element cancion4;
	@Id("iconoEditarLimite")
	private Element iconoEditarLimite;
	@Id("iconoEditarCanciones")
	private Element iconoEditarCanciones;
	/**
     * Creates a new VistaMenu_administracion.
     */
    public VistaMenu_administracion() {
        // You can initialise any data required for the connected UI components here.
    }

	

}
