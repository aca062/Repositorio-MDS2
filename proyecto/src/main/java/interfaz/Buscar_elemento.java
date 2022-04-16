package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBuscar_elemento;

public class Buscar_elemento extends VistaBuscar_elemento{
	/*private Label _tituloL;
	private Label _buscadorL;
	private TextField _buscadorTF;
	private Image _imagen;*/
	public Menu_administracion _menuAdministracion;
	public Buscar_administrador _buscarAdministrador = new Buscar_administrador();
	
	public Buscar_elemento() {
		Inicializar();
	}
	void Inicializar() {
		this.getBuscador().setVisible(true);
		this.getH1Titulo().setVisible(true);
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.add(_buscarAdministrador);
	}
}