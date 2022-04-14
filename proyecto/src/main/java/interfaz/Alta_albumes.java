package interfaz;

import vistas.VistaAlta_albumes;

public class Alta_albumes extends VistaAlta_albumes{
	/*private Label _altaAlbumL;
	private event _anadir_imagen;
	private Image _imagen;
	private Button _anadirImagenB;
	private Label _tituloL;
	private TextField _tituloTF;
	private Label _nombreL;
	private TextField _nombreTF;
	private Label _fechaEdicionL;
	private TextField _fechaEdicionTF;
	private Label _listaCancionL;
	private Dropdown _listaCancionD;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Dar_de_alta _darDeAlta;
	
	public Alta_albumes() {
		Inicializar();
	}

	public void Anadir_imagen() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getConfirmar().setVisible(true);
		this.getCancelar().setVisible(true);
		this.getFechaEdicion().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getTitulo().setVisible(true);
		this.getImg().setVisible(true);
		this.getNombreArtista().setVisible(true);
		this.getAnadirImagen().setVisible(true);
	}
}