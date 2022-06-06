package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaBuscar_elemento;

public class Buscar_elemento extends VistaBuscar_elemento {
    /*
     * private Label _tituloL; private Label _buscadorL; private TextField
     * _buscadorTF; private Image _imagen;
     */
    public Menu_administracion _menuAdministracion;
    public Buscar_administrador _buscarAdministrador;

    public Buscar_elemento() {
        Inicializar();

        TextField buscador = this.getBuscador();

        this.getBuscador().addKeyDownListener(Key.ENTER, new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                String buscado = buscador.getValue();
                CambiarBuscar(buscado);
            }
        }, KeyModifier.SHIFT);
    }

    void Inicializar() {
        this.getBuscador().setVisible(true);
        this.getH1Titulo().setVisible(true);
        VerticalLayout v1 = this.getLayoutBusqueda().as(VerticalLayout.class);
        v1.getStyle().set("width", "100%");
        _buscarAdministrador = new Buscar_administrador();
        v1.add(_buscarAdministrador);
    }

    void CambiarBuscar(String buscado) {
        VerticalLayout v1 = this.getLayoutBusqueda().as(VerticalLayout.class);
        v1.removeAll();
        _buscarAdministrador = new Buscar_administrador(buscado);
        v1.add(_buscarAdministrador);
    }
}