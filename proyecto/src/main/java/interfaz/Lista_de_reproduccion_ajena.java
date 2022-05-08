package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLista_de_reproduccion_ajena;

public class Lista_de_reproduccion_ajena extends VistaLista_de_reproduccion_ajena{
	/*private event _imagen_reproducir;
	private Image _imagen;
	private Label _tituloListaL;
	private Button _tituloListaB;*/
	public Paginacion_listas_ajenas _paginacionListasAjenas;
	public Listas_de_reproduccion_ajenas _listasDeReproduccionAjenas;
	public Listas_de_reproduccion_busqueda _listaDeReproduccionBusqueda;
	public Listas_de_reproduccion_recomendadas _listasDeReproduccionRecomendadas;
	public Ver_detalle_de_lista_ajena _verDetalleDeListaAjena;
	
	public Lista_de_reproduccion_ajena() {
		Inicializar();
		this.getBotonNombre().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				DetalleLista();
			}
		});
	}

	protected void DetalleLista() {
		_verDetalleDeListaAjena = new Ver_detalle_de_lista_ajena();
		_verDetalleDeListaAjena.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_verDetalleDeListaAjena);
	}

	public void Imagen_reproducir() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getBotonNombre().setVisible(true);
		this.getImgListaAjena().setVisible(true);
	}
}