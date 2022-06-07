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
import vistas.VistaArtista_admin;

public class Artista_admin extends VistaArtista_admin {
    /*
     * private event _eliminar; private Image _imagen; private Label _nombreL;
     * private Button _editarB; private Button _eliminarB;
     */
    public Artistas_busqueda_admin _artistasBusquedaAdmin;
    public Editar_artista _editarArtista;
    orm.bbdd.Artista artista;
    private iAdministrador adm = new BDPrincipal();

    public Artista_admin() {
        Inicializar();
        this.getEditar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                EditarArtista();
            }
        });
        this.getEliminar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                Eliminar();
            }
        });
    }

    public void Eliminar() {
        Dialog popup = new Dialog();
        String nombreArtista = this.getH4Nombre().getText().toString();
        Text advertencia = new Text("¿Seguro que desea eliminar este artista?");
        VerticalLayout dialogLayout = new VerticalLayout(advertencia);
        popup.add(dialogLayout);
        Button confirmar = new Button("Confirmar");
        Button cancelar = new Button("Cancelar");
        popup.add(cancelar);
        popup.add(confirmar);
        popup.setWidth("40%");
        cancelar.getStyle().set("margin-right", "20px");
        confirmar.addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                ConfirmarEliminacion(nombreArtista, popup);
            }
        });
        cancelar.addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                popup.close();
            }
        });
        ControladorVistas.PopUpFormularioEditar(popup);
    }

    void Inicializar() {
        this.getH4Nombre().setVisible(true);
        this.getImgArtista().setVisible(true);
        this.getEliminar().setVisible(true);
        this.getEditar().setVisible(true);
    }

    void ConfirmarEliminacion(String nombre, Dialog popup) {
        // Comprobar si hay canciones con ese estilo
        popup.close();
        boolean correcto = adm.eliminarArtista(artista.getId());
        popup.close();
        if (correcto) {
            ControladorVistas.PopUpBasico("Artista eliminado con éxito");
        } else {
            ControladorVistas.PopUpBasico("Error al eliminar el artista");
        }
        ControladorVistas.CambiarContenido(new Buscar_administrador());
    }

    public void EditarArtista() {
        _editarArtista = new Editar_artista(artista);
        _editarArtista.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_editarArtista);
    }

    public void setArtista(orm.bbdd.Artista artista) {
        this.artista = artista;
        this.getH4Nombre().setText(artista.getNick());
        this.setId(Integer.toString(artista.getId()));
        if (artista.getFoto() == null || artista.getFoto().equals("")) {
            this.setImgArtista(
                    "https://www.grupoalvic.com/wp-content/plugins/productos-alvic/productos/muestras/ZMD-Gris-nube-con-efecto.jpg");
        } else {
            this.setImgArtista(artista.getFoto());
        }

    }
}