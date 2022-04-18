package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
		this.getLayoutPrincipal().as(VerticalLayout.class).add(_cabeceraCibernauta);
		this.getLayoutPrincipal().setVisible(true);	}
}