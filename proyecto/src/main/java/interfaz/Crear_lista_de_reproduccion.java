package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import vistas.VistaCrear_lista_de_reproduccion;

public class Crear_lista_de_reproduccion extends VistaCrear_lista_de_reproduccion {
    /*
     * private Label _tituloL; private Label _nombreL; private TextField _nombreTF;
     * private Label _listaCancionL; private Dropdown _listaCancionD; private
     * TextField _listaCancionTF; private Label _listaCancionList; private Button
     * _cancelarB; private Button _confirmarB;
     */
    public Perfil _perfil;
    public Perfil_artista_propio _perfilArtista;
    iActor_comun bd = new BDPrincipal();

    public Crear_lista_de_reproduccion() {
        Inicializar();
        this.getConfirmar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                Confirmar();
            }
        });
        this.getCancelar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                Cancelar();
            }
        });
    }

    public void Confirmar() {
        if (this.getNombre().getValue().equals("")) {
            ControladorVistas.PopUpBasico("No se ha introducido ningún nombre");
        } else {
            int comprobacion = bd.crearLista(this.getNombre().getValue(),
                    this.getVaadinTextArea().getValue().split(","), ControladorVistas.getUsuario().getId());

            if (comprobacion == -2) {
                ControladorVistas.PopUpBasico("Ya tienes una lista de reproducción con ese nombre");
            } else if (comprobacion == -1) {
                ControladorVistas.PopUpBasico("Una de las canciones añadidas no existe");
            } else if (comprobacion == -3) {
                ControladorVistas.PopUpBasico("Se ha producido un error");
            } else {
                ControladorVistas.PopUpBasico("La lista se ha creado correctamente");
                if (ControladorVistas.getTipoUsuario().equals("admin")) {
                    Perfil_administrador _administrador = new Perfil_administrador();
                    _administrador.getStyle().set("width", "100%");
                    ControladorVistas.CambiarContenido(_administrador);
                } else if (ControladorVistas.getTipoUsuario().equals("artista")) {
                    Perfil_artista_propio _artista = new Perfil_artista_propio();
                    _artista.getStyle().set("width", "100%");
                    ControladorVistas.CambiarContenido(_artista);
                } else {
                    Perfil_usuario_registrado _usuario = new Perfil_usuario_registrado();
                    _usuario.getStyle().set("width", "100%");
                    ControladorVistas.CambiarContenido(_usuario);
                }
            }
        }
    }

    public void Cancelar() {
        if (ControladorVistas.getTipoUsuario().equals("admin")) {
            Perfil_administrador _administrador = new Perfil_administrador();
            _administrador.getStyle().set("width", "100%");
            ControladorVistas.CambiarContenido(_administrador);
        } else if (ControladorVistas.getTipoUsuario().equals("artista")) {
            Perfil_artista_propio _artista = new Perfil_artista_propio();
            _artista.getStyle().set("width", "100%");
            ControladorVistas.CambiarContenido(_artista);
        } else {
            Perfil_usuario_registrado _usuario = new Perfil_usuario_registrado();
            _usuario.getStyle().set("width", "100%");
            ControladorVistas.CambiarContenido(_usuario);
        }
    }

    void Inicializar() {
        this.getCancelar().setVisible(true);
        this.getH2Titulo().setVisible(true);
        this.getConfirmar().setVisible(true);
        this.getNombre().setVisible(true);
    }
}