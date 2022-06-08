package bbdd;

import org.orm.PersistentException;

import orm.bbdd.Actor_Comun;
import orm.bbdd.Cancion;

public interface iCibernauta {

	public String inicioDeSesion(String aEmail, String aContrasena);

	public int registro(String aEmail, String aContrasena, String aNick, String aImagen);

	public void recuperarContrasena(String aEmail);

    public Cancion[] cargarCancionesAdmin() throws PersistentException;

    public Actor_Comun getUsuarioCorreo(String correo);

    Actor_Comun getUsuario(int id);
}