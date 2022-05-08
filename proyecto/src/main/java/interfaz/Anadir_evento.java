package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAnadir_evento;

public class Anadir_evento extends VistaAnadir_evento{
	/*private Label _tituloL;
	private event _anadir_foto;
	private Image _imagen;
	private Button _anadirFotoB;
	private Label _fechaL;
	private TextField _fechaTF;
	private Label _horaL;
	private TextField _horaTF;
	private Label _lugarL;
	private TextField _lugarTF;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Perfil_artista_propio _perfilArtista;
	
	public Anadir_evento() {
		Inicializar();
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

	private void Inicializar() {
		// TODO Auto-generated method stub
	}

	protected void Confirmar() {
		if (this.getFecha().isEmpty() || this.getHora().isEmpty() || this.getLugar().isEmpty()) {
			ControladorVistas.PopUpBasico("No se pueden dejar campos en blanco");
		}else {
			//Se guarda el evento
			_perfilArtista = new Perfil_artista_propio();
			_perfilArtista.getStyle().set("width", "100%");
			ControladorVistas.CambiarContenido(_perfilArtista);
		}
	}

	protected void Cancelar() {
		_perfilArtista = new Perfil_artista_propio();
		_perfilArtista.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_perfilArtista);
	}

	public void Anadir_foto() {
		throw new UnsupportedOperationException();
	}
}