package interfaz;

import vistas.VistaVer_creditos;

public class Ver_creditos extends VistaVer_creditos{
	/*private Label _tituloCreditosL;
	private Label _tituloCancionL;
	private Label _tituloAlbumL;
	private Label _compositoresL;
	private Label _productoresL;
	private Label _interpretesL;*/	
	public Ver_detalle_cancion _verDetalleCancion;
	public Reproductor_cibernauta _reproductorCibernauta;
	
	public Ver_creditos() {
		Inicializar();
	}
	
	void Inicializar() {
		this.getH3VerCreditos().setVisible(true);
		this.getH4Compositores().setVisible(true);
		this.getH4Interpretes().setVisible(true);
		this.getH4Productores().setVisible(true);
		this.getH4TituloAlbum().setVisible(true);
		this.getH4TituloCancion().setVisible(true);
	}
}