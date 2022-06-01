/**
 * Licensee: Antonio Jesús Cano Andreu(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.bbdd.MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.bbdd.Album lormbbddAlbum = orm.bbdd.AlbumDAO.createAlbum();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estadisticas, canciones, artista
			orm.bbdd.AlbumDAO.save(lormbbddAlbum);
			orm.bbdd.Acceso_Dato lormbbddAcceso_Dato = orm.bbdd.Acceso_DatoDAO.createAcceso_Dato();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario, numIntentos
			orm.bbdd.Acceso_DatoDAO.save(lormbbddAcceso_Dato);
			orm.bbdd.Estadistica lormbbddEstadistica = orm.bbdd.EstadisticaDAO.createEstadistica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : albums, lista_de_reproduccion, cancions, artistas, usuario, tiempoSemana, tiempoAnual
			orm.bbdd.EstadisticaDAO.save(lormbbddEstadistica);
			orm.bbdd.Estilo lormbbddEstilo = orm.bbdd.EstiloDAO.createEstilo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : artistas, canciones
			orm.bbdd.EstiloDAO.save(lormbbddEstilo);
			orm.bbdd.Evento lormbbddEvento = orm.bbdd.EventoDAO.createEvento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario, artista
			orm.bbdd.EventoDAO.save(lormbbddEvento);
			orm.bbdd.Lista_de_reproduccion lormbbddLista_de_reproduccion = orm.bbdd.Lista_de_reproduccionDAO.createLista_de_reproduccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : creador, estadisticas, canciones, seguidor
			orm.bbdd.Lista_de_reproduccionDAO.save(lormbbddLista_de_reproduccion);
			orm.bbdd.Cancion lormbbddCancion = orm.bbdd.CancionDAO.createCancion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : artistas, album, listas_de_reproduccion, _usuario, estadisticas, usuario, numReproducciones, estilo
			orm.bbdd.CancionDAO.save(lormbbddCancion);
			orm.bbdd.Actor_Comun lormbbddActor_Comun = orm.bbdd.Actor_ComunDAO.createActor_Comun();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : canciones_reproducidas, seguidor, notificaciones, listas_de_reproduccion_seguidas, cancion_favorita, seguido, listas_de_reproduccion_propias, estadistica, acceso_Dato
			orm.bbdd.Actor_ComunDAO.save(lormbbddActor_Comun);
			orm.bbdd.Administrador lormbbddAdministrador = orm.bbdd.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : numCanciones
			orm.bbdd.AdministradorDAO.save(lormbbddAdministrador);
			orm.bbdd.Artista lormbbddArtista = orm.bbdd.ArtistaDAO.createArtista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : albums, estilos, eventos, estadisticas, cancions
			orm.bbdd.ArtistaDAO.save(lormbbddArtista);
			orm.bbdd.Usuario_Registrado lormbbddUsuario_Registrado = orm.bbdd.Usuario_RegistradoDAO.createUsuario_Registrado();
			// Initialize the properties of the persistent object here
			orm.bbdd.Usuario_RegistradoDAO.save(lormbbddUsuario_Registrado);
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
				orm.bbdd.MDS2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
