package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import bbdd.iCibernauta;
import orm.bbdd.Evento;
import vistas.VistaPerfil_artista_comun;

public class Perfil_artista_comun extends VistaPerfil_artista_comun {
    /*
     * private Image _fotoPerfil; private Label _nickL; private Label _emailL;
     * private Label _seguidoresL; private Label _nSeguidoresL; private Label
     * _seguidosL; private Label _nSeguidosL; private Label _tituloEventosL; private
     * Image _imagenEvento; private Label _fechaL; private Label _lugarL;
     */
    public Lista_album _listaAlbum;
    public Canciones_mas_escuchadas _cancionesMasEscuchadas;
    public Listas_de_reproduccion_en_las_que_aparece _listasDeReproduccionEnLasQueAparece;
    public Artistas_similares _artistasSimilares;
    iActor_comun bd = new BDPrincipal();
    iCibernauta cib = new BDPrincipal();

    public Perfil_artista_comun() {
        InicializarPropio();
        this.getBotonAnadirFestivalConcierto().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                try {
					AnadirEvento();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    public Perfil_artista_comun(orm.bbdd.Artista artista) {
        InicializarAjeno(artista);
    }

    private void InicializarPropio() {

        this.getH5Nombre().setText(ControladorVistas.getUsuario().getNick());
        if (ControladorVistas.getUsuario().getFoto() != null) {
            this.getFoto().setSrc(ControladorVistas.getUsuario().getFoto());
        } else {
            this.getFoto()
                    .setSrc("https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png");
        }
        this.getH5Nombre().setText(ControladorVistas.getUsuario().getNick());
        this.getH5Correo().setText(ControladorVistas.getUsuario().getEmail());
        this.getNumeroSeguidos1().setText(Integer.toString(ControladorVistas.getUsuario().seguido.size()));
        this.getNumeroSeguidos().setText(Integer.toString(ControladorVistas.getUsuario().seguidor.size()));


        try {
            Evento[] eventos = bd.cargarEventos(ControladorVistas.getUsuario().getId());
            int i = 1;
            for (Evento evento : eventos) {
                HorizontalLayout levento = new HorizontalLayout();
                levento.getStyle().set("align-self", "center");
                Image imagen = new Image();
                if (evento.getFoto() != null) {
                    imagen.setSrc(evento.getFoto());
                }
                levento.add(imagen);
                String event = evento.getLugar() + " | " + evento.getFecha() + " | " + evento.getHora();
                levento.add(new H5(event));
                if (i % 2 == 0) {
                    this.getLayoutFestivalesDer().as(VerticalLayout.class).add(levento);
                }else {
                    this.getLayoutFestivalesIzq().as(VerticalLayout.class).add(levento);
                }
                i++;
            }
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    protected void AnadirEvento() throws PersistentException {
        Anadir_evento anadirEvento = new Anadir_evento();
        anadirEvento.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(anadirEvento);
    }

    private void InicializarAjeno(orm.bbdd.Artista artista) {

        // this.getLayoutFotoPerfil().as(VerticalLayout.class).add(foto);
        this.getH5Nombre().setText(artista.getNick());
        if (artista.getFoto() != null) {
            this.getFoto().setSrc(artista.getFoto());
        } else {
            this.getFoto()
                    .setSrc("https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png");
        }
        this.getH5Nombre().setText(artista.getNick());
        this.getH5Correo().setText(artista.getEmail());
        this.getNumeroSeguidos1().setText(Integer.toString(artista.seguido.size()));
        this.getNumeroSeguidos().setText(Integer.toString(artista.seguidor.size()));

        Evento[] eventos;
        try {
            eventos = bd.cargarEventos(artista.getId());
            for (Evento evento : eventos) {
                HorizontalLayout levento = new HorizontalLayout();
                levento.getStyle().set("align-self", "center");
                Image imagen = new Image();
                if (evento.getFoto() != null) {
                    imagen.setSrc(evento.getFoto());
                }
                levento.add(imagen);
                String event = evento.getLugar() + " | " + evento.getFecha() + " | " + evento.getHora();
                levento.add(new H5(event));
            }
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}