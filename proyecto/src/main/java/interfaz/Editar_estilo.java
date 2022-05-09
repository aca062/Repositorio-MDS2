package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEditar_estilo;

public class Editar_estilo extends VistaEditar_estilo{
	/*private Label _editarEstiloL;
	private Label _nombreEstiloL;
	private TextField _nombreEstiloTF;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Estilo_admin _estiloAdmin;
	
	public Editar_estilo() {
		Inicializar();
		this.getConfirmar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});
		this.getCancelar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
	}

	public void Confirmar() {
		//Más cosas
		Buscar_elemento _buscarElemento = new Buscar_elemento();
		_buscarElemento.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_buscarElemento);
	}
	
	public void Cancelar() {
		Buscar_elemento _buscarElemento = new Buscar_elemento();
		_buscarElemento.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_buscarElemento);
	}
	
	void Inicializar() {
		this.getConfirmar().setVisible(true);
		this.getCancelar().setVisible(true);
		this.getNombreDelEstilo().setVisible(true);
	}
}