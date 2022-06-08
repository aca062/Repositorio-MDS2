package bbdd;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Acceso_Dato;
import orm.bbdd.Acceso_DatoDAO;
import orm.bbdd.Actor_Comun;
import orm.bbdd.Actor_ComunDAO;
import orm.bbdd.Estadistica;
import orm.bbdd.EstadisticaDAO;
import orm.bbdd.Lista_de_reproduccionDAO;
import orm.bbdd.MDS2PersistentManager;
import orm.bbdd.Usuario_Registrado;
import orm.bbdd.Usuario_RegistradoCriteria;
import orm.bbdd.Usuario_RegistradoDAO;

public class BD_Usuarios_Registrados {
	public BDPrincipal _bd_prin_usuarios_registrados;
	public Vector<Usuario_Registrado> _contiene_usuario_registrados = new Vector<Usuario_Registrado>();

	public void editarUsuario(int aIdUsuario, String aEmail, String aContrasena, String aNick, String aImagen) throws PersistentException{
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(aIdUsuario);
			/*BD_Usuarios_Registrados usuarios = new BD_Usuarios_Registrados();
			int id = usuarios._contiene_usuario_registrados.size() + 1;
			usuario.setId(id);*/
			Acceso_Dato accesoD = usuario.getAcceso_Dato();
			accesoD.setContrasena(aContrasena);
			accesoD.setEmail(aEmail);
			accesoD.setNumIntentos(0);
			accesoD.setTipoUsuario("usuario");
			accesoD.setFechaBloqueo("");
			Acceso_DatoDAO.save(accesoD);
			
			Estadistica estadistica = usuario.getEstadistica();
			estadistica.setTiempoAnual(0);
			double[] tiempoSemana = new double[7];
			estadistica.setTiempoSemana(tiempoSemana);
			//estadistica.setUsuario(usuario);
			EstadisticaDAO.save(estadistica);
			/*BD_Acceso_Datos accesosDato = new BD_Acceso_Datos();
			Acceso_Dato idAcceso = accesosDato._contiene_acceso_datos.lastElement();
			BD_Estadisticas estadisticas = new BD_Estadisticas();
			Estadistica idEstadistica = estadisticas._contiene_estadisticas.lastElement();*/

			usuario.setEmail(aEmail);
			usuario.setContrasena(aContrasena);
			usuario.setNick(aNick);
			usuario.setAcceso_Dato(accesoD);
			usuario.setEstadistica(estadistica);
			usuario.setFoto(aImagen);
			Usuario_RegistradoDAO.save(usuario);
			t.commit();

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void registro(String aEmail, String aContrasena, String aNick, String aImagen) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.createUsuario_Registrado();
			/*BD_Usuarios_Registrados usuarios = new BD_Usuarios_Registrados();
			int id = usuarios._contiene_usuario_registrados.size() + 1;
			usuario.setId(id);*/
			Acceso_Dato accesoD = new Acceso_Dato();
			accesoD.setContrasena(aContrasena);
			accesoD.setEmail(aEmail);
			accesoD.setNumIntentos(0);
			accesoD.setTipoUsuario("usuario");
			accesoD.setFechaBloqueo("");
			Acceso_DatoDAO.save(accesoD);
			Estadistica estadistica = new Estadistica();
			estadistica.setTiempoAnual(0);
			double[] tiempoSemana = new double[7];
			estadistica.setTiempoSemana(tiempoSemana);
			//estadistica.setUsuario(usuario);
			EstadisticaDAO.save(estadistica);
			/*BD_Acceso_Datos accesosDato = new BD_Acceso_Datos();
			Acceso_Dato idAcceso = accesosDato._contiene_acceso_datos.lastElement();
			BD_Estadisticas estadisticas = new BD_Estadisticas();
			Estadistica idEstadistica = estadisticas._contiene_estadisticas.lastElement();*/

			usuario.setEmail(aEmail);
			usuario.setContrasena(aContrasena);
			usuario.setNick(aNick);
			usuario.setAcceso_Dato(accesoD);
			usuario.setEstadistica(estadistica);
			usuario.setFoto(aImagen);
			Usuario_RegistradoDAO.save(usuario);
			t.commit();

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean eliminarUsuario(int aIdUsuario) throws PersistentException{
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        boolean correcto = false;
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(aIdUsuario);
			
			correcto = Usuario_RegistradoDAO.delete(usuario);
			
			BD_Listas_de_reproduccion bdlistas = new BD_Listas_de_reproduccion();
            orm.bbdd.Lista_de_reproduccion[] lListas_de_reproduccion_propiass = usuario.listas_de_reproduccion_propias
                    .toArray();
            for (int i = 0; i < lListas_de_reproduccion_propiass.length; i++) {
            	Lista_de_reproduccionDAO.delete(lListas_de_reproduccion_propiass[i]);
            }
			
			BD_Acceso_Datos bdacceso = new BD_Acceso_Datos();
			if(usuario.getAcceso_Dato() != null) {
				bdacceso.eliminarAcceso(usuario.getAcceso_Dato().getId());
			}
			BD_Estadisticas bdestadisticas = new BD_Estadisticas();
			if(usuario.getEstadistica() != null) {
				bdestadisticas.eliminarEstadistica(usuario.getEstadistica().getId());
			}
			t.commit();
		} catch (PersistentException e) {
            correcto = true;
            e.printStackTrace();
        } catch (Exception e) {
            correcto = false;
            e.printStackTrace();
        }
        return correcto;
    }

