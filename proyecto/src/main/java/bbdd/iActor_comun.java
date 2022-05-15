package bbdd;

import orm.bbdd.Album;
import interfaz.Artista_elemento;
import interfaz.Estilo_admin;
import interfaz.Cancion;
import interfaz.Lista_de_reproduccion_ajena;
import interfaz.Estadisticas;
import interfaz.Usuario_registrado;

public interface iActor_comun {

	public void marcarFavorito(int aId);

	public void anadir(String aNombre);

	public void desmarcarFavorita(int aId);

	public void crearLista(String aNombre);

	public void seguirLista(int aIdLista);

	public void seguir_dejarDeSeguirUsuario(String aNick);

	public void seguir_dejarDeSeguirArtista(String aNick);

	public void cargarAlbum(Album aAlbum);

	public void cargarArtista(Artista_elemento aArtista);

	public void cargarEstilo(Estilo_admin aEstilo);

	public void cargarCancion(Cancion aCancion);

	public void verCreditos(String aTitulo, String[] aInterpretes, String[] aCompositores, String[] aProductores, String aTituloAlb);

	public void cargarLista(Lista_de_reproduccion_ajena aLista);

	public void cargarEstadisticas(Estadisticas aEstadisticas);

	public void cargarUsuario(Usuario_registrado aUsuario);
}