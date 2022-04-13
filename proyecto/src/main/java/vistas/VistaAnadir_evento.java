package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-anadir_evento template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-anadir_evento")
@JsModule("./src/vistas/vista-anadir_evento.ts")
public class VistaAnadir_evento extends LitTemplate {



	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutEvento")
	private Element layoutEvento;
	@Id("layoutEventoFoto")
	private HorizontalLayout layoutEventoFoto;
	@Id("imgFecha")
	private Image imgFecha;
	@Id("anadirFoto")
	private Button anadirFoto;
	@Id("fecha")
	private TextField fecha;
	@Id("lugar")
	private TextField lugar;
	@Id("hora")
	private TextField hora;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("cancelar")
	private Button cancelar;
	@Id("confirmar")
	private Button confirmar;

	/**
     * Creates a new VistaAnadir_evento.
     */
    public VistaAnadir_evento() {
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

	public Element getLayoutEvento() {
		return layoutEvento;
	}

	public void setLayoutEvento(Element layoutEvento) {
		this.layoutEvento = layoutEvento;
	}

	public HorizontalLayout getLayoutEventoFoto() {
		return layoutEventoFoto;
	}

	public void setLayoutEventoFoto(HorizontalLayout layoutEventoFoto) {
		this.layoutEventoFoto = layoutEventoFoto;
	}

	public Image getImgFecha() {
		return imgFecha;
	}

	public void setImgFecha(Image imgFecha) {
		this.imgFecha = imgFecha;
	}

	public Button getAnadirFoto() {
		return anadirFoto;
	}

	public void setAnadirFoto(Button anadirFoto) {
		this.anadirFoto = anadirFoto;
	}

	public TextField getFecha() {
		return fecha;
	}

	public void setFecha(TextField fecha) {
		this.fecha = fecha;
	}

	public TextField getLugar() {
		return lugar;
	}

	public void setLugar(TextField lugar) {
		this.lugar = lugar;
	}

	public TextField getHora() {
		return hora;
	}

	public void setHora(TextField hora) {
		this.hora = hora;
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
