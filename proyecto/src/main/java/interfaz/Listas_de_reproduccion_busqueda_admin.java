package interfaz;

import java.util.Vector;

import orm.bbdd.Lista_de_reproduccion;
import vistas.VistaListas_de_reproduccion_busqueda_admin;

public class Listas_de_reproduccion_busqueda_admin extends VistaListas_de_reproduccion_busqueda_admin{
	//private Label _tituloL;
	public Buscar_administrador _buscarAdministrador;
	public Vector<Lista_de_reproduccion_admin> _listaDeReproduccionAdmin = new Vector<Lista_de_reproduccion_admin>();

	public Listas_de_reproduccion_busqueda_admin() {
		Inicializar();
	}

	void Inicializar() {

	}

    public void anadirLista(Lista_de_reproduccion lista_de_reproduccion) {

        _listaDeReproduccionAdmin.add(new Lista_de_reproduccion_admin());

        _listaDeReproduccionAdmin.lastElement().setLista(lista_de_reproduccion);

        this.getLayoutListas().add(_listaDeReproduccionAdmin.lastElement());

    }
}