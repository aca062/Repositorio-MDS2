package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;

public class Perfil_artista_ajeno extends Perfil_artista_comun {
    public Listas_de_reproduccion_ajenas _listasDeReproduccionAjenas;
    /*
     * private event _seguir_Dejar_de_seguir; private Button _seguirDejarDeSeguirB;
     */
    public Artista_elemento _artistaElemento;
    orm.bbdd.Artista artista;
    iActor_comun bd = new BDPrincipal();

    public Perfil_artista_ajeno(orm.bbdd.Artista artista) {
        super(artista);
        this.artista = artista;
        Inicializar();
        Button botonSeguir = this.getBotonDejarSeguir();
        this.getBotonDejarSeguir().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                SeguirDejarSeguir();
                if (botonSeguir.getText().equals("Seguir")) {
                    botonSeguir.setText("Dejar de seguir");
                }else {
                    botonSeguir.setText("Seguir");
                }
            }
        });
    }

    protected void SeguirDejarSeguir() {
        int numero = bd.seguir_dejarDeSeguirArtista(ControladorVistas.getUsuario().getId(), artista.getId());
        this.getNumeroSeguidos().setText(Integer.toString(numero));
    }

    private void Inicializar() {
        if (ControladorVistas.getUsuario().seguido.contains(artista)) {
            this.getBotonDejarSeguir().setText("Dejar de seguir");
        }else {
            this.getBotonDejarSeguir().setText("Seguir");
        }
        this.getBotonAnadirFestivalConcierto().setVisible(false);
        this.getBotonEditarCorreo().setVisible(false);
        this.getH5Correo().setVisible(false);
        this.getBotonEditarFoto().setVisible(false);
        this.getBotonRecibirNotificaciones().setVisible(false);
        this.getBotonCrearNuevaLista().setVisible(false);
        this.getBotonDarseBaja().setVisible(false);
        this.getNumeroSeguidos1().setVisible(false);
        this.getTextoSeguidos().setVisible(false);
    }

    public void Seguir_Dejar_de_seguir() {
        throw new UnsupportedOperationException();
    }
}