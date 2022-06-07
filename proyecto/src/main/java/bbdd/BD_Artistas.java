package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Acceso_Dato;
import orm.bbdd.Acceso_DatoDAO;
import orm.bbdd.Artista;
import orm.bbdd.ArtistaCriteria;
import orm.bbdd.ArtistaDAO;
import orm.bbdd.Estadistica;
import orm.bbdd.EstadisticaDAO;
import orm.bbdd.Estilo;
import orm.bbdd.EstiloDAO;
import orm.bbdd.MDS2PersistentManager;

public class BD_Artistas {
    public BDPrincipal _bd_prin_artistas;
    public Vector<Artista> _contiene_artistas = new Vector<Artista>();

    public void altaArtistas(String aEmail, String aContrasena, String aNick, String aImagen, int aIdEstilo)
            throws PersistentException {
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            Artista artista = ArtistaDAO.createArtista();
            /*
             * BD_Usuarios_Registrados usuarios = new BD_Usuarios_Registrados(); int id =
             * usuarios._contiene_usuario_registrados.size() + 1; usuario.setId(id);
             */
            Acceso_Dato accesoD = new Acceso_Dato();
            accesoD.setContrasena(aContrasena);
            accesoD.setEmail(aEmail);
            accesoD.setNumIntentos(0);
            accesoD.setTipoUsuario("artista");
            accesoD.setFechaBloqueo("");
            Acceso_DatoDAO.save(accesoD);
            Estadistica estadistica = new Estadistica();
            estadistica.setTiempoAnual(0);
            double[] tiempoSemana = new double[7];
            estadistica.setTiempoSemana(tiempoSemana);
            // estadistica.setUsuario(usuario);
            EstadisticaDAO.save(estadistica);

            Estilo estilo = EstiloDAO.getEstiloByORMID(aIdEstilo);
            artista.estilos.add(estilo);
            /*
             * BD_Acceso_Datos accesosDato = new BD_Acceso_Datos(); Acceso_Dato idAcceso =
             * accesosDato._contiene_acceso_datos.lastElement(); BD_Estadisticas
             * estadisticas = new BD_Estadisticas(); Estadistica idEstadistica =
             * estadisticas._contiene_estadisticas.lastElement();
             */

            artista.setEmail(aEmail);
            artista.setContrasena(aContrasena);
            artista.setNick(aNick);
            artista.setAcceso_Dato(accesoD);
            artista.setEstadistica(estadistica);
            artista.setFoto(aImagen);
            ArtistaDAO.save(artista);
            t.commit();

        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void editarArtista(String aEmail, String aContrasena, String aNick, String aImagen, int aIdArtista, int aIdEstilo)
            throws PersistentException {
    	PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            Artista artista = ArtistaDAO.loadArtistaByORMID(aIdArtista);
            /*
             * BD_Usuarios_Registrados usuarios = new BD_Usuarios_Registrados(); int id =
             * usuarios._contiene_usuario_registrados.size() + 1; usuario.setId(id);
             */
            Acceso_Dato accesoD = new Acceso_Dato();
            accesoD.setContrasena(aContrasena);
            accesoD.setEmail(aEmail);
            accesoD.setNumIntentos(0);
            accesoD.setTipoUsuario("artista");
            accesoD.setFechaBloqueo("");
            Acceso_DatoDAO.save(accesoD);
            Estadistica estadistica = new Estadistica();
            estadistica.setTiempoAnual(0);
            double[] tiempoSemana = new double[7];
            estadistica.setTiempoSemana(tiempoSemana);
            // estadistica.setUsuario(usuario);
            EstadisticaDAO.save(estadistica);

            Estilo estilo = EstiloDAO.getEstiloByORMID(aIdEstilo);
            artista.estilos.add(estilo);
            /*
             * BD_Acceso_Datos accesosDato = new BD_Acceso_Datos(); Acceso_Dato idAcceso =
             * accesosDato._contiene_acceso_datos.lastElement(); BD_Estadisticas
             * estadisticas = new BD_Estadisticas(); Estadistica idEstadistica =
             * estadisticas._contiene_estadisticas.lastElement();
             */

            artista.setEmail(aEmail);
            artista.setContrasena(aContrasena);
            artista.setNick(aNick);
            artista.setAcceso_Dato(accesoD);
            artista.setEstadistica(estadistica);
            artista.setFoto(aImagen);
            ArtistaDAO.save(artista);
            t.commit();

        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void editarFoto(String aFoto, int aIdArtista) throws PersistentException {
        throw new UnsupportedOperationException();
    }

    public boolean eliminarArtista(int aIdArtista) throws PersistentException {
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

        boolean correcto = false;
        try {

            Artista artista = ArtistaDAO.loadArtistaByORMID(aIdArtista);

            orm.bbdd.Cancion[] lCancionss = artista.cancions.toArray();
            for (int i = 0; i < lCancionss.length; i++) {
                lCancionss[i].artistas.remove(artista);
            }
            orm.bbdd.Estadistica[] lEstadisticass = artista.estadisticas.toArray();
            for (int i = 0; i < lEstadisticass.length; i++) {
                lEstadisticass[i].artistas.remove(artista);
            }
            BD_Eventos bdeventos = new BD_Eventos();
            orm.bbdd.Evento[] lEventoss = artista.eventos.toArray();
            for (int i = 0; i < lEventoss.length; i++) {
                bdeventos.eliminarEvento(lEventoss[i].getIdEvento());
            }
            orm.bbdd.Estilo[] lEstiloss = artista.estilos.toArray();
            for (int i = 0; i < lEstiloss.length; i++) {
                lEstiloss[i].artistas.remove(artista);
            }
            BD_Albumes bdalbumes = new BD_Albumes();
            orm.bbdd.Album[] lAlbumss = artista.albums.toArray();
            for (int i = 0; i < lAlbumss.length; i++) {
                bdalbumes.eliminarAlbum(lAlbumss[i].getIdAlbum());
            }
            BD_Listas_de_reproduccion bdlistas = new BD_Listas_de_reproduccion();
            orm.bbdd.Lista_de_reproduccion[] lListas_de_reproduccion_propiass = artista.listas_de_reproduccion_propias
                    .toArray();
            for (int i = 0; i < lListas_de_reproduccion_propiass.length; i++) {
                bdlistas.eliminarLista(lListas_de_reproduccion_propiass[i].getIdLista());
            }
            orm.bbdd.Actor_Comun[] lSeguidos = artista.seguido.toArray();
            for (int i = 0; i < lSeguidos.length; i++) {
                lSeguidos[i].seguidor.remove(artista);
            }
            orm.bbdd.Cancion[] lCancion_favoritas = artista.cancion_favorita.toArray();
            for (int i = 0; i < lCancion_favoritas.length; i++) {
                lCancion_favoritas[i].usuario.remove(artista);
            }
            orm.bbdd.Lista_de_reproduccion[] lListas_de_reproduccion_seguidass = artista.listas_de_reproduccion_seguidas
                    .toArray();
            for (int i = 0; i < lListas_de_reproduccion_seguidass.length; i++) {
                lListas_de_reproduccion_seguidass[i].seguidor.remove(artista);
            }
            orm.bbdd.Evento[] lNotificacioness = artista.notificaciones.toArray();
            for (int i = 0; i < lNotificacioness.length; i++) {
                lNotificacioness[i].usuario.remove(artista);
            }
            orm.bbdd.Actor_Comun[] lSeguidors = artista.seguidor.toArray();
            for (int i = 0; i < lSeguidors.length; i++) {
                lSeguidors[i].seguido.remove(artista);
            }
            orm.bbdd.Cancion[] lCanciones_reproducidass = artista.canciones_reproducidas.toArray();
            for (int i = 0; i < lCanciones_reproducidass.length; i++) {
                lCanciones_reproducidass[i]._usuario.remove(artista);
            }
            correcto = ArtistaDAO.delete(artista);

            BD_Acceso_Datos bdacceso = new BD_Acceso_Datos();
            if (artista.getAcceso_Dato() != null) {
                bdacceso.eliminarAcceso(artista.getAcceso_Dato().getId());
            }
            BD_Estadisticas bdestadisticas = new BD_Estadisticas();
            if (artista.getEstadistica() != null) {
                bdestadisticas.eliminarEstadistica(artista.getEstadistica().getId());
            }

            t.commit();

        } catch (PersistentException e) {
            correcto = true;
            e.printStackTrace();
        } catch (Exception e) {
            correcto = false;
            t.rollback();
            e.printStackTrace();
        }
        return correcto;
    }

    public void darDeBaja() {
        throw new UnsupportedOperationException();
    }

    public void editarE_mail(String aEmail, int aIdArtista) throws PersistentException {
        throw new UnsupportedOperationException();
    }

    public Artista cargarArtista(int aIdArtista) {
        throw new UnsupportedOperationException();
    }

    public void seguir_dejarDeSeguirArtista(int aId, int aIdSeguido) throws PersistentException {
        throw new UnsupportedOperationException();
    }

    public void altaAlbum(String aNombreArtista) {
        throw new UnsupportedOperationException();
    }

    public void editarAlbum(String aNombreArtista) {
        throw new UnsupportedOperationException();
    }

    public Artista[] busquedaArtistas(String paramBusqueda) throws PersistentException {
        Artista[] artistas = new Artista[0];

        ArtistaCriteria criteria = new ArtistaCriteria();
        String criterio = ("%" + paramBusqueda.trim().toLowerCase() + "%");
        criteria.nick.like(criterio);
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            artistas = ArtistaDAO.listArtistaByCriteria(criteria);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        return artistas;
    }
}