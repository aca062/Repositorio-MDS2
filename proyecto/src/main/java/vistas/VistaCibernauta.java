package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;

import interfaz.Cabecera_cibernauta;

import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_cibernauta;
import vistas.VistaUltimos_exitos;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCancion_cibernauta;

/**
 * A Designer generated component for the vista-cibernauta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cibernauta")
@JsModule("./src/vistas/vista-cibernauta.ts")
public class VistaCibernauta extends LitTemplate {

    
	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("cabecera")
	private Cabecera_cibernauta cabecera;
	@Id("vistaUltimos_exitos")
	private Element vistaUltimos_exitos;

	/**
     * Creates a new VistaCibernauta.
     */
    public VistaCibernauta() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public Cabecera_cibernauta getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera_cibernauta cabecera) {
		this.cabecera = cabecera;
	}

	public Element getVistaUltimos_exitos() {
		return vistaUltimos_exitos;
	}

	public void setVistaUltimos_exitos(Element vistaUltimos_exitos) {
		this.vistaUltimos_exitos = vistaUltimos_exitos;
	}
	

}
