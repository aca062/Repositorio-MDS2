package interfaz;

import java.util.Vector;
import interfaz.Lista_de_reproduccion_ajena;
import vistas.VistaListas_de_reproduccion_recomendadas;

public class Listas_de_reproduccion_recomendadas extends VistaListas_de_reproduccion_recomendadas{
	//private Label _tituloL;
	public Actor_comun _actorComun;
	public Vector<Lista_de_reproduccion_ajena> _listaDeReproduccionAjena = new Vector<Lista_de_reproduccion_ajena>();
	
	public Listas_de_reproduccion_recomendadas() {
		Inicializar();
	}
	void Inicializar() {
		this.getTitulo().setVisible(true);
		_listaDeReproduccionAjena.add(new Lista_de_reproduccion_ajena());
		for(int i = 0 ; i < 3; i++) {
			this.getLayoutPrincipal().add(_listaDeReproduccionAjena.get(0));
		}
	}
}