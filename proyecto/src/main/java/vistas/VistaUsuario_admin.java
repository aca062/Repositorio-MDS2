package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-usuario_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuario_admin")
@JsModule("./src/vistas/vista-usuario_admin.ts")
public class VistaUsuario_admin extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutUsuario")
	private HorizontalLayout layoutUsuario;
	@Id("h4NombrePerfil")
	private H4 h4NombrePerfil;
	@Id("botonEditar")
	private Button botonEditar;
	@Id("botonEliminar")
	private Button botonEliminar;

	/**
     * Creates a new VistaUsuario_admin.
     */
    public VistaUsuario_admin() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutUsuario() {
		return layoutUsuario;
	}

	public void setLayoutUsuario(HorizontalLayout layoutUsuario) {
		this.layoutUsuario = layoutUsuario;
	}

	public H4 getH4NombrePerfil() {
		return h4NombrePerfil;
	}

	public void setH4NombrePerfil(H4 h4NombrePerfil) {
		this.h4NombrePerfil = h4NombrePerfil;
	}

	public Button getBotonEditar() {
		return botonEditar;
	}

	public void setBotonEditar(Button botonEditar) {
		this.botonEditar = botonEditar;
	}

	public Button getBotonEliminar() {
		return botonEliminar;
	}

	public void setBotonEliminar(Button botonEliminar) {
		this.botonEliminar = botonEliminar;
	}

}
