package interfaz;

import vistas.VistaAlta_estilos;

public class Alta_estilos extends VistaAlta_estilos{
	/*private Label _altaEstilosL;
	private Label _nombreEstiloL;
	private TextField _nombreEstiloTF;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Dar_de_alta _darDeAlta;
	
	public Alta_estilos() {
		Inicializar();
	}
	
	void Inicializar() {
		this.getConfirmar().setVisible(true);
		this.getCancelar().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getNombreDelEstilo().setVisible(true);
	}
}