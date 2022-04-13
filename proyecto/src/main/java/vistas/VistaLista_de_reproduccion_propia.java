package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-lista_de_reproduccion_propia template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_propia")
@JsModule("./src/vistas/vista-lista_de_reproduccion_propia.ts")
public class VistaLista_de_reproduccion_propia extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutListaPropia")
	private HorizontalLayout layoutListaPropia;
	@Id("imgListaPropia")
	private Image imgListaPropia;
	@Id("botonNombre")
	private Button botonNombre;

	/**
     * Creates a new VistaLista_de_reproduccion_propia.
     */
    public VistaLista_de_reproduccion_propia() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutListaPropia() {
		return layoutListaPropia;
	}

	public void setLayoutListaPropia(HorizontalLayout layoutListaPropia) {
		this.layoutListaPropia = layoutListaPropia;
	}

	public Image getImgListaPropia() {
		return imgListaPropia;
	}

	public void setImgListaPropia(Image imgListaPropia) {
		this.imgListaPropia = imgListaPropia;
	}

	public Button getBotonNombre() {
		return botonNombre;
	}

	public void setBotonNombre(Button botonNombre) {
		this.botonNombre = botonNombre;
	}

	

}
