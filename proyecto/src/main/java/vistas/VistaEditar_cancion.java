package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-editar_cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar_cancion")
@JsModule("./src/vistas/vista-editar_cancion.ts")
public class VistaEditar_cancion extends LitTemplate {



	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutCancion")
	private Element layoutCancion;
	@Id("titulo")
	private TextField titulo;
	@Id("tituloAlbum")
	private TextField tituloAlbum;
	@Id("compositores")
	private TextField compositores;
	@Id("productores")
	private TextField productores;
	@Id("interpretes")
	private TextField interpretes;
	@Id("estilo")
	private ComboBox estilo;
	@Id("layoutFichero")
	private HorizontalLayout layoutFichero;
	@Id("h4Titulo")
	private H4 h4Titulo;
	@Id("h5Requisitos")
	private H5 h5Requisitos;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;
	@Id("upload")
	private Upload upload;
	@Id("botonEliminar")
	private Button botonEliminar;

	/**
     * Creates a new VistaEditar_cancion.
     */
    public VistaEditar_cancion() {
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

	public Element getLayoutCancion() {
		return layoutCancion;
	}

	public void setLayoutCancion(Element layoutCancion) {
		this.layoutCancion = layoutCancion;
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

	public TextField getCompositores() {
		return compositores;
	}

	public void setCompositores(TextField compositores) {
		this.compositores = compositores;
	}

	public TextField getProductores() {
		return productores;
	}

	public void setProductores(TextField productores) {
		this.productores = productores;
	}

	public TextField getInterpretes() {
		return interpretes;
	}

	public void setInterpretes(TextField interpretes) {
		this.interpretes = interpretes;
	}

	public ComboBox getEstilo() {
		return estilo;
	}

	public void setEstilo(ComboBox estilo) {
		this.estilo = estilo;
	}

	public HorizontalLayout getLayoutFichero() {
		return layoutFichero;
	}

	public void setLayoutFichero(HorizontalLayout layoutFichero) {
		this.layoutFichero = layoutFichero;
	}

	public H4 getH4Titulo() {
		return h4Titulo;
	}

	public void setH4Titulo(H4 h4Titulo) {
		this.h4Titulo = h4Titulo;
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

	public Upload getUpload() {
		return upload;
	}

	public void setUpload(Upload upload) {
		this.upload = upload;
	}

	public Button getBotonEliminar() {
		return botonEliminar;
	}

	public void setBotonEliminar(Button botonEliminar) {
		this.botonEliminar = botonEliminar;
	}


}
