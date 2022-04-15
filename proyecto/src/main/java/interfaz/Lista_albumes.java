package interfaz;

import java.util.Vector;
import interfaz.Album;
import vistas.VistaLista_albumes;

public class Lista_albumes extends VistaLista_albumes{
	//private Label _tituloL;
	public Ver_todos_los_albumes _verTodosLosAlbumes;
	public Vector<Album> _album = new Vector<Album>();

	public Lista_albumes() {

	}
	void Inicializar() {
		_album.add(new Album());
		_album.add(new Album());
		_album.add(new Album());
		this.getH1Titulo().setVisible(true);
		for(int i=0;i<3;i++) {
			this.getLayoutAlbumes().add(_album.get(i));
		}
	}
}