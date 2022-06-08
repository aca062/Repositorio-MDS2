package bbdd;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

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

        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        try {
            admin.setEmail(aEmail);
            AdministradorDAO.save(admin);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

	}
}