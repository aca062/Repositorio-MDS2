package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCrear_lista_de_reproduccion;

public class Crear_lista_de_reproduccion extends VistaCrear_lista_de_reproduccion{
	/*private Label _tituloL;
	private Label _nombreL;
	private TextField _nombreTF;
	private Label _listaCancionL;
	private Dropdown _listaCancionD;
	private TextField _listaCancionTF;
	private Label _listaCancionList;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Perfil _perfil;
	public Perfil_artista_propio _perfilArtista;
	
	public Crear_lista_de_reproduccion() {
		Inicializar();
		this.getConfirmar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});
		this.getEliminar().addClickListener(new ComponentEventListener(){
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
		v1.add(_perfil = new Perfil());
	}
	
	public void Cancelar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_perfil = new Perfil());
	}
	
	void Inicializar() {
		this.getCancelar().setVisible(true);
		this.getEliminar().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getConfirmar().setVisible(true);
		this.getNombre().setVisible(true);
		this.getListaCancion().setVisible(true);
		this.getListaCanciones().setVisible(true);
		this.getNombreCancion().setVisible(true);
	}
}