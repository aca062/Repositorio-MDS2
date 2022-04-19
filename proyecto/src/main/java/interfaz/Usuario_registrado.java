package interfaz;

public class Usuario_registrado extends Actor_comun {
	public Perfil_usuario_registrado _perfil;
	
	public Usuario_registrado() {
		super();
		Inicializar();
	}
	
	void Inicializar() {
		this.getBotonAdmin().setVisible(false);
	}
}