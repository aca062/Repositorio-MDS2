package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Acceso_Dato;
import orm.bbdd.Acceso_DatoDAO;
import orm.bbdd.Artista;
import orm.bbdd.ArtistaDAO;
import orm.bbdd.Estadistica;
import orm.bbdd.EstadisticaDAO;
import orm.bbdd.Estilo;
import orm.bbdd.EstiloDAO;
import orm.bbdd.MDS2PersistentManager;
import orm.bbdd.Usuario_Registrado;
import orm.bbdd.Usuario_RegistradoDAO;

public class BD_Artistas {
	public BDPrincipal _bd_prin_artistas;
	public Vector<Artista> _contiene_artistas = new Vector<Artista>();

	public void altaArtistas(String aEmail, String aContrasena, String aNick, String aImagen, int aIdEstilo) throws PersistentException{
	      PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
	        try {
	            Artista artista = ArtistaDAO.createArtista();
	            /*BD_Usuarios_Registrados usuarios = new BD_Usuarios_Registrados();
	            int id = usuarios._contiene_usuario_registrados.size() + 1;
	            usuario.setId(id);*/
	            Acceso_Dato accesoD = new Acceso_Dato();
	            accesoD.setContrasena(aContrasena);
	            accesoD.setEmail(aEmail);
	            accesoD.setNumIntentos(0);
	            accesoD.setTipoUsuario("artista");
	            accesoD.setFechaBloqueo("");
	            Acceso_DatoDAO.save(accesoD);
	            Estadistica estadistica = new Estadistica();
	            estadistica.setTiempoAnual(0);
	            double[] tiempoSemana = new double[7];
	            estadistica.setTiempoSemana(tiempoSemana);
	            //estadistica.setUsuario(usuario);
	            EstadisticaDAO.save(estadistica);
	            
	            Estilo estilo = EstiloDAO.getEstiloByORMID(aIdEstilo);
	            artista.estilos.add(estilo);
	            /*BD_Acceso_Datos accesosDato = new BD_Acceso_Datos();
	            Acceso_Dato idAcceso = accesosDato._contiene_acceso_datos.lastElement();
	            BD_Estadisticas estadisticas = new BD_Estadisticas();
	            Estadistica idEstadistica = estadisticas._contiene_estadisticas.lastElement();*/

	            artista.setEmail(aEmail);
	            artista.setContrasena(aContrasena);
	            artista.setNick(aNick);
	            artista.setAcceso_Dato(accesoD);
	            artista.setEstadistica(estadistica);
	            artista.setFoto(aImagen);
	            ArtistaDAO.save(artista);
	            t.commit();

	        } catch (PersistentException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}

	public void editarArtista(String aEmail, String aContrasena, String aNick, String aImagen, int aIdArtista) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void editarFoto(String aFoto, int aIdArtista) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void eliminarArtista(int aIdArtista) throws PersistentException{
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Artista artista = ArtistaDAO.getArtistaByORMID(aIdArtista);
			ArtistaDAO.delete(artista);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void darDeBaja() {
		throw new UnsupportedOperationException();
	}

	public void editarE_mail(String aEmail, int aIdArtista) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public Artista cargarArtista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public void seguir_dejarDeSeguirArtista(int aId, int aIdSeguido) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void altaAlbum(String aNombreArtista) {
		throw new UnsupportedOperationException();
	}

	public void editarAlbum(String aNombreArtista) {
		throw new UnsupportedOperationException();
	}
}