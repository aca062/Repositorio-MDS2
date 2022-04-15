package interfaz;

import vistas.VistaCabecera_cibernauta;

public class Cabecera_cibernauta extends VistaCabecera_cibernauta{
	/*private Button _loginB;
	private Button _logoB;*/
	public Cibernauta _cibernauta;
	public Login_cibernauta _loginCibernauta;
	
	public Cabecera_cibernauta() {
		Inicializar();
	}
	
	void Inicializar() {
		this.getContacto().setVisible(true);
		this.getIniciarSesion().setVisible(true);
		this.getLayoutCabecera().setVisible(true);
		this.getLayoutPrincipal().setVisible(true);
		this.getLogo().setVisible(true);
	}
}