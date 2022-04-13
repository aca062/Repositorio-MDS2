package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import vistas.VistaPaginacion_listas_ajenas;
import vistas.VistaPaginacion_listas_propias;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver_listas_comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_listas_comun")
@JsModule("./src/vistas/vista-ver_listas_comun.ts")
public class VistaVer_listas_comun extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutTitulo")
	private HorizontalLayout layoutTitulo;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("h3NumeroPagina")
	private H3 h3NumeroPagina;
	@Id("layoutlistas")
	private HorizontalLayout layoutlistas;
	@Id("vistaPaginacion_listas_ajenas")
	private Element vistaPaginacion_listas_ajenas;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vistaPaginacion_listas_propias")
	private Element vistaPaginacion_listas_propias;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("botonAtras")
	private Button botonAtras;
	@Id("h3NumeroPagina1")
	private H3 h3NumeroPagina1;
	/**
     * Creates a new VistaVer_listas_comun.
     */
    public VistaVer_listas_comun() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}
	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}
	public HorizontalLayout getLayoutTitulo() {
		return layoutTitulo;
	}
	public void setLayoutTitulo(HorizontalLayout layoutTitulo) {
		this.layoutTitulo = layoutTitulo;
	}
	public H1 getH1Titulo() {
		return h1Titulo;
	}
	public void setH1Titulo(H1 h1Titulo) {
		this.h1Titulo = h1Titulo;
	}
	public H3 getH3NumeroPagina() {
		return h3NumeroPagina;
	}
	public void setH3NumeroPagina(H3 h3NumeroPagina) {
		this.h3NumeroPagina = h3NumeroPagina;
	}
	public HorizontalLayout getLayoutlistas() {
		return layoutlistas;
	}
	public void setLayoutlistas(HorizontalLayout layoutlistas) {
		this.layoutlistas = layoutlistas;
	}
	public Element getVistaPaginacion_listas_ajenas() {
		return vistaPaginacion_listas_ajenas;
	}
	public void setVistaPaginacion_listas_ajenas(Element vistaPaginacion_listas_ajenas) {
		this.vistaPaginacion_listas_ajenas = vistaPaginacion_listas_ajenas;
	}
	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}
	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}
	public Element getVistaPaginacion_listas_propias() {
		return vistaPaginacion_listas_propias;
	}
	public void setVistaPaginacion_listas_propias(Element vistaPaginacion_listas_propias) {
		this.vistaPaginacion_listas_propias = vistaPaginacion_listas_propias;
	}
	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}
	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}
	public Button getBotonAtras() {
		return botonAtras;
	}
	public void setBotonAtras(Button botonAtras) {
		this.botonAtras = botonAtras;
	}
	public H3 getH3NumeroPagina1() {
		return h3NumeroPagina1;
	}
	public void setH3NumeroPagina1(H3 h3NumeroPagina1) {
		this.h3NumeroPagina1 = h3NumeroPagina1;
	}

}
