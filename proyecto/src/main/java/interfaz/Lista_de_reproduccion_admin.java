package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import orm.bbdd.Lista_de_reproduccion;
import vistas.VistaLista_de_reproduccion_admin;

public class Lista_de_reproduccion_admin extends VistaLista_de_reproduccion_admin{
	/*private event _eliminar;
	private Image _imagen;
	private Label _nombreL;
	private Button _editarB;
	private Button _eliminarB;*/
	public Listas_de_reproduccion_busqueda_admin _listasDeReproduccionBusquedaAdmin;
	public Modificar_lista _modificarLista;

	public Lista_de_reproduccion_admin() {
        Inicializar();
        this.getEditar().addClickListener(new ComponentEventListener(){
            @Override
            public void onComponentEvent(ComponentEvent event) {
                EditarLista();
            }
        });
        this.getEliminar().addClickListener(new ComponentEventListener(){
            @Override
            public void onComponentEvent(ComponentEvent event) {
                Eliminar();
            }
        });
    }

	protected void EditarLista() {
        // TODO Auto-generated method stub

    }

    public Lista_de_reproduccion_admin(Lista_de_reproduccion lista) {
		Inicializar();
		this.setH4Nombre(new H4(lista.getNombre()));
		this.getImgLista().setSrc("https://media.tarkett-image.com/large/TH_25094225_25187225_001.jpg");
		this.setIdLista(lista.getIdLista());

		this.getEditar().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				ModificarLista(lista.getIdLista());
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
		String nombreLista = this.getH4Nombre().getText().toString();
		Text advertencia = new Text("¿Seguro que desea eliminar esta lista de reproducción?");
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
				ConfirmarEliminacion(nombreLista, popup);
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

	public void ModificarLista(int i) {
		_modificarLista = new Modificar_lista();
		_modificarLista.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_modificarLista);
	}

	void ConfirmarEliminacion(String nombre, Dialog popup) {
		//Comprobar si hay canciones con ese estilo
		popup.close();
	}

	void Inicializar() {
		this.getEditar().setVisible(true);
		this.getImgLista().setVisible(true);
		this.getH4Nombre().setVisible(true);
	}

    public void setLista(Lista_de_reproduccion lista_de_reproduccion) {
        this.getH4Nombre().setText(lista_de_reproduccion.getNombre());
        this.setId(Integer.toString(lista_de_reproduccion.getIdLista()));
        this.getImgLista().setVisible(false);
    }
}