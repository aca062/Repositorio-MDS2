package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-registrarse template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registrarse")
@JsModule("./src/vistas/vista-registrarse.ts")
public class VistaRegistrarse extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("img")
	private Image img;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("eMail")
	private TextField eMail;
	@Id("nick")
	private TextField nick;
	@Id("contraseña")
	private TextField contraseña;
	@Id("repetirContraseña")
	private TextField repetirContraseña;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("vaadinButton2")
	private Button vaadinButton2;
	@Id("vaadinButton3")
	private Button vaadinButton3;

	/**
     * Creates a new VistaRegistrarse.
     */
    public VistaRegistrarse() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public TextField geteMail() {
		return eMail;
	}

	public void seteMail(TextField eMail) {
		this.eMail = eMail;
	}

	public TextField getNick() {
		return nick;
	}

	public void setNick(TextField nick) {
		this.nick = nick;
	}

	public TextField getContraseña() {
		return contraseña;
	}

	public void setContraseña(TextField contraseña) {
		this.contraseña = contraseña;
	}

	public TextField getRepetirContraseña() {
		return repetirContraseña;
	}

	public void setRepetirContraseña(TextField repetirContraseña) {
		this.repetirContraseña = repetirContraseña;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getVaadinButton1() {
		return vaadinButton1;
	}

	public void setVaadinButton1(Button vaadinButton1) {
		this.vaadinButton1 = vaadinButton1;
	}

	public Button getVaadinButton2() {
		return vaadinButton2;
	}

	public void setVaadinButton2(Button vaadinButton2) {
		this.vaadinButton2 = vaadinButton2;
	}

	public Button getVaadinButton3() {
		return vaadinButton3;
	}

	public void setVaadinButton3(Button vaadinButton3) {
		this.vaadinButton3 = vaadinButton3;
	}

}
