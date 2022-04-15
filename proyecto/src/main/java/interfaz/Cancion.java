package interfaz;

import vistas.VistaCancion;

public class Cancion extends VistaCancion{
	/*private event _imagen_reproducir;
	private Image _imagen;
	private Button _tituloCancionB;*/
	public Canciones_busqueda _cancionesBusqueda;
	public Canciones_favoritas _cancionesFavoritas;
	public Canciones_recomendadas _cancionesRecomendadas;
	public Ultimas_canciones_reproducidas _ultimasCancionesReproducidas;
	public Lista_de_canciones _listaDeCanciones;
	public Ver_detalle_cancion _verDetalleCancion;

	public Cancion() {
		Inicializar();
	}
	
	public void Imagen_reproducir() {
		throw new UnsupportedOperationException();
	}
	
	void Inicializar() {
		this.getBotonCancion().setVisible(true);
		this.getH5Titulo().setVisible(true);
		this.getLayoutCancion().setVisible(true);
		this.getLayoutPrincipal().setVisible(true);
		this.getMeGusta().setVisible(true);
		this.getNumeroRep().setVisible(true);
	}
}