package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Contacto;
import vistas.VistaActor_comun;

public class Actor_comun extends VistaActor_comun{
	public Cabecera_pagina _cabecera = new Cabecera_pagina();
	public Reproductor _reproductor;
	public Canciones_favoritas _cancionesFavoritas = new Canciones_favoritas();
	public Canciones_recomendadas _cancionesRecomendadas;
	public Ultimas_canciones_reproducidas _ultimasCancionesReproducidas;
	public Estadisticas _unnamed_Estadisticas_;
	public Artistas_recomendados _artistasRecomendados;
	public Contacto _contacto;
	public Listas_de_reproduccion_recomendadas _listasDeReproduccionRecomendadas;
	/*private Button _cerrarSesionB;
	private Button _verPerfilB;
	private TextField _buscadorTF;
	private Button _buscadorB;
	private Label _estadisticasL;
	private Button _estadisticasVerTodosB;
	private Label _estadisticasArtistaNombreL;
	private Label _estadisticasArtistaTituloL;
	private Image _estadisticasArtistaImagen;
	private Label _estadisticasCancionNombreL;
	private Label _estadisticasCancionTituloL;
	private Image _estadisticasCancionImagen;
	private Label _contactoTituloL;
	private Button _contactoCorreoB;
	private Label _contactoTlfnL;
	private Button _logoB;*/
	
	
	//AAAAAAAAAAAAAAAA Actor_comun actor = new Actor_comun(true);
	
	
	/*public Actor_comun(boolean as) {
		
	}*/
	
	public Actor_comun() {
		Inicializar();
		
	}
	
	void Inicializar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_cabecera);
		_cabecera.getStyle().set("width", "100%");   
		_cabecera.getStyle().set("height", "100%");
		VerticalLayout contenido = _cabecera.getLayoutContenido().as(VerticalLayout.class);
		
		/*actor.getStyle().set("width", "100%");   
		actor.getStyle().set("height", "100%");
		contenido.add(actor);
		actor.getLayoutCancionesFav().add(_cancionesFavoritas);
		/*VerticalLayout v2 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v2.removeAll();1
		v2.getStyle().set("padding", "0");
		v2.add(_cabecera);*/
		/*Actor_comun actor = new Actor_comun(true);
		actor.getStyle().set("width", "100%");   
		actor.getStyle().set("height", "100%");
		v2.add(actor);
		actor.getLayoutCancionesFav().add(_cancionesFavoritas);
		_cabecera.getStyle().set("width", "100%");*/
	}
}