package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-estilos_busqueda_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-estilos_busqueda_admin")
@JsModule("./src/vistas/vista-estilos_busqueda_admin.ts")
public class VistaEstilos_busqueda_admin extends LitTemplate {



	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("Titulo")
	private H1 titulo;
	@Id("layoutEstilo")
	private HorizontalLayout layoutEstilo;

	/**
     * Creates a new VistaEstilos_busqueda_admin.
     */
    public VistaEstilos_busqueda_admin() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public H1 getTitulo() {
		return titulo;
	}

	public void setTitulo(H1 titulo) {
		this.titulo = titulo;
	}

	public HorizontalLayout getLayoutEstilo() {
		return layoutEstilo;
	}

	public void setLayoutEstilo(HorizontalLayout layoutEstilo) {
		this.layoutEstilo = layoutEstilo;
	}
}
