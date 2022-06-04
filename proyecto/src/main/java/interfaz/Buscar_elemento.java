package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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

        String buscado = this.getBuscador().getValue();

        this.getBuscador().addKeyDownListener(Key.ENTER, new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                _buscarAdministrador = new Buscar_administrador(buscado);
            }
        }, KeyModifier.SHIFT);
    }

    void Inicializar() {
        this.getBuscador().setVisible(true);
        this.getH1Titulo().setVisible(true);
        VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
        _buscarAdministrador = new Buscar_administrador();
        v1.add(_buscarAdministrador);
    }
}