package bbdd;

import org.orm.PersistentException;

import orm.bbdd.Album;
import orm.bbdd.Artista;
import orm.bbdd.Cancion;
import orm.bbdd.Estilo;
import orm.bbdd.Evento;
import orm.bbdd.Lista_de_reproduccion;
import orm.bbdd.Usuario_Registrado;

public interface iActor_comun {

	public void marcarFavorito(int idCancion, int idUsuario);

	public void desmarcarFavorita(int idCancion, int idUsuario);

	public int crearLista(String aNombre, String[] strings, int i);

	public int seguir_dejarDeSeguirArtista(int aId, int aIdSeguido);

	public Estilo[] cargarEstilo();

	public Cancion[] cargarCancionRecomendada(int aIdUsuario);

	public Album[] cargarAlbumRecomendado(int aIdUsuario);

	public Lista_de_reproduccion[] cargarListaRecomendada();

	public Usuario_Registrado[] cargarListaSeguidores(int aIdUsuario);

	public Usuario_Registrado[] cargarListaSeguidos(int aIdUsuario);

	public Cancion[] cargarCancionesFavoritas(int aIdUsuario);

	public Cancion[] cargarUltimasCancionesReproducidas(int aIdUsuario);

    void setUltimaCancionReproducida(int aIdUsuario, int aIdCancion);

    public Artista[] cargarArtistaRecomendado();

    public Lista_de_reproduccion[] cargarListasPropias(int id);

    public boolean cambiarCorreo(String correo, int id) throws PersistentException;

    public void cambiarFoto(int id, String nameImagen) throws PersistentException;

    public Cancion[] cargarCancionesLista(int idLista) throws PersistentException;

    public Lista_de_reproduccion[] cargarListaFavorita();

    public Evento[] cargarEventos(int id) throws PersistentException;

}