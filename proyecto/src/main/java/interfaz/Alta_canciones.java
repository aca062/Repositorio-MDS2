package interfaz;

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
	public Dar_de_alta _darDeAlta;
	
	public Alta_canciones() {
		Inicializar();
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