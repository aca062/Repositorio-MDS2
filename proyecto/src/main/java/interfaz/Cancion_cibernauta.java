package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import bbdd.BD_Canciones;
import orm.bbdd.Cancion;
import vistas.VistaCancion_cibernauta;

public class Cancion_cibernauta extends VistaCancion_cibernauta{
	/*private event _imagen_reproducir;
	private Image _imagen;
	private Label _nombreL;*/
	public Ultimos_exitos _ultimosExitos;
	Cancion cancion;
	BD_Canciones bdCanciones = new BD_Canciones();

	public Cancion_cibernauta() {
		Inicializar();
	}

	public void Imagen_reproducir() {
		throw new UnsupportedOperationException();
	}

	void Inicializar() {
	}

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
        if (cancion.getRutaImagen() != null) {
            this.getImgCancionCIbernauta().setSrc(cancion.getRutaImagen());
        }else {
            this.getImgCancionCIbernauta().setSrc("https://m.media-amazon.com/images/I/214zIZyXvVL._AC_SY450_.jpg");
        }
        this.getH5Titulo().setText(cancion.getTitulo());
        this.getImgCancionCIbernauta().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                ControladorVistas.GetReproductor().setSource(cancion.getArchivoMultimedia());
                try {
                    bdCanciones.aumentarRep(cancion.getIdCancion());
                } catch (PersistentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }
}