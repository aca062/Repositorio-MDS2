package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import orm.bbdd.Lista_de_reproduccion;
import vistas.VistaModificar_lista;

public class Modificar_lista extends VistaModificar_lista{
	/*private event _eliminar_cancion;
	private Label _editarListaL;
	private Label _nombreL;
	private TextField _nombreTF;
	private Label _listaCancionesL;
	private Dropdown _listaCancionesD;
	private TextField _listaCancionesTF;
	private Label _listaCancionesList;
	private Button _eliminarB;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Lista_de_reproduccion_admin _listaDeReproduccionAdmin;
	public Ver_detalle_de_lista_propia _verDetalleDeListaPropia;

	public Modificar_lista(Lista_de_reproduccion lista) {

		Inicializar(lista);

		this.getBotonCancelar().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});

		this.getBotonConfirmar().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});
	}

	public void Eliminar_cancion() {
		throw new UnsupportedOperationException();
	}
	void Inicializar(Lista_de_reproduccion lista) {
	}
	public void Cancelar() {
		//Depende de si es admin o no
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Buscar_administrador());
	}
	public void Confirmar() {
		//Depende de si es admin o no
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Buscar_administrador());
	}
}