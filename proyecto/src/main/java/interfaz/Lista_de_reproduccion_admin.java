package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLista_de_reproduccion_admin;

public class Lista_de_reproduccion_admin extends VistaLista_de_reproduccion_admin{
	/*private event _eliminar;
	private Image _imagen;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Listas_de_reproduccion_busqueda_admin _listasDeReproduccionBusquedaAdmin;
	public Modificar_lista _modificarLista = new Modificar_lista();
	
	public Lista_de_reproduccion_admin() {
		Inicializar();
		this.getEditar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				ModificarLista();
			}
		});
		this.getEliminar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Eliminar();
			}
		});
	}

	public void Eliminar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Buscar_administrador());
	}
	
	public void ModificarLista() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_modificarLista);
	}
	
	void Inicializar() {
		this.getEditar().setVisible(true);
		this.getImgLista().setVisible(true);
		this.getH4Nombre().setVisible(true);
	}
}