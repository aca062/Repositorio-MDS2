package bbdd;

import java.sql.Date;

import org.orm.PersistentException;

import interfaz.Artista_elemento;
import interfaz.Estadisticas;
import interfaz.Estilo_admin;
import interfaz.Lista_de_reproduccion_ajena;
import interfaz.Usuario_registrado;
import orm.bbdd.Album;
import orm.bbdd.Artista;
import orm.bbdd.Cancion;
import orm.bbdd.Estadistica;
import orm.bbdd.Estilo;
import orm.bbdd.Lista_de_reproduccion;
import orm.bbdd.Usuario_Registrado;

/*import bbdd.BD_Usuarios_Registrados;
import BBDD.BD_Artistas;
import BBDD.BD_Administradores;
import BBDD.BD_Canciones;
import BBDD.BD_Listas_de_reproduccion;
import BBDD.BD_Albumes;
import BBDD.BD_Eventos;
import BBDD.BD_Estilos;
import BBDD.BD_Estadisticas;
import BBDD.BD_Acceso_Datos;
import BBDD.Album;
import interfaz.Artista_elemento;
import interfaz.Estilo_admin;
// import interfaz.Cancion;
import interfaz.Lista_de_reproduccion_ajena;
import interfaz.Estadisticas;
import interfaz.Usuario_registrado;
import BBDD.Artista;
import BBDD.Estilo;
// import BBDD.Cancion;
import BBDD.Lista_de_reproduccion;
import BBDD.Estadistica;
import BBDD.Usuario_Registrado;*/

public class BDPrincipal implements iActor_comun, iAdministrador, iArtista, iCibernauta, iUsuario_registrado {
	public BD_Usuarios_Registrados _bd_usuarios_registrados;
	public BD_Artistas _bd_artistas;
	public BD_Administradores _bd_administradores;
	public BD_Canciones _bd_canciones;
	public BD_Listas_de_reproduccion _bd_listas_de_reproduccion;
	public BD_Albumes _bd_albumes;
	public BD_Eventos _bd_eventos;
	public BD_Estilos _bd_estilos;
	public BD_Estadisticas _bd_estadisticas;
	public BD_Acceso_Datos _bd_acceso_datos;

	public void marcarFavorito(int aId, String aNick) {
		throw new UnsupportedOperationException();
	}

	public void anadir(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void desmarcarFavorita(int aId, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void crearLista(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void seguirLista(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void seguir_dejarDeSeguirUsuario(String aNick, String aNickSeguido) {
		throw new UnsupportedOperationException();
	}

	public void seguir_dejarDeSeguirArtista(String aNick, String aNickSeguido) {
		throw new UnsupportedOperationException();
	}

	public void cargarAlbum(Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public void cargarArtista(Artista_elemento aArtista) {
		throw new UnsupportedOperationException();
	}

	public void cargarEstilo(Estilo_admin aEstilo) {
		throw new UnsupportedOperationException();
	}

	public void cargarCancion(interfaz.Cancion aCancion) {
		throw new UnsupportedOperationException();
	}

	public void verCreditos(String aTitulo, String[] aInterpretes, String[] aCompositores, String[] aProductores, String aTituloAlb) {
		throw new UnsupportedOperationException();
	}

	public void cargarLista(Lista_de_reproduccion_ajena aLista) {
		throw new UnsupportedOperationException();
	}

	public void cargarEstadisticas(Estadisticas aEstadisticas) {
		throw new UnsupportedOperationException();
	}

	public void cargarUsuario(Usuario_registrado aUsuario) {
		throw new UnsupportedOperationException();
	}

	public void AltaAlbum(String aImagen, String aTitulo, Date aFechaEdicion, String aNombreArtista, interfaz.Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	public void altaArtistas(String aEmail, String aContrasena, String aNick, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public void altaEstilo(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void altaCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia, Estilo_admin[] aEstilos, String aTituloAlbum) {
		throw new UnsupportedOperationException();
	}

	public void editarAlbum(String aTitulo, Date aFechaEdicion, String aImagen, String aNombreArtista, interfaz.Cancion[] aCanciones, int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void editarArtista(String aEmail, String aContrasena, String aNick, String aImagen, int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public void editarCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia, Estilo_admin[] aEstilos, String aTituloAlbum, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void editarEstilo(String aNombre, int aIdEstilo) {
		throw new UnsupportedOperationException();
	}

	public void editarLista(String aNombre, int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public void editarUsuario(String aEmail, String aContrasena, String aNick, String aImagen, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void editarFoto(String aFoto, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void eliminar(int aId) {
		throw new UnsupportedOperationException();
	}

	public void editar_e_mail(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public void editarCancionesMostradas(interfaz.Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	public void editarNumCancionesCibernauta(int aNumCanciones) {
		throw new UnsupportedOperationException();
	}

	public void altaArtistas(String aEmail, String aContrasena, String aNick, int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public void anadirEvento(Date aFecha, String aHora, String aLugar, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void darDeBaja(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public void editarE_mail(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public boolean inicioDeSesion(String aEmail, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void registro(String aEmail, String aContrasena, String aNick, String aImagen) {
		try {
			_bd_administradores = new BD_Administradores();
			_bd_usuarios_registrados = new BD_Usuarios_Registrados();
			_bd_usuarios_registrados.registro(aEmail, aContrasena, aNick, aImagen);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void recuperarContrasena(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public void marcarFavorito(int aIdCancion, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void seguir_dejarDeSeguirArtista(int aId, int aIdSeguido) {
		throw new UnsupportedOperationException();
	}

	public Album cargarAlbum(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Artista cargarArtista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Estilo cargarEstilo(int aIdEstilo) {
		throw new UnsupportedOperationException();
	}

	public Cancion cargarCancion(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion cargarLista(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public Estadistica cargarEstadisticas(int aIdEstadisticas) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado cargarUsuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void editarUsuario(int aIdUsuario, String aEmail, String aContrasena, String aNick, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public void editar_e_mail(String aEmail, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void editarE_mail(String aEmail, int aIdArtista) {
		throw new UnsupportedOperationException();
	}
}