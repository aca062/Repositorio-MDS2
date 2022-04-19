package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPerfil_artista_comun;

public class Perfil_artista_comun extends VistaPerfil_artista_comun{
	/*private Image _fotoPerfil;
	private Label _nickL;
	private Label _emailL;
	private Label _seguidoresL;
	private Label _nSeguidoresL;
	private Label _seguidosL;
	private Label _nSeguidosL;
	private Label _tituloEventosL;
	private Image _imagenEvento;
	private Label _fechaL;
	private Label _lugarL;*/
	public Lista_album _listaAlbum;
	public Canciones_mas_escuchadas _cancionesMasEscuchadas;
	public Listas_de_reproduccion_en_las_que_aparece _listasDeReproduccionEnLasQueAparece;
	public Artistas_similares _artistasSimilares;
	
	public Perfil_artista_comun() {
		Inicializar();
		this.getBotonAnadirFestivalConcierto().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				AnadirEvento();
			}
		});
	}

	protected void AnadirEvento() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Anadir_evento());
	}

	private void Inicializar() {
		// TODO Auto-generated method stub
	}
	
	
}