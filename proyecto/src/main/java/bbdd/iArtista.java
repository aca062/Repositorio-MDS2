package bbdd;

import java.sql.Date;

public interface iArtista extends iActor_comun {

	public void altaArtistas(String aEmail, String aContrasena, String aNick);

	public void anadirEvento(Date aFecha, String aHora, String aLugar, String aFoto);

	public void editarFoto(String aFoto);

	public void darDeBaja(String aEmail);

	public void editarE_mail(String aEmail);
}