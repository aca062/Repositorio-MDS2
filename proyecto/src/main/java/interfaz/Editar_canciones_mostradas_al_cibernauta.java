package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import vistas.VistaEditar_canciones_mostradas_al_cibernauta;

public class Editar_canciones_mostradas_al_cibernauta extends VistaEditar_canciones_mostradas_al_cibernauta {

    iAdministrador bd = new BDPrincipal();
    public Menu_administracion _menuAdministracion;

    public Editar_canciones_mostradas_al_cibernauta() {
        try {
            Inicializar();
        } catch (PersistentException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        this.getConfirmar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                try {
                    Confirmar();
                } catch (PersistentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        this.getCancelar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                Cancelar();
            }
        });
    }

    public void Confirmar() throws PersistentException {
        // Más cosas
        int comprobacion = bd.editarCancionesCibernauta(this.getVaadinTextArea().getValue().split(","),
                ControladorVistas.getUsuario().getId());

        if (comprobacion == -1) {
            ControladorVistas.PopUpBasico("Alguna de las canciones introducidas no existe");
        } else {
            ControladorVistas.PopUpBasico("Las canciones se han cambiado correctamente");
            _menuAdministracion = new Menu_administracion();
            _menuAdministracion.getStyle().set("width", "100%");
            ControladorVistas.CambiarContenido(_menuAdministracion);
        }
    }

    public void Cancelar() {
        _menuAdministracion = new Menu_administracion();
        _menuAdministracion.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_menuAdministracion);
    }

    void Inicializar() throws PersistentException {
        orm.bbdd.Cancion[] canciones = bd.cargarCancionesCibernauta(ControladorVistas.getUsuario().getId());
        String cancions = "";
        for (int i = 0; i < canciones.length; i++) {
            cancions += canciones[i].getTitulo();
            if (i < canciones.length - 1) {
                cancions += ", ";
            }
        }
        this.getVaadinTextArea().setValue(cancions);
        this.getCancelar().setVisible(true);
        this.getConfirmar().setVisible(true);
        this.getH2Titulo().setVisible(true);
    }
}