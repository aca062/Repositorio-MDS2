package bbdd;

import java.sql.Date;

import org.orm.PersistentException;

import orm.bbdd.Actor_Comun;
import orm.bbdd.Actor_ComunDAO;
import orm.bbdd.Album;
import orm.bbdd.AlbumDAO;
import orm.bbdd.Artista;
import orm.bbdd.Cancion;
import orm.bbdd.Estilo;
import orm.bbdd.Evento;
import orm.bbdd.Lista_de_reproduccion;
import orm.bbdd.Usuario_Registrado;

public class BDPrincipal implements iActor_comun, iAdministrador, iArtista, iCibernauta, iUsuario_registrado {
    public BD_Usuarios_Registrados _bd_usuarios_registrados = new BD_Usuarios_Registrados();
    public BD_Artistas _bd_artistas = new BD_Artistas();
    public BD_Administradores _bd_administradores = new BD_Administradores();
    public BD_Canciones _bd_canciones = new BD_Canciones();
    public BD_Listas_de_reproduccion _bd_listas_de_reproduccion = new BD_Listas_de_reproduccion();
    public BD_Albumes _bd_albumes = new BD_Albumes();
    public BD_Eventos _bd_eventos = new BD_Eventos();
    public BD_Estilos _bd_estilos = new BD_Estilos();
    public BD_Estadisticas _bd_estadisticas = new BD_Estadisticas();
    public BD_Acceso_Datos _bd_acceso_datos = new BD_Acceso_Datos();

