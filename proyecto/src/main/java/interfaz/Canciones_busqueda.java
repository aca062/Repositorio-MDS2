package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import vistas.VistaCanciones_busqueda;

public class Canciones_busqueda extends VistaCanciones_busqueda{
	//private Label _tituloL;
	public Buscar _buscar;
	public Vector<Cancion> _cancion = new Vector<Cancion>();
	String buscado;
    private iAdministrador adm = new BDPrincipal();

	public Canciones_busqueda(String buscado) {
	    this.buscado = buscado;
		Inicializar();
	}

    void Inicializar() {
        CargarCancionesBusqueda();
    }

    private void anadirCancion(orm.bbdd.Cancion cancion) {

        _cancion.add(new Cancion());

        _cancion.lastElement().setCancion(cancion);

        this.getLayoutPrincipal().as(VerticalLayout.class).add(_cancion.lastElement());
    }

    private void CargarCancionesBusqueda() {

        orm.bbdd.Cancion[] canciones = adm.busquedaCancion(buscado);
        if (canciones == null) {
            return;
        }

        if (canciones.length == 0) {
            this.getH1Titulo().setVisible(false);
        }else {
            for (orm.bbdd.Cancion cancion : canciones) {
                anadirCancion(cancion);
            }
        }
    }
}