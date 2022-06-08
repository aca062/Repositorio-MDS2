package interfaz;

import java.util.Vector;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import vistas.VistaVer_mas_canciones_favoritas;

public class Ver_mas_canciones_favoritas extends VistaVer_mas_canciones_favoritas{
	public Canciones_favoritas _cancionesFavoritas;
	
	public Lista_de_reproduccion_favoritos _listaDeReproduccionFavoritos;
	iActor_comun bd = new BDPrincipal();
	
	public Ver_mas_canciones_favoritas() {
		Inicializar();
	}

	private void Inicializar() {
		_listaDeReproduccionFavoritos = new Lista_de_reproduccion_favoritos();
		VerticalLayout layoutCanciones = this.getLayoutPrincipal().as(VerticalLayout.class);
		layoutCanciones.add(_listaDeReproduccionFavoritos);
		
    }
	
}