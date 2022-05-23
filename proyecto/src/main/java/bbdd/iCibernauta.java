package bbdd;

public interface iCibernauta {

	public boolean inicioDeSesion(String aEmail, String aContrasena);

	public void registro(String aEmail, String aContrasena, String aNick, String aImagen);

	public void recuperarContrasena(String aEmail);
}