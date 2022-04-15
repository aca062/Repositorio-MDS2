package interfaz;

import vistas.VistaLista_de_reproduccion_ajena;

public class Lista_de_reproduccion_ajena extends VistaLista_de_reproduccion_ajena{
	/*private event _imagen_reproducir;
	private Image _imagen;
	private Label _tituloListaL;
	private Button _tituloListaB;*/
	public Paginacion_listas_ajenas _paginacionListasAjenas;
	public Listas_de_reproduccion_ajenas _listasDeReproduccionAjenas;
	public Listas_de_reproduccion_busqueda _listaDeReproduccionBusqueda;
	public Listas_de_reproduccion_recomendadas _listasDeReproduccionRecomendadas;
	public Ver_detalle_de_lista_ajena _verDetalleDeListaAjena;
	
	public Lista_de_reproduccion_ajena() {
		Inicializar();
	}

	public void Imagen_reproducir() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getBotonNombre().setVisible(true);
		this.getImgListaAjena().setVisible(true);
	}
}