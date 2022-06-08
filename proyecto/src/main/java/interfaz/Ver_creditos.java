package interfaz;

import orm.bbdd.Cancion;
import vistas.VistaVer_creditos;

public class Ver_creditos extends VistaVer_creditos {
    /*
     * private Label _tituloCreditosL; private Label _tituloCancionL; private Label
     * _tituloAlbumL; private Label _compositoresL; private Label _productoresL;
     * private Label _interpretesL;
     */
    public Ver_detalle_cancion _verDetalleCancion;
    public Reproductor_cibernauta _reproductorCibernauta;
    orm.bbdd.Cancion cancion;

    public Ver_creditos(Cancion cancion) {
        this.cancion = cancion;
        Inicializar();
    }

    void Inicializar() {
        String compositores = "Compositores: ";
        for (int i = 0; i < cancion.getCompositores().length; i++) {
            compositores += cancion.getCompositores()[i];
            if (i != cancion.getCompositores().length - 1) {
                compositores += ", ";
            }
        }
        this.getH4Compositores().setText(compositores);
        String productores = "Productores: ";
        for (int i = 0; i < cancion.getProductores().length; i++) {
            productores += cancion.getProductores()[i];
            if (i != cancion.getProductores().length - 1) {
                productores += ", ";
            }
        }
        this.getH4Productores().setText(productores);
        String interpretes = "Interpretes: ";
        for (int i = 0; i < cancion.getInterpretes().length; i++) {
            interpretes += cancion.getInterpretes()[i];
            if (i != cancion.getInterpretes().length - 1) {
                interpretes += ", ";
            }
        }
        this.getH4Interpretes().setText(interpretes);
        String albumes = "Álbum: ";
        for (int i = 0; i < cancion.album.toArray().length; i++) {
            albumes += cancion.album.toArray()[i];
            if (i != cancion.album.toArray().length - 1) {
                albumes += ", ";
            }
        }
        this.getH4TituloAlbum().setText(albumes);
        this.getH4TituloCancion().setText(cancion.getTitulo());
        this.getH3VerCreditos().setVisible(false);
        this.getH4Compositores().setVisible(true);
        this.getH4Interpretes().setVisible(true);
        this.getH4Productores().setVisible(true);
        this.getH4TituloAlbum().setVisible(true);
        this.getH4TituloCancion().setVisible(true);
    }
}