package bbdd;

import orm.bbdd.Cancion;

public interface iCibernauta {

	public String inicioDeSesion(String aEmail, String aContrasena);

	public int registro(String aEmail, String aContrasena, String aNick, String aImagen);

	public void recuperarContrasena(String aEmail);

	public Cancion[] cargarUltimosExitos(int aNumCanciones);
}