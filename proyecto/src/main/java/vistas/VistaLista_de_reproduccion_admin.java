package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-lista_de_reproduccion_admin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_admin")
@JsModule("./src/vistas/vista-lista_de_reproduccion_admin.ts")
public class VistaLista_de_reproduccion_admin extends LitTemplate {

    
	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutLista")
	private HorizontalLayout layoutLista;
	@Id("imgLista")
	private Image imgLista;
	@Id("h4Nombre")
	private H4 h4Nombre;
	@Id("editar")
	private Button editar;
	@Id("eliminar")
	private Button eliminar;

	/**
     * Creates a new VistaLista_de_reproduccion_admin.
     */
    public VistaLista_de_reproduccion_admin() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutLista() {
		return layoutLista;
	}

	public void setLayoutLista(HorizontalLayout layoutLista) {
		this.layoutLista = layoutLista;
	}

	public Image getImgLista() {
		return imgLista;
	}

	public void setImgLista(Image imgLista) {
		this.imgLista = imgLista;
	}

	public H4 getH4Nombre() {
		return h4Nombre;
	}

	public void setH4Nombre(H4 h4Nombre) {
		this.h4Nombre = h4Nombre;
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
