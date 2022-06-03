package bbdd;

import java.sql.Date;

import interfaz.Cancion;

public interface iAdministrador extends iActor_comun {

	public int altaArtistas(String aEmail, String aContrasena, String aNick, String aImagen, int aIdEstilo);

	public void altaEstilo(String aNombre, int aIdEstilo);

	public int altaCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia,int aIdEstilos, String aTituloAlbum);

	public void editarAlbum(String aTitulo, Date aFechaEdicion, String aImagen, String aNombreArtista, Cancion[] aCanciones, int aIdAlbum);

	public void editarArtista(String aEmail, String aContrasena, String aNick, String aImagen, int aIdArtista);

	public void editarCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia, String aEstilos, String aTituloAlbum, int aIdCancion);

	public void editarEstilo(String aNombre, int aIdEstilo);

	public void editarLista(String aNombre, int aIdLista);

	public void editarUsuario(int aIdUsuario, String aEmail, String aContrasena, String aNick, String aImagen);

	public void editarFoto(String aFoto, int aIdUsuario);

	public void editar_e_mail(String aEmail, int aIdUsuario);

	public void editarCancionesMostradas(Cancion[] aCanciones);

	public void editarNumCancionesCibernauta(int aNumCanciones);

	public void eliminarAlbum(int aIdAlbum);

	public void eliminarCancion(int aIdCancion);

	public void eliminarArtista(int aIdArtista);

	public void eliminarUsuario(int aIdUsuario);

	public void eliminarEstilo(int aIdEstilo);

	public void eliminarLista(int aIdListas);

	public void AltaAlbum(String aImagen, String aTitulo, Date aFechaEdicion, String aNombreArtista,
			orm.bbdd.Cancion[] aCanciones);




}