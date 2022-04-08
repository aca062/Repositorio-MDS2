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
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-alta_artistas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-alta_artistas")
@JsModule("./src/vistas/vista-alta_artistas.ts")
public class VistaAlta_artistas extends LitTemplate {

	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutArtista")
	private Element layoutArtista;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("imgArtista")
	private Image imgArtista;
	@Id("anadirFoto")
	private Button anadirFoto;
	@Id("contraseña")
	private PasswordField contraseña;
	@Id("nick")
	private TextField nick;
	@Id("confirmarContraseña")
	private PasswordField confirmarContraseña;
	@Id("eMail")
	private TextField eMail;
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
	@Id("confirmar")
	private Button confirmar;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("layoutPrincipal")
	private Element layoutPrincipal;

	/**
     * Creates a new VistaAlta_artistas.
     */
    public VistaAlta_artistas() {
        // You can initialise any data required for the connected UI components here.
    }
}
