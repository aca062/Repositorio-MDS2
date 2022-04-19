package interfaz;

public class Artista extends Actor_comun {
	public Perfil_artista_propio _perfilArtista;
	
	public Artista() {
		super();
		Inicializar();
	}
	
	void Inicializar() {
		this.getBotonAdmin().setVisible(false);
	}
}