package interfaz;

public class Artista extends Actor_comun {
	public Perfil_artista_propio _perfilArtista;

	public Artista() {
		super();
		InicializarArtista();
	}

	void InicializarArtista() {
		this.getLayoutAdministracion().setVisible(false);
		this.getBotonAdmin().setVisible(false);
	}
}