    @Override
    public void desmarcarFavorita(int idCancion, int idUsuario) {
        try {
            _bd_canciones = new BD_Canciones();
            _bd_canciones.desmarcarFavorita(idCancion, idUsuario);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int crearLista(String aNombre, String[] canciones, int id) {
        try {
            _bd_listas_de_reproduccion = new BD_Listas_de_reproduccion();
            return _bd_listas_de_reproduccion.crearLista(aNombre, canciones, id);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return -3;
    }

    @Override
    public int AltaAlbum(String aImagen, String aTitulo, Date aFechaEdicion, String aNombreArtista,
            Cancion[] aCanciones) {
        try {
            _bd_albumes = new BD_Albumes();
            _bd_albumes.AltaAlbum(aImagen, aTitulo, aFechaEdicion, aNombreArtista, aCanciones);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return 1;
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

    @Override
    public int altaCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes,
            String aArcMultimedia, int aIdEstilos, String aTituloAlbum, String imagen) {
        try {
            _bd_canciones = new BD_Canciones();

            for (int i = 0; i < aInterpretes.length; i++) {
                try {
                    Actor_Comun actor = Actor_ComunDAO.listActor_ComunByQuery("nick='" + aInterpretes[i].trim() + "'",
                            "nick")[0];
                    if (Actor_ComunDAO.listActor_ComunByQuery("nick='" + aInterpretes[i].trim() + "'",
                            "nick").length == 0) {
                        return -1;
                    } else {
                        if (!actor.getAcceso_Dato().getTipoUsuario().equals("artista")) {
                            return -1;
                        }
                    }
                    if (aTituloAlbum != null && !aTituloAlbum.equals("")) {
                        if (AlbumDAO.listAlbumByQuery(
                                "titulo='" + aTituloAlbum + "' AND ArtistaActor_ComunId='" + actor.getId() + "'",
                                "titulo").length == 0) {
                            return -2;
                        }
                    }
                } catch (IndexOutOfBoundsException e) {
                    return -1;
                }
            }
            _bd_canciones.altaCancion(aTitulo, aCompositores, aProductores, aInterpretes, aArcMultimedia, aIdEstilos,
                    aTituloAlbum, imagen);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return 1;
    }

    @Override
    public int editarAlbum(String aTitulo, Date aFechaEdicion, String aImagen, String aNombreArtista,
            orm.bbdd.Cancion[] aCanciones, int aIdAlbum) {
        try {
            _bd_albumes = new BD_Albumes();
            _bd_albumes.editarAlbum(aTitulo, aFechaEdicion, aImagen, aNombreArtista, aCanciones, aIdAlbum);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return 1;
    }

    @Override
    public int editarArtista(String aEmail, String aContrasena, String aNick, String aImagen, int aIdArtista,
            int aIdEstilo) {
        try {
            _bd_artistas = new BD_Artistas();
            _bd_artistas.editarArtista(aEmail, aContrasena, aNick, aImagen, aIdArtista, aIdEstilo);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return 1;
    }

    @Override
    public int editarCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes,
            String aArcMultimedia, int aEstilos, String aTituloAlbum, int aIdCancion) {
        _bd_canciones = new BD_Canciones();
        int comprobacion = -1;
        try {
            _bd_canciones.editarCancion(aTitulo, aCompositores, aProductores, aInterpretes, aArcMultimedia, aEstilos,
                    aTituloAlbum, aIdCancion);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return 1;
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
    public void editarLista(String aNombre, String canciones, int aIdLista) throws PersistentException {
        _bd_listas_de_reproduccion = new BD_Listas_de_reproduccion();
        _bd_listas_de_reproduccion.editarLista(aNombre, canciones, aIdLista);
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
    public boolean eliminarCancion(int aIdCancion) {
        boolean correcto = false;
        try {
            correcto = _bd_canciones.eliminarCancion(aIdCancion);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return correcto;
    }

    @Override
    public boolean eliminarArtista(int aIdArtista) {
        boolean correcto = false;
        try {
            correcto = _bd_artistas.eliminarArtista(aIdArtista);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return correcto;
    }

    @Override
    public boolean eliminarAlbum(int aIdAlbum) {
        boolean correcto = false;
        try {
            correcto = _bd_albumes.eliminarAlbum(aIdAlbum);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return correcto;
    }

    @Override
    public boolean eliminarUsuario(int aIdUsuario) {
        boolean correcto = false;
        try {
            correcto = _bd_usuarios_registrados.eliminarUsuario(aIdUsuario);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return correcto;
    }

    @Override
    public boolean eliminarEstilo(int aIdEstilo) {
        boolean correcto = false;
        try {
            correcto = _bd_estilos.eliminarEstilo(aIdEstilo);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return correcto;
    }

    @Override
    public boolean eliminarLista(int aIdListas) {
        boolean correcto = false;
        try {
            correcto = _bd_listas_de_reproduccion.eliminarLista(aIdListas);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return correcto;
    }

    @Override
    public void editarNumCancionesCibernauta(int aNumCanciones) {
        try {
            _bd_canciones = new BD_Canciones();
            _bd_canciones.editarNumCancionesCibernauta(aNumCanciones);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int altaArtistas(String aEmail, String aContrasena, String aNick, String aImagen, int aIdEstilo) {
        try {
            if (Actor_ComunDAO.listActor_ComunByQuery("nick='" + aNick + "'", "nick").length != 0) {
                return -1;
            }
            if (Actor_ComunDAO.listActor_ComunByQuery("email='" + aEmail + "'", "nick").length != 0) {
                return -2;
            }
            _bd_artistas = new BD_Artistas();
            _bd_artistas.altaArtistas(aEmail, aContrasena, aNick, aImagen, aIdEstilo);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return 1;
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
    public int registro(String aEmail, String aContrasena, String aNick, String aImagen) {
        try {
            if (Actor_ComunDAO.listActor_ComunByQuery("nick='" + aNick + "'", "nick").length != 0) {
                return -1;
            }
            if (Actor_ComunDAO.listActor_ComunByQuery("email='" + aEmail + "'", "nick").length != 0) {
                return -2;
            }
            _bd_usuarios_registrados = new BD_Usuarios_Registrados();
            _bd_usuarios_registrados.registro(aEmail, aContrasena, aNick, aImagen);
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 1;
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
    public void marcarFavorito(int idCancion, int idUsuario) {
        try {
            _bd_canciones = new BD_Canciones();
            _bd_canciones.marcarFavorito(idCancion, idUsuario);
        } catch (PersistentException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int seguir_dejarDeSeguirArtista(int aId, int aIdSeguido) {
        try {
            _bd_artistas = new BD_Artistas();
            return _bd_artistas.seguir_dejarDeSeguirArtista(aId, aIdSeguido);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return -1;
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
    public Estilo[] cargarEstilo() {
        Estilo[] estilos = null;
        try {
            estilos = _bd_estilos.cargarEstilo();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return estilos;
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

    /*
     * @Override public Cancion[] cargarUltimosExitos(int aNumCanciones) { Cancion[]
     * canciones = null;
     *
     * try { canciones = _bd_canciones.cargarUltimosExitos(aNumCanciones); } catch
     * (PersistentException e) { e.printStackTrace(); } return canciones; }
     */

    @Override
    public Cancion[] cargarCancionesFavoritas(int aIdUsuario) {
        Cancion[] listas = null;
        listas = _bd_canciones.cargarCancionesFavoritas(aIdUsuario);
        return listas;
    }

    @Override
    public Cancion[] cargarUltimasCancionesReproducidas(int aIdUsuario) {
        Cancion[] canciones = null;

        try {
            canciones = _bd_canciones.cargarUltimasCancionesReproducidas(aIdUsuario);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return canciones;
    }

    @Override
    public void setUltimaCancionReproducida(int aIdUsuario, int aIdCancion) {
        try {
            _bd_canciones.setUltimaCancionReproducida(aIdUsuario, aIdCancion);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Lista_de_reproduccion[] cargarListaRecomendada() {
        Lista_de_reproduccion[] listas = null;

        try {
            listas = _bd_listas_de_reproduccion.cargarListaRecomendada();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return listas;
    }

    @Override
    public Lista_de_reproduccion[] cargarListaFavorita() {
        Lista_de_reproduccion[] listas = null;

        try {
            listas = _bd_listas_de_reproduccion.cargarListaFavorita();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return listas;
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
    public int editarUsuario(int aIdUsuario, String aEmail, String aContrasena, String aNick, String aImagen) {
        try {
            _bd_usuarios_registrados = new BD_Usuarios_Registrados();
            _bd_usuarios_registrados.editarUsuario(aIdUsuario, aEmail, aContrasena, aNick, aImagen);
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 1;
    }

    @Override
    public Cancion[] busquedaCancion(String aParametrosBusqueda) {
        Cancion[] canciones = null;
        try {
            canciones = _bd_canciones.busquedaCancion(aParametrosBusqueda);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return canciones;
    }

    @Override
    public Album[] busquedaAlbum(String paramBusqueda) {
        Album[] albumes = null;
        try {
            albumes = _bd_albumes.busquedaAlbum(paramBusqueda);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return albumes;
    }

    @Override
    public Artista[] busquedaArtista(String paramBusqueda) {
        Artista[] artistas = null;
        try {
            artistas = _bd_artistas.busquedaArtistas(paramBusqueda);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return artistas;
    }

    @Override
    public Usuario_Registrado[] busquedaUsuarios(String paramBusqueda) {
        Usuario_Registrado[] usuarios = null;
        try {
            usuarios = _bd_usuarios_registrados.busquedaUsuarios(paramBusqueda);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    @Override
    public Estilo[] busquedaEstilos(String paramBusqueda) {
        Estilo[] estilo = null;
        try {
            estilo = _bd_estilos.busquedaEstilos(paramBusqueda);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return estilo;
    }

    @Override
    public Lista_de_reproduccion[] busquedaListas(String paramBusqueda) {
        Lista_de_reproduccion[] lista = null;
        try {
            lista = _bd_listas_de_reproduccion.busquedaLista(paramBusqueda);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public Actor_Comun getUsuario(int id) {
        Actor_Comun usuario = null;
        try {
            Actor_Comun[] usuarios = Actor_ComunDAO.listActor_ComunByQuery("Id='" + id + "'", "email");
            if (usuarios.length == 0) {
                return usuario;
            }
            usuario = usuarios[0];
        } catch (PersistentException e) {
            return usuario;
        }
        return usuario;
    }

    @Override
    public Artista[] cargarArtistaRecomendado() {
        Artista[] artistas = null;

        try {
            artistas = _bd_artistas.cargarArtistasRecomendados();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return artistas;
    }

    @Override
    public Lista_de_reproduccion[] cargarListasPropias(int id) {
        Lista_de_reproduccion[] listas = null;
        listas = _bd_listas_de_reproduccion.cargarListasPropias(id);
        return listas;
    }

    @Override
    public boolean cambiarCorreo(String correo, int id) throws PersistentException {
        Actor_Comun[] comprobar = Actor_ComunDAO.listActor_ComunByQuery("email='" + correo + "'", "email");

        if (comprobar.length >= 1) {
            return false;
        }

        Actor_Comun[] usuario = Actor_ComunDAO.listActor_ComunByQuery("id='" + id + "'", "email");

        switch (usuario[0].getAcceso_Dato().getTipoUsuario()) {
        case "admin":
            _bd_administradores.editar_e_mail(correo, id);
            break;
        case "usuario":
            _bd_usuarios_registrados.editar_e_mail(correo, id);
            break;
        case "artista":
            _bd_artistas.editarE_mail(correo, id);
            break;
        }

        return true;

    }

    @Override
    public void cambiarFoto(int id, String nombre) throws PersistentException {
        Actor_Comun[] usuario = Actor_ComunDAO.listActor_ComunByQuery("id='" + id + "'", "email");

        switch (usuario[0].getAcceso_Dato().getTipoUsuario()) {
        case "admin":
            _bd_administradores.editarFoto(id, nombre);
            break;
        case "usuario":
            _bd_usuarios_registrados.editarFoto(id, nombre);
            break;
        case "artista":
            _bd_artistas.editarFoto(id, nombre);
            break;
        }

    }

    @Override
    public orm.bbdd.Cancion[] cargarCancionesLista(int idLista) throws PersistentException {
        orm.bbdd.Cancion[] canciones = null;
        canciones = _bd_listas_de_reproduccion.cargarCancionesLista(idLista);
        return canciones;
    }

    @Override
    public int editarCancionesCibernauta(String[] strings, int i) throws PersistentException {
        return _bd_administradores.editarCancionesCibernauta(strings, i);
    }

    @Override
    public orm.bbdd.Cancion[] cargarCancionesCibernauta(int id) throws PersistentException {
        return _bd_administradores.cargarCancionesCibernauta(id);
    }

    @Override
    public Cancion[] cargarCancionesAdmin() throws PersistentException {
        return _bd_administradores.cargarCancionesCibernauta(1);
    }

    @Override
    public Actor_Comun getUsuarioCorreo(String correo) {
        Actor_Comun usuario = null;
        try {
            Actor_Comun[] usuarios = Actor_ComunDAO.listActor_ComunByQuery("email='" + correo + "'", "email");
            if (usuarios.length == 0) {
                return usuario;
            }
            usuario = usuarios[0];
        } catch (PersistentException e) {
            return usuario;
        }
        return usuario;
    }

    @Override
    public Evento[] cargarEventos(int id) throws PersistentException {
        return _bd_eventos.cargarEventos(id);
    }
}