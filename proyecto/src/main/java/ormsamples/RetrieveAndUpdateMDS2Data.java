/**
 * Licensee: Antonio Jesús Cano Andreu(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.bbdd.MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.bbdd.Album lormbbddAlbum = orm.bbdd.AlbumDAO.loadAlbumByQuery(null, null);
			// Update the properties of the persistent object
			orm.bbdd.AlbumDAO.save(lormbbddAlbum);
			orm.bbdd.Acceso_Dato lormbbddAcceso_Dato = orm.bbdd.Acceso_DatoDAO.loadAcceso_DatoByQuery(null, null);
			// Update the properties of the persistent object
			orm.bbdd.Acceso_DatoDAO.save(lormbbddAcceso_Dato);
			orm.bbdd.Estadistica lormbbddEstadistica = orm.bbdd.EstadisticaDAO.loadEstadisticaByQuery(null, null);
			// Update the properties of the persistent object
			orm.bbdd.EstadisticaDAO.save(lormbbddEstadistica);
			orm.bbdd.Estilo lormbbddEstilo = orm.bbdd.EstiloDAO.loadEstiloByQuery(null, null);
			// Update the properties of the persistent object
			orm.bbdd.EstiloDAO.save(lormbbddEstilo);
			orm.bbdd.Evento lormbbddEvento = orm.bbdd.EventoDAO.loadEventoByQuery(null, null);
			// Update the properties of the persistent object
			orm.bbdd.EventoDAO.save(lormbbddEvento);
			orm.bbdd.Lista_de_reproduccion lormbbddLista_de_reproduccion = orm.bbdd.Lista_de_reproduccionDAO.loadLista_de_reproduccionByQuery(null, null);
			// Update the properties of the persistent object
			orm.bbdd.Lista_de_reproduccionDAO.save(lormbbddLista_de_reproduccion);
			orm.bbdd.Cancion lormbbddCancion = orm.bbdd.CancionDAO.loadCancionByQuery(null, null);
			// Update the properties of the persistent object
			orm.bbdd.CancionDAO.save(lormbbddCancion);
			orm.bbdd.Actor_Comun lormbbddActor_Comun = orm.bbdd.Actor_ComunDAO.loadActor_ComunByQuery(null, null);
			// Update the properties of the persistent object
			orm.bbdd.Actor_ComunDAO.save(lormbbddActor_Comun);
			orm.bbdd.Administrador lormbbddAdministrador = orm.bbdd.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			orm.bbdd.AdministradorDAO.save(lormbbddAdministrador);
			orm.bbdd.Artista lormbbddArtista = orm.bbdd.ArtistaDAO.loadArtistaByQuery(null, null);
			// Update the properties of the persistent object
			orm.bbdd.ArtistaDAO.save(lormbbddArtista);
			orm.bbdd.Usuario_Registrado lormbbddUsuario_Registrado = orm.bbdd.Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery(null, null);
			// Update the properties of the persistent object
			orm.bbdd.Usuario_RegistradoDAO.save(lormbbddUsuario_Registrado);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Album by AlbumCriteria");
		orm.bbdd.AlbumCriteria lormbbddAlbumCriteria = new orm.bbdd.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormbbddAlbumCriteria.idAlbum.eq();
		System.out.println(lormbbddAlbumCriteria.uniqueAlbum());
		
		System.out.println("Retrieving Acceso_Dato by Acceso_DatoCriteria");
		orm.bbdd.Acceso_DatoCriteria lormbbddAcceso_DatoCriteria = new orm.bbdd.Acceso_DatoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormbbddAcceso_DatoCriteria.id.eq();
		System.out.println(lormbbddAcceso_DatoCriteria.uniqueAcceso_Dato());
		
		System.out.println("Retrieving Estadistica by EstadisticaCriteria");
		orm.bbdd.EstadisticaCriteria lormbbddEstadisticaCriteria = new orm.bbdd.EstadisticaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormbbddEstadisticaCriteria.id.eq();
		System.out.println(lormbbddEstadisticaCriteria.uniqueEstadistica());
		
		System.out.println("Retrieving Estilo by EstiloCriteria");
		orm.bbdd.EstiloCriteria lormbbddEstiloCriteria = new orm.bbdd.EstiloCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormbbddEstiloCriteria.idEstilo.eq();
		System.out.println(lormbbddEstiloCriteria.uniqueEstilo());
		
		System.out.println("Retrieving Evento by EventoCriteria");
		orm.bbdd.EventoCriteria lormbbddEventoCriteria = new orm.bbdd.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormbbddEventoCriteria.idEvento.eq();
		System.out.println(lormbbddEventoCriteria.uniqueEvento());
		
		System.out.println("Retrieving Lista_de_reproduccion by Lista_de_reproduccionCriteria");
		orm.bbdd.Lista_de_reproduccionCriteria lormbbddLista_de_reproduccionCriteria = new orm.bbdd.Lista_de_reproduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormbbddLista_de_reproduccionCriteria.idLista.eq();
		System.out.println(lormbbddLista_de_reproduccionCriteria.uniqueLista_de_reproduccion());
		
		System.out.println("Retrieving Cancion by CancionCriteria");
		orm.bbdd.CancionCriteria lormbbddCancionCriteria = new orm.bbdd.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormbbddCancionCriteria.idCancion.eq();
		System.out.println(lormbbddCancionCriteria.uniqueCancion());
		
		System.out.println("Retrieving Actor_Comun by Actor_ComunCriteria");
		orm.bbdd.Actor_ComunCriteria lormbbddActor_ComunCriteria = new orm.bbdd.Actor_ComunCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormbbddActor_ComunCriteria.id.eq();
		System.out.println(lormbbddActor_ComunCriteria.uniqueActor_Comun());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		orm.bbdd.AdministradorCriteria lormbbddAdministradorCriteria = new orm.bbdd.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormbbddAdministradorCriteria.id.eq();
		System.out.println(lormbbddAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Artista by ArtistaCriteria");
		orm.bbdd.ArtistaCriteria lormbbddArtistaCriteria = new orm.bbdd.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormbbddArtistaCriteria.id.eq();
		System.out.println(lormbbddArtistaCriteria.uniqueArtista());
		
		System.out.println("Retrieving Usuario_Registrado by Usuario_RegistradoCriteria");
		orm.bbdd.Usuario_RegistradoCriteria lormbbddUsuario_RegistradoCriteria = new orm.bbdd.Usuario_RegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormbbddUsuario_RegistradoCriteria.id.eq();
		System.out.println(lormbbddUsuario_RegistradoCriteria.uniqueUsuario_Registrado());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS2Data retrieveAndUpdateMDS2Data = new RetrieveAndUpdateMDS2Data();
			try {
				retrieveAndUpdateMDS2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS2Data.retrieveByCriteria();
			}
			finally {
				orm.bbdd.MDS2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
