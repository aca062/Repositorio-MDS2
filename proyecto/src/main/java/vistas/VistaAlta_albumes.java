package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.select.Select;

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
	@Id("img")
	private Image img;
	@Id("anadirImagen")
	private Button anadirImagen;
	@Id("nombreArtista")
	private TextField nombreArtista;
	@Id("titulo")
	private TextField titulo;
	@Id("fechaEdicion")
	private TextField fechaEdicion;
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
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
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
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public Button getAnadirImagen() {
		return anadirImagen;
	}
	public void setAnadirImagen(Button anadirImagen) {
		this.anadirImagen = anadirImagen;
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

}
