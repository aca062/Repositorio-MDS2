package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEditar_canciones_mostradas_al_cibernauta;

public class Editar_canciones_mostradas_al_cibernauta extends VistaEditar_canciones_mostradas_al_cibernauta{
	/*private Label _tituloL;
	private Label _buscarCancionL;
	private Dropdown _buscarCancionD;
	private Label _buscarCancionList;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Menu_administracion _menuAdministracion;
	
	public Editar_canciones_mostradas_al_cibernauta() {
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
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_menuAdministracion = new Menu_administracion());
	}
	
	public void Cancelar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_menuAdministracion = new Menu_administracion());
	}
	
	void Inicializar() {
		this.getCancelar().setVisible(true);
		this.getConfirmar().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getBuscador().setVisible(true);
		this.getListaCanciones().setVisible(true);
	}
}