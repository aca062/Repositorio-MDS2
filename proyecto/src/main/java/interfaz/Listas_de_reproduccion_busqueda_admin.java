package interfaz;

import java.util.Vector;

import vistas.VistaListas_de_reproduccion_busqueda_admin;

public class Listas_de_reproduccion_busqueda_admin extends VistaListas_de_reproduccion_busqueda_admin{
	//private Label _tituloL;
	public Buscar_administrador _buscarAdministrador;
	public Vector<Lista_de_reproduccion_admin> _listaDeReproduccionAdmin = new Vector<Lista_de_reproduccion_admin>();

	public Listas_de_reproduccion_busqueda_admin() {
		Inicializar();
	}

	void Inicializar() {
		_listaDeReproduccionAdmin.add(new Lista_de_reproduccion_admin());
		_listaDeReproduccionAdmin.add(new Lista_de_reproduccion_admin());
		_listaDeReproduccionAdmin.add(new Lista_de_reproduccion_admin());
		this.getH1Titulo().setVisible(true);
		for(int i=0;i<3;i++) {
			this.getLayoutListas().add(_listaDeReproduccionAdmin.get(i));
		}
	}
}