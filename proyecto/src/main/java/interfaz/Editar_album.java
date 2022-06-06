package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import orm.bbdd.Album;
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

	public Editar_album(Album album) {

		Inicializar(album);

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

	public void Anadir_imagen() {
		throw new UnsupportedOperationException();
	}
	void Inicializar(Album album) {
		this.getCambiarImagen().setVisible(true);
		this.getImgAlbum().setVisible(true);
		this.getTitulo().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getNombreArtista().setVisible(true);
		this.getFechaEdición().setVisible(true);
	}
}