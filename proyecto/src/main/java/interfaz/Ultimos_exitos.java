package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import bbdd.BDPrincipal;
import bbdd.iCibernauta;
import vistas.VistaUltimos_exitos;

public class Ultimos_exitos extends VistaUltimos_exitos {
    // private Label _tituloL;
    public Cibernauta _cibernauta;
    public Vector<Cancion_cibernauta> _cancionCibernauta = new Vector<Cancion_cibernauta>();
    iCibernauta cb = new BDPrincipal();

    public Ultimos_exitos() {
        try {
            Inicializar();
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    void Inicializar() throws PersistentException {
        orm.bbdd.Cancion[] canciones = cb.cargarCancionesAdmin();
        for (orm.bbdd.Cancion cancion : canciones) {
            _cancionCibernauta.add(new Cancion_cibernauta());
            _cancionCibernauta.lastElement().setCancion(cancion);
            this.getLayoutCanciones().add(_cancionCibernauta.lastElement());
        }
    }
}