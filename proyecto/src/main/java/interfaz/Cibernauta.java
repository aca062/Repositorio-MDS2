package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCibernauta;

public class Cibernauta extends VistaCibernauta{
	public Reproductor_cibernauta _reproductorCibernauta;
	public Ultimos_exitos _ultimosExitos;
	
	public Cibernauta() {
		Inicializar();
	}
	
	void Inicializar() {
		_ultimosExitos = new Ultimos_exitos();
		this.getLayoutPrincipal().as(VerticalLayout.class).add(_ultimosExitos);
		this.getLayoutPrincipal().setVisible(true);	
	}
}