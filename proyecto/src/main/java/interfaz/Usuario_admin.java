package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import orm.bbdd.Usuario_Registrado;
import vistas.VistaUsuario_admin;

public class Usuario_admin extends VistaUsuario_admin{
	/*private event _eliminar;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Usuarios_busqueda_admin _usuariosBusquedaAdmin;
	public Editar_usuario _editarUsuario;
    private iAdministrador adm = new BDPrincipal();
	orm.bbdd.Usuario_Registrado usuario;

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
			@Override
            public void onComponentEvent(ComponentEvent event) {
				ConfirmarEliminacion(popup);
			}
		});
        cancelar.addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				popup.close();
			}
		});
        ControladorVistas.PopUpFormularioEditar(popup);
	}

	void ConfirmarEliminacion(Dialog popup) {
        boolean correcto = adm.eliminarUsuario(usuario.getId());
        popup.close();
        if (correcto) {
            ControladorVistas.PopUpBasico("Usuario eliminado con éxito");
        } else {
            ControladorVistas.PopUpBasico("Error al eliminar el usuario");
        }
        ControladorVistas.CambiarContenido(new Buscar_administrador());
	}

	public void EditarUsuario() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_editarUsuario = new Editar_usuario(usuario));
	}

    public void setUsuario(Usuario_Registrado usuario_Registrado) {
        this.usuario = usuario_Registrado;
        this.getH4NombrePerfil().setText(usuario_Registrado.getNick());
        this.setId(Integer.toString(usuario_Registrado.getId()));
    }
}