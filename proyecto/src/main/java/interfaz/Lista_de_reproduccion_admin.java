package interfaz;

import vistas.VistaLista_de_reproduccion_admin;

public class Lista_de_reproduccion_admin extends VistaLista_de_reproduccion_admin{
	/*private event _eliminar;
	private Image _imagen;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Listas_de_reproduccion_busqueda_admin _listasDeReproduccionBusquedaAdmin;
	public Modificar_lista _modificarLista = new Modificar_lista();
	
	public Lista_de_reproduccion_admin() {
		
	}

	public void Eliminar() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getEditar().setVisible(true);
		this.getImgLista().setVisible(true);
		this.getH4Nombre().setVisible(true);
	}
}