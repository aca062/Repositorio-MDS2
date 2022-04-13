package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-modificar_lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar_lista")
@JsModule("./src/vistas/vista-modificar_lista.ts")
public class VistaModificar_lista extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layout")
	private Element layout;
	@Id("textFieldNombre")
	private TextField textFieldNombre;
	@Id("selectorCanciones")
	private Select selectorCanciones;
	@Id("desplegable")
	private Element desplegable;
	@Id("vaadinItem3")
	private Element vaadinItem3;
	@Id("vaadinItem4")
	private Element vaadinItem4;
	@Id("vaadinItem5")
	private Element vaadinItem5;
	@Id("layoutListaCanciones")
	private HorizontalLayout layoutListaCanciones;
	@Id("listaCanciones")
	private Element listaCanciones;
	@Id("itemEliminarCancion1")
	private Element itemEliminarCancion1;
	@Id("botonEliminar1")
	private Button botonEliminar1;
	@Id("itemEliminarCancion2")
	private Element itemEliminarCancion2;
	@Id("botonEliminar2")
	private Button botonEliminar2;
	@Id("itemEliminarCancion3")
	private Element itemEliminarCancion3;
	@Id("botonEliminar3")
	private Button botonEliminar3;
	@Id("botonCancelar")
	private Button botonCancelar;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("botonConfirmar")
	private Button botonConfirmar;

	/**
     * Creates a new VistaModificar_lista.
     */
    public VistaModificar_lista() {
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

	public Element getLayout() {
		return layout;
	}

	public void setLayout(Element layout) {
		this.layout = layout;
	}

	public TextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public void setTextFieldNombre(TextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public Select getSelectorCanciones() {
		return selectorCanciones;
	}

	public void setSelectorCanciones(Select selectorCanciones) {
		this.selectorCanciones = selectorCanciones;
	}

	public Element getDesplegable() {
		return desplegable;
	}

	public void setDesplegable(Element desplegable) {
		this.desplegable = desplegable;
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

	public HorizontalLayout getLayoutListaCanciones() {
		return layoutListaCanciones;
	}

	public void setLayoutListaCanciones(HorizontalLayout layoutListaCanciones) {
		this.layoutListaCanciones = layoutListaCanciones;
	}

	public Element getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(Element listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

	public Element getItemEliminarCancion1() {
		return itemEliminarCancion1;
	}

	public void setItemEliminarCancion1(Element itemEliminarCancion1) {
		this.itemEliminarCancion1 = itemEliminarCancion1;
	}

	public Button getBotonEliminar1() {
		return botonEliminar1;
	}

	public void setBotonEliminar1(Button botonEliminar1) {
		this.botonEliminar1 = botonEliminar1;
	}

	public Element getItemEliminarCancion2() {
		return itemEliminarCancion2;
	}

	public void setItemEliminarCancion2(Element itemEliminarCancion2) {
		this.itemEliminarCancion2 = itemEliminarCancion2;
	}

	public Button getBotonEliminar2() {
		return botonEliminar2;
	}

	public void setBotonEliminar2(Button botonEliminar2) {
		this.botonEliminar2 = botonEliminar2;
	}

	public Element getItemEliminarCancion3() {
		return itemEliminarCancion3;
	}

	public void setItemEliminarCancion3(Element itemEliminarCancion3) {
		this.itemEliminarCancion3 = itemEliminarCancion3;
	}

	public Button getBotonEliminar3() {
		return botonEliminar3;
	}

	public void setBotonEliminar3(Button botonEliminar3) {
		this.botonEliminar3 = botonEliminar3;
	}

	public Button getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(Button botonCancelar) {
		this.botonCancelar = botonCancelar;
	}

	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}

	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}

	public Button getBotonConfirmar() {
		return botonConfirmar;
	}

	public void setBotonConfirmar(Button botonConfirmar) {
		this.botonConfirmar = botonConfirmar;
	}

}
