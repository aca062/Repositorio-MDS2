package interfaz;

public class Usuario_registrado extends Actor_comun {
	public Perfil_usuario_registrado _perfil;
	
	public Usuario_registrado() {
		super();
		InicializarUsuario();
	}
	
	void InicializarUsuario() {
		this.getLayoutAdministracion().setVisible(false);
		this.getBotonAdmin().setVisible(false);
	}
}