package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;

/**
 * A Designer generated component for the vista-ver_creditos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_creditos")
@JsModule("./src/vistas/vista-ver_creditos.ts")
public class VistaVer_creditos extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("h3")
	private H3 h3;
	@Id("h4")
	private H4 h4;
	@Id("h41")
	private H4 h41;
	@Id("h42")
	private H4 h42;
	@Id("h43")
	private H4 h43;
	@Id("h44")
	private H4 h44;

	/**
     * Creates a new VistaVer_creditos.
     */
    public VistaVer_creditos() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public H3 getH3() {
		return h3;
	}

	public void setH3(H3 h3) {
		this.h3 = h3;
	}

	public H4 getH4() {
		return h4;
	}

	public void setH4(H4 h4) {
		this.h4 = h4;
	}

	public H4 getH41() {
		return h41;
	}

	public void setH41(H4 h41) {
		this.h41 = h41;
	}

	public H4 getH42() {
		return h42;
	}

	public void setH42(H4 h42) {
		this.h42 = h42;
	}

	public H4 getH43() {
		return h43;
	}

	public void setH43(H4 h43) {
		this.h43 = h43;
	}

	public H4 getH44() {
		return h44;
	}

	public void setH44(H4 h44) {
		this.h44 = h44;
	}

}
