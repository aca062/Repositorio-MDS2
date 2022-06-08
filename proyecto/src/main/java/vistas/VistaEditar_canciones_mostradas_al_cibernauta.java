package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-editar_caciones_mostradas_al_cbernauta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar_canciones_mostradas_al_cibernauta")
@JsModule("./src/vistas/vista-editar_canciones_mostradas_al_cibernauta.ts")
public class VistaEditar_canciones_mostradas_al_cibernauta extends LitTemplate {



	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutCanciones")
	private Element layoutCanciones;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;
    @Id("h3")
    private H3 h3;
    @Id("vaadinTextArea")
    private TextArea vaadinTextArea;

	/**
     * Creates a new VistaEditar_caciones_mostradas_al_cbernauta.
     */
    public VistaEditar_canciones_mostradas_al_cibernauta() {
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

	public Element getLayoutCanciones() {
		return layoutCanciones;
	}

	public void setLayoutCanciones(Element layoutCanciones) {
		this.layoutCanciones = layoutCanciones;
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

    public TextArea getVaadinTextArea() {
        return vaadinTextArea;
    }

    public void setVaadinTextArea(TextArea vaadinTextArea) {
        this.vaadinTextArea = vaadinTextArea;
    }


}
