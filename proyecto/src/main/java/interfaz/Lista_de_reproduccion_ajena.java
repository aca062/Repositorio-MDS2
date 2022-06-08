package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import orm.bbdd.Lista_de_reproduccion;
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
    iActor_comun bd = new BDPrincipal();
    Lista_de_reproduccion lista;


	public Lista_de_reproduccion_ajena() {
		Inicializar();
		this.getBotonNombre().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				DetalleLista();
			}
		});
	}

	protected void DetalleLista() {
		_verDetalleDeListaAjena = new Ver_detalle_de_lista_ajena(lista);
		_verDetalleDeListaAjena.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_verDetalleDeListaAjena);
	}

	public void Imagen_reproducir() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getBotonNombre().setVisible(true);
		this.getImgListaAjena().setVisible(true);

        /*int i = 0;

        for (orm.bbdd.Lista_de_reproduccion lista : bd.cargarListaRecomendada()) {
            i++;
            _listasDeReproduccionRecomendadas._listaDeReproduccionAjena.add(new Lista_de_reproduccion_ajena());
            _listasDeReproduccionRecomendadas._listaDeReproduccionAjena.lastElement().setLista(lista);
            this.getLayoutPrincipal().as(VerticalLayout.class).add(_listasDeReproduccionRecomendadas._listaDeReproduccionAjena.lastElement());
            if (i == 3) {
                break;
            }
        }*/
	}

    public void setLista(Lista_de_reproduccion lista) {
        this.lista = lista;
        this.getBotonNombre().setText(lista.getNombre());
        this.setId(Integer.toString(lista.getIdLista()));
        this.getBotonNombre().getStyle().set("width", "100%");
        this.getImgListaAjena().setSrc("https://m.media-amazon.com/images/I/214zIZyXvVL._AC_SY450_.jpg");

    }
}