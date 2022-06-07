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
import orm.bbdd.Album;
import vistas.VistaAlbum_admin;

public class Album_admin extends VistaAlbum_admin {
    /*
     * private event _eliminar; private Image _imagen; private Label _nombreL;
     * private Button _editarB; private Button _eliminarB;
     */
    public Albumes_busqueda_admin _albumesBusquedaAdmin;
    public Editar_album _editarAlbum;
    private iAdministrador adm = new BDPrincipal();
    orm.bbdd.Album album;

    public Album_admin() {
        Inicializar();
        this.getEditar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                EditarAlbum();
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
        // Más cosas
        Dialog popup = new Dialog();
        String nombreAlbum = this.getH4Titulo().getText().toString();
        Text advertencia = new Text("¿Seguro que desea eliminar este álbum?");
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
                ConfirmarEliminacion(nombreAlbum, popup);
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

    public void EditarAlbum() {
        VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
        v1.removeAll();
        v1.add(_editarAlbum = new Editar_album(album));
    }

    void ConfirmarEliminacion(String nombre, Dialog popup) {
        boolean correcto = adm.eliminarAlbum(album.getIdAlbum());
        popup.close();
        if (correcto) {
            ControladorVistas.PopUpBasico("Album eliminado con éxito");
        } else {
            ControladorVistas.PopUpBasico("Error al eliminar el álbum");
        }
        ControladorVistas.CambiarContenido(new Buscar_administrador());
    }

    void Inicializar() {
        this.getImgAlbum().setVisible(true);
        this.getH4Titulo().setVisible(true);
        this.getEliminar().setVisible(true);
        this.getEditar().setVisible(true);
    }

    public void setAlbum(Album album) {
        this.album = album;
        this.getH4Titulo().setText(album.getTitulo());
        this.setId(Integer.toString(album.getIdAlbum()));
        if (album.getImagen() == null || album.getImagen().equals("")) {
            this.setImgAlbum(
                    "https://www.grupoalvic.com/wp-content/plugins/productos-alvic/productos/muestras/ZMD-Gris-nube-con-efecto.jpg");
        } else {
            String foto = "img/albumes/" + album.getImagen().split("/")[album.getImagen().split("/").length - 1];
            this.setImgAlbum(foto);
        }
    }
}