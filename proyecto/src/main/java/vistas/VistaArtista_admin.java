package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H4;

/**
 * A Designer generated component for the vista-artista_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artista_admin")
@JsModule("./src/vistas/vista-artista_admin.ts")
public class VistaArtista_admin extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("img")
	private Image img;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("h4")
	private H4 h4;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaArtista_admin.
     */
    public VistaArtista_admin() {
        // You can initialise any data required for the connected UI components here.
    }

}
