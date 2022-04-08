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
	

}
