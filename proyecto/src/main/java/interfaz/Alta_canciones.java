package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAlta_canciones;

public class Alta_canciones extends VistaAlta_canciones{
	/*private Label _altaCancionL;
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
	private Label _archivoMultimimediaL;
	private Button _anadirArchivoMultimediaB;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Dar_de_alta _darDeAlta = new Dar_de_alta();
	
	public Alta_canciones() {
		Inicializar();
		this.getCancelar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
		this.getConfirmar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});
	}

	protected void Confirmar() {
		_darDeAlta = new Dar_de_alta();
		_darDeAlta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_darDeAlta);
	}

	protected void Cancelar() {
		_darDeAlta = new Dar_de_alta();
		_darDeAlta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_darDeAlta);
		
	}
	
	public void Anadir_archivo_multimedia() {
		throw new UnsupportedOperationException();
	}

	public void Comprobar_formato() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getAnadirCancion().setVisible(true);
		this.getCancelar().setVisible(true);
		this.getConfirmar().setVisible(true);
		this.getCompositores().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getH4Fichero().setVisible(true);
		this.getH5Requisitos().setVisible(true);
		this.getInterpretes().setVisible(true);
		this.getTítuloÁlbum().setVisible(true);
		this.getTitulo().setVisible(true);
		this.getProductores().setVisible(true);
	}
}