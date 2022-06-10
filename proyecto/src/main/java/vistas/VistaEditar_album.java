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
 * A Designer generated component for the vista-editar_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar_album")
@JsModule("./src/vistas/vista-editar_album.ts")
public class VistaEditar_album extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutAlbumes")
	private Element layoutAlbumes;
	@Id("layoutAlbum")
	private HorizontalLayout layoutAlbum;
	@Id("imgAlbum")
	private Image imgAlbum;
	@Id("cambiarImagen")
	private Button cambiarImagen;
	@Id("nombreArtista")
	private TextField nombreArtista;
	@Id("fechaEdicion")
	private TextField fechaEdicion;
	@Id("titulo")
	private TextField titulo;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("confirmar")
	private Button confirmar;
	@Id("cancelar")
	private Button cancelar;
    @Id("listaCanciones")
    private TextArea listaCanciones;
	@Id("upload")
	private Upload upload;

	/**
     * Creates a new VistaEditar_album.
     */
    public VistaEditar_album() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public H2 getH2Titulo() {
		return h2Titulo;
	}

	public void setH2Titulo(H2 h2Titulo) {
		this.h2Titulo = h2Titulo;
	}

	public Element getLayoutAlbumes() {
		return layoutAlbumes;
	}

	public void setLayoutAlbumes(Element layoutAlbumes) {
		this.layoutAlbumes = layoutAlbumes;
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

	public Button getCambiarImagen() {
		return cambiarImagen;
	}

	public void setCambiarImagen(Button cambiarImagen) {
		this.cambiarImagen = cambiarImagen;
	}

	public TextField getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(TextField nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public TextField getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(TextField fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	public TextField getTitulo() {
		return titulo;
	}

	public void setTitulo(TextField titulo) {
		this.titulo = titulo;
	}

	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}

	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}

	public Button getConfirmar() {
		return confirmar;
	}

	public void setConfirmar(Button confirmar) {
		this.confirmar = confirmar;
	}

	public Button getCancelar() {
		return cancelar;
	}

	public void setCancelar(Button cancelar) {
		this.cancelar = cancelar;
	}

    public TextArea getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(TextArea listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    public Upload getUpload() {
        return upload;
    }

    public void setUpload(Upload upload) {
        this.upload = upload;
    }



}
