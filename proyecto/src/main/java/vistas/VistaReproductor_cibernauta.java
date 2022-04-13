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
 * A Designer generated component for the vista-reproductor_cibernauta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-reproductor_cibernauta")
@JsModule("./src/vistas/vista-reproductor_cibernauta.ts")
public class VistaReproductor_cibernauta extends LitTemplate {


	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutReproductor")
	private HorizontalLayout layoutReproductor;
	@Id("layoutCancion")
	private Element layoutCancion;
	@Id("h3NombreCancion")
	private H3 h3NombreCancion;
	@Id("botonVerCreditos")
	private Button botonVerCreditos;
	@Id("layoutBotonReproducir")
	private Element layoutBotonReproducir;
	@Id("layoutVolumen")
	private Element layoutVolumen;
	@Id("botonReproducir")
	private Button botonReproducir;
	@Id("botonVolumen")
	private Button botonVolumen;

	/**
     * Creates a new VistaReproductor_cibernauta.
     */
    public VistaReproductor_cibernauta() {
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

	public H3 getH3NombreCancion() {
		return h3NombreCancion;
	}

	public void setH3NombreCancion(H3 h3NombreCancion) {
		this.h3NombreCancion = h3NombreCancion;
	}

	public Button getBotonVerCreditos() {
		return botonVerCreditos;
	}

	public void setBotonVerCreditos(Button botonVerCreditos) {
		this.botonVerCreditos = botonVerCreditos;
	}

	public Element getLayoutBotonReproducir() {
		return layoutBotonReproducir;
	}

	public void setLayoutBotonReproducir(Element layoutBotonReproducir) {
		this.layoutBotonReproducir = layoutBotonReproducir;
	}

	public Element getLayoutVolumen() {
		return layoutVolumen;
	}

	public void setLayoutVolumen(Element layoutVolumen) {
		this.layoutVolumen = layoutVolumen;
	}

	public Button getBotonReproducir() {
		return botonReproducir;
	}

	public void setBotonReproducir(Button botonReproducir) {
		this.botonReproducir = botonReproducir;
	}

	public Button getBotonVolumen() {
		return botonVolumen;
	}

	public void setBotonVolumen(Button botonVolumen) {
		this.botonVolumen = botonVolumen;
	}

}
