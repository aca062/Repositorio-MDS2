package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.H2;

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
	@Id("fechaEdición")
	private TextField fechaEdición;
	@Id("titulo")
	private TextField titulo;
	@Id("buscadorCanciones")
	private Select buscadorCanciones;
	@Id("vaadinListBox1")
	private Element vaadinListBox1;
	@Id("vaadinItem3")
	private Element vaadinItem3;
	@Id("vaadinItem4")
	private Element vaadinItem4;
	@Id("vaadinItem5")
	private Element vaadinItem5;
	@Id("listaCanciones")
	private Element listaCanciones;
	@Id("layoutCancion")
	private HorizontalLayout layoutCancion;
	@Id("nombreCancion")
	private Element nombreCancion;
	@Id("eliminar")
	private Button eliminar;
	@Id("layoutCancion1")
	private HorizontalLayout layoutCancion1;
	@Id("nombreCancion1")
	private Element nombreCancion1;
	@Id("eliminar1")
	private Button eliminar1;
	@Id("layoutCancion2")
	private HorizontalLayout layoutCancion2;
	@Id("nombreCancion2")
	private Element nombreCancion2;
	@Id("eliminar2")
	private Button eliminar2;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("confirmar")
	private Button confirmar;
	@Id("cancelar")
	private Button cancelar;

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

	public TextField getFechaEdición() {
		return fechaEdición;
	}

	public void setFechaEdición(TextField fechaEdición) {
		this.fechaEdición = fechaEdición;
	}

	public TextField getTitulo() {
		return titulo;
	}

	public void setTitulo(TextField titulo) {
		this.titulo = titulo;
	}

	public Select getBuscadorCanciones() {
		return buscadorCanciones;
	}

	public void setBuscadorCanciones(Select buscadorCanciones) {
		this.buscadorCanciones = buscadorCanciones;
	}

	public Element getVaadinListBox1() {
		return vaadinListBox1;
	}

	public void setVaadinListBox1(Element vaadinListBox1) {
		this.vaadinListBox1 = vaadinListBox1;
	}

	public Element getVaadinItem3() {
		return vaadinItem3;
	}

	public void setVaadinItem3(Element vaadinItem3) {
		this.vaadinItem3 = vaadinItem3;
	}

	public Element getVaadinItem4() {
		return vaadinItem4;
	}

	public void setVaadinItem4(Element vaadinItem4) {
		this.vaadinItem4 = vaadinItem4;
	}

	public Element getVaadinItem5() {
		return vaadinItem5;
	}

	public void setVaadinItem5(Element vaadinItem5) {
		this.vaadinItem5 = vaadinItem5;
	}

	public Element getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(Element listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

	public HorizontalLayout getLayoutCancion() {
		return layoutCancion;
	}

	public void setLayoutCancion(HorizontalLayout layoutCancion) {
		this.layoutCancion = layoutCancion;
	}

	public Element getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(Element nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public Button getEliminar() {
		return eliminar;
	}

	public void setEliminar(Button eliminar) {
		this.eliminar = eliminar;
	}

	public HorizontalLayout getLayoutCancion1() {
		return layoutCancion1;
	}

	public void setLayoutCancion1(HorizontalLayout layoutCancion1) {
		this.layoutCancion1 = layoutCancion1;
	}

	public Element getNombreCancion1() {
		return nombreCancion1;
	}

	public void setNombreCancion1(Element nombreCancion1) {
		this.nombreCancion1 = nombreCancion1;
	}

	public Button getEliminar1() {
		return eliminar1;
	}

	public void setEliminar1(Button eliminar1) {
		this.eliminar1 = eliminar1;
	}

	public HorizontalLayout getLayoutCancion2() {
		return layoutCancion2;
	}

	public void setLayoutCancion2(HorizontalLayout layoutCancion2) {
		this.layoutCancion2 = layoutCancion2;
	}

	public Element getNombreCancion2() {
		return nombreCancion2;
	}

	public void setNombreCancion2(Element nombreCancion2) {
		this.nombreCancion2 = nombreCancion2;
	}

	public Button getEliminar2() {
		return eliminar2;
	}

	public void setEliminar2(Button eliminar2) {
		this.eliminar2 = eliminar2;
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

	

}
