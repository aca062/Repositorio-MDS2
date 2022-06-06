package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import orm.bbdd.Usuario_Registrado;
import vistas.VistaEditar_usuario;

public class Editar_usuario extends VistaEditar_usuario{
	/*private Label _editarUsuarioL;
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
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Usuario_admin _usuarioAdmin;

	public Editar_usuario(Usuario_Registrado usuario) {

		Inicializar(usuario);

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
		Buscar_elemento _buscarElemento = new Buscar_elemento();
		_buscarElemento.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_buscarElemento);
	}

	public void Cancelar() {
		Buscar_elemento _buscarElemento = new Buscar_elemento();
		_buscarElemento.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_buscarElemento);
	}

	public void Anadir_imagen() {
		throw new UnsupportedOperationException();
	}
	void Inicializar(Usuario_Registrado usuario) {
		this.getCancelar().setVisible(true);
		this.getConfirmar().setVisible(true);
		this.getNick().setVisible(true);
		this.getContraseña().setVisible(true);
		this.getConfirmarContraseña().setVisible(true);
		this.geteMail().setVisible(true);
		this.getAnadirFoto().setVisible(true);
		this.getImgUsuario().setVisible(true);
		this.getH2Titulo().setVisible(true);
	}
}