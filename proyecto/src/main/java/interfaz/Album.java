package interfaz;

import com.example.test.ControladorVistas;

import vistas.VistaAlbum;

public class Album extends VistaAlbum{
	/*private event _imagen_reproducir;
	private Image _fotoAlbum;
	private Button _nombreAlbumB;*/
	public Lista_album _listaAlbum;
	public Lista_albumes _listaAlbumes;
	public Ver_detalle_album _verDetalleAlbum;
	orm.bbdd.Album album;

	public Album(orm.bbdd.Album album) {
	    this.album = album;
		Inicializar();
		/*this.getTitulo().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				DetallesAlbum();
			}
		});*/
	}

	public void Imagen_reproducir() {

	}

	void Inicializar() {
	    this.getImgAlbum().setSrc(album.getImagen());
	    this.getTitulo().setText(album.getTitulo());
		this.getImgAlbum().setVisible(true);
		this.getTitulo().setVisible(true);
	}

	public void DetallesAlbum() {
		_verDetalleAlbum = new Ver_detalle_album(album);
		_verDetalleAlbum.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_verDetalleAlbum);
	}
}