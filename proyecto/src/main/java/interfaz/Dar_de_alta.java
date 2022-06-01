package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import vistas.VistaDar_de_alta;

public class Dar_de_alta extends VistaDar_de_alta{
	/*private Label _tituloL;
	private Image _imagenArtista;
	private Button _artistaB;
	private Image _imagenCancion;
	private Button _cancionB;
	private Image _imagenAlbum;
	private Button _albumB;
	private Image _imagenEstilo;
	private Button _estiloB;*/
	public Menu_administracion _menuAdministracion;
	public Alta_estilos _altaEstilos;
	public Alta_canciones _altaCanciones;
	public Alta_artistas _altaArtistas;
	public Alta_albumes _altaAlbumes;

	public Dar_de_alta() {
		Inicializar();
		this.getBotonAlbumes().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				try {
					DarAltaAlbum();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		this.getBotonArtistas().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				try {
                    DarAltaArtista();
                } catch (PersistentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
			}
		});
		this.getBotonCanciones().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				try {
					DarAltaCancion();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		this.getBotonEstilos().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				DarAltaEstilo();
			}
		});
	}

	void Inicializar() {
		this.getBotonAlbumes().setVisible(true);
		this.getBotonArtistas().setVisible(true);
		this.getBotonCanciones().setVisible(true);
		this.getBotonEstilos().setVisible(true);
		this.getH1Titulo().setVisible(true);
	}

	public void DarAltaAlbum() throws PersistentException {
		_altaAlbumes = new Alta_albumes();
		_altaAlbumes.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_altaAlbumes);
	}

	public void DarAltaArtista() throws PersistentException {
		_altaArtistas = new Alta_artistas();
		_altaArtistas.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_altaArtistas);
	}

	public void DarAltaCancion() throws PersistentException {
		_altaCanciones = new Alta_canciones();
		_altaCanciones.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_altaCanciones);
	}

	public void DarAltaEstilo() {
		_altaEstilos = new Alta_estilos();
		_altaEstilos.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_altaEstilos);
	}
}