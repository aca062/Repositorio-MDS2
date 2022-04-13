package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-ver_detalle_cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_detalle_cancion")
@JsModule("./src/vistas/vista-ver_detalle_cancion.ts")
public class VistaVer_detalle_cancion extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutCancion")
	private HorizontalLayout layoutCancion;
	@Id("layout")
	private Element layout;
	@Id("fotoCancion")
	private Image fotoCancion;
	@Id("botonReproducir")
	private Button botonReproducir;
	@Id("layoutInformacionBotones")
	private Element layoutInformacionBotones;
	@Id("h4NombreCancion")
	private H4 h4NombreCancion;
	@Id("botonArtista")
	private Button botonArtista;
	@Id("botonAlbum")
	private Button botonAlbum;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("anadirLista")
	private Select anadirLista;
	@Id("botonMeGusta")
	private Button botonMeGusta;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("vaadinItem2")
	private Element vaadinItem2;
	@Id("botonVerCreditos")
	private Button botonVerCreditos;

	/**
     * Creates a new VistaVer_detalle_cancion.
     */
    public VistaVer_detalle_cancion() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutCancion() {
		return layoutCancion;
	}

	public void setLayoutCancion(HorizontalLayout layoutCancion) {
		this.layoutCancion = layoutCancion;
	}

	public Element getLayout() {
		return layout;
	}

	public void setLayout(Element layout) {
		this.layout = layout;
	}

	public Image getFotoCancion() {
		return fotoCancion;
	}

	public void setFotoCancion(Image fotoCancion) {
		this.fotoCancion = fotoCancion;
	}

	public Button getBotonReproducir() {
		return botonReproducir;
	}

	public void setBotonReproducir(Button botonReproducir) {
		this.botonReproducir = botonReproducir;
	}

	public Element getLayoutInformacionBotones() {
		return layoutInformacionBotones;
	}

	public void setLayoutInformacionBotones(Element layoutInformacionBotones) {
		this.layoutInformacionBotones = layoutInformacionBotones;
	}

	public H4 getH4NombreCancion() {
		return h4NombreCancion;
	}

	public void setH4NombreCancion(H4 h4NombreCancion) {
		this.h4NombreCancion = h4NombreCancion;
	}

	public Button getBotonArtista() {
		return botonArtista;
	}

	public void setBotonArtista(Button botonArtista) {
		this.botonArtista = botonArtista;
	}

	public Button getBotonAlbum() {
		return botonAlbum;
	}

	public void setBotonAlbum(Button botonAlbum) {
		this.botonAlbum = botonAlbum;
	}

	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}

	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}

	public Select getAnadirLista() {
		return anadirLista;
	}

	public void setAnadirLista(Select anadirLista) {
		this.anadirLista = anadirLista;
	}

	public Button getBotonMeGusta() {
		return botonMeGusta;
	}

	public void setBotonMeGusta(Button botonMeGusta) {
		this.botonMeGusta = botonMeGusta;
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

	public Button getBotonVerCreditos() {
		return botonVerCreditos;
	}

	public void setBotonVerCreditos(Button botonVerCreditos) {
		this.botonVerCreditos = botonVerCreditos;
	}

}
