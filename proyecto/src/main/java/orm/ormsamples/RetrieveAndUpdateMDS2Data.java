/**
 * Licensee: Antonio Jesús Cano Andreu(University of Almeria)
 * License Type: Academic
 */
package orm.ormsamples;
import orm.bbdd.*;

import org.orm.*;
public class RetrieveAndUpdateMDS2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Album bBDDAlbum = AlbumDAO.loadAlbumByQuery(null, null);
			// Update the properties of the persistent object
			AlbumDAO.save(bBDDAlbum);
			Acceso_Dato bBDDAcceso_Dato = Acceso_DatoDAO.loadAcceso_DatoByQuery(null, null);
			// Update the properties of the persistent object
			Acceso_DatoDAO.save(bBDDAcceso_Dato);
			Estadistica bBDDEstadistica = EstadisticaDAO.loadEstadisticaByQuery(null, null);
			// Update the properties of the persistent object
			EstadisticaDAO.save(bBDDEstadistica);
			Estilo bBDDEstilo = EstiloDAO.loadEstiloByQuery(null, null);
			// Update the properties of the persistent object
			EstiloDAO.save(bBDDEstilo);
			Evento bBDDEvento = EventoDAO.loadEventoByQuery(null, null);
			// Update the properties of the persistent object
			EventoDAO.save(bBDDEvento);
			Lista_de_reproduccion bBDDLista_de_reproduccion = Lista_de_reproduccionDAO.loadLista_de_reproduccionByQuery(null, null);
			// Update the properties of the persistent object
			Lista_de_reproduccionDAO.save(bBDDLista_de_reproduccion);
			Cancion bBDDCancion = CancionDAO.loadCancionByQuery(null, null);
			// Update the properties of the persistent object
			CancionDAO.save(bBDDCancion);
			Actor_Comun bBDDActor_Comun = Actor_ComunDAO.loadActor_ComunByQuery(null, null);
			// Update the properties of the persistent object
			Actor_ComunDAO.save(bBDDActor_Comun);
			Administrador bBDDAdministrador = AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			AdministradorDAO.save(bBDDAdministrador);
			Artista bBDDArtista = ArtistaDAO.loadArtistaByQuery(null, null);
			// Update the properties of the persistent object
			ArtistaDAO.save(bBDDArtista);
			Usuario_Registrado bBDDUsuario_Registrado = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery(null, null);
			// Update the properties of the persistent object
			Usuario_RegistradoDAO.save(bBDDUsuario_Registrado);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Album by AlbumCriteria");
		AlbumCriteria bBDDAlbumCriteria = new AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bBDDAlbumCriteria.idAlbum.eq();
		System.out.println(bBDDAlbumCriteria.uniqueAlbum());
		
		System.out.println("Retrieving Acceso_Dato by Acceso_DatoCriteria");
		Acceso_DatoCriteria bBDDAcceso_DatoCriteria = new Acceso_DatoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bBDDAcceso_DatoCriteria.id.eq();
		System.out.println(bBDDAcceso_DatoCriteria.uniqueAcceso_Dato());
		
		System.out.println("Retrieving Estadistica by EstadisticaCriteria");
		EstadisticaCriteria bBDDEstadisticaCriteria = new EstadisticaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bBDDEstadisticaCriteria.id.eq();
		System.out.println(bBDDEstadisticaCriteria.uniqueEstadistica());
		
		System.out.println("Retrieving Estilo by EstiloCriteria");
		EstiloCriteria bBDDEstiloCriteria = new EstiloCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bBDDEstiloCriteria.idEstilo.eq();
		System.out.println(bBDDEstiloCriteria.uniqueEstilo());
		
		System.out.println("Retrieving Evento by EventoCriteria");
		EventoCriteria bBDDEventoCriteria = new EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bBDDEventoCriteria.idEvento.eq();
		System.out.println(bBDDEventoCriteria.uniqueEvento());
		
		System.out.println("Retrieving Lista_de_reproduccion by Lista_de_reproduccionCriteria");
		Lista_de_reproduccionCriteria bBDDLista_de_reproduccionCriteria = new Lista_de_reproduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bBDDLista_de_reproduccionCriteria.idLista.eq();
		System.out.println(bBDDLista_de_reproduccionCriteria.uniqueLista_de_reproduccion());
		
		System.out.println("Retrieving Cancion by CancionCriteria");
		CancionCriteria bBDDCancionCriteria = new CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bBDDCancionCriteria.idCancion.eq();
		System.out.println(bBDDCancionCriteria.uniqueCancion());
		
		System.out.println("Retrieving Actor_Comun by Actor_ComunCriteria");
		Actor_ComunCriteria bBDDActor_ComunCriteria = new Actor_ComunCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bBDDActor_ComunCriteria.id.eq();
		System.out.println(bBDDActor_ComunCriteria.uniqueActor_Comun());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		AdministradorCriteria bBDDAdministradorCriteria = new AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bBDDAdministradorCriteria.id.eq();
		System.out.println(bBDDAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Artista by ArtistaCriteria");
		ArtistaCriteria bBDDArtistaCriteria = new ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bBDDArtistaCriteria.id.eq();
		System.out.println(bBDDArtistaCriteria.uniqueArtista());
		
		System.out.println("Retrieving Usuario_Registrado by Usuario_RegistradoCriteria");
		Usuario_RegistradoCriteria bBDDUsuario_RegistradoCriteria = new Usuario_RegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bBDDUsuario_RegistradoCriteria.id.eq();
		System.out.println(bBDDUsuario_RegistradoCriteria.uniqueUsuario_Registrado());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS2Data retrieveAndUpdateMDS2Data = new RetrieveAndUpdateMDS2Data();
			try {
				retrieveAndUpdateMDS2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS2Data.retrieveByCriteria();
			}
			finally {
				MDS2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
