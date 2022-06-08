package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;

public class Perfil_artista_propio extends Perfil_artista_comun {
    /*
     * private event _editar_foto_perfil; private event _recibir_notificacion;
     * private event _dar_de_baja; private event _editar_e_mail; private Button
     * _editarFotoPerfilB; private Button _editarEmailB; private Label _tusListasL;
     * private Button _crearListaB; private Image _imagenLista; private Label
     * _tituloListaL; private Button _verTodasB; private Button _anadirFestivalesB;
     * private Button _darBajaB; private Button _recibirNotificacionesB;
     */
    public Artista _artista;
    public Cibernauta _cibernauta;
    public Anadir_evento _anadirEvento;
    iAdministrador bd = new BDPrincipal();
    public Crear_lista_de_reproduccion _crearListaDeReproduccion;
    public Listas_de_reproduccion_propias _listasDeReproduccionPropia;

    public Perfil_artista_propio() {
        super();
        this.getBotonDejarSeguir().setVisible(false);
        this.getBotonDarseBaja().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                DarDeBaja();
            }
        });
        this.getBotonAnadirFestivalConcierto().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                try {
                    AnadirFestival();
                } catch (PersistentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        this.getBotonCrearNuevaLista().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                CrearLista();
            }
        });

    }

    protected void CrearLista() {
        _crearListaDeReproduccion = new Crear_lista_de_reproduccion();
        _crearListaDeReproduccion.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_crearListaDeReproduccion);
    }

    protected void Cibernauta() {
        Cabecera_cibernauta cab = new Cabecera_cibernauta();
        _cibernauta = new Cibernauta();
        _cibernauta.getStyle().set("width", "100%");
        cab.getStyle().set("width", "100%");
        ControladorVistas.CambiarCabecera(cab);
        ControladorVistas.CambiarContenido(_cibernauta);

    }

    public void AnadirFestival() throws PersistentException {
        _anadirEvento = new Anadir_evento();
        _anadirEvento.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_anadirEvento);
    }

    public void DarDeBaja() {
        Dialog popup = new Dialog();
        Text advertencia = new Text("¿Seguro que desea darse de baja?");
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
                Confirmar_Eliminar(popup);
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

    public void Confirmar_Eliminar(Dialog popup) {
        popup.close();
        ControladorVistas.PopUpBasico("El usuario se ha dado de baja correctamente");
        bd.eliminarArtista(ControladorVistas.getUsuario().getId());
        Cibernauta();
    }

    public void Editar_foto_perfil() {
        throw new UnsupportedOperationException();
    }
}