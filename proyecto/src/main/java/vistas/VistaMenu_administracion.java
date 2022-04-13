package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Hr;

/**
 * A Designer generated component for the vista-menu_administracion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-menu_administracion")
@JsModule("./src/vistas/vista-menu_administracion.ts")
public class VistaMenu_administracion extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Administracion")
	private H2 h2Administracion;
	@Id("layoutMenuAdmin")
	private Element layoutMenuAdmin;
	@Id("layoutBotonesAdmin")
	private HorizontalLayout layoutBotonesAdmin;
	@Id("botonBuscarElemento")
	private Button botonBuscarElemento;
	@Id("botonDarDeAlta")
	private Button botonDarDeAlta;
	@Id("layoutLimiteCanciones")
	private HorizontalLayout layoutLimiteCanciones;
	@Id("h4TextoLimite")
	private H4 h4TextoLimite;
	@Id("botonEditarLimite")
	private Button botonEditarLimite;
	@Id("layoutCancionesMostradas")
	private HorizontalLayout layoutCancionesMostradas;
	@Id("h4TextoCancionesMostradas")
	private H4 h4TextoCancionesMostradas;
	@Id("botonEditarCanciones")
	private Button botonEditarCanciones;
	@Id("listaCanciones")
	private Element listaCanciones;
	@Id("cancion1")
	private Element cancion1;
	@Id("cancion2")
	private Element cancion2;
	@Id("separador")
	private Hr separador;
	@Id("cancion3")
	private Element cancion3;
	@Id("cancion4")
	private Element cancion4;
	@Id("iconoEditarLimite")
	private Element iconoEditarLimite;
	@Id("iconoEditarCanciones")
	private Element iconoEditarCanciones;
	/**
     * Creates a new VistaMenu_administracion.
     */
    public VistaMenu_administracion() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}
	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}
	public H2 getH2Administracion() {
		return h2Administracion;
	}
	public void setH2Administracion(H2 h2Administracion) {
		this.h2Administracion = h2Administracion;
	}
	public Element getLayoutMenuAdmin() {
		return layoutMenuAdmin;
	}
	public void setLayoutMenuAdmin(Element layoutMenuAdmin) {
		this.layoutMenuAdmin = layoutMenuAdmin;
	}
	public HorizontalLayout getLayoutBotonesAdmin() {
		return layoutBotonesAdmin;
	}
	public void setLayoutBotonesAdmin(HorizontalLayout layoutBotonesAdmin) {
		this.layoutBotonesAdmin = layoutBotonesAdmin;
	}
	public Button getBotonBuscarElemento() {
		return botonBuscarElemento;
	}
	public void setBotonBuscarElemento(Button botonBuscarElemento) {
		this.botonBuscarElemento = botonBuscarElemento;
	}
	public Button getBotonDarDeAlta() {
		return botonDarDeAlta;
	}
	public void setBotonDarDeAlta(Button botonDarDeAlta) {
		this.botonDarDeAlta = botonDarDeAlta;
	}
	public HorizontalLayout getLayoutLimiteCanciones() {
		return layoutLimiteCanciones;
	}
	public void setLayoutLimiteCanciones(HorizontalLayout layoutLimiteCanciones) {
		this.layoutLimiteCanciones = layoutLimiteCanciones;
	}
	public H4 getH4TextoLimite() {
		return h4TextoLimite;
	}
	public void setH4TextoLimite(H4 h4TextoLimite) {
		this.h4TextoLimite = h4TextoLimite;
	}
	public Button getBotonEditarLimite() {
		return botonEditarLimite;
	}
	public void setBotonEditarLimite(Button botonEditarLimite) {
		this.botonEditarLimite = botonEditarLimite;
	}
	public HorizontalLayout getLayoutCancionesMostradas() {
		return layoutCancionesMostradas;
	}
	public void setLayoutCancionesMostradas(HorizontalLayout layoutCancionesMostradas) {
		this.layoutCancionesMostradas = layoutCancionesMostradas;
	}
	public H4 getH4TextoCancionesMostradas() {
		return h4TextoCancionesMostradas;
	}
	public void setH4TextoCancionesMostradas(H4 h4TextoCancionesMostradas) {
		this.h4TextoCancionesMostradas = h4TextoCancionesMostradas;
	}
	public Button getBotonEditarCanciones() {
		return botonEditarCanciones;
	}
	public void setBotonEditarCanciones(Button botonEditarCanciones) {
		this.botonEditarCanciones = botonEditarCanciones;
	}
	public Element getListaCanciones() {
		return listaCanciones;
	}
	public void setListaCanciones(Element listaCanciones) {
		this.listaCanciones = listaCanciones;
	}
	public Element getCancion1() {
		return cancion1;
	}
	public void setCancion1(Element cancion1) {
		this.cancion1 = cancion1;
	}
	public Element getCancion2() {
		return cancion2;
	}
	public void setCancion2(Element cancion2) {
		this.cancion2 = cancion2;
	}
	public Hr getSeparador() {
		return separador;
	}
	public void setSeparador(Hr separador) {
		this.separador = separador;
	}
	public Element getCancion3() {
		return cancion3;
	}
	public void setCancion3(Element cancion3) {
		this.cancion3 = cancion3;
	}
	public Element getCancion4() {
		return cancion4;
	}
	public void setCancion4(Element cancion4) {
		this.cancion4 = cancion4;
	}
	public Element getIconoEditarLimite() {
		return iconoEditarLimite;
	}
	public void setIconoEditarLimite(Element iconoEditarLimite) {
		this.iconoEditarLimite = iconoEditarLimite;
	}
	public Element getIconoEditarCanciones() {
		return iconoEditarCanciones;
	}
	public void setIconoEditarCanciones(Element iconoEditarCanciones) {
		this.iconoEditarCanciones = iconoEditarCanciones;
	}

	

}
