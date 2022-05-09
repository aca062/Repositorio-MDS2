package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
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
		Dialog popup = new Dialog();
		String nombreUsuario = this.getH4NombrePerfil().getText().toString();
		Text advertencia = new Text("¿Seguro que desea eliminar este usuario?");
        VerticalLayout dialogLayout = new VerticalLayout(advertencia);
        popup.add(dialogLayout);
        Button confirmar = new Button("Confirmar");
        Button cancelar = new Button("Cancelar");
        popup.add(cancelar);
        popup.add(confirmar);
        popup.setWidth("40%");
        cancelar.getStyle().set("margin-right", "20px");
        confirmar.addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				ConfirmarEliminacion(nombreUsuario, popup);
			}
		});
        cancelar.addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				popup.close();
			}
		});
        ControladorVistas.PopUpFormularioEditar(popup);
	}
	
	void ConfirmarEliminacion(String nombre, Dialog popup) {
		//Comprobar si hay canciones con ese estilo
		popup.close();
	}
	
	public void EditarUsuario() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_editarUsuario = new Editar_usuario());
	}
}