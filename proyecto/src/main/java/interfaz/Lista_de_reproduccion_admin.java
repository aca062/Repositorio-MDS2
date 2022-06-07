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
	orm.bbdd.Lista_de_reproduccion lista;
    private iAdministrador adm = new BDPrincipal();

	public Lista_de_reproduccion_admin() {
        Inicializar();
        this.getImgLista().setSrc("https://media.tarkett-image.com/large/TH_25094225_25187225_001.jpg");
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

	public void ModificarLista(int i) {
		_modificarLista = new Modificar_lista(lista);
		_modificarLista.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_modificarLista);
	}

	void ConfirmarEliminacion(Dialog popup) {
        boolean correcto = adm.eliminarLista(lista.getIdLista());
        popup.close();
        if (correcto) {
            ControladorVistas.PopUpBasico("Lista de reproducción eliminada con éxito");
        } else {
            ControladorVistas.PopUpBasico("Error al eliminar la lista de reproducción");
        }
        ControladorVistas.CambiarContenido(new Buscar_administrador());
	}

	void Inicializar() {
		this.getEditar().setVisible(true);
		this.getImgLista().setVisible(true);
		this.getH4Nombre().setVisible(true);
	}

    public void setLista(Lista_de_reproduccion lista_de_reproduccion) {
        this.lista = lista_de_reproduccion;
        this.getH4Nombre().setText(lista_de_reproduccion.getNombre());
        this.setId(Integer.toString(lista_de_reproduccion.getIdLista()));
        this.getImgLista().setVisible(false);
    }
}