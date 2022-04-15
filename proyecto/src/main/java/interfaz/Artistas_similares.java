package interfaz;

import java.util.Vector;
import interfaz.Artista_elemento;
import vistas.VistaArtistas_similares;

public class Artistas_similares extends VistaArtistas_similares{
	//private Label _tituloL;
	public Perfil_artista_comun _perfilArtistaComun;
	public Vector<Artista_elemento> _artistaElemento = new Vector<Artista_elemento>();
	
	public Artistas_similares() {
		Inicializar();
	}
	void Inicializar() {
		this.getH1Titulo().setVisible(true);
		_artistaElemento.add(new Artista_elemento());
		for(int i=0;i<3;i++) {
			this.getLayoutPrincipal().add(_artistaElemento.get(i));
		}
	}
}