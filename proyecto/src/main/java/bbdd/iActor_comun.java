package bbdd;

import orm.bbdd.Album;
import orm.bbdd.Artista;
import orm.bbdd.Estilo;
import orm.bbdd.Cancion;
import orm.bbdd.Lista_de_reproduccion;
import orm.bbdd.Estadistica;
import orm.bbdd.Usuario_Registrado;

public interface iActor_comun {

	public void marcarFavorito(int aIdCancion, int aIdUsuario);

	public void anadir(String aNombre);

	public void desmarcarFavorita(int aIdCancion, int aIdUsuario);

	public void crearLista(String aNombre);

	public void seguirLista(int aIdLista);

	public void seguir_dejarDeSeguirUsuario(String aNick, String aNickSeguido);

	public void seguir_dejarDeSeguirArtista(int aId, int aIdSeguido);

	public Album cargarAlbum(int aIdAlbum);

	public Artista cargarArtista(int aIdArtista);

	public Estilo cargarEstilo(int aIdEstilo);

	public Cancion cargarCancion(int aIdCancion);

	public Lista_de_reproduccion cargarLista(int aIdLista);

	public Estadistica cargarEstadisticas(int aIdEstadisticas);

	public Usuario_Registrado cargarUsuario(int aIdUsuario);
}