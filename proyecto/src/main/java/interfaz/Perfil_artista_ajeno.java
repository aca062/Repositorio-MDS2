package interfaz;

import interfaz.Listas_de_reproduccion_ajenas;
import interfaz.Perfil_artista_comun;

public class Perfil_artista_ajeno extends Perfil_artista_comun {
	public Listas_de_reproduccion_ajenas _listasDeReproduccionAjenas;
	/*private event _seguir_Dejar_de_seguir;
	private Button _seguirDejarDeSeguirB;*/
	public Artista_elemento _artistaElemento;

	public Perfil_artista_ajeno() {
		super();
		Inicializar();
	}
	
	private void Inicializar() {
		this.getBotonAnadirFestivalConcierto().setVisible(false);
		this.getBotonEditarCorreo().setVisible(false);
		this.getBotonEditarFoto().setVisible(false);
		this.getBotonRecibirNotificaciones().setVisible(false);
		this.getBotonCrearNuevaLista().setVisible(false);
		this.getBotonDarseBaja().setVisible(false);
	}
	
	public void Seguir_Dejar_de_seguir() {
		throw new UnsupportedOperationException();
	}
}