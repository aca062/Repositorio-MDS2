package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaUsuario_admin;

public class Usuario_admin extends VistaUsuario_admin{
	/*private event _eliminar;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Usuarios_busqueda_admin _usuariosBusquedaAdmin;
	public Editar_usuario _editarUsuario;
	
	public Usuario_admin() {
		Inicializar();
		this.getBotonEditar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				EditarUsuario();
			}
		});
		this.getBotonEliminar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Eliminar();
			}
		});
	}

	void Inicializar() {
		this.getH4NombrePerfil().setVisible(true);
		this.getBotonEliminar().setVisible(true);
		this.getBotonEditar().setVisible(true);
		
	}

	public void Eliminar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Buscar_administrador());
	}
	
	public void EditarUsuario() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_editarUsuario = new Editar_usuario());
	}
}