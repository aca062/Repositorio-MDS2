package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCancion;

public class Cancion extends VistaCancion{
	/*private event _imagen_reproducir;
	private Image _imagen;
	private Button _tituloCancionB;*/
	public Canciones_busqueda _cancionesBusqueda;
	public Canciones_favoritas _cancionesFavoritas;
	public Canciones_recomendadas _cancionesRecomendadas;
	public Ultimas_canciones_reproducidas _ultimasCancionesReproducidas;
	public Lista_de_canciones _listaDeCanciones;
	public Ver_detalle_cancion _verDetalleCancion;

	public Cancion() {
		Inicializar();
		this.getBotonNombre().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				DetalleCancion();
			}
		});
	}
	
	protected void DetalleCancion() {
		_verDetalleCancion = new Ver_detalle_cancion();
		_verDetalleCancion.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_verDetalleCancion);
	}

	public void Imagen_reproducir() {
		throw new UnsupportedOperationException();
	}
	
	void Inicializar() {
		this.getBotonCancion().setVisible(true);
		this.getMeGusta().setVisible(true);
		this.getNumeroRep().setVisible(true);
	}
}