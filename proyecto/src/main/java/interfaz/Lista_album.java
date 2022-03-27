package interfaz;

import java.util.Vector;
import interfaz.Album;
import interfaz.Ver_todos_los_albumes;
import vistas.VistaLista_album;

public class Lista_album extends VistaLista_album{
	//private Label _tituloL;
	public Perfil_artista_comun _perfilArtistaComun;
	public Vector<Album> _album = new Vector<Album>();
	public Vector<Ver_todos_los_albumes> _verTodosLosAlbumes = new Vector<Ver_todos_los_albumes>();
}