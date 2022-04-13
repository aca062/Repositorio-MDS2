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
 * A Designer generated component for the vista-lista_de_reproduccion_ajena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_ajena")
@JsModule("./src/vistas/vista-lista_de_reproduccion_ajena.ts")
public class VistaLista_de_reproduccion_ajena extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutListaAjena")
	private HorizontalLayout layoutListaAjena;
	@Id("imgListaAjena")
	private Image imgListaAjena;
	@Id("botonNombre")
	private Button botonNombre;

	/**
     * Creates a new VistaLista_de_reproduccion_ajena.
     */
    public VistaLista_de_reproduccion_ajena() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutListaAjena() {
		return layoutListaAjena;
	}

	public void setLayoutListaAjena(HorizontalLayout layoutListaAjena) {
		this.layoutListaAjena = layoutListaAjena;
	}

	public Image getImgListaAjena() {
		return imgListaAjena;
	}

	public void setImgListaAjena(Image imgListaAjena) {
		this.imgListaAjena = imgListaAjena;
	}

	public Button getBotonNombre() {
		return botonNombre;
	}

	public void setBotonNombre(Button botonNombre) {
		this.botonNombre = botonNombre;
	}

	
}
