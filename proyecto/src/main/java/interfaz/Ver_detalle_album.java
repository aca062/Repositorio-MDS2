package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import bbdd.BD_Albumes;
import vistas.VistaVer_detalle_album;

public class Ver_detalle_album extends VistaVer_detalle_album{
	/*private event _imagen_reproducir;
	private Label _nombreAlbumL;
	private Button _nombreArtistaB;
	private Label _fechaL;
	private Image _imagenAlbum;*/
	public Perfil_artista_ajeno _artistaAjeno;
	public Album _album;
	orm.bbdd.Album album;
	public Lista_de_canciones _listaDeCanciones;
    BD_Albumes bdAlbumes = new BD_Albumes();

	public Ver_detalle_album(orm.bbdd.Album album2) {
	    this.album = album2;
		Inicializar();
		this.getBotonArtista().addClickListener(new ComponentEventListener() {
			@Override
            public void onComponentEvent(ComponentEvent event) {
				IrArtista();
			}
		});

		this.getBotonArtista().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                IrArtista();
            }
        });
	}

	public void Imagen_reproducir() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
	    this.getTitulo().setText(album.getTitulo());
	    this.getImg().setSrc(album.getImagen());
	    this.getBotonArtista().setText(album.getArtista().getNick().toString());
	    this.getH5FechaAlbum().setText(album.getFechaEdicion().toString());
		this.getBotonArtista().setVisible(true);
		this.getH5FechaAlbum().setVisible(true);

		try {
            orm.bbdd.Cancion[] canciones = bdAlbumes.cargarCancionesAlbum(album.getIdAlbum());
            _listaDeCanciones = new Lista_de_canciones(canciones);
            _listaDeCanciones.getStyle().set("width", "100%");
            this.getLayoutCancionesAlbum().add(_listaDeCanciones);
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

	public void IrArtista() {
        _artistaAjeno = new Perfil_artista_ajeno(album.getArtista());
        _artistaAjeno.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_artistaAjeno);
	}
}