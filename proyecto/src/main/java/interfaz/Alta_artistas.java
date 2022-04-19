package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAlta_artistas;

public class Alta_artistas extends VistaAlta_artistas{
	/*private Label _altaArtistaL;
	private event _anadir_imagen;
	private Image _imagen;
	private Button _anadirImagenB;
	private Label _nickL;
	private TextField _nickTF;
	private Label _passwordL;
	private TextField _passwordTF;
	private Label _confirmarPassL;
	private TextField _confirmarPassTF;
	private Label _emailL;
	private TextField _emailTF;
	private Label _estilosL;
	private Dropdown _estilosD;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Dar_de_alta _darDeAlta = new Dar_de_alta();
	
	public Alta_artistas() {
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

	protected void Confirmar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_darDeAlta);
	}

	protected void Cancelar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_darDeAlta);
		
	}

	public void Anadir_imagen() {
		throw new UnsupportedOperationException();
	}
	void Inicializar() {
		this.getAnadirFoto().setVisible(true);
		this.getCancelar().setVisible(true);
		this.getConfirmar().setVisible(true);
		this.getContraseña().setVisible(true);
		this.getConfirmarContraseña().setVisible(true);
		this.geteMail().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getImgArtista().setVisible(true);
		this.getNick().setVisible(true);
	}
}