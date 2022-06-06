package bbdd;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

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

    public void marcarFavorito(int aIdCancion, int aIdUsuario) throws PersistentException {
        throw new UnsupportedOperationException();
    }

    public void eliminarCancion(int aIdCancion) throws PersistentException {
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);
            CancionDAO.delete(cancion);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
    }

    public void desmarcarFavorita(int aIdCancion, int aIdUsuario) throws PersistentException {
        throw new UnsupportedOperationException();
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
        Cancion[] canciones = new Cancion[0];

        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            canciones = CancionDAO.listCancionByQuery(null, null);
            // TODO Decidir forma de elegir canciones recomendadas
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
}