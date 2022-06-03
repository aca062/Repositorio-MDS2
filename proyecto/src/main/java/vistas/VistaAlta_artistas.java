package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.combobox.ComboBox;

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
	@Id("contraseña")
	private PasswordField contrasena;
	@Id("nick")
	private TextField nick;
	@Id("confirmarContraseña")
	private PasswordField confirmarContraseña;
	@Id("eMail")
	private TextField eMail;
	@Id("confirmar")
	private Button confirmar;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("layoutPrincipal")
	private Element layoutPrincipal;
    @Id("subirFoto")
    private Upload subirFoto;
    @Id("botonEliminar")
    private Button botonEliminar;
	@Id("dropdown")
	private ComboBox<String> dropdown;

	/**
     * Creates a new VistaAlta_artistas.
     */
    public VistaAlta_artistas() {
        // You can initialise any data required for the connected UI components here.
    }

	public H2 getH2Titulo() {
		return h2Titulo;
	}

	public void setH2Titulo(H2 h2Titulo) {
		this.h2Titulo = h2Titulo;
	}

	public Element getLayoutArtista() {
		return layoutArtista;
	}

	public void setLayoutArtista(Element layoutArtista) {
		this.layoutArtista = layoutArtista;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Image getImgArtista() {
		return imgArtista;
	}

	public void setImgArtista(Image imgArtista) {
		this.imgArtista = imgArtista;
	}

	public PasswordField getContrasena() {
		return contrasena;
	}

	public void setContrasena(PasswordField contraseña) {
		this.contrasena = contraseña;
	}

	public TextField getNick() {
		return nick;
	}

	public void setNick(TextField nick) {
		this.nick = nick;
	}

	public PasswordField getConfirmarContrasena() {
		return confirmarContraseña;
	}

	public void setConfirmarContraseña(PasswordField confirmarContraseña) {
		this.confirmarContraseña = confirmarContraseña;
	}

	public TextField geteMail() {
		return eMail;
	}

	public void seteMail(TextField eMail) {
		this.eMail = eMail;
	}

	public Button getConfirmar() {
		return confirmar;
	}

	public void setConfirmar(Button confirmar) {
		this.confirmar = confirmar;
	}

	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}

	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}

	public Button getCancelar() {
		return cancelar;
	}

	public void setCancelar(Button cancelar) {
		this.cancelar = cancelar;
	}

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

    public Upload getSubirFoto() {
        return subirFoto;
    }

    public void setSubirFoto(Upload subirFoto) {
        this.subirFoto = subirFoto;
    }

    public Button getBotonEliminar() {
        return botonEliminar;
    }

    public void setBotonEliminar(Button botonEliminar) {
        this.botonEliminar = botonEliminar;
    }

	public ComboBox<String> getDropdown() {
		return dropdown;
	}

	public void setDropdown(ComboBox<String> dropdown) {
		this.dropdown = dropdown;
	}
}
