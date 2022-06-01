/**
 * Licensee: Antonio Jesús Cano Andreu(University of Almeria)
 * License Type: Academic
 */
package orm.ormsamples;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
public class DeleteMDS2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.bbdd.MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.bbdd.Album lormbbddAlbum = orm.bbdd.AlbumDAO.loadAlbumByQuery(null, null);
			// Delete the persistent object
			orm.bbdd.AlbumDAO.delete(lormbbddAlbum);
			orm.bbdd.Acceso_Dato lormbbddAcceso_Dato = orm.bbdd.Acceso_DatoDAO.loadAcceso_DatoByQuery(null, null);
			// Delete the persistent object
			orm.bbdd.Acceso_DatoDAO.delete(lormbbddAcceso_Dato);
			orm.bbdd.Estadistica lormbbddEstadistica = orm.bbdd.EstadisticaDAO.loadEstadisticaByQuery(null, null);
			// Delete the persistent object
			orm.bbdd.EstadisticaDAO.delete(lormbbddEstadistica);
			orm.bbdd.Estilo lormbbddEstilo = orm.bbdd.EstiloDAO.loadEstiloByQuery(null, null);
			// Delete the persistent object
			orm.bbdd.EstiloDAO.delete(lormbbddEstilo);
			orm.bbdd.Evento lormbbddEvento = orm.bbdd.EventoDAO.loadEventoByQuery(null, null);
			// Delete the persistent object
			orm.bbdd.EventoDAO.delete(lormbbddEvento);
			orm.bbdd.Lista_de_reproduccion lormbbddLista_de_reproduccion = orm.bbdd.Lista_de_reproduccionDAO.loadLista_de_reproduccionByQuery(null, null);
			// Delete the persistent object
			orm.bbdd.Lista_de_reproduccionDAO.delete(lormbbddLista_de_reproduccion);
			orm.bbdd.Cancion lormbbddCancion = orm.bbdd.CancionDAO.loadCancionByQuery(null, null);
			// Delete the persistent object
			orm.bbdd.CancionDAO.delete(lormbbddCancion);
			orm.bbdd.Actor_Comun lormbbddActor_Comun = orm.bbdd.Actor_ComunDAO.loadActor_ComunByQuery(null, null);
			// Delete the persistent object
			orm.bbdd.Actor_ComunDAO.delete(lormbbddActor_Comun);
			orm.bbdd.Administrador lormbbddAdministrador = orm.bbdd.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			orm.bbdd.AdministradorDAO.delete(lormbbddAdministrador);
			orm.bbdd.Artista lormbbddArtista = orm.bbdd.ArtistaDAO.loadArtistaByQuery(null, null);
			// Delete the persistent object
			orm.bbdd.ArtistaDAO.delete(lormbbddArtista);
			orm.bbdd.Usuario_Registrado lormbbddUsuario_Registrado = orm.bbdd.Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery(null, null);
			// Delete the persistent object
			orm.bbdd.Usuario_RegistradoDAO.delete(lormbbddUsuario_Registrado);
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
				orm.bbdd.MDS2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
