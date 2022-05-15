/**
 * Licensee: Antonio Jesús Cano Andreu(University of Almeria)
 * License Type: Academic
 */
package orm.ormsamples;

import org.orm.*;

import orm.bbdd.*;

public class DeleteMDS2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Album bBDDAlbum = AlbumDAO.loadAlbumByQuery(null, null);
			// Delete the persistent object
			AlbumDAO.delete(bBDDAlbum);
			Acceso_Dato bBDDAcceso_Dato = Acceso_DatoDAO.loadAcceso_DatoByQuery(null, null);
			// Delete the persistent object
			Acceso_DatoDAO.delete(bBDDAcceso_Dato);
			Estadistica bBDDEstadistica = EstadisticaDAO.loadEstadisticaByQuery(null, null);
			// Delete the persistent object
			EstadisticaDAO.delete(bBDDEstadistica);
			Estilo bBDDEstilo = EstiloDAO.loadEstiloByQuery(null, null);
			// Delete the persistent object
			EstiloDAO.delete(bBDDEstilo);
			Evento bBDDEvento = EventoDAO.loadEventoByQuery(null, null);
			// Delete the persistent object
			EventoDAO.delete(bBDDEvento);
			Lista_de_reproduccion bBDDLista_de_reproduccion = Lista_de_reproduccionDAO.loadLista_de_reproduccionByQuery(null, null);
			// Delete the persistent object
			Lista_de_reproduccionDAO.delete(bBDDLista_de_reproduccion);
			Cancion bBDDCancion = CancionDAO.loadCancionByQuery(null, null);
			// Delete the persistent object
			CancionDAO.delete(bBDDCancion);
			Actor_Comun bBDDActor_Comun = Actor_ComunDAO.loadActor_ComunByQuery(null, null);
			// Delete the persistent object
			Actor_ComunDAO.delete(bBDDActor_Comun);
			Administrador bBDDAdministrador = AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			AdministradorDAO.delete(bBDDAdministrador);
			Artista bBDDArtista = ArtistaDAO.loadArtistaByQuery(null, null);
			// Delete the persistent object
			ArtistaDAO.delete(bBDDArtista);
			Usuario_Registrado bBDDUsuario_Registrado = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery(null, null);
			// Delete the persistent object
			Usuario_RegistradoDAO.delete(bBDDUsuario_Registrado);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMDS2Data deleteMDS2Data = new DeleteMDS2Data();
			try {
				deleteMDS2Data.deleteTestData();
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
