package bbdd;

import java.sql.Date;
import interfaz.Cancion;
import interfaz.Estilo_admin;

public interface iAdministrador extends iActor_comun {

	public void AltaAlbum(String aImagen, String aTitulo, Date aFechaEdicion, String aNombreArtista, Cancion[] aCanciones);

	public void altaArtistas(String aEmail, String aContrasena, String aNick, String aImagen);

	public void altaEstilo(String aNombre);

	public void altaCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia, Estilo_admin[] aEstilos, String aTituloAlbum);

	public void editarAlbum(String aTitulo, Date aFechaEdicion, String aImagen, String aNombreArtista, Cancion[] aCanciones);

	public void editarArtista(String aEmail, String aContrasena, String aNick, String aImagen);

	public void editarCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia, Estilo_admin[] aEstilos, String aTituloAlbum);

	public void editarEstilo(String aNombre);

	public void editarLista(String aNombre);

	public void editarUsuario(String aEmail, String aContrasena, String aNick, String aImagen);

	public void editarFoto(String aFoto);

	public void eliminar(int aId);

	public void editar_e_mail(String aEmail);

	public void editarCancionesMostradas(Cancion[] aCanciones);

	public void editarNumCancionesCibernauta(int aNumCanciones);
}