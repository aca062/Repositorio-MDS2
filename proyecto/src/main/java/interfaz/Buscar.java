package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBuscar;

public class Buscar extends VistaBuscar{
	/*private Label _tituloCancionL;
	private Label _tituloListaL;
	private Label _tituloArtistaL;*/
	public Cabecera_pagina _cabecera;
	public Artistas_busqueda _artistasBusqueda = new Artistas_busqueda();
	public Canciones_busqueda _cancionesBusqueda = new Canciones_busqueda();
	public Listas_de_reproduccion_busqueda _listaDeReproduccionBusqueda = new Listas_de_reproduccion_busqueda();
	
	public Buscar() {
		Inicializar();
	}

	public void Filtro_palabras_malsonantes() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		VerticalLayout v1 = this.getLayoutArtistas().as(VerticalLayout.class);
		v1.add(_artistasBusqueda);
		VerticalLayout v2 = this.getLayoutCanciones().as(VerticalLayout.class);
		v2.add(_cancionesBusqueda);
		VerticalLayout v3 = this.getLayoutListas().as(VerticalLayout.class);
		v3.add(_listaDeReproduccionBusqueda);
	}
}