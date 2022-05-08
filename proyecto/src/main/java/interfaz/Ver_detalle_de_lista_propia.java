package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_detalle_de_lista_propia extends Ver_detalle_de_lista_comun {
	//private event _eliminar_lista;
	public Lista_de_reproduccion_propia _listaDeReproduccionPropia;
	public Modificar_lista _modificarLista;
	
	public Ver_detalle_de_lista_propia() {
		Inicializar();
	}
	
	void Inicializar() {
		VerticalLayout layoutCanciones = this.getLayoutCanciones().as(VerticalLayout.class);
		layoutCanciones.add(new Cancion());
		layoutCanciones.add(new Cancion());
		layoutCanciones.add(new Cancion());
	}

	public void Eliminar_lista() {
		throw new UnsupportedOperationException();
	}
}