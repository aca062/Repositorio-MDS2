package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-introducir_nueva_contrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-introducir_nueva_contrasena")
@JsModule("./src/vistas/vista-introducir_nueva_contrasena.ts")
public class VistaIntroducir_nueva_contrasena extends LitTemplate {



	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("nuevaContrasena")
	private TextField nuevaContrasena;
	@Id("vuelvaAIntroducirLaContrasena")
	private TextField vuelvaAIntroducirLaContrasena;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;

	/**
     * Creates a new VistaIntroducir_nueva_contrasena.
     */
    public VistaIntroducir_nueva_contrasena() {
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

	public TextField getNuevaContrasena() {
		return nuevaContrasena;
	}

	public void setNuevaContrasena(TextField nuevaContrasena) {
		this.nuevaContrasena = nuevaContrasena;
	}

	public TextField getVuelvaAIntroducirLaContrasena() {
		return vuelvaAIntroducirLaContrasena;
	}

	public void setVuelvaAIntroducirLaContrasena(TextField vuelvaAIntroducirLaContrasena) {
		this.vuelvaAIntroducirLaContrasena = vuelvaAIntroducirLaContrasena;
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



}
