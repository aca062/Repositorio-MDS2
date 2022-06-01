package interfaz;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import orm.bbdd.CancionDAO;
import vistas.VistaAlta_albumes;

public class Alta_albumes extends VistaAlta_albumes{
	/*private Label _altaAlbumL;
	private event _anadir_imagen;
	private Image _imagen;
	private Button _anadirImagenB;
	private Label _tituloL;
	private TextField _tituloTF;
	private Label _nombreL;
	private TextField _nombreTF;
	private Label _fechaEdicionL;
	private TextField _fechaEdicionTF;
	private Label _listaCancionL;
	private Dropdown _listaCancionD;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Dar_de_alta _darDeAlta = new Dar_de_alta();
	iAdministrador adm = new BDPrincipal();
	String pathFoto = null;
	
	
	public Alta_albumes() throws PersistentException {
		Inicializar();
		orm.bbdd.Cancion[] canciones = null;
		canciones = CancionDAO.listCancionByQuery(null, null);
		
		List<String> nombreCanciones = new Vector<String>(canciones.length);
		for(orm.bbdd.Cancion cancion : canciones) {
			nombreCanciones.add(cancion.getTitulo());
		}
		this.getEstilo().setItems(nombreCanciones);
		
		this.getCancelar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
		this.getConfirmar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});
	}

	protected void Confirmar() {
		//adm.AltaAlbum(pathFoto, this.getTitulo().getValue(), this.getFechaEdicion().getValue(), this.getNombreArtista().getValue(),nombreCanciones);
		_darDeAlta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_darDeAlta);
	}

	protected void Cancelar() {
		_darDeAlta = new Dar_de_alta();
		_darDeAlta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_darDeAlta);
		
	}

	public void Anadir_imagen() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getConfirmar().setVisible(true);
		this.getCancelar().setVisible(true);
		this.getFechaEdicion().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getTitulo().setVisible(true);
		this.getImg().setVisible(true);
		this.getNombreArtista().setVisible(true);
		this.getAnadirImagen().setVisible(true);
	}
}