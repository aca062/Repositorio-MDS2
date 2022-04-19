package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
			public void onComponentEvent(ComponentEvent event) {
				DarAltaAlbum();
			}
		});
		this.getBotonArtistas().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				DarAltaArtista();
			}
		});
		this.getBotonCanciones().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				DarAltaCancion();
			}
		});
		this.getBotonEstilos().addClickListener(new ComponentEventListener(){
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
	
	public void DarAltaAlbum() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_altaAlbumes = new Alta_albumes());
	}
	
	public void DarAltaArtista() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_altaArtistas = new Alta_artistas());
	}
	
	public void DarAltaCancion() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_altaCanciones = new Alta_canciones());
	}
	
	public void DarAltaEstilo() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_altaEstilos = new Alta_estilos());
	}
}