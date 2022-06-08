package interfaz;

public class Perfil_administrador extends Perfil {
	/*private event _editar_foto_perfil;
	private event _editar_e_mail;*/
	public Administrador _administrador;

	public Perfil_administrador() {
	    super();
	    this.getBotonDarseBaja().setVisible(false);
	}

	public void Editar_foto_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Editar_e_mail() {
		throw new UnsupportedOperationException();
	}
}