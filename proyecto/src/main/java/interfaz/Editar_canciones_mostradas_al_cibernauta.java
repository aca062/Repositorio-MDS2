package interfaz;

import vistas.VistaEditar_canciones_mostradas_al_cibernauta;

public class Editar_canciones_mostradas_al_cibernauta extends VistaEditar_canciones_mostradas_al_cibernauta{
	/*private Label _tituloL;
	private Label _buscarCancionL;
	private Dropdown _buscarCancionD;
	private Label _buscarCancionList;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Menu_administracion _menuAdministracion;
	
	public Editar_canciones_mostradas_al_cibernauta() {
		Inicializar();
	}
	void Inicializar() {
		this.getCancelar().setVisible(true);
		this.getConfirmar().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getBuscador().setVisible(true);
		this.getListaCanciones().setVisible(true);
	}
}