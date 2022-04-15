package interfaz;

import java.util.Vector;
import interfaz.Cancion_mas_escuchada;
import vistas.VistaCanciones_mas_escuchadas;

public class Canciones_mas_escuchadas extends VistaCanciones_mas_escuchadas{
	//private Label _tituloL;
	public Perfil_artista_comun _perfilArtistaComun;
	public Vector<Cancion_mas_escuchada> _cancionMasEscuchada = new Vector<Cancion_mas_escuchada>();
	
	public Canciones_mas_escuchadas() {
		Inicializar();
	}
	void Inicializar() {
		this.getH1Titulo().setVisible(true);
		_cancionMasEscuchada.add(new Cancion_mas_escuchada());
		for(int i = 0;i<3;i++) {
			this.getLayoutPrincipal().add(_cancionMasEscuchada.get(i));
		}
	}
}