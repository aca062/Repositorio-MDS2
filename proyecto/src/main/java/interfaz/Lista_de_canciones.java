package interfaz;

import java.util.Vector;
import interfaz.Cancion;
import vistas.VistaLista_de_canciones;

public class Lista_de_canciones extends VistaLista_de_canciones{
	public Ver_detalle_album _verDetalleAlbum;
	public Ver_detalle_de_lista_comun _verDetalleDeListaComun;
	public Vector<Cancion> _cancion = new Vector<Cancion>();
	
	public Lista_de_canciones() {
		Inicializar();
	}
	void Inicializar() {
		_cancion.add(new Cancion());
		_cancion.add(new Cancion());
		_cancion.add(new Cancion());
		for(int i = 0;i<3;i++) {
			this.getLayoutPrincipal().add(_cancion.get(i));
		}
	}
}