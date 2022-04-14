package interfaz;

import com.vaadin.flow.component.ComponentEventListener;
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
	public Editar_artista() {
		Inicializar();
		
	}
	public Artista_admin _artistaAdmin;

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