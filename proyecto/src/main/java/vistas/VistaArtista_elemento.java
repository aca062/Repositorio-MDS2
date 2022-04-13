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
 * A Designer generated component for the vista-artista_elemento template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artista_elemento")
@JsModule("./src/vistas/vista-artista_elemento.ts")
public class VistaArtista_elemento extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutArtista")
	private HorizontalLayout layoutArtista;
	@Id("imgArtista")
	private Image imgArtista;
	@Id("botonNombre")
	private Button botonNombre;

	/**
     * Creates a new VistaArtista_elemento.
     */
    public VistaArtista_elemento() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutArtista() {
		return layoutArtista;
	}

	public void setLayoutArtista(HorizontalLayout layoutArtista) {
		this.layoutArtista = layoutArtista;
	}

	public Image getImgArtista() {
		return imgArtista;
	}

	public void setImgArtista(Image imgArtista) {
		this.imgArtista = imgArtista;
	}

	public Button getBotonNombre() {
		return botonNombre;
	}

	public void setBotonNombre(Button botonNombre) {
		this.botonNombre = botonNombre;
	}

}
