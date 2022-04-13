package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-verificar_e_mail template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verificar_e_mail")
@JsModule("./src/vistas/vista-verificar_e_mail.ts")
public class VistaVerificar_e_mail extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutVerificacion")
	private Element layoutVerificacion;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("h4Instrucciones")
	private H4 h4Instrucciones;
	@Id("numeroAcceso")
	private TextField numeroAcceso;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("botonCancelar")
	private Button botonCancelar;
	@Id("botonConfirmar")
	private Button botonConfirmar;
	@Id("botonEnviarOtraVez")
	private Button botonEnviarOtraVez;
	/**
     * Creates a new VistaVerificar_e_mail.
     */
    public VistaVerificar_e_mail() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}
	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}
	public Element getLayoutVerificacion() {
		return layoutVerificacion;
	}
	public void setLayoutVerificacion(Element layoutVerificacion) {
		this.layoutVerificacion = layoutVerificacion;
	}
	public H2 getH2Titulo() {
		return h2Titulo;
	}
	public void setH2Titulo(H2 h2Titulo) {
		this.h2Titulo = h2Titulo;
	}
	public H4 getH4Instrucciones() {
		return h4Instrucciones;
	}
	public void setH4Instrucciones(H4 h4Instrucciones) {
		this.h4Instrucciones = h4Instrucciones;
	}
	public TextField getNumeroAcceso() {
		return numeroAcceso;
	}
	public void setNumeroAcceso(TextField numeroAcceso) {
		this.numeroAcceso = numeroAcceso;
	}
	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}
	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}
	public Button getBotonCancelar() {
		return botonCancelar;
	}
	public void setBotonCancelar(Button botonCancelar) {
		this.botonCancelar = botonCancelar;
	}
	public Button getBotonConfirmar() {
		return botonConfirmar;
	}
	public void setBotonConfirmar(Button botonConfirmar) {
		this.botonConfirmar = botonConfirmar;
	}
	public Button getBotonEnviarOtraVez() {
		return botonEnviarOtraVez;
	}
	public void setBotonEnviarOtraVez(Button botonEnviarOtraVez) {
		this.botonEnviarOtraVez = botonEnviarOtraVez;
	}

}
