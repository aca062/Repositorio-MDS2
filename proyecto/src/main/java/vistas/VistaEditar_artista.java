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
 * A Designer generated component for the vista-editar_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar_artista")
@JsModule("./src/vistas/vista-editar_artista.ts")
public class VistaEditar_artista extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutArtistas")
	private Element layoutArtistas;
	@Id("layoutArtista")
	private HorizontalLayout layoutArtista;
	@Id("imgArtista")
	private Image imgArtista;
	@Id("anadirFoto")
	private Button anadirFoto;
	@Id("nick")
	private TextField nick;
	@Id("contraseña")
	private PasswordField contraseña;
	@Id("confirmarContraseña")
	private PasswordField confirmarContraseña;
	@Id("eMail")
	private TextField eMail;
	@Id("estilo")
	private Select estilo;
	@Id("listaEstilos")
	private Element listaEstilos;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;

	/**
     * Creates a new VistaEditar_artista.
     */
    public VistaEditar_artista() {
        // You can initialise any data required for the connected UI components here.
    }

	

}
