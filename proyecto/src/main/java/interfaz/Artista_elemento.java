package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import orm.bbdd.Artista;
import vistas.VistaArtista_elemento;

public class Artista_elemento extends VistaArtista_elemento{
	/*private Button _nombreArtistaB;
	private Image _imagen;*/
	public Artistas_similares _artistasSimilares;
	public Artistas_busqueda _artistasBusqueda;
	public Artistas_recomendados _artistasRecomendados;
	public Perfil_artista_ajeno _perfilArtistaAjeno;
	orm.bbdd.Artista artista;

	public Artista_elemento() {
		Inicializar();
		this.getBotonNombre().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				PerfilArtista();
			}
		});
	}

	protected void PerfilArtista() {
		_perfilArtistaAjeno = new Perfil_artista_ajeno(artista);
		_perfilArtistaAjeno.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_perfilArtistaAjeno);
	}

	void Inicializar() {
		this.getBotonNombre().setVisible(true);
		this.getImgArtista().setVisible(true);
	}

    public void setArtista(Artista artista) {
        this.artista = artista;
        this.getBotonNombre().setText(artista.getNick());
        this.setId(Integer.toString(artista.getId()));
        this.getBotonNombre().getStyle().set("width", "100%");
        if (artista.getFoto() != null && !artista.getFoto().equals("")) {
            this.getImgArtista().setSrc(artista.getFoto());
        } else {
            this.getImgArtista().setSrc("https://m.media-amazon.com/images/I/214zIZyXvVL._AC_SY450_.jpg");
        }
    }
}