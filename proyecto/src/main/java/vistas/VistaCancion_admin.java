package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cancion_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_admin")
@JsModule("./src/vistas/vista-cancion_admin.ts")
public class VistaCancion_admin extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutCancion")
	private HorizontalLayout layoutCancion;
	@Id("imgCancion")
	private Image imgCancion;
	@Id("h4Titulo")
	private H4 h4Titulo;
	@Id("editar")
	private Button editar;
	@Id("eliminar")
	private Button eliminar;

	/**
     * Creates a new VistaCancion_admin.
     */
    public VistaCancion_admin() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutCancion() {
		return layoutCancion;
	}

	public void setLayoutCancion(HorizontalLayout layoutCancion) {
		this.layoutCancion = layoutCancion;
	}

	public Image getImgCancion() {
		return imgCancion;
	}

	public void setImgCancion(Image imgCancion) {
		this.imgCancion = imgCancion;
	}

	public H4 getH4Titulo() {
		return h4Titulo;
	}

	public void setH4Titulo(H4 h4Titulo) {
		this.h4Titulo = h4Titulo;
	}

	public Button getEditar() {
		return editar;
	}

	public void setEditar(Button editar) {
		this.editar = editar;
	}

	public Button getEliminar() {
		return eliminar;
	}

	public void setEliminar(Button eliminar) {
		this.eliminar = eliminar;
	}

	
}
