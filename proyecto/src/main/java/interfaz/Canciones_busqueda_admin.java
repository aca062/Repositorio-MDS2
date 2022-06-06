package interfaz;

import java.util.Vector;

import vistas.VistaCanciones_busqueda_admin;

public class Canciones_busqueda_admin extends VistaCanciones_busqueda_admin {
    // private Label _tituloL;
    public Buscar_administrador _buscarAdministrador;
    public Vector<Cancion_admin> _cancionAdmin = new Vector<Cancion_admin>();

    public Canciones_busqueda_admin() {
        Inicializar();
    }

    void Inicializar() {



        /*
         * _cancionAdmin.add(new Cancion_admin()); _cancionAdmin.add(new
         * Cancion_admin()); _cancionAdmin.add(new Cancion_admin()); for(int i
         * =0;i<3;i++) { this.getLayoutCanciones().add(_cancionAdmin.get(i)); }
         * this.getH1Titulo().setVisible(true);
         */
    }

    void anadirCancion(orm.bbdd.Cancion cancion) {

        _cancionAdmin.add(new Cancion_admin());

        _cancionAdmin.lastElement().setCancion(cancion);

        this.getLayoutCanciones().add(_cancionAdmin.lastElement());

    }
}