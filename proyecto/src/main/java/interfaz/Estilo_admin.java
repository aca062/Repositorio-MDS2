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
import orm.bbdd.Estilo;
import vistas.VistaEstilo_admin;

public class Estilo_admin extends VistaEstilo_admin{
	/*private event _eliminar;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Estilos_busqueda_admin _estilosBusquedaAdmin;
	public Editar_estilo _editarEstilo;
    private iAdministrador adm = new BDPrincipal();
	orm.bbdd.Estilo estilo;

	public Estilo_admin() {
		Inicializar();
		this.getEditar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				EditarEstilo();
			}
		});
		this.getEliminar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Eliminar();
			}
		});
	}

	public void Eliminar() {
		Dialog popup = new Dialog();
		String nombreEstilo = this.getEstilo().getText().toString();
		Text advertencia = new Text("¿Seguro que desea eliminar el estilo?");
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
				ConfirmarEliminacion(nombreEstilo, popup);
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

	void Inicializar() {
		this.getEliminar().setVisible(true);
		this.getEditar().setVisible(true);
		this.getEstilo().setVisible(true);
	}

	void ConfirmarEliminacion(String nombre, Dialog popup) {
        boolean correcto = adm.eliminarEstilo(estilo.getIdEstilo());
        popup.close();
        if (correcto) {
            ControladorVistas.PopUpBasico("Estilo eliminado con éxito");
        } else {
            ControladorVistas.PopUpBasico("Alguna canción o artista aún tiene el estilo, por lo que no se ha podido eliminar");
        }
        ControladorVistas.CambiarContenido(new Buscar_administrador());
	}

	public void EditarEstilo() {
		_editarEstilo = new Editar_estilo(estilo);
		_editarEstilo.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_editarEstilo);
	}

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
        this.getEstilo().setText(estilo.getNombre());
        this.setId(Integer.toString(estilo.getIdEstilo()));
    }
}