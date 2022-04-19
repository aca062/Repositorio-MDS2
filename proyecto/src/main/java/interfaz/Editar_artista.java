package interfaz;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.ComponentEvent;
import vistas.VistaEditar_artista;

public class Editar_artista extends VistaEditar_artista{
	/*private Label _editarArtistaL;
	private event _anadir_imagen;
	private Image _imagen;
	private Button _anadirFotoB;
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
	public Artista_admin _artistaAdmin;
	
	public Editar_artista() {
		Inicializar();
		
		this.getConfirmar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});
		this.getCancelar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
	}

	public void Confirmar() {
		//Más cosas
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Buscar_administrador());
	}
	
	public void Cancelar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Buscar_administrador());
	}

	public void Anadir_imagen() {
		throw new UnsupportedOperationException();
	}
	
	void Inicializar() {
		this.getCancelar().setVisible(true);
		this.getConfirmar().setVisible(true);
		this.getEstilo().setVisible(true);
		this.getNick().setVisible(true);
		this.getContraseña().setVisible(true);
		this.getConfirmarContraseña().setVisible(true);
		this.geteMail().setVisible(true);
		this.getAnadirFoto().setVisible(true);
		this.getImgArtista().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getListaEstilos().setVisible(false);
		}
}