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
	@Id("layoutContacto")
	private HorizontalLayout layoutContacto;
	@Id("layoutTitulo")
	private Element layoutTitulo;
	@Id("h3")
	private H3 h3;
	@Id("layoutInformacion")
	private Element layoutInformacion;
	@Id("h4Telefono")
	private H4 h4Telefono;
	@Id("h41Correo")
	private H4 h41Correo;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;

	/**
     * Creates a new VistaCabecera_pagina.
     */
    public VistaCabecera_pagina() {
        // You can initialise any data required for the connected UI components here.
    }

}
