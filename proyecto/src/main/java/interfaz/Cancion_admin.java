package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

import vistas.VistaCancion_admin;

public class Cancion_admin extends VistaCancion_admin{
	/*private event _eliminar;
	private Image _imagen;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Canciones_busqueda_admin _cancionesBusquedaAdmin;
	public Editar_cancion _editarCancion = new Editar_cancion();
	
	
	public Cancion_admin() {
		Inicializar();
		this.getEditar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				EditarAlbum();
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
		//Más cosas
		Dialog popup = new Dialog();
		String nombreCancion = this.getH4Titulo().getText().toString();
		Text advertencia = new Text("¿Seguro que desea eliminar esta canción?");
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
				ConfirmarEliminacion(nombreCancion, popup);
			}
		});
        cancelar.addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				popup.close();
			}
		});
        ControladorVistas.PopUpFormularioEditar(popup);
	}
	
	public void EditarAlbum() {
		_editarCancion = new Editar_cancion();
		_editarCancion.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_editarCancion);
	}
	
	void ConfirmarEliminacion(String nombre, Dialog popup) {
		//Comprobar si hay canciones con ese estilo
		popup.close();
	}
	
	void Inicializar() {
		this.getEditar().setVisible(true);
		this.getEliminar().setVisible(true);
		this.getImgCancion().setVisible(true);
		this.getH4Titulo().setVisible(true);
	}
}