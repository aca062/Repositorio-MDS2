package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import vistas.VistaAlta_estilos;

public class Alta_estilos extends VistaAlta_estilos{
	/*private Label _altaEstilosL;
	private Label _nombreEstiloL;
	private TextField _nombreEstiloTF;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Dar_de_alta _darDeAlta;
	private iAdministrador adm = new BDPrincipal();

	public Alta_estilos() {
		Inicializar();
		this.getCancelar().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
		this.getConfirmar().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});
	}

	protected void Confirmar() {
	    adm.altaEstilo(getNombreDelEstilo().getValue(), 0);
	    ControladorVistas.PopUpBasico("Estilo añadido con éxito");
		_darDeAlta = new Dar_de_alta();
		_darDeAlta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_darDeAlta);
	}

	protected void Cancelar() {
		_darDeAlta = new Dar_de_alta();
		_darDeAlta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_darDeAlta);

	}

	void Inicializar() {
		this.getConfirmar().setVisible(true);
		this.getCancelar().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getNombreDelEstilo().setVisible(true);
	}
}