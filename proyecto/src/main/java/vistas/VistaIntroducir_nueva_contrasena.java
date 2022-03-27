package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-introducir_nueva_contrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-introducir_nueva_contrasena")
@JsModule("./src/vistas/vista-introducir_nueva_contrasena.ts")
public class VistaIntroducir_nueva_contrasena extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("h2")
	private H2 h2;
	@Id("vuelvaAIntroducirLaContraseña")
	private TextField vuelvaAIntroducirLaContraseña;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("nuevaContraseña")
	private TextField nuevaContraseña;

	/**
     * Creates a new VistaIntroducir_nueva_contrasena.
     */
    public VistaIntroducir_nueva_contrasena() {
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

	public H2 getH2() {
		return h2;
	}

	public void setH2(H2 h2) {
		this.h2 = h2;
	}

	public TextField getVuelvaAIntroducirLaContraseña() {
		return vuelvaAIntroducirLaContraseña;
	}

	public void setVuelvaAIntroducirLaContraseña(TextField vuelvaAIntroducirLaContraseña) {
		this.vuelvaAIntroducirLaContraseña = vuelvaAIntroducirLaContraseña;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Button getVaadinButton1() {
		return vaadinButton1;
	}

	public void setVaadinButton1(Button vaadinButton1) {
		this.vaadinButton1 = vaadinButton1;
	}

	public TextField getNuevaContraseña() {
		return nuevaContraseña;
	}

	public void setNuevaContraseña(TextField nuevaContraseña) {
		this.nuevaContraseña = nuevaContraseña;
	}

}
