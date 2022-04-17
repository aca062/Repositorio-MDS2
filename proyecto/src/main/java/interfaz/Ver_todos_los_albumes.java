package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_todos_los_albumes;

public class Ver_todos_los_albumes extends VistaVer_todos_los_albumes{
	/*private event _pasar_pagina;
	private event _cambiar_paginacion;*/
	public Lista_album _listaAlbum;
	public Lista_albumes _listaAlbumes = new Lista_albumes();
	
	public Ver_todos_los_albumes() {
		Inicializar();
	}
	
	public void Pasar_pagina() {
		throw new UnsupportedOperationException();
	}

	public void Cambiar_paginacion() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		
		for(int i=0;i<3;i++) {
			
		}
		this.getLayoutAlbumes().add(_listaAlbumes);
		this.getH5NumeroPaginas().setVisible(true);
		this.getH5Paginas().setVisible(true);
		this.getBotonAdelante().setVisible(true);
		this.getBotonAtras().setVisible(true);
		
	}
}