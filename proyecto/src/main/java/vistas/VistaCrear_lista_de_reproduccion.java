package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-crear_lista_de_reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crear_lista_de_reproduccion")
@JsModule("./src/vistas/vista-crear_lista_de_reproduccion.ts")
public class VistaCrear_lista_de_reproduccion extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutLista")
	private Element layoutLista;
	@Id("nombre")
	private TextField nombre;
	@Id("listaCanciones")
	private Select listaCanciones;
	@Id("buscadorCanciones")
	private Element buscadorCanciones;
	@Id("vaadinItem4")
	private Element vaadinItem4;
	@Id("vaadinItem5")
	private Element vaadinItem5;
	@Id("vaadinItem6")
	private Element vaadinItem6;
	@Id("listaCancion")
	private Element listaCancion;
	@Id("layoutCancion")
	private HorizontalLayout layoutCancion;
	@Id("nombreCancion")
	private Element nombreCancion;
	@Id("layoutCancion1")
	private HorizontalLayout layoutCancion1;
	@Id("eliminar")
	private Button eliminar;
	@Id("nombre1")
	private Element nombre1;
	@Id("eliminar1")
	private Button eliminar1;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;

	/**
     * Creates a new VistaCrear_lista_de_reproduccion.
     */
    public VistaCrear_lista_de_reproduccion() {
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

	public Element getLayoutLista() {
		return layoutLista;
	}

	public void setLayoutLista(Element layoutLista) {
		this.layoutLista = layoutLista;
	}

	public TextField getNombre() {
		return nombre;
	}

	public void setNombre(TextField nombre) {
		this.nombre = nombre;
	}

	public Select getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(Select listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

	public Element getBuscadorCanciones() {
		return buscadorCanciones;
	}

	public void setBuscadorCanciones(Element buscadorCanciones) {
		this.buscadorCanciones = buscadorCanciones;
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

	public Element getVaadinItem6() {
		return vaadinItem6;
	}

	public void setVaadinItem6(Element vaadinItem6) {
		this.vaadinItem6 = vaadinItem6;
	}

	public Element getListaCancion() {
		return listaCancion;
	}

	public void setListaCancion(Element listaCancion) {
		this.listaCancion = listaCancion;
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

	public HorizontalLayout getLayoutCancion1() {
		return layoutCancion1;
	}

	public void setLayoutCancion1(HorizontalLayout layoutCancion1) {
		this.layoutCancion1 = layoutCancion1;
	}

	public Button getEliminar() {
		return eliminar;
	}

	public void setEliminar(Button eliminar) {
		this.eliminar = eliminar;
	}

	public Element getNombre1() {
		return nombre1;
	}

	public void setNombre1(Element nombre1) {
		this.nombre1 = nombre1;
	}

	public Button getEliminar1() {
		return eliminar1;
	}

	public void setEliminar1(Button eliminar1) {
		this.eliminar1 = eliminar1;
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

	

}
