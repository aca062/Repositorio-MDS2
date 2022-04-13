package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.button.Button;
import vistas.VistaLista_de_canciones;

/**
 * A Designer generated component for the vista-ver_detalle_de_lista_comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_detalle_de_lista_comun")
@JsModule("./src/vistas/vista-ver_detalle_de_lista_comun.ts")
public class VistaVer_detalle_de_lista_comun extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutTituloOpciones")
	private HorizontalLayout layoutTituloOpciones;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("opciones")
	private Select opciones;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("vaadinItem2")
	private Element vaadinItem2;
	@Id("botonUsuario")
	private Button botonUsuario;
	@Id("layoutListaCanciones")
	private Element layoutListaCanciones;
	@Id("numeroCanciones")
	private HorizontalLayout numeroCanciones;
	@Id("h2NumCanciones")
	private H2 h2NumCanciones;
	@Id("layoutCanciones")
	private Element layoutCanciones;
	@Id("vistaLista_de_canciones")
	private Element vistaLista_de_canciones;
	/**
     * Creates a new VistaVer_detalle_de_lista_comun.
     */
    public VistaVer_detalle_de_lista_comun() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}
	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}
	public HorizontalLayout getLayoutTituloOpciones() {
		return layoutTituloOpciones;
	}
	public void setLayoutTituloOpciones(HorizontalLayout layoutTituloOpciones) {
		this.layoutTituloOpciones = layoutTituloOpciones;
	}
	public H2 getH2Titulo() {
		return h2Titulo;
	}
	public void setH2Titulo(H2 h2Titulo) {
		this.h2Titulo = h2Titulo;
	}
	public Select getOpciones() {
		return opciones;
	}
	public void setOpciones(Select opciones) {
		this.opciones = opciones;
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
	public Button getBotonUsuario() {
		return botonUsuario;
	}
	public void setBotonUsuario(Button botonUsuario) {
		this.botonUsuario = botonUsuario;
	}
	public Element getLayoutListaCanciones() {
		return layoutListaCanciones;
	}
	public void setLayoutListaCanciones(Element layoutListaCanciones) {
		this.layoutListaCanciones = layoutListaCanciones;
	}
	public HorizontalLayout getNumeroCanciones() {
		return numeroCanciones;
	}
	public void setNumeroCanciones(HorizontalLayout numeroCanciones) {
		this.numeroCanciones = numeroCanciones;
	}
	public H2 getH2NumCanciones() {
		return h2NumCanciones;
	}
	public void setH2NumCanciones(H2 h2NumCanciones) {
		this.h2NumCanciones = h2NumCanciones;
	}
	public Element getLayoutCanciones() {
		return layoutCanciones;
	}
	public void setLayoutCanciones(Element layoutCanciones) {
		this.layoutCanciones = layoutCanciones;
	}
	public Element getVistaLista_de_canciones() {
		return vistaLista_de_canciones;
	}
	public void setVistaLista_de_canciones(Element vistaLista_de_canciones) {
		this.vistaLista_de_canciones = vistaLista_de_canciones;
	}

}
