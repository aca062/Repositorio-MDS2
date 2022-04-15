package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Album;
import interfaz.Ver_todos_los_albumes;
import vistas.VistaLista_album;

public class Lista_album extends VistaLista_album{
	//private Label _tituloL;
	public Perfil_artista_comun _perfilArtistaComun;
	public Vector<Album> _album = new Vector<Album>();
	public Vector<Ver_todos_los_albumes> _verTodosLosAlbumes = new Vector<Ver_todos_los_albumes>();
	
	public Lista_album() {
		Inicializar();
	}
	void Inicializar() {
		_album.add(new Album());
		_album.add(new Album());
		_album.add(new Album());
		this.getVerMas().setVisible(true);
		this.getH1Titulo().setVisible(true);
		for(int i=0;i<3;i++) {
			this.getLayoutPrincipal().as(VerticalLayout.class).add(_album.get(i));
		}
	}
}