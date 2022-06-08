package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.bbdd.Acceso_Dato;
import orm.bbdd.Acceso_DatoDAO;
import orm.bbdd.Administrador;
import orm.bbdd.AdministradorDAO;
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
}