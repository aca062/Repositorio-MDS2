package bbdd;

import java.sql.Date;

import org.orm.PersistentException;

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

	@Override
    public void anadir(String aNombre) {
		throw new UnsupportedOperationException();
	}

	@Override
    public void desmarcarFavorita(int aId, int aIdUsuario) {
		try {
			_bd_canciones = new BD_Canciones();
			_bd_canciones.desmarcarFavorita(aId, aIdUsuario);
		} catch(PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void crearLista(String aNombre) {
		try {
			_bd_listas_de_reproduccion = new BD_Listas_de_reproduccion();
			_bd_listas_de_reproduccion.crearLista(aNombre);
		} catch (PersistentException e) {
			e.printStackTrace();
		}

	}

	@Override
    public void seguirLista(int aIdLista) {
		try {
			_bd_usuarios_registrados = new BD_Usuarios_Registrados();
			_bd_usuarios_registrados.seguirLista(aIdLista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void seguir_dejarDeSeguirUsuario(int aId, int aIdSeguido) {
		try {
			_bd_usuarios_registrados = new BD_Usuarios_Registrados();
			_bd_usuarios_registrados.seguir_dejarDeSeguirUsuario(aId, aIdSeguido);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void AltaAlbum(String aImagen, String aTitulo, Date aFechaEdicion, String aNombreArtista, interfaz.Cancion[] aCanciones,int aIdAlbum) {
		try {
			_bd_albumes = new BD_Albumes();
			_bd_canciones = new BD_Canciones();
			_bd_artistas = new BD_Artistas();
			_bd_albumes.AltaAlbum(aImagen, aTitulo, aFechaEdicion, aIdAlbum);
			_bd_canciones.altaAlbum(aCanciones);
			_bd_artistas.altaAlbum(aNombreArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void altaEstilo(String aNombre, int aIdEstilo) {
		try {
			_bd_estilos = new BD_Estilos();
			_bd_estilos.altaEstilo(aNombre, aIdEstilo);
		} catch (PersistentException e) {
			e.printStackTrace();
		}

	}

	public void altaCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia,int aIdCancion, String aEstilos, String aTituloAlbum) {
		try {
			_bd_albumes = new BD_Albumes();
			_bd_canciones = new BD_Canciones();
			_bd_estilos = new BD_Estilos();
			_bd_albumes.altaCancion(aTituloAlbum);
			_bd_canciones.altaCancion(aTitulo, aCompositores, aProductores, aInterpretes, aArcMultimedia, aIdCancion);
			_bd_estilos.altaCancion(aEstilos);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void editarAlbum(String aTitulo, Date aFechaEdicion, String aImagen, String aNombreArtista, interfaz.Cancion[] aCanciones, int aIdAlbum) {
		try {
			_bd_albumes = new BD_Albumes();
			_bd_canciones = new BD_Canciones();
			_bd_artistas = new BD_Artistas();
			_bd_albumes.AltaAlbum(aImagen, aTitulo, aFechaEdicion, aIdAlbum);
			_bd_canciones.altaAlbum(aCanciones);
			_bd_artistas.altaAlbum(aNombreArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void editarArtista(String aEmail, String aContrasena, String aNick, String aImagen, int aIdArtista) {
		try {
			_bd_artistas = new BD_Artistas();
			_bd_artistas.editarArtista(aEmail, aContrasena, aNick, aImagen, aIdArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void editarCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia, String aEstilos, String aTituloAlbum, int aIdCancion) {
		try {
			_bd_albumes = new BD_Albumes();
			_bd_canciones = new BD_Canciones();
			_bd_estilos = new BD_Estilos();
			_bd_albumes.altaCancion(aTituloAlbum);
			_bd_canciones.altaCancion(aTitulo, aCompositores, aProductores, aInterpretes, aArcMultimedia, aIdCancion);
			_bd_estilos.altaCancion(aEstilos);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void editarEstilo(String aNombre, int aIdEstilo) {
		try {
			_bd_estilos = new BD_Estilos();
			_bd_estilos.editarEstilo(aNombre, aIdEstilo);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void editarLista(String aNombre, int aIdLista) {
		try {
			_bd_listas_de_reproduccion = new BD_Listas_de_reproduccion();
			_bd_listas_de_reproduccion.editarLista(aNombre, aIdLista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void editarFoto(String aFoto, int aIdUsuario) {
		try {
			_bd_administradores = new BD_Administradores();
			_bd_administradores.editarFoto(aFoto, aIdUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void editarFotoArtista(String aFoto, int aIdArtista) {
		try {
			_bd_artistas = new BD_Artistas();
			_bd_artistas.editarFoto(aFoto, aIdArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void eliminar(int aId) {
		throw new UnsupportedOperationException();
	}


	@Override
    public void editarCancionesMostradas(interfaz.Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	@Override
    public void editarNumCancionesCibernauta(int aNumCanciones) {
		try {
			_bd_canciones = new BD_Canciones();
			_bd_canciones.editarNumCancionesCibernauta(aNumCanciones);
		} catch(PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void altaArtistas(String aEmail, String aContrasena, String aNick, String aImagen, int aIdArtista) {
		try {
			_bd_artistas = new BD_Artistas();
			_bd_artistas.altaArtistas(aEmail, aContrasena, aNick, aImagen, aIdArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void anadirEvento(Date aFecha, String aHora, String aLugar, String aFoto) {
		try {
			_bd_eventos = new BD_Eventos();
			_bd_eventos.anadirEvento(aFecha, aHora, aLugar, aFoto);
		} catch (PersistentException e) {
			e.printStackTrace();
		}

	}

	@Override
    public void darDeBaja(String aEmail) {
		try {
			_bd_usuarios_registrados = new BD_Usuarios_Registrados();
			_bd_usuarios_registrados.darDeBaja(aEmail);
		} catch (PersistentException e) {
			e.printStackTrace();
		}

	}


	@Override
    public String inicioDeSesion(String aEmail, String aContrasena) {
		_bd_acceso_datos = new BD_Acceso_Datos();
		try {
			return _bd_acceso_datos.inicioDeSesion(aEmail, aContrasena);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "que tal estamos";
	}

	@Override
    public void registro(String aEmail, String aContrasena, String aNick, String aImagen) {
		try {
			_bd_usuarios_registrados = new BD_Usuarios_Registrados();
			_bd_usuarios_registrados.registro(aEmail, aContrasena, aNick, aImagen);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
    public void recuperarContrasena(String aEmail) {
		try {
			_bd_acceso_datos = new BD_Acceso_Datos();
			_bd_acceso_datos.recuperarContrasena(aEmail);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
    public void marcarFavorito(int aIdCancion, int aIdUsuario) {
		try {
			_bd_canciones = new BD_Canciones();
			_bd_canciones.marcarFavorito(aIdCancion, aIdUsuario);
		} catch(PersistentException e) {
			e.printStackTrace();
		}

	}

	@Override
    public void seguir_dejarDeSeguirArtista(int aId, int aIdSeguido) {
		try {
			_bd_artistas = new BD_Artistas();
			_bd_artistas.seguir_dejarDeSeguirArtista(aId, aIdSeguido);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public Album cargarAlbum(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}
	@Override
	public Album[] cargarAlbumRecomendado(int aIdUsuario) {
		Album[] albumes = null;
		
		try {
			albumes = _bd_albumes.cargarAlbumRecomendado(aIdUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return albumes;
	}

	@Override
    public Artista cargarArtista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	@Override
    public Estilo[] cargarEstilo() {
		Estilo[] estilos = null;
		try {
			estilos = _bd_estilos.cargarEstilo();
		} catch (PersistentException e){
			e.printStackTrace();
		}
		return estilos;
	}

	@Override
    public Cancion cargarCancion(int aIdCancion) {
		throw new UnsupportedOperationException();
	}
	
	@Override
    public Cancion[] cargarCancionRecomendada(int aIdUsuario) {
		Cancion[] canciones = null;
		
		try {
			canciones = _bd_canciones.cargarCancionRecomendada(aIdUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return canciones;
	}
	
	@Override
    public Cancion[] cargarUltimosExitos(int aNumCanciones) {
		Cancion[] canciones = null;
		
		try {
			canciones = _bd_canciones.cargarUltimosExitos(aNumCanciones);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return canciones;
	}

	@Override
    public Lista_de_reproduccion cargarLista(int aIdLista) {
		throw new UnsupportedOperationException();
	}
	
	@Override
    public Lista_de_reproduccion[] cargarListaRecomendada(int aIdUsuario) {
		Lista_de_reproduccion[] listas = null;
		
		try {
			listas = _bd_listas_de_reproduccion.cargarListaRecomendada(aIdUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return listas;
	}

	@Override
    public Estadistica cargarEstadisticas(int aIdEstadisticas) {
		throw new UnsupportedOperationException();
	}

	@Override
    public Usuario_Registrado cargarUsuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
	
	@Override
    public Usuario_Registrado[] cargarListaSeguidores(int aIdUsuario) {
		Usuario_Registrado[] usuarios = null;
		
		try {
			usuarios = _bd_usuarios_registrados.cargarListaSeguidores(aIdUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return usuarios;
	}
	
	@Override
    public Usuario_Registrado[] cargarListaSeguidos(int aIdUsuario) {
		Usuario_Registrado[] usuarios = null;
		
		try {
			usuarios = _bd_usuarios_registrados.cargarListaSeguidos(aIdUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return usuarios;
	}

	@Override
    public void editarUsuario(int aIdUsuario, String aEmail, String aContrasena, String aNick, String aImagen) {
		try {
			_bd_usuarios_registrados = new BD_Usuarios_Registrados();
			_bd_usuarios_registrados.editarUsuario(aIdUsuario, aEmail, aContrasena, aNick, aImagen);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
    public void editar_e_mail(String aEmail, int aIdUsuario) {
		try {
			_bd_administradores = new BD_Administradores();
			_bd_administradores.editar_e_mail(aEmail, aIdUsuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
    public void editarE_mail(String aEmail, int aIdArtista) {
		try {
			_bd_artistas = new BD_Artistas();
			_bd_artistas.editarE_mail(aEmail, aIdArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}