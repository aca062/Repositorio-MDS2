package interfaz;

import vistas.VistaDar_de_alta;

public class Dar_de_alta extends VistaDar_de_alta{
	/*private Label _tituloL;
	private Image _imagenArtista;
	private Button _artistaB;
	private Image _imagenCancion;
	private Button _cancionB;
	private Image _imagenAlbum;
	private Button _albumB;
	private Image _imagenEstilo;
	private Button _estiloB;*/
	public Menu_administracion _menuAdministracion;
	public Alta_estilos _altaEstilos;
	public Alta_canciones _altaCanciones;
	public Alta_artistas _altaArtistas;
	public Alta_albumes _altaAlbumes;
	
	public Dar_de_alta() {
		Inicializar();
	}
	void Inicializar() {
		this.getBotonAlbumes().setVisible(true);
		this.getBotonArtistas().setVisible(true);
		this.getBotonCanciones().setVisible(true);
		this.getBotonEstilos().setVisible(true);
		this.getH1Titulo().setVisible(true);
	}
}