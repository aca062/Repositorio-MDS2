package bbdd;

import java.sql.Date;

import interfaz.Cancion;
import orm.bbdd.Album;
import orm.bbdd.Artista;
import orm.bbdd.Estilo;
import orm.bbdd.Lista_de_reproduccion;
import orm.bbdd.Usuario_Registrado;

public interface iAdministrador extends iActor_comun {

	public int altaArtistas(String aEmail, String aContrasena, String aNick, String aImagen, int aIdEstilo);

	public void altaEstilo(String aNombre, int aIdEstilo);

	public int altaCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia,int aIdEstilos, String aTituloAlbum, String imagen);

	public int editarAlbum(String aTitulo, Date aFechaEdicion, String aImagen, String aNombreArtista, orm.bbdd.Cancion[] aCanciones, int aIdAlbum);

	public int editarArtista(String aEmail, String aContrasena, String aNick, String aImagen, int aIdArtista, int aIdEstilo);

	public int editarCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia, int aEstilos, String aTituloAlbum, int aIdCancion);

	public void editarEstilo(String aNombre, int aIdEstilo);

	public void editarLista(String aNombre, int aIdLista);

	public void editarUsuario(int aIdUsuario, String aEmail, String aContrasena, String aNick, String aImagen);

	public void editarFoto(String aFoto, int aIdUsuario);

	public void editar_e_mail(String aEmail, int aIdUsuario);

	public void editarCancionesMostradas(Cancion[] aCanciones);

	public void editarNumCancionesCibernauta(int aNumCanciones);

	public boolean eliminarAlbum(int aIdAlbum);

	public boolean eliminarCancion(int aIdCancion);

	public boolean eliminarArtista(int aIdArtista);

	public boolean eliminarUsuario(int aIdUsuario);

	public boolean eliminarEstilo(int aIdEstilo);

	public boolean eliminarLista(int aIdListas);

	public int AltaAlbum(String aImagen, String aTitulo, Date aFechaEdicion, String aNombreArtista,
			orm.bbdd.Cancion[] aCanciones);

	public orm.bbdd.Cancion[] busquedaCancion(String aParametrosBusqueda);

    public Album[] busquedaAlbum(String paramBusqueda);

    public Artista[] busquedaArtista(String paramBusqueda);

    public Usuario_Registrado[] busquedaUsuarios(String paramBusqueda);

    public Estilo[] busquedaEstilos(String paramBusqueda);

    public Lista_de_reproduccion[] busquedaListas(String paramBusqueda);




}