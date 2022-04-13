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

	public Element getLayoutCanciones() {
		return layoutCanciones;
	}

	public void setLayoutCanciones(Element layoutCanciones) {
		this.layoutCanciones = layoutCanciones;
	}

	public Select getBuscador() {
		return buscador;
	}

	public void setBuscador(Select buscador) {
		this.buscador = buscador;
	}

	public Element getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(Element listaCanciones) {
		this.listaCanciones = listaCanciones;
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

	public Button getEliminar() {
		return eliminar;
	}

	public void setEliminar(Button eliminar) {
		this.eliminar = eliminar;
	}

	public HorizontalLayout getLayoutCancion1() {
		return layoutCancion1;
	}

	public void setLayoutCancion1(HorizontalLayout layoutCancion1) {
		this.layoutCancion1 = layoutCancion1;
	}

	public Element getNombreCancion1() {
		return nombreCancion1;
	}

	public void setNombreCancion1(Element nombreCancion1) {
		this.nombreCancion1 = nombreCancion1;
	}

	public HorizontalLayout getLayoutCancion2() {
		return layoutCancion2;
	}

	public void setLayoutCancion2(HorizontalLayout layoutCancion2) {
		this.layoutCancion2 = layoutCancion2;
	}

	public Button getEliminar1() {
		return eliminar1;
	}

	public void setEliminar1(Button eliminar1) {
		this.eliminar1 = eliminar1;
	}

	public Element getNombreCancion2() {
		return nombreCancion2;
	}

	public void setNombreCancion2(Element nombreCancion2) {
		this.nombreCancion2 = nombreCancion2;
	}

	public Button getEliminar2() {
		return eliminar2;
	}

	public void setEliminar2(Button eliminar2) {
		this.eliminar2 = eliminar2;
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

	public Button getConfirmar() {
		return confirmar;
	}

	public void setConfirmar(Button confirmar) {
		this.confirmar = confirmar;
	}

	
}
