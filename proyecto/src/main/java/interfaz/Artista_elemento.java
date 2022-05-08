package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaArtista_elemento;

public class Artista_elemento extends VistaArtista_elemento{
	/*private Button _nombreArtistaB;
	private Image _imagen;*/
	public Artistas_similares _artistasSimilares;
	public Artistas_busqueda _artistasBusqueda;
	public Artistas_recomendados _artistasRecomendados;
	public Perfil_artista_ajeno _perfilArtistaAjeno;
	
	public Artista_elemento() {
		Inicializar();
		this.getBotonNombre().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				PerfilArtista();
			}
		});
	}
	
	protected void PerfilArtista() {
		_perfilArtistaAjeno = new Perfil_artista_ajeno();
		_perfilArtistaAjeno.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_perfilArtistaAjeno);
	}

	void Inicializar() {
		this.getBotonNombre().setVisible(true);
		this.getImgArtista().setVisible(true);
	}
}