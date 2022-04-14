package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import vistas.VistaUsuario_admin;

public class Usuario_admin extends VistaUsuario_admin{
	/*private event _eliminar;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Usuarios_busqueda_admin _usuariosBusquedaAdmin;
	public Editar_usuario _editarUsuario = new Editar_usuario();
	
	public Usuario_admin() {
		Inicializar();
		this.getBotonEditar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				EditarUsuario();
			}
		});
	}

	void Inicializar() {
		this.getH4NombrePerfil().setVisible(true);
		this.getBotonEliminar().setVisible(true);
		this.getBotonEditar().setVisible(true);
		
	}

	public void Eliminar() {
		throw new UnsupportedOperationException();
	}
	public void EditarUsuario() {
		
	}
}