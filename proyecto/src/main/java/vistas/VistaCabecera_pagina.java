package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-cabecera_pagina template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera_pagina")
@JsModule("./src/vistas/vista-cabecera_pagina.ts")
public class VistaCabecera_pagina extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutCabecera")
	private HorizontalLayout layoutCabecera;
	@Id("logo")
	private Button logo;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("verPerfil")
	private Button verPerfil;
	@Id("cerrarSesion")
	private Button cerrarSesion;
	@Id("layoutPrincipal1")
	private Element layoutPrincipal1;
	@Id("layoutBuscador")
	private HorizontalLayout layoutBuscador;
	@Id("buscador")
	private TextField buscador;
	@Id("ironIcon")
	private Element ironIcon;

	/**
     * Creates a new VistaCabecera_pagina.
     */
    public VistaCabecera_pagina() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutCabecera() {
		return layoutCabecera;
	}

	public void setLayoutCabecera(HorizontalLayout layoutCabecera) {
		this.layoutCabecera = layoutCabecera;
	}

	public Button getLogo() {
		return logo;
	}

	public void setLogo(Button logo) {
		this.logo = logo;
	}

	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}

	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}

	public Button getVerPerfil() {
		return verPerfil;
	}

	public void setVerPerfil(Button verPerfil) {
		this.verPerfil = verPerfil;
	}

	public Button getCerrarSesion() {
		return cerrarSesion;
	}

	public void setCerrarSesion(Button cerrarSesion) {
		this.cerrarSesion = cerrarSesion;
	}

	public Element getLayoutPrincipal1() {
		return layoutPrincipal1;
	}

	public void setLayoutPrincipal1(Element layoutPrincipal1) {
		this.layoutPrincipal1 = layoutPrincipal1;
	}

	public HorizontalLayout getLayoutBuscador() {
		return layoutBuscador;
	}

	public void setLayoutBuscador(HorizontalLayout layoutBuscador) {
		this.layoutBuscador = layoutBuscador;
	}

	public TextField getBuscador() {
		return buscador;
	}

	public void setBuscador(TextField buscador) {
		this.buscador = buscador;
	}

	public Element getIronIcon() {
		return ironIcon;
	}

	public void setIronIcon(Element ironIcon) {
		this.ironIcon = ironIcon;
	}

}
