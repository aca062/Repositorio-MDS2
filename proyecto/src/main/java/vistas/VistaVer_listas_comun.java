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

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("h1")
	private H1 h1;
	@Id("h3")
	private H3 h3;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vistaPaginacion_listas_ajenas")
	private VistaPaginacion_listas_ajenas vistaPaginacion_listas_ajenas;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vistaPaginacion_listas_propias")
	private VistaPaginacion_listas_propias vistaPaginacion_listas_propias;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("h31")
	private H3 h31;
	@Id("vaadinButton1")
	private Button vaadinButton1;

	/**
     * Creates a new VistaVer_listas_comun.
     */
    public VistaVer_listas_comun() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public H3 getH3() {
		return h3;
	}

	public void setH3(H3 h3) {
		this.h3 = h3;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public VistaPaginacion_listas_ajenas getVistaPaginacion_listas_ajenas() {
		return vistaPaginacion_listas_ajenas;
	}

	public void setVistaPaginacion_listas_ajenas(VistaPaginacion_listas_ajenas vistaPaginacion_listas_ajenas) {
		this.vistaPaginacion_listas_ajenas = vistaPaginacion_listas_ajenas;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public VistaPaginacion_listas_propias getVistaPaginacion_listas_propias() {
		return vistaPaginacion_listas_propias;
	}

	public void setVistaPaginacion_listas_propias(VistaPaginacion_listas_propias vistaPaginacion_listas_propias) {
		this.vistaPaginacion_listas_propias = vistaPaginacion_listas_propias;
	}

	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}

	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public H3 getH31() {
		return h31;
	}

	public void setH31(H3 h31) {
		this.h31 = h31;
	}

	public Button getVaadinButton1() {
		return vaadinButton1;
	}

	public void setVaadinButton1(Button vaadinButton1) {
		this.vaadinButton1 = vaadinButton1;
	}

}
