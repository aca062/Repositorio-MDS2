package interfaz;

import vistas.VistaCibernauta;

public class Cibernauta extends VistaCibernauta{
	public Cabecera_cibernauta _cabeceraCibernauta;
	public Reproductor_cibernauta _reproductorCibernauta;
	public Ultimos_exitos _ultimosExitos;
	
	public Cibernauta() {
		Inicializar();
	}
	
	void Inicializar() {
		_cabeceraCibernauta = new Cabecera_cibernauta();
		this.setCabecera(_cabeceraCibernauta);
		this.getCabecera().setVisible(true);
		this.getCabecera().Inicializar();
		this.getLayoutPrincipal().setVisible(true);
		this.getVistaUltimos_exitos().setVisible(true);
	}
}