package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import orm.bbdd.Lista_de_reproduccion;
import vistas.VistaLista_de_reproduccion_propia;

public class Lista_de_reproduccion_propia extends VistaLista_de_reproduccion_propia{
	/*private event _imagen_reproducir;
	private Image _imagen;
	private Label _tituloCancionListaL;*/
	public Listas_de_reproduccion_propias _listasDeReproduccionPropia;
	public Paginacion_listas_propias _paginacionListasPropias;
	public Ver_detalle_de_lista_propia _verDetalleDeListaPropia;
	orm.bbdd.Lista_de_reproduccion lista;

	public Lista_de_reproduccion_propia() {
		Inicializar();
		this.getBotonNombre().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				DetalleLista();
			}
		});
	}

	protected void DetalleLista() {
		_verDetalleDeListaPropia = new Ver_detalle_de_lista_propia(lista);
		_verDetalleDeListaPropia.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_verDetalleDeListaPropia);
	}

	public void Imagen_reproducir() {
		throw new UnsupportedOperationException();
	}

	private void Inicializar() {


	}

    public void setLista(Lista_de_reproduccion lista) {
        this.lista = lista;
        this.getBotonNombre().setText(lista.getNombre());
        this.setId(Integer.toString(lista.getIdLista()));
        this.getBotonNombre().getStyle().set("width", "100%");
        this.getImgListaPropia().setSrc("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Solid_orange.svg/800px-Solid_orange.svg.png");
    }
}