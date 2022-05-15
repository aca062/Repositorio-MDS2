/**
 * Licensee: Antonio Jesús Cano Andreu(University of Almeria)
 * License Type: Academic
 */
package orm.ormsamples;

import org.orm.*;

import orm.bbdd.*;

public class CreateMDS2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Album bBDDAlbum = AlbumDAO.createAlbum();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estadisticas, canciones
			AlbumDAO.save(bBDDAlbum);
			Acceso_Dato bBDDAcceso_Dato = Acceso_DatoDAO.createAcceso_Dato();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : numIntentos, id, email
			Acceso_DatoDAO.save(bBDDAcceso_Dato);
			Estadistica bBDDEstadistica = EstadisticaDAO.createEstadistica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : albums, lista_de_reproduccion, cancions, artistas, usuario, tiempoSemana, tiempoAnual
			EstadisticaDAO.save(bBDDEstadistica);
			Estilo bBDDEstilo = EstiloDAO.createEstilo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : artistas, canciones
			EstiloDAO.save(bBDDEstilo);
			Evento bBDDEvento = EventoDAO.createEvento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario
			EventoDAO.save(bBDDEvento);
			Lista_de_reproduccion bBDDLista_de_reproduccion = Lista_de_reproduccionDAO.createLista_de_reproduccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estadisticas, canciones, seguidor
			Lista_de_reproduccionDAO.save(bBDDLista_de_reproduccion);
			Cancion bBDDCancion = CancionDAO.createCancion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : artistas, album, listas_de_reproduccion, estadisticas, usuario, numReproducciones, estilo
			CancionDAO.save(bBDDCancion);
			Actor_Comun bBDDActor_Comun = Actor_ComunDAO.createActor_Comun();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : seguidor, notificaciones, listas_de_reproduccion_seguidas, cancion_favorita, seguido, estadistica, email
			Actor_ComunDAO.save(bBDDActor_Comun);
			Administrador bBDDAdministrador = AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			AdministradorDAO.save(bBDDAdministrador);
			Artista bBDDArtista = ArtistaDAO.createArtista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estilos, estadisticas, cancions
			ArtistaDAO.save(bBDDArtista);
			Usuario_Registrado bBDDUsuario_Registrado = Usuario_RegistradoDAO.createUsuario_Registrado();
			// Initialize the properties of the persistent object here
			Usuario_RegistradoDAO.save(bBDDUsuario_Registrado);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS2Data createMDS2Data = new CreateMDS2Data();
			try {
				createMDS2Data.createTestData();
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
