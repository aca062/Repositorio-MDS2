package bbdd;

import org.orm.PersistentException;

import orm.bbdd.Album;
import orm.bbdd.Artista;
import orm.bbdd.Cancion;
import orm.bbdd.Estadistica;
import orm.bbdd.Estilo;
import orm.bbdd.Lista_de_reproduccion;
import orm.bbdd.Usuario_Registrado;

public interface iActor_comun {

	public void marcarFavorito(int idCancion, int idUsuario);

	public void anadir(String aNombre);

	public void desmarcarFavorita(int idCancion, int idUsuario);

	public int crearLista(String aNombre, String[] strings, int i);

	public void seguirLista(int aIdLista);

	public void seguir_dejarDeSeguirUsuario(int aId, int aIdSeguido);

	public void seguir_dejarDeSeguirArtista(int aId, int aIdSeguido);

	public Album cargarAlbum(int aIdAlbum);

	public Artista cargarArtista(int aIdArtista);

	//public Estilo cargarEstilo(int aIdEstilo);

	public Cancion cargarCancion(int aIdCancion);

	public Lista_de_reproduccion cargarLista(int aIdLista);

	public Estadistica cargarEstadisticas(int aIdEstadisticas);

	public Usuario_Registrado cargarUsuario(int aIdUsuario);

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

<<<<<<< HEAD
    public Cancion[] cargarCancionesLista(int idLista) throws PersistentException;
=======
	public Lista_de_reproduccion[] cargarListaFavorita();
>>>>>>> branch 'master' of https://github.com/aca062/Repositorio-MDS2.git
}