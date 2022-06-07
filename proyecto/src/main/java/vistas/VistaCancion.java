package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion")
@JsModule("./src/vistas/vista-cancion.ts")
public class VistaCancion extends LitTemplate {


	@Id("layoutPrincipal")
	private HorizontalLayout layoutPrincipal;
	@Id("layoutCancion")
	private Element layoutCancion;
	@Id("numeroRep")
	private H6 numeroRep;
	@Id("meGusta")
	private Button meGusta;
	@Id("botonNombre")
	private Button botonNombre;
    @Id("botonCancion")
    private Image botonCancion;
	/**
     * Creates a new VistaCancion.
     */
    public VistaCancion() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(HorizontalLayout layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public Image getBotonCancion() {
		return botonCancion;
	}

	public void setBotonCancion(Image botonCancion) {
		this.botonCancion = botonCancion;
	}

	public Element getLayoutCancion() {
		return layoutCancion;
	}

	public void setLayoutCancion(Element layoutCancion) {
		this.layoutCancion = layoutCancion;
	}

	public H6 getNumeroRep() {
		return numeroRep;
	}

	public void setNumeroRep(H6 numeroRep) {
		this.numeroRep = numeroRep;
	}

	public Button getMeGusta() {
		return meGusta;
	}

	public void setMeGusta(Button meGusta) {
		this.meGusta = meGusta;
	}

	public Button getBotonNombre() {
		return botonNombre;
	}

	public void setBotonNombre(Button botonNombre) {
		this.botonNombre = botonNombre;
	}

}
