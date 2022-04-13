package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-reproductor template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-reproductor")
@JsModule("./src/vistas/vista-reproductor.ts")
public class VistaReproductor extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutReproductor")
	private HorizontalLayout layoutReproductor;
	@Id("layoutCancion")
	private Element layoutCancion;
	@Id("h3Cancion")
	private H3 h3Cancion;
	@Id("botonVerCreditos")
	private Button botonVerCreditos;
	@Id("boton1")
	private Button boton1;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("boton2")
	private Button boton2;
	@Id("boton3")
	private Button boton3;
	@Id("botonReproducir")
	private Button botonReproducir;
	@Id("boton4")
	private Button boton4;
	@Id("layoutVolumen")
	private Element layoutVolumen;
	@Id("botonVolumen")
	private Button botonVolumen;

	/**
     * Creates a new VistaReproductor.
     */
    public VistaReproductor() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutReproductor() {
		return layoutReproductor;
	}

	public void setLayoutReproductor(HorizontalLayout layoutReproductor) {
		this.layoutReproductor = layoutReproductor;
	}

	public Element getLayoutCancion() {
		return layoutCancion;
	}

	public void setLayoutCancion(Element layoutCancion) {
		this.layoutCancion = layoutCancion;
	}

	public H3 getH3Cancion() {
		return h3Cancion;
	}

	public void setH3Cancion(H3 h3Cancion) {
		this.h3Cancion = h3Cancion;
	}

	public Button getBotonVerCreditos() {
		return botonVerCreditos;
	}

	public void setBotonVerCreditos(Button botonVerCreditos) {
		this.botonVerCreditos = botonVerCreditos;
	}

	public Button getBoton1() {
		return boton1;
	}

	public void setBoton1(Button boton1) {
		this.boton1 = boton1;
	}

	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}

	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}

	public Button getBoton2() {
		return boton2;
	}

	public void setBoton2(Button boton2) {
		this.boton2 = boton2;
	}

	public Button getBoton3() {
		return boton3;
	}

	public void setBoton3(Button boton3) {
		this.boton3 = boton3;
	}

	public Button getBotonReproducir() {
		return botonReproducir;
	}

	public void setBotonReproducir(Button botonReproducir) {
		this.botonReproducir = botonReproducir;
	}

	public Button getBoton4() {
		return boton4;
	}

	public void setBoton4(Button boton4) {
		this.boton4 = boton4;
	}

	public Element getLayoutVolumen() {
		return layoutVolumen;
	}

	public void setLayoutVolumen(Element layoutVolumen) {
		this.layoutVolumen = layoutVolumen;
	}

	public Button getBotonVolumen() {
		return botonVolumen;
	}

	public void setBotonVolumen(Button botonVolumen) {
		this.botonVolumen = botonVolumen;
	}

}
