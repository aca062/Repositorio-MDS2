package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-alta_albumes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-alta_albumes")
@JsModule("./src/vistas/vista-alta_albumes.ts")
public class VistaAlta_albumes extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutAlta")
	private Element layoutAlta;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutAlbum")
	private HorizontalLayout layoutAlbum;
	@Id("img")
	private Image img;
	@Id("anadirImagen")
	private Button anadirImagen;
	@Id("nombreArtista")
	private TextField nombreArtista;
	@Id("titulo")
	private TextField titulo;
	@Id("fechaEdicion")
	private TextField fechaEdicion;
	@Id("estilo")
	private Select estilo;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("vaadinItem2")
	private Element vaadinItem2;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	/**
     * Creates a new VistaAlta_albumes.
     */
    public VistaAlta_albumes() {
        // You can initialise any data required for the connected UI components here.
    }

}
