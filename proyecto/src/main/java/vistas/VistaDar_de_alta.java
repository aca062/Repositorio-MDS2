package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;

/**
 * A Designer generated component for the vista-dar_de_alta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar_de_alta")
@JsModule("./src/vistas/vista-dar_de_alta.ts")
public class VistaDar_de_alta extends LitTemplate {

    
	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("layoutAdministracion")
	private Element layoutAdministracion;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("botonArtistas")
	private Button botonArtistas;
	@Id("botonCanciones")
	private Button botonCanciones;
	@Id("layoutBotones1")
	private HorizontalLayout layoutBotones1;
	@Id("botonAlbumes")
	private Button botonAlbumes;
	@Id("botonEstilos")
	private Button botonEstilos;

	/**
     * Creates a new VistaDar_de_alta.
     */
    public VistaDar_de_alta() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public H1 getH1Titulo() {
		return h1Titulo;
	}

	public void setH1Titulo(H1 h1Titulo) {
		this.h1Titulo = h1Titulo;
	}

	public Element getLayoutAdministracion() {
		return layoutAdministracion;
	}

	public void setLayoutAdministracion(Element layoutAdministracion) {
		this.layoutAdministracion = layoutAdministracion;
	}

	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}

	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}

	public Button getBotonArtistas() {
		return botonArtistas;
	}

	public void setBotonArtistas(Button botonArtistas) {
		this.botonArtistas = botonArtistas;
	}

	public Button getBotonCanciones() {
		return botonCanciones;
	}

	public void setBotonCanciones(Button botonCanciones) {
		this.botonCanciones = botonCanciones;
	}

	public HorizontalLayout getLayoutBotones1() {
		return layoutBotones1;
	}

	public void setLayoutBotones1(HorizontalLayout layoutBotones1) {
		this.layoutBotones1 = layoutBotones1;
	}

	public Button getBotonAlbumes() {
		return botonAlbumes;
	}

	public void setBotonAlbumes(Button botonAlbumes) {
		this.botonAlbumes = botonAlbumes;
	}

	public Button getBotonEstilos() {
		return botonEstilos;
	}

	public void setBotonEstilos(Button botonEstilos) {
		this.botonEstilos = botonEstilos;
	}
	

}
