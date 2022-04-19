package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMenu_administracion;

public class Menu_administracion extends VistaMenu_administracion{
	/*private event _editar_numero_canciones_mostradas_al_cibernauta;
	private TextField _editarNumeroCancionesTF;
	private Label _editarNumeroCancionesL;
	private Label _limiteCancionesL;
	private Label _tituloL;
	private Button _buscarElementoB;
	private Button _darAltaB;
	private Label _cancionesMostradasL;
	private Button _editarCancionesB;
	private Label _cancionesMostradasLista;*/
	public Administrador _administrador;
	public Editar_canciones_mostradas_al_cibernauta _editarCancionesMostradasAlCibernauta;
	public Dar_de_alta _darDeAlta;
	public Buscar_elemento _buscarElemento;
	
	public Menu_administracion() {
		Inicializar();
		this.getBotonBuscarElemento().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				BuscarElemento();
			}
		});
		this.getBotonDarDeAlta().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				DarAlta();
			}
		});
		this.getBotonEditarCanciones().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				EditarCanciones();
			}
		});
		/*this.getBotonEditarLimite().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				EditarLimite();
			}
		});*/
	}

	public void Editar_numero_canciones_mostradas_al_cibernauta() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getBotonDarDeAlta().setVisible(true);
		this.getBotonEditarCanciones().setVisible(true);
		this.getBotonBuscarElemento().setVisible(true);
		this.getBotonEditarLimite().setVisible(true);
		this.getH2Administracion().setVisible(true);
		this.getH4TextoCancionesMostradas().setVisible(true);
		this.getH4TextoLimite().setVisible(true);
		this.getListaCanciones().setVisible(true);
	}
	public void BuscarElemento() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_buscarElemento = new Buscar_elemento());
	}
	public void DarAlta() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_darDeAlta = new Dar_de_alta());
	}
	public void EditarCanciones() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_editarCancionesMostradasAlCibernauta = new Editar_canciones_mostradas_al_cibernauta());
	}
	/*public void EditarLimite() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_altaEstilos);
	}*/
}