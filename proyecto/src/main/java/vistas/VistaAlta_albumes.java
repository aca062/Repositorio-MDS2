package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-alta_albumes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-alta_albumes")
@JsModule("./src/vistas/vista-alta_albumes.ts")
public class VistaAlta_albumes extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutAlta")
	private Element layoutAlta;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutAlbum")
	private HorizontalLayout layoutAlbum;
	@Id("titulo")
	private TextField titulo;
	@Id("fechaEdicion")
	private TextField fechaEdicion;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
    @Id("imagen")
    private Image imagen;
    @Id("vaadinUpload")
    private Upload vaadinUpload;
    @Id("eliminarFoto")
    private Button eliminarFoto;
    @Id("canciones")
    private TextArea canciones;
    @Id("nombreArtista")
    private TextField nombreArtista;
	/**
     * Creates a new VistaAlta_albumes.
     */
    public VistaAlta_albumes() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}
	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}
	public Element getLayoutAlta() {
		return layoutAlta;
	}
	public void setLayoutAlta(Element layoutAlta) {
		this.layoutAlta = layoutAlta;
	}
	public H2 getH2Titulo() {
		return h2Titulo;
	}
	public void setH2Titulo(H2 h2Titulo) {
		this.h2Titulo = h2Titulo;
	}
	public HorizontalLayout getLayoutAlbum() {
		return layoutAlbum;
	}
	public void setLayoutAlbum(HorizontalLayout layoutAlbum) {
		this.layoutAlbum = layoutAlbum;
	}
	public TextField getNombreArtista() {
		return nombreArtista;
	}
	public void setNombreArtista(TextField nombreArtista) {
		this.nombreArtista = nombreArtista;
	}
	public TextField getTitulo() {
		return titulo;
	}
	public void setTitulo(TextField titulo) {
		this.titulo = titulo;
	}
	public TextField getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(TextField fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}
	public Button getCancelar() {
		return cancelar;
	}
	public void setCancelar(Button cancelar) {
		this.cancelar = cancelar;
	}
	public Button getConfirmar() {
		return confirmar;
	}
	public void setConfirmar(Button confirmar) {
		this.confirmar = confirmar;
	}
	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}
	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}
    public Image getImagen() {
        return imagen;
    }
    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    public Upload getVaadinUpload() {
        return vaadinUpload;
    }
    public void setVaadinUpload(Upload vaadinUpload) {
        this.vaadinUpload = vaadinUpload;
    }
    public Button getEliminarFoto() {
        return eliminarFoto;
    }
    public void setEliminarFoto(Button eliminarFoto) {
        this.eliminarFoto = eliminarFoto;
    }
    public TextArea getCanciones() {
        return canciones;
    }
    public void setCanciones(TextArea canciones) {
        this.canciones = canciones;
    }

}
