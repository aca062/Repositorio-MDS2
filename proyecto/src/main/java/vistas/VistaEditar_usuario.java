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
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.upload.Upload;

/**
 * A Designer generated component for the vista-editar_usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar_usuario")
@JsModule("./src/vistas/vista-editar_usuario.ts")
public class VistaEditar_usuario extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutUsuarios")
	private Element layoutUsuarios;
	@Id("layoutUsuario")
	private HorizontalLayout layoutUsuario;
	@Id("nick")
	private TextField nick;
	@Id("contraseña")
	private PasswordField contraseña;
	@Id("confirmarContraseña")
	private PasswordField confirmarContraseña;
	@Id("eMail")
	private TextField eMail;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;
	@Id("img")
	private Image img;
	@Id("upload")
	private Upload upload;
	@Id("eliminarFoto")
	private Button eliminarFoto;

	/**
     * Creates a new VistaEditar_usuario.
     */
    public VistaEditar_usuario() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public H2 getH2Titulo() {
		return h2Titulo;
	}

	public void setH2Titulo(H2 h2Titulo) {
		this.h2Titulo = h2Titulo;
	}

	public Element getLayoutUsuarios() {
		return layoutUsuarios;
	}

	public void setLayoutUsuarios(Element layoutUsuarios) {
		this.layoutUsuarios = layoutUsuarios;
	}

	public HorizontalLayout getLayoutUsuario() {
		return layoutUsuario;
	}

	public void setLayoutUsuario(HorizontalLayout layoutUsuario) {
		this.layoutUsuario = layoutUsuario;
	}

	public TextField getNick() {
		return nick;
	}

	public void setNick(TextField nick) {
		this.nick = nick;
	}

	public PasswordField getContraseña() {
		return contraseña;
	}

	public void setContraseña(PasswordField contraseña) {
		this.contraseña = contraseña;
	}

	public PasswordField getConfirmarContraseña() {
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

	public Button getConfirmar() {
		return confirmar;
	}

	public void setConfirmar(Button confirmar) {
		this.confirmar = confirmar;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public Upload getUpload() {
		return upload;
	}

	public void setUpload(Upload upload) {
		this.upload = upload;
	}

	public Button getEliminarFoto() {
		return eliminarFoto;
	}

	public void setEliminarFoto(Button eliminarFoto) {
		this.eliminarFoto = eliminarFoto;
	}

	

}
