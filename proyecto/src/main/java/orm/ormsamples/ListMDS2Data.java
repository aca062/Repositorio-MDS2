/**
 * Licensee: Antonio Jesús Cano Andreu(University of Almeria)
 * License Type: Academic
 */
package orm.ormsamples;

import orm.bbdd.*;

import org.orm.*;
public class ListMDS2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Album...");
		Album[] bBDDAlbums = AlbumDAO.listAlbumByQuery(null, null);
		int length = Math.min(bBDDAlbums.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bBDDAlbums[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Acceso_Dato...");
		Acceso_Dato[] bBDDAcceso_Datos = Acceso_DatoDAO.listAcceso_DatoByQuery(null, null);
		length = Math.min(bBDDAcceso_Datos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bBDDAcceso_Datos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estadistica...");
		Estadistica[] bBDDEstadisticas = EstadisticaDAO.listEstadisticaByQuery(null, null);
		length = Math.min(bBDDEstadisticas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bBDDEstadisticas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estilo...");
		Estilo[] bBDDEstilos = EstiloDAO.listEstiloByQuery(null, null);
		length = Math.min(bBDDEstilos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bBDDEstilos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evento...");
		Evento[] bBDDEventos = EventoDAO.listEventoByQuery(null, null);
		length = Math.min(bBDDEventos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bBDDEventos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lista_de_reproduccion...");
		Lista_de_reproduccion[] bBDDLista_de_reproduccions = Lista_de_reproduccionDAO.listLista_de_reproduccionByQuery(null, null);
		length = Math.min(bBDDLista_de_reproduccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bBDDLista_de_reproduccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cancion...");
		Cancion[] bBDDCancions = CancionDAO.listCancionByQuery(null, null);
		length = Math.min(bBDDCancions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bBDDCancions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Actor_Comun...");
		Actor_Comun[] bBDDActor_Comuns = Actor_ComunDAO.listActor_ComunByQuery(null, null);
		length = Math.min(bBDDActor_Comuns.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bBDDActor_Comuns[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		Administrador[] bBDDAdministradors = AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(bBDDAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bBDDAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Artista...");
		Artista[] bBDDArtistas = ArtistaDAO.listArtistaByQuery(null, null);
		length = Math.min(bBDDArtistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bBDDArtistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_Registrado...");
		Usuario_Registrado[] bBDDUsuario_Registrados = Usuario_RegistradoDAO.listUsuario_RegistradoByQuery(null, null);
		length = Math.min(bBDDUsuario_Registrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bBDDUsuario_Registrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Album by Criteria...");
		AlbumCriteria bBDDAlbumCriteria = new AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bBDDAlbumCriteria.idAlbum.eq();
		bBDDAlbumCriteria.setMaxResults(ROW_COUNT);
		Album[] bBDDAlbums = bBDDAlbumCriteria.listAlbum();
		int length =bBDDAlbums== null ? 0 : Math.min(bBDDAlbums.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bBDDAlbums[i]);
		}
		System.out.println(length + " Album record(s) retrieved."); 
		
		System.out.println("Listing Acceso_Dato by Criteria...");
		Acceso_DatoCriteria bBDDAcceso_DatoCriteria = new Acceso_DatoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bBDDAcceso_DatoCriteria.email.eq();
		bBDDAcceso_DatoCriteria.setMaxResults(ROW_COUNT);
		Acceso_Dato[] bBDDAcceso_Datos = bBDDAcceso_DatoCriteria.listAcceso_Dato();
		length =bBDDAcceso_Datos== null ? 0 : Math.min(bBDDAcceso_Datos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bBDDAcceso_Datos[i]);
		}
		System.out.println(length + " Acceso_Dato record(s) retrieved."); 
		
		System.out.println("Listing Estadistica by Criteria...");
		EstadisticaCriteria bBDDEstadisticaCriteria = new EstadisticaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bBDDEstadisticaCriteria.id.eq();
		bBDDEstadisticaCriteria.setMaxResults(ROW_COUNT);
		Estadistica[] bBDDEstadisticas = bBDDEstadisticaCriteria.listEstadistica();
		length =bBDDEstadisticas== null ? 0 : Math.min(bBDDEstadisticas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bBDDEstadisticas[i]);
		}
		System.out.println(length + " Estadistica record(s) retrieved."); 
		
		System.out.println("Listing Estilo by Criteria...");
		EstiloCriteria bBDDEstiloCriteria = new EstiloCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bBDDEstiloCriteria.idEstilo.eq();
		bBDDEstiloCriteria.setMaxResults(ROW_COUNT);
		Estilo[] bBDDEstilos = bBDDEstiloCriteria.listEstilo();
		length =bBDDEstilos== null ? 0 : Math.min(bBDDEstilos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bBDDEstilos[i]);
		}
		System.out.println(length + " Estilo record(s) retrieved."); 
		
		System.out.println("Listing Evento by Criteria...");
		EventoCriteria bBDDEventoCriteria = new EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bBDDEventoCriteria.idEvento.eq();
		bBDDEventoCriteria.setMaxResults(ROW_COUNT);
		Evento[] bBDDEventos = bBDDEventoCriteria.listEvento();
		length =bBDDEventos== null ? 0 : Math.min(bBDDEventos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bBDDEventos[i]);
		}
		System.out.println(length + " Evento record(s) retrieved."); 
		
		System.out.println("Listing Lista_de_reproduccion by Criteria...");
		Lista_de_reproduccionCriteria bBDDLista_de_reproduccionCriteria = new Lista_de_reproduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bBDDLista_de_reproduccionCriteria.idLista.eq();
		bBDDLista_de_reproduccionCriteria.setMaxResults(ROW_COUNT);
		Lista_de_reproduccion[] bBDDLista_de_reproduccions = bBDDLista_de_reproduccionCriteria.listLista_de_reproduccion();
		length =bBDDLista_de_reproduccions== null ? 0 : Math.min(bBDDLista_de_reproduccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bBDDLista_de_reproduccions[i]);
		}
		System.out.println(length + " Lista_de_reproduccion record(s) retrieved."); 
		
		System.out.println("Listing Cancion by Criteria...");
		CancionCriteria bBDDCancionCriteria = new CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bBDDCancionCriteria.idCancion.eq();
		bBDDCancionCriteria.setMaxResults(ROW_COUNT);
		Cancion[] bBDDCancions = bBDDCancionCriteria.listCancion();
		length =bBDDCancions== null ? 0 : Math.min(bBDDCancions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bBDDCancions[i]);
		}
		System.out.println(length + " Cancion record(s) retrieved."); 
		
		System.out.println("Listing Actor_Comun by Criteria...");
		Actor_ComunCriteria bBDDActor_ComunCriteria = new Actor_ComunCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bBDDActor_ComunCriteria.email.eq();
		bBDDActor_ComunCriteria.setMaxResults(ROW_COUNT);
		Actor_Comun[] bBDDActor_Comuns = bBDDActor_ComunCriteria.listActor_Comun();
		length =bBDDActor_Comuns== null ? 0 : Math.min(bBDDActor_Comuns.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bBDDActor_Comuns[i]);
		}
		System.out.println(length + " Actor_Comun record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		AdministradorCriteria bBDDAdministradorCriteria = new AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bBDDAdministradorCriteria.email.eq();
		bBDDAdministradorCriteria.setMaxResults(ROW_COUNT);
		Administrador[] bBDDAdministradors = bBDDAdministradorCriteria.listAdministrador();
		length =bBDDAdministradors== null ? 0 : Math.min(bBDDAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bBDDAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Artista by Criteria...");
		ArtistaCriteria bBDDArtistaCriteria = new ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bBDDArtistaCriteria.email.eq();
		bBDDArtistaCriteria.setMaxResults(ROW_COUNT);
		Artista[] bBDDArtistas = bBDDArtistaCriteria.listArtista();
		length =bBDDArtistas== null ? 0 : Math.min(bBDDArtistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bBDDArtistas[i]);
		}
		System.out.println(length + " Artista record(s) retrieved."); 
		
		System.out.println("Listing Usuario_Registrado by Criteria...");
		Usuario_RegistradoCriteria bBDDUsuario_RegistradoCriteria = new Usuario_RegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bBDDUsuario_RegistradoCriteria.email.eq();
		bBDDUsuario_RegistradoCriteria.setMaxResults(ROW_COUNT);
		Usuario_Registrado[] bBDDUsuario_Registrados = bBDDUsuario_RegistradoCriteria.listUsuario_Registrado();
		length =bBDDUsuario_Registrados== null ? 0 : Math.min(bBDDUsuario_Registrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bBDDUsuario_Registrados[i]);
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
				MDS2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
