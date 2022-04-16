package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEditar_album;

public class Editar_album extends VistaEditar_album{
	/*private Label _editarAlbumL;
	private event _anadir_imagen;
	private Image _imagen;
	private Button _cambiarImagenB;
	private Label _tituloL;
	private TextField _tituloTF;
	private Label _nombreArtistaL;
	private TextField _nombreArtistaTF;
	private Label _fechaEdicionL;
	private TextField _fechaEdicionTF;
	private Label _listaCancionesL;
	private Dropdown _listaCancionesD;
	private Label _listaCancionesList;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Album_admin _albumAdmin;
	
	public Editar_album() {
		Inicializar();
	}
	
	public void Anadir_imagen() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getCambiarImagen().setVisible(true);
		this.getImgAlbum().setVisible(true);
		this.getTitulo().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getNombreArtista().setVisible(true);
		this.getFechaEdición().setVisible(true);
	}
}