package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import vistas.VistaPaginacion_listas_ajenas;
import vistas.VistaPaginacion_listas_propias;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver_listas_comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_listas_comun")
@JsModule("./src/vistas/vista-ver_listas_comun.ts")
public class VistaVer_listas_comun extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("h1")
	private H1 h1;
	@Id("h3")
	private H3 h3;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vistaPaginacion_listas_ajenas")
	private VistaPaginacion_listas_ajenas vistaPaginacion_listas_ajenas;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vistaPaginacion_listas_propias")
	private VistaPaginacion_listas_propias vistaPaginacion_listas_propias;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("h31")
	private H3 h31;
	@Id("vaadinButton1")
	private Button vaadinButton1;

	/**
     * Creates a new VistaVer_listas_comun.
     */
    public VistaVer_listas_comun() {
        // You can initialise any data required for the connected UI components here.
    }

}
