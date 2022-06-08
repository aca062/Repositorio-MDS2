package interfaz;

import java.util.Vector;

import com.example.test.ControladorVistas;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import vistas.VistaLista_de_reproduccion_favoritos;

public class Lista_de_reproduccion_favoritos extends VistaLista_de_reproduccion_favoritos{
	//private Label _tituloL;
	public Ver_mas_canciones_favoritas _verMasCancionesFavoritas;
	public Vector<Cancion_favorita> _cancionFavorita = new Vector<Cancion_favorita>();
	iActor_comun bd = new BDPrincipal();

	public Lista_de_reproduccion_favoritos() {
		Inicializar();
	}
	void Inicializar() {
		for(orm.bbdd.Cancion cancion : bd.cargarCancionesFavoritas(ControladorVistas.getUsuario().getId())) {
			_cancionFavorita.add(new Cancion_favorita());
			_cancionFavorita.lastElement().setCancion(cancion);
			this.getListaCanciones().add(_cancionFavorita.lastElement());
		}

		this.getH3Creador().setText(ControladorVistas.getUsuario().getNick());
		this.getH1Titulo().setVisible(true);
		this.getH3Creador().setVisible(true);
		this.getNumCanciones().setVisible(false);
		this.getComboBox().setVisible(false);
	}
}