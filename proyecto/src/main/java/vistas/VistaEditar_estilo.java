package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-editar_estilo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar_estilo")
@JsModule("./src/vistas/vista-editar_estilo.ts")
public class VistaEditar_estilo extends LitTemplate {

    
	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutEstilo")
	private Element layoutEstilo;
	@Id("nombreDelEstilo")
	private TextField nombreDelEstilo;
	@Id("cancelar")
	private Button cancelar;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("confirmar")
	private Button confirmar;

	/**
     * Creates a new VistaEditar_estilo.
     */
    public VistaEditar_estilo() {
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

	public Element getLayoutEstilo() {
		return layoutEstilo;
	}

	public void setLayoutEstilo(Element layoutEstilo) {
		this.layoutEstilo = layoutEstilo;
	}

	public TextField getNombreDelEstilo() {
		return nombreDelEstilo;
	}

	public void setNombreDelEstilo(TextField nombreDelEstilo) {
		this.nombreDelEstilo = nombreDelEstilo;
	}

	public Button getCancelar() {
		return cancelar;
	}

	public void setCancelar(Button cancelar) {
		this.cancelar = cancelar;
	}

	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}

	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}

	public Button getConfirmar() {
		return confirmar;
	}

	public void setConfirmar(Button confirmar) {
		this.confirmar = confirmar;
	}
	

}
