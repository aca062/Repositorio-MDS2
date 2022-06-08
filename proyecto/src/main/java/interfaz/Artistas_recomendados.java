package interfaz;

import java.util.Vector;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import vistas.VistaArtistas_recomendados;

public class Artistas_recomendados extends VistaArtistas_recomendados{
	//private Label _tituloL;
	public Actor_comun _actorComun;
	public Vector<Artista_elemento> _artistaElemento = new Vector<Artista_elemento>();
    iActor_comun bd = new BDPrincipal();

	public Artistas_recomendados() {
		Inicializar();
	}

	void Inicializar() {
		this.getH1Titulo().setVisible(true);
		this.getVistaArtista_elemento().setVisible(false);
		this.getVistaArtista_elemento1().setVisible(false);
		this.getVistaArtista_elemento2().setVisible(false);

        int i = 0;

        for (orm.bbdd.Artista artista : bd.cargarArtistaRecomendado()) {
            i++;
            _artistaElemento.add(new Artista_elemento());
            _artistaElemento.lastElement().setArtista(artista);
            this.getLayoutPrincipal().add(_artistaElemento.lastElement());
            if (i == 3) {
                break;
            }
        }
	}
}