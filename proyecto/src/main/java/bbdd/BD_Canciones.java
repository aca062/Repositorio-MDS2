package bbdd;

import java.util.Random;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

// import BBDD.Cancion;
import orm.bbdd.Cancion;
import orm.bbdd.CancionDAO;
import orm.bbdd.MDS2PersistentManager;
import orm.bbdd.Usuario_Registrado;
import orm.bbdd.Usuario_RegistradoDAO;

public class BD_Canciones {
	public BDPrincipal _bd_prin_canciones;
	public Vector<Cancion> _contiene_canciones = new Vector<Cancion>();

	public void altaCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia, int aIdCancion) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void editarCancion(String aTitulo, String[] aCompositores, String[] aProductores, String[] aInterpretes, String aArcMultimedia, int aIdCancion) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void marcarFavorito(int aIdCancion, int aIdUsuario) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void eliminarCancion(int aIdCancion) throws PersistentException{
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);
			CancionDAO.delete(cancion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void desmarcarFavorita(int aIdCancion, int aIdUsuario) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public Cancion cargarCancion(int aIdCancion) throws PersistentException{
		throw new UnsupportedOperationException();
	}
	
	public Cancion[] cargarUltimosExitos(int aNumCanciones) throws PersistentException{
		Cancion[] cancionesRandom = new Cancion[aNumCanciones];
		
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Cancion[] canciones = CancionDAO.listCancionByQuery(null, null);
			
			Random rdm = new Random();
			int x;
			
			for(int i =0;i<aNumCanciones;i++) {
				x = rdm.nextInt(canciones.length);
				cancionesRandom[i] = canciones[x];
			}
			
			t.commit();
		} catch(Exception e) {
			t.rollback();
		}
		return cancionesRandom;
	}
	
	public Cancion[] cargarCancionRecomendada(int aIdUsuario) throws PersistentException{
		Cancion[] canciones = new Cancion[0];
		
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			canciones = CancionDAO.listCancionByQuery(null, null);
			//TODO Decidir forma de elegir canciones recomendadas 
			t.commit();
		} catch(Exception e) {
			t.rollback();
		}
		return canciones;
	}

	public void editarNumCancionesCibernauta(int aNumCanciones) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void editarCancionesMostradas(interfaz.Cancion[] aCanciones) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void altaAlbum(interfaz.Cancion[] aCanciones) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void editarAlbum(interfaz.Cancion[] aCanciones) throws PersistentException{
		throw new UnsupportedOperationException();
	}
}