	public void seguirLista(int aIdLista) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void seguir_dejarDeSeguirUsuario(int aId, int aIdSeguido) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado cargarUsuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado[] cargarListaSeguidores(int aIdUsuario) throws PersistentException{
		List<Usuario_Registrado> seguidores = new Vector<Usuario_Registrado>();

		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {

			Actor_Comun usuario = Actor_ComunDAO.getActor_ComunByORMID(aIdUsuario);
			Iterator<Actor_Comun> i = usuario.seguidor.getIterator();

			Actor_Comun ac;

			while(i.hasNext()) {
				ac = i.next();
				if(ac instanceof Actor_Comun) {
					seguidores.add((Usuario_Registrado)ac);
				}
			}

			t.commit();
		} catch(Exception e) {
			t.rollback();
		}
		return seguidores.toArray(new Usuario_Registrado[seguidores.size()]);
	}
	public Usuario_Registrado[] cargarListaSeguidos(int aIdUsuario) throws PersistentException{
		List<Usuario_Registrado> seguidos = new Vector<Usuario_Registrado>();

		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {

			Actor_Comun usuario = Actor_ComunDAO.getActor_ComunByORMID(aIdUsuario);
			Iterator<Actor_Comun> i = usuario.seguido.getIterator();

			Actor_Comun ac;

			while(i.hasNext()) {
				ac = i.next();
				if(ac instanceof Actor_Comun) {
					seguidos.add((Usuario_Registrado)ac);
				}
			}

			t.commit();
		} catch(Exception e) {
			t.rollback();
		}
		return seguidos.toArray(new Usuario_Registrado[seguidos.size()]);
	}

    public Usuario_Registrado[] busquedaUsuarios(String paramBusqueda) throws PersistentException {
        Usuario_Registrado[] usuarios = new Usuario_Registrado[0];

        Usuario_RegistradoCriteria criteria = new Usuario_RegistradoCriteria();
        String criterio = ("%" + paramBusqueda.trim().toLowerCase() + "%");
        criteria.nick.like(criterio);
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            usuarios = Usuario_RegistradoDAO.listUsuario_RegistradoByCriteria(criteria);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        return usuarios;
    }

    public void editar_e_mail(String correo, int id) throws PersistentException {

        Usuario_Registrado user = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(id);

        Acceso_Dato acceso = Acceso_DatoDAO.getAcceso_DatoByORMID(id);

        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            user.setEmail(correo);
            acceso.setEmail(correo);
            Usuario_RegistradoDAO.save(user);
            Acceso_DatoDAO.save(acceso);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

    }

    public void editarFoto(int id, String nombre) throws PersistentException {
        Usuario_Registrado user = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(id);

        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            user.setFoto(nombre);
            Usuario_RegistradoDAO.save(user);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
    }
}