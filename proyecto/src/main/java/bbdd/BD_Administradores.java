package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Acceso_Dato;
import orm.bbdd.Acceso_DatoDAO;
import orm.bbdd.Administrador;
import orm.bbdd.AdministradorDAO;
import orm.bbdd.Cancion;
import orm.bbdd.CancionDAO;
import orm.bbdd.MDS2PersistentManager;

public class BD_Administradores {
	public BDPrincipal _bd_prin_administradores;
	public Vector<Administrador> _contiene_administradores = new Vector<Administrador>();

	public void editarFoto(String aFoto, int aIdUsuario) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void editar_e_mail(String aEmail, int aIdUsuario) throws PersistentException{

        Administrador admin = AdministradorDAO.getAdministradorByORMID(aIdUsuario);

        Acceso_Dato acceso = Acceso_DatoDAO.getAcceso_DatoByORMID(aIdUsuario);

        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            admin.setEmail(aEmail);
            acceso.setEmail(aEmail);
            AdministradorDAO.save(admin);
            Acceso_DatoDAO.save(acceso);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

	}

    public void editarFoto(int id, String nombre) throws PersistentException {
        Administrador admin = AdministradorDAO.getAdministradorByORMID(id);

        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            admin.setFoto(nombre);
            AdministradorDAO.save(admin);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
    }

    public int editarCancionesCibernauta(String[] strings, int id) throws PersistentException {
        Administrador admin = AdministradorDAO.getAdministradorByORMID(id);

        Cancion[] cancions = new Cancion[strings.length];

        for (int i = 0; i < strings.length; i++) {
            Cancion[] j = CancionDAO.listCancionByQuery("titulo='" + strings[i].trim() + "'", "titulo");
            if (j == null || j.length == 0) {
                return -1;
            }
            cancions[i] = j[0];
        }

        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            for (Cancion c : cancions) {
                admin.cancions.add(c);
                c.setAdministrador(admin);
                CancionDAO.save(c);
            }
            admin.setNumCanciones(cancions.length);
            AdministradorDAO.save(admin);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        return 1;
    }

    public Cancion[] cargarCancionesCibernauta(int id) throws PersistentException {
        Administrador admin = AdministradorDAO.getAdministradorByORMID(id);
        Cancion[] canciones = new Cancion[admin.cancions.size()];
        for (int i = 0; i < canciones.length; i++) {
            canciones[i] = admin.cancions.toArray()[i];
        }
        return canciones;
    }
}