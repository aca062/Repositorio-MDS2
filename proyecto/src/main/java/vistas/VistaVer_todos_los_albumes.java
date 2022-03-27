package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaLista_albumes;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver_todos_los_albumes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_todos_los_albumes")
@JsModule("./src/vistas/vista-ver_todos_los_albumes.ts")
public class VistaVer_todos_los_albumes extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaLista_albumes")
	private VistaLista_albumes vistaLista_albumes;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("h5")
	private H5 h5;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("h51")
	private H5 h51;
	@Id("vaadinButton1")
	private Button vaadinButton1;

	/**
     * Creates a new VistaVer_todos_los_albumes.
     */
    public VistaVer_todos_los_albumes() {
        // You can initialise any data required for the connected UI components here.
    }

}
