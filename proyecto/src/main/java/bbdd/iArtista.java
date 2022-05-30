package bbdd;

import java.sql.Date;

public interface iArtista extends iActor_comun {

	public void altaArtistas(String aEmail, String aContrasena, String aNick,String aImagen, int aIdArtista);

	public void anadirEvento(Date aFecha, String aHora, String aLugar, String aFoto);

	public void editarFoto(String aFoto, int aIdArtista);

	public void darDeBaja(String aEmail);

	public void editarE_mail(String aEmail, int aIdArtista);
}