package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-alta_canciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-alta_canciones")
@JsModule("./src/vistas/vista-alta_canciones.ts")
public class VistaAlta_canciones extends LitTemplate {



	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutCnacion")
	private Element layoutCnacion;
	@Id("titulo")
	private TextField titulo;
	@Id("títuloÁlbum")
	private TextField tituloAlbum;
	@Id("productores")
	private TextField productores;
	@Id("compositores")
	private TextField compositores;
	@Id("interpretes")
	private TextField interpretes;
	@Id("layoutAnadirCnacion")
	private HorizontalLayout layoutAnadirCnacion;
	@Id("h4Fichero")
	private H4 h4Fichero;
	@Id("h5Requisitos")
	private H5 h5Requisitos;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;
    @Id("vaadinUpload")
    private Upload vaadinUpload;
    @Id("botonEliminar")
    private Button botonEliminar;
	@Id("dropdown")
	private ComboBox<String> dropdown;
    @Id("img")
    private Image img;
    @Id("vaadinUpload1")
    private Upload vaadinUpload1;
    @Id("vaadinButton")
    private Button vaadinButton;
	/**
     * Creates a new VistaAlta_canciones.
     */
    public VistaAlta_canciones() {
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

	public Element getLayoutCnacion() {
		return layoutCnacion;
	}

	public void setLayoutCnacion(Element layoutCnacion) {
		this.layoutCnacion = layoutCnacion;
	}

	public TextField getTitulo() {
		return titulo;
	}

	public void setTitulo(TextField titulo) {
		this.titulo = titulo;
	}

	public TextField getTituloAlbum() {
		return tituloAlbum;
	}

	public void setTituloAlbum(TextField tituloAlbum) {
		this.tituloAlbum = tituloAlbum;
	}

	public TextField getProductores() {
		return productores;
	}

	public void setProductores(TextField productores) {
		this.productores = productores;
	}

	public TextField getCompositores() {
		return compositores;
	}

	public void setCompositores(TextField compositores) {
		this.compositores = compositores;
	}

	public TextField getInterpretes() {
		return interpretes;
	}

	public void setInterpretes(TextField interpretes) {
		this.interpretes = interpretes;
	}

	public HorizontalLayout getLayoutAnadirCnacion() {
		return layoutAnadirCnacion;
	}

	public void setLayoutAnadirCnacion(HorizontalLayout layoutAnadirCnacion) {
		this.layoutAnadirCnacion = layoutAnadirCnacion;
	}

	public H4 getH4Fichero() {
		return h4Fichero;
	}

	public void setH4Fichero(H4 h4Fichero) {
		this.h4Fichero = h4Fichero;
	}

	public H5 getH5Requisitos() {
		return h5Requisitos;
	}

	public void setH5Requisitos(H5 h5Requisitos) {
		this.h5Requisitos = h5Requisitos;
	}

	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}

	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
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

    public Upload getVaadinUpload() {
        return vaadinUpload;
    }

    public void setVaadinUpload(Upload vaadinUpload) {
        this.vaadinUpload = vaadinUpload;
    }

    public Button getBotonEliminar() {
        return botonEliminar;
    }

    public void setBotonEliminar(Button botonEliminar) {
        this.botonEliminar = botonEliminar;
    }

	public ComboBox<String> getDropdown() {
		return dropdown;
	}

	public void setDropdown(ComboBox<String> dropdown) {
		this.dropdown = dropdown;
	}

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public Upload getVaadinUpload1() {
        return vaadinUpload1;
    }

    public void setVaadinUpload1(Upload vaadinUpload1) {
        this.vaadinUpload1 = vaadinUpload1;
    }

    public Button getVaadinButton() {
        return vaadinButton;
    }

    public void setVaadinButton(Button vaadinButton) {
        this.vaadinButton = vaadinButton;
    }

}
