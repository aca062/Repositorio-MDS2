package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Actor_Comun;
import orm.bbdd.Actor_ComunDAO;
import orm.bbdd.Album;
import orm.bbdd.AlbumDAO;
import orm.bbdd.Artista;
import orm.bbdd.ArtistaDAO;
import orm.bbdd.Lista_de_reproduccion;
import orm.bbdd.Lista_de_reproduccionDAO;
import orm.bbdd.MDS2PersistentManager;

public class BD_Listas_de_reproduccion {
	public BDPrincipal _bd_prin_listas_de_reproduccion;
	public Vector<Lista_de_reproduccion> _contiene_listas_de_reproduccion = new Vector<Lista_de_reproduccion>();

	public void editarLista(String aNombre, int aIdLista) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void anadir(String aNombre) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void eliminarLista(int aIdListas) throws PersistentException{
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(aIdListas);
			Lista_de_reproduccionDAO.delete(lista);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void crearLista(String aNombre) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion cargarLista(int aIdLista) {
		throw new UnsupportedOperationException();
	}
	
	public Lista_de_reproduccion[] cargarListaRecomendada(int aIdUsuario) throws PersistentException{
		Lista_de_reproduccion[] listas = new Lista_de_reproduccion[0];
		
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			listas = Lista_de_reproduccionDAO.listLista_de_reproduccionByQuery(null, null);
			//TODO Decidir forma de elegir albumes recomendados 
			t.commit();
		} catch(Exception e) {
			t.rollback();
		}
		return listas;
	}
	
	public Lista_de_reproduccion[] cargarCancionesFavoritas(int aIdUsuario) throws PersistentException{
		Lista_de_reproduccion[] lista = null;
		
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			 
			t.commit();
		} catch(Exception e) {
			t.rollback();
		}
		return lista;
	}
	
}