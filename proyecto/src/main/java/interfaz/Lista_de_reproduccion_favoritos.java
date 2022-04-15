package interfaz;

import java.util.Vector;

import vistas.VistaLista_de_reproduccion_favoritos;

public class Lista_de_reproduccion_favoritos extends VistaLista_de_reproduccion_favoritos{
	//private Label _tituloL;
	public Ver_mas_canciones_favoritas _verMasCancionesFavoritas;
	public Vector<Cancion_favorita> _cancionFavorita = new Vector<Cancion_favorita>();
	
	public Lista_de_reproduccion_favoritos() {
		Inicializar();
	}
	void Inicializar() {
		_cancionFavorita.add(new Cancion_favorita());
		for(int i=0;i<3;i++) {
			this.getListaCanciones().add(_cancionFavorita.get(i));
		}
		this.getH1Titulo().setVisible(true);
		this.getH3Creador().setVisible(true);
		this.getNumCanciones().setVisible(true);
		this.getOpciones().setVisible(true);
		
	}
}