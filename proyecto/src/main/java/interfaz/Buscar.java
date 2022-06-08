package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBuscar;

public class Buscar extends VistaBuscar{
	/*private Label _tituloCancionL;
	private Label _tituloListaL;
	private Label _tituloArtistaL;*/
	public Cabecera_pagina _cabecera;
	public Artistas_busqueda _artistasBusqueda;
	public Canciones_busqueda _cancionesBusqueda;
	public Listas_de_reproduccion_busqueda _listaDeReproduccionBusqueda;

	public Buscar(String buscado) {
		Inicializar(buscado);
	}

	public void Filtro_palabras_malsonantes() {
		throw new UnsupportedOperationException();
	}

	void Inicializar(String buscado) {
	    _artistasBusqueda = new Artistas_busqueda(buscado);
		VerticalLayout v1 = this.getLayoutArtistas().as(VerticalLayout.class);
		v1.add(_artistasBusqueda);
		_cancionesBusqueda = new Canciones_busqueda(buscado);
		VerticalLayout v2 = this.getLayoutCanciones().as(VerticalLayout.class);
		v2.add(_cancionesBusqueda);
		_listaDeReproduccionBusqueda = new Listas_de_reproduccion_busqueda(buscado);
		VerticalLayout v3 = this.getLayoutListas().as(VerticalLayout.class);
		v3.add(_listaDeReproduccionBusqueda);
	}
}