package interfaz;

import vistas.VistaEditar_estilo;

public class Editar_estilo extends VistaEditar_estilo{
	/*private Label _editarEstiloL;
	private Label _nombreEstiloL;
	private TextField _nombreEstiloTF;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Estilo_admin _estiloAdmin;
	
	public Editar_estilo() {
		Inicializar();
	}
	void Inicializar() {
		this.getConfirmar().setVisible(true);
		this.getCancelar().setVisible(true);
		this.getNombreDelEstilo().setVisible(true);
	}
}