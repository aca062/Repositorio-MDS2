package bbdd;

import java.sql.Date;

import interfaz.Cancion;
import interfaz.Estilo_admin;

public interface iAdministrador extends iActor_comun {

	public void AltaAlbum(String aImagen, String aTitulo, Date aFechaEdicion, String aNombreArtista, Cancion[] aCanciones);

	public void altaArtistas(String aEmail, String aContrasena, String aNick, String aImagen);

	public void altaEstilo(String aNombre);

	public void altaCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia, Estilo_admin[] aEstilos, String aTituloAlbum);

	public void editarAlbum(String aTitulo, Date aFechaEdicion, String aImagen, String aNombreArtista, Cancion[] aCanciones, int aIdAlbum);

	public void editarArtista(String aEmail, String aContrasena, String aNick, String aImagen, int aIdArtista);

	public void editarCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia, Estilo_admin[] aEstilos, String aTituloAlbum, int aIdCancion);

	public void editarEstilo(String aNombre, int aIdEstilo);

	public void editarLista(String aNombre, int aIdLista);

	public void editarUsuario(int aIdUsuario, String aEmail, String aContrasena, String aNick, String aImagen);

	public void editarFoto(String aFoto, int aIdUsuario);

	public void eliminar(int aId);

	public void editar_e_mail(String aEmail, int aIdUsuario);

	public void editarCancionesMostradas(Cancion[] aCanciones);

	public void editarNumCancionesCibernauta(int aNumCanciones);
}