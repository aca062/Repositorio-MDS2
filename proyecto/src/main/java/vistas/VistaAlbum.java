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
 * A Designer generated component for the vista-album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-album")
@JsModule("./src/vistas/vista-album.ts")
public class VistaAlbum extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutAlbum")
	private HorizontalLayout layoutAlbum;
	@Id("imgAlbum")
	private Image imgAlbum;
	@Id("titulo")
	private Button titulo;

	/**
     * Creates a new VistaAlbum.
     */
    public VistaAlbum() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutAlbum() {
		return layoutAlbum;
	}

	public void setLayoutAlbum(HorizontalLayout layoutAlbum) {
		this.layoutAlbum = layoutAlbum;
	}

	public Image getImgAlbum() {
		return imgAlbum;
	}

	public void setImgAlbum(Image imgAlbum) {
		this.imgAlbum = imgAlbum;
	}

	public Button getTitulo() {
		return titulo;
	}

	public void setTitulo(Button titulo) {
		this.titulo = titulo;
	}

}
