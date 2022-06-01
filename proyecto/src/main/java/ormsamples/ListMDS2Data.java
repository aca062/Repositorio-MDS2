/**
 * Licensee: Antonio Jesús Cano Andreu(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListMDS2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Album...");
		orm.bbdd.Album[] ormbbddAlbums = orm.bbdd.AlbumDAO.listAlbumByQuery(null, null);
		int length = Math.min(ormbbddAlbums.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormbbddAlbums[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Acceso_Dato...");
		orm.bbdd.Acceso_Dato[] ormbbddAcceso_Datos = orm.bbdd.Acceso_DatoDAO.listAcceso_DatoByQuery(null, null);
		length = Math.min(ormbbddAcceso_Datos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormbbddAcceso_Datos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estadistica...");
		orm.bbdd.Estadistica[] ormbbddEstadisticas = orm.bbdd.EstadisticaDAO.listEstadisticaByQuery(null, null);
		length = Math.min(ormbbddEstadisticas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormbbddEstadisticas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estilo...");
		orm.bbdd.Estilo[] ormbbddEstilos = orm.bbdd.EstiloDAO.listEstiloByQuery(null, null);
		length = Math.min(ormbbddEstilos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormbbddEstilos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evento...");
		orm.bbdd.Evento[] ormbbddEventos = orm.bbdd.EventoDAO.listEventoByQuery(null, null);
		length = Math.min(ormbbddEventos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormbbddEventos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lista_de_reproduccion...");
		orm.bbdd.Lista_de_reproduccion[] ormbbddLista_de_reproduccions = orm.bbdd.Lista_de_reproduccionDAO.listLista_de_reproduccionByQuery(null, null);
		length = Math.min(ormbbddLista_de_reproduccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormbbddLista_de_reproduccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cancion...");
		orm.bbdd.Cancion[] ormbbddCancions = orm.bbdd.CancionDAO.listCancionByQuery(null, null);
		length = Math.min(ormbbddCancions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormbbddCancions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Actor_Comun...");
		orm.bbdd.Actor_Comun[] ormbbddActor_Comuns = orm.bbdd.Actor_ComunDAO.listActor_ComunByQuery(null, null);
		length = Math.min(ormbbddActor_Comuns.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormbbddActor_Comuns[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		orm.bbdd.Administrador[] ormbbddAdministradors = orm.bbdd.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(ormbbddAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormbbddAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Artista...");
		orm.bbdd.Artista[] ormbbddArtistas = orm.bbdd.ArtistaDAO.listArtistaByQuery(null, null);
		length = Math.min(ormbbddArtistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormbbddArtistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_Registrado...");
		orm.bbdd.Usuario_Registrado[] ormbbddUsuario_Registrados = orm.bbdd.Usuario_RegistradoDAO.listUsuario_RegistradoByQuery(null, null);
		length = Math.min(ormbbddUsuario_Registrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormbbddUsuario_Registrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Album by Criteria...");
		orm.bbdd.AlbumCriteria lormbbddAlbumCriteria = new orm.bbdd.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormbbddAlbumCriteria.idAlbum.eq();
		lormbbddAlbumCriteria.setMaxResults(ROW_COUNT);
		orm.bbdd.Album[] ormbbddAlbums = lormbbddAlbumCriteria.listAlbum();
		int length =ormbbddAlbums== null ? 0 : Math.min(ormbbddAlbums.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormbbddAlbums[i]);
		}
		System.out.println(length + " Album record(s) retrieved."); 
		
		System.out.println("Listing Acceso_Dato by Criteria...");
		orm.bbdd.Acceso_DatoCriteria lormbbddAcceso_DatoCriteria = new orm.bbdd.Acceso_DatoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormbbddAcceso_DatoCriteria.id.eq();
		lormbbddAcceso_DatoCriteria.setMaxResults(ROW_COUNT);
		orm.bbdd.Acceso_Dato[] ormbbddAcceso_Datos = lormbbddAcceso_DatoCriteria.listAcceso_Dato();
		length =ormbbddAcceso_Datos== null ? 0 : Math.min(ormbbddAcceso_Datos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormbbddAcceso_Datos[i]);
		}
		System.out.println(length + " Acceso_Dato record(s) retrieved."); 
		
		System.out.println("Listing Estadistica by Criteria...");
		orm.bbdd.EstadisticaCriteria lormbbddEstadisticaCriteria = new orm.bbdd.EstadisticaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormbbddEstadisticaCriteria.id.eq();
		lormbbddEstadisticaCriteria.setMaxResults(ROW_COUNT);
		orm.bbdd.Estadistica[] ormbbddEstadisticas = lormbbddEstadisticaCriteria.listEstadistica();
		length =ormbbddEstadisticas== null ? 0 : Math.min(ormbbddEstadisticas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormbbddEstadisticas[i]);
		}
		System.out.println(length + " Estadistica record(s) retrieved."); 
		
		System.out.println("Listing Estilo by Criteria...");
		orm.bbdd.EstiloCriteria lormbbddEstiloCriteria = new orm.bbdd.EstiloCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormbbddEstiloCriteria.idEstilo.eq();
		lormbbddEstiloCriteria.setMaxResults(ROW_COUNT);
		orm.bbdd.Estilo[] ormbbddEstilos = lormbbddEstiloCriteria.listEstilo();
		length =ormbbddEstilos== null ? 0 : Math.min(ormbbddEstilos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormbbddEstilos[i]);
		}
		System.out.println(length + " Estilo record(s) retrieved."); 
		
		System.out.println("Listing Evento by Criteria...");
		orm.bbdd.EventoCriteria lormbbddEventoCriteria = new orm.bbdd.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormbbddEventoCriteria.idEvento.eq();
		lormbbddEventoCriteria.setMaxResults(ROW_COUNT);
		orm.bbdd.Evento[] ormbbddEventos = lormbbddEventoCriteria.listEvento();
		length =ormbbddEventos== null ? 0 : Math.min(ormbbddEventos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormbbddEventos[i]);
		}
		System.out.println(length + " Evento record(s) retrieved."); 
		
		System.out.println("Listing Lista_de_reproduccion by Criteria...");
		orm.bbdd.Lista_de_reproduccionCriteria lormbbddLista_de_reproduccionCriteria = new orm.bbdd.Lista_de_reproduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormbbddLista_de_reproduccionCriteria.idLista.eq();
		lormbbddLista_de_reproduccionCriteria.setMaxResults(ROW_COUNT);
		orm.bbdd.Lista_de_reproduccion[] ormbbddLista_de_reproduccions = lormbbddLista_de_reproduccionCriteria.listLista_de_reproduccion();
		length =ormbbddLista_de_reproduccions== null ? 0 : Math.min(ormbbddLista_de_reproduccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormbbddLista_de_reproduccions[i]);
		}
		System.out.println(length + " Lista_de_reproduccion record(s) retrieved."); 
		
		System.out.println("Listing Cancion by Criteria...");
		orm.bbdd.CancionCriteria lormbbddCancionCriteria = new orm.bbdd.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormbbddCancionCriteria.idCancion.eq();
		lormbbddCancionCriteria.setMaxResults(ROW_COUNT);
		orm.bbdd.Cancion[] ormbbddCancions = lormbbddCancionCriteria.listCancion();
		length =ormbbddCancions== null ? 0 : Math.min(ormbbddCancions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormbbddCancions[i]);
		}
		System.out.println(length + " Cancion record(s) retrieved."); 
		
		System.out.println("Listing Actor_Comun by Criteria...");
		orm.bbdd.Actor_ComunCriteria lormbbddActor_ComunCriteria = new orm.bbdd.Actor_ComunCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormbbddActor_ComunCriteria.id.eq();
		lormbbddActor_ComunCriteria.setMaxResults(ROW_COUNT);
		orm.bbdd.Actor_Comun[] ormbbddActor_Comuns = lormbbddActor_ComunCriteria.listActor_Comun();
		length =ormbbddActor_Comuns== null ? 0 : Math.min(ormbbddActor_Comuns.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormbbddActor_Comuns[i]);
		}
		System.out.println(length + " Actor_Comun record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		orm.bbdd.AdministradorCriteria lormbbddAdministradorCriteria = new orm.bbdd.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormbbddAdministradorCriteria.id.eq();
		lormbbddAdministradorCriteria.setMaxResults(ROW_COUNT);
		orm.bbdd.Administrador[] ormbbddAdministradors = lormbbddAdministradorCriteria.listAdministrador();
		length =ormbbddAdministradors== null ? 0 : Math.min(ormbbddAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormbbddAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Artista by Criteria...");
		orm.bbdd.ArtistaCriteria lormbbddArtistaCriteria = new orm.bbdd.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormbbddArtistaCriteria.id.eq();
		lormbbddArtistaCriteria.setMaxResults(ROW_COUNT);
		orm.bbdd.Artista[] ormbbddArtistas = lormbbddArtistaCriteria.listArtista();
		length =ormbbddArtistas== null ? 0 : Math.min(ormbbddArtistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormbbddArtistas[i]);
		}
		System.out.println(length + " Artista record(s) retrieved."); 
		
		System.out.println("Listing Usuario_Registrado by Criteria...");
		orm.bbdd.Usuario_RegistradoCriteria lormbbddUsuario_RegistradoCriteria = new orm.bbdd.Usuario_RegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormbbddUsuario_RegistradoCriteria.id.eq();
		lormbbddUsuario_RegistradoCriteria.setMaxResults(ROW_COUNT);
		orm.bbdd.Usuario_Registrado[] ormbbddUsuario_Registrados = lormbbddUsuario_RegistradoCriteria.listUsuario_Registrado();
		length =ormbbddUsuario_Registrados== null ? 0 : Math.min(ormbbddUsuario_Registrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormbbddUsuario_Registrados[i]);
		}
		System.out.println(length + " Usuario_Registrado record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS2Data listMDS2Data = new ListMDS2Data();
			try {
				listMDS2Data.listTestData();
				//listMDS2Data.listByCriteria();
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
