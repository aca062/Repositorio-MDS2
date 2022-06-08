package interfaz;

import java.util.Vector;

import vistas.VistaLista_de_canciones;

public class Lista_de_canciones extends VistaLista_de_canciones {
    public Ver_detalle_album _verDetalleAlbum;
    public Ver_detalle_de_lista_comun _verDetalleDeListaComun;
    public Vector<Cancion> _cancion = new Vector<Cancion>();
    orm.bbdd.Cancion[] canciones;

    public Lista_de_canciones(orm.bbdd.Cancion[] canciones) {
        this.canciones = canciones;
        Inicializar();
    }

    void Inicializar() {
        for (orm.bbdd.Cancion cancion : canciones) {
            Cancion can = new Cancion();
            can.setCancion(cancion);
            this.getLayoutPrincipal().add(can);
        }
    }
}