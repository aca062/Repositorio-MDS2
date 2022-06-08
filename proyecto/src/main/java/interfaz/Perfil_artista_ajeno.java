package interfaz;

public class Perfil_artista_ajeno extends Perfil_artista_comun {
	public Listas_de_reproduccion_ajenas _listasDeReproduccionAjenas;
	/*private event _seguir_Dejar_de_seguir;
	private Button _seguirDejarDeSeguirB;*/
	public Artista_elemento _artistaElemento;

	public Perfil_artista_ajeno(orm.bbdd.Artista artista) {
		super(artista);
		Inicializar();
	}

	private void Inicializar() {
		this.getBotonAnadirFestivalConcierto().setVisible(false);
		this.getBotonEditarCorreo().setVisible(false);
		this.getH5Correo().setVisible(false);
		this.getBotonEditarFoto().setVisible(false);
		this.getBotonRecibirNotificaciones().setVisible(false);
		this.getBotonCrearNuevaLista().setVisible(false);
		this.getBotonDarseBaja().setVisible(false);
		this.getNumeroSeguidos1().setVisible(false);
		this.getTextoSeguidos().setVisible(false);
	}

	public void Seguir_Dejar_de_seguir() {
		throw new UnsupportedOperationException();
	}
}