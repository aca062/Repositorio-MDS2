package bbdd;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Actor_Comun;
import orm.bbdd.Actor_ComunDAO;
import orm.bbdd.Album;
import orm.bbdd.AlbumCriteria;
import orm.bbdd.AlbumDAO;
import orm.bbdd.Artista;
import orm.bbdd.ArtistaCriteria;
import orm.bbdd.ArtistaDAO;
// import BBDD.Cancion;
import orm.bbdd.Cancion;
import orm.bbdd.CancionCriteria;
import orm.bbdd.CancionDAO;
import orm.bbdd.Estilo;
import orm.bbdd.EstiloDAO;
import orm.bbdd.MDS2PersistentManager;

public class BD_Canciones {
    public BDPrincipal _bd_prin_canciones;
    public Vector<Cancion> _contiene_canciones = new Vector<Cancion>();

    public void altaCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes,
            String aArcMultimedia, int aIdEstilos, String aTituloAlbum) throws PersistentException {

        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            Set<String> artistas = new TreeSet<String>();
            for (String artista : artistas) {
                artistas.add(artista);
            }
            Cancion cancion = CancionDAO.createCancion();
            cancion.setTitulo(aTitulo);
            cancion.setProductores(aProductores);
            cancion.setInterpretes(aInterpretes);
            cancion.setCompositores(aCompositores);
            cancion.setArchivoMultimedia(aArcMultimedia);
            cancion.setNumReproducciones(0);
            Estilo estilo = EstiloDAO.getEstiloByORMID(aIdEstilos);
            cancion.setEstilo(estilo);
            if (!aTituloAlbum.equals("") || aTituloAlbum != null) {
                AlbumCriteria albC = new AlbumCriteria();
                albC.titulo.like(aTituloAlbum);
                Album alb = AlbumDAO.loadAlbumByCriteria(albC);
                cancion.album.add(alb);
            }
            for (String artista : aInterpretes) {
                ArtistaCriteria artC = new ArtistaCriteria();
                artC.nick.like(artista.trim());
                Artista art = ArtistaDAO.loadArtistaByCriteria(artC);
                cancion.artistas.add(art);
            }
            CancionDAO.save(cancion);
            t.commit();

        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public int editarCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes,
            String aArcMultimedia, int aIdCancion) throws PersistentException {
        throw new UnsupportedOperationException();
    }

    public void marcarFavorito(Cancion cancion, Actor_Comun usuario) throws PersistentException {
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            cancion.usuario.add(usuario);
            usuario.cancion_favorita.add(cancion);
            CancionDAO.save(cancion);
            Actor_ComunDAO.save(usuario);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        MDS2PersistentManager.instance().disposePersistentManager();
    }

    public boolean eliminarCancion(int aIdCancion) throws PersistentException {
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        boolean correcto = false;
        try {
            Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);
            correcto = CancionDAO.deleteAndDissociate(cancion);
            t.commit();
        } catch (Exception e) {
            correcto = false;
            t.rollback();
        }
        return correcto;
    }

    public void desmarcarFavorita(Cancion cancion, Actor_Comun usuario) throws PersistentException {
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            cancion.usuario.remove(usuario);
            usuario.cancion_favorita.remove(cancion);
            CancionDAO.save(cancion);
            Actor_ComunDAO.save(usuario);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        MDS2PersistentManager.instance().disposePersistentManager();
    }

    public Cancion cargarCancion(int aIdCancion) throws PersistentException {
        throw new UnsupportedOperationException();
    }

    public Cancion[] busquedaCancion(String aParametrosBusqueda) throws PersistentException {
        Cancion[] canciones = new Cancion[0];

        CancionCriteria criteria = new CancionCriteria();
        String criterio = ("%" + aParametrosBusqueda.trim().toLowerCase() + "%");
        criteria.titulo.like(criterio);
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            canciones = CancionDAO.listCancionByCriteria(criteria);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        return canciones;
    }

    public Cancion[] cargarUltimosExitos(int aNumCanciones) throws PersistentException {
        Cancion[] cancionesRandom = new Cancion[aNumCanciones];

        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            Cancion[] canciones = CancionDAO.listCancionByQuery(null, null);

            Random rdm = new Random();
            int x;

            for (int i = 0; i < aNumCanciones; i++) {
                x = rdm.nextInt(canciones.length);
                cancionesRandom[i] = canciones[x];
            }

            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        return cancionesRandom;
    }

    public Cancion[] cargarCancionRecomendada(int aIdUsuario) throws PersistentException {
        Cancion[] canciones = new Cancion[3];

        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            canciones = CancionDAO.listCancionByQuery("true=true", "IdCancion DESC");
            for (int i = 0; i < 3; i++) {
                canciones[i] = canciones[i];
            }
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        return canciones;
    }

    public Cancion[] cargarUltimasCancionesReproducidas(int aIdUsuario) throws PersistentException {
        Cancion[] canciones = new Cancion[0];

        /*
         * PersistentTransaction t =
         * MDS2PersistentManager.instance().getSession().beginTransaction(); try {
         * Actor_Comun usuario = Actor_ComunDAO.getActor_ComunByORMID(aIdUsuario);
         *
         * }
         *
         * t.commit(); } catch(Exception e) { t.rollback(); }
         */
        return canciones;
    }

    public void editarNumCancionesCibernauta(int aNumCanciones) throws PersistentException {
        throw new UnsupportedOperationException();
    }

    public void editarCancionesMostradas(interfaz.Cancion[] aCanciones) throws PersistentException {
        throw new UnsupportedOperationException();
    }

    public void altaAlbum(interfaz.Cancion[] aCanciones) throws PersistentException {
        throw new UnsupportedOperationException();
    }

    public void editarAlbum(interfaz.Cancion[] aCanciones) throws PersistentException {
        throw new UnsupportedOperationException();
    }

    public Cancion[] cargarCancionesFavoritas(int aIdUsuario) {
        Cancion[] cancionesFav;
        try {
            Actor_Comun usuario = Actor_ComunDAO.getActor_ComunByORMID(aIdUsuario);
            cancionesFav = new Cancion[usuario.cancion_favorita.size()];
            int j = 0;
            for (Cancion cancion : usuario.cancion_favorita.toArray()) {
                cancionesFav[j] = cancion;
                j++;
            }
            return cancionesFav;
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}