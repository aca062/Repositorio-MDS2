package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-editar_caciones_mostradas_al_cbernauta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar_canciones_mostradas_al_cibernauta")
@JsModule("./src/vistas/vista-editar_canciones_mostradas_al_cibernauta.ts")
public class VistaEditar_canciones_mostradas_al_cibernauta extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutCanciones")
	private Element layoutCanciones;
	@Id("buscador")
	private Select buscador;
	@Id("listaCanciones")
	private Element listaCanciones;
	@Id("layoutCancion")
	private HorizontalLayout layoutCancion;
	@Id("nombreCancion")
	private Element nombreCancion;
	@Id("eliminar")
	private Button eliminar;
	@Id("layoutCancion1")
	private HorizontalLayout layoutCancion1;
	@Id("nombreCancion1")
	private Element nombreCancion1;
	@Id("layoutCancion2")
	private HorizontalLayout layoutCancion2;
	@Id("eliminar1")
	private Button eliminar1;
	@Id("nombreCancion2")
	private Element nombreCancion2;
	@Id("eliminar2")
	private Button eliminar2;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;

	/**
     * Creates a new VistaEditar_caciones_mostradas_al_cbernauta.
     */
    public VistaEditar_canciones_mostradas_al_cibernauta() {
        // You can initialise any data required for the connected UI components here.
    }

	
}
