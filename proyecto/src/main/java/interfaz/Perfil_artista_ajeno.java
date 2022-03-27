package interfaz;

import interfaz.Listas_de_reproduccion_ajenas;
import interfaz.Perfil_artista_comun;

public class Perfil_artista_ajeno extends Perfil_artista_comun {
	public Listas_de_reproduccion_ajenas _listasDeReproduccionAjenas;
	/*private event _seguir_Dejar_de_seguir;
	private Button _seguirDejarDeSeguirB;*/
	public Artista_elemento _artistaElemento;

	public void Seguir_Dejar_de_seguir() {
		throw new UnsupportedOperationException();
	}
}