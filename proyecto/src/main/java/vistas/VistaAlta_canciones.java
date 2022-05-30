package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;
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
	@Id("estilo")
	private Select estilo;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("vaadinItem2")
	private Element vaadinItem2;
	@Id("layoutAnadirCnacion")
	private HorizontalLayout layoutAnadirCnacion;
	@Id("h4Fichero")
	private H4 h4Fichero;
	@Id("anadirCancion")
	private Button anadirCancion;
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

	public Select getEstilo() {
		return estilo;
	}

	public void setEstilo(Select estilo) {
		this.estilo = estilo;
	}

	public Element getVaadinListBox() {
		return vaadinListBox;
	}

	public void setVaadinListBox(Element vaadinListBox) {
		this.vaadinListBox = vaadinListBox;
	}

	public Element getVaadinItem() {
		return vaadinItem;
	}

	public void setVaadinItem(Element vaadinItem) {
		this.vaadinItem = vaadinItem;
	}

	public Element getVaadinItem1() {
		return vaadinItem1;
	}

	public void setVaadinItem1(Element vaadinItem1) {
		this.vaadinItem1 = vaadinItem1;
	}

	public Element getVaadinItem2() {
		return vaadinItem2;
	}

	public void setVaadinItem2(Element vaadinItem2) {
		this.vaadinItem2 = vaadinItem2;
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

	public Button getAnadirCancion() {
		return anadirCancion;
	}

	public void setAnadirCancion(Button anadirCancion) {
		this.anadirCancion = anadirCancion;
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

}
