package interfaz;

import java.util.Vector;
import interfaz.Artista_elemento;
import vistas.VistaArtistas_recomendados;

public class Artistas_recomendados extends VistaArtistas_recomendados{
	//private Label _tituloL;
	public Actor_comun _actorComun;
	public Vector<Artista_elemento> _artistaElemento = new Vector<Artista_elemento>();
	
	public Artistas_recomendados() {
		Inicializar();
	}
	void Inicializar() {
		this.getH1Titulo().setVisible(true);
		_artistaElemento.add(new Artista_elemento());
		_artistaElemento.add(new Artista_elemento());
		_artistaElemento.add(new Artista_elemento());
		for(int i =0;i<3;i++) {
			this.getLayoutPrincipal().add(_artistaElemento.get(i));
		}
	}
}