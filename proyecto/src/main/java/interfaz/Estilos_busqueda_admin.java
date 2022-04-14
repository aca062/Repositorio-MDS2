package interfaz;

import java.util.Vector;
import interfaz.Estilo_admin;
import vistas.VistaEstilos_busqueda_admin;

public class Estilos_busqueda_admin extends VistaEstilos_busqueda_admin{
	//private Label _tituloL;
	public Buscar_administrador _buscarAdministrador;
	public Vector<Estilo_admin> _estiloAdmin = new Vector<Estilo_admin>();
	Estilo_admin _esa = new Estilo_admin();
	
	public Estilos_busqueda_admin() {
		Inicializar();
	}
	void Inicializar() {
		this.getLayoutEstilo().add(_esa);
	}
}