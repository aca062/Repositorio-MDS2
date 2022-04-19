package interfaz;

//import com.example.test.WindowController;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEditar_cancion;

public class Editar_cancion extends VistaEditar_cancion{
	/*private Label _editarCancionL;
	private event _anadir_archivo_multimedia;
	private Label _tituloL;
	private TextField _tituloTF;
	private Label _tituloAlbumL;
	private TextField _tituloAlbumTF;
	private Label _compositoresL;
	private TextField _compositoresTF;
	private Label _productoresL;
	private TextField _productoresTF;
	private Label _interpretesL;
	private TextField _interpretesTF;
	private Label _estilosL;
	private Dropdown _estilosD;
	private Label _ficheroL;
	private Button _anadirFicheroB;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Cancion_admin _cancionAdmin;
	
	public Editar_cancion() {
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
		v1.add(new Buscar_administrador());
	}
	
	public void Cancelar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Buscar_administrador());
	}

	public void Anadir_archivo_multimedia() {
		throw new UnsupportedOperationException();
	}

	public void Comprobar_formato() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getConfirmar().setVisible(true);
		this.getCancelar().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getTítulo().setVisible(true);
		this.getTítuloÁlbum().setVisible(true);
		this.getCompositores().setVisible(true);
		this.getProductores().setVisible(true);
		this.getInterpretes().setVisible(true);
		this.getEstilo().setVisible(true);
		this.getAnadirCancion().setVisible(true);
		this.getH4Titulo().setVisible(true);
		this.getH5Requisitos().setVisible(true);
	}
}