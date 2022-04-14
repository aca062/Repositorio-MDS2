package interfaz;

import vistas.VistaEditar_usuario;

public class Editar_usuario extends VistaEditar_usuario{
	/*private Label _editarUsuarioL;
	private event _anadir_imagen;
	private Image _imagen;
	private Button _anadirFotoB;
	private Label _nickL;
	private TextField _nickTF;
	private Label _passwordL;
	private TextField _passwordTF;
	private Label _confirmarPassL;
	private TextField _confirmarPassTF;
	private Label _emailL;
	private TextField _emailTF;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Usuario_admin _usuarioAdmin;
	
	public Editar_usuario() {
		Inicializar();
	}
	
	public void Anadir_imagen() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getCancelar().setVisible(true);
		this.getConfirmar().setVisible(true);
		this.getNick().setVisible(true);
		this.getContraseña().setVisible(true);
		this.getConfirmarContraseña().setVisible(true);
		this.geteMail().setVisible(true);
		this.getAnadirFoto().setVisible(true);
		this.getImgUsuario().setVisible(true);
		this.getH2Titulo().setVisible(true);
	}
}