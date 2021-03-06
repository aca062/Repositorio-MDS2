package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import orm.bbdd.Lista_de_reproduccion;

public class Ver_detalle_de_lista_ajena extends Ver_detalle_de_lista_comun {
    // private event _seguir_lista;
    public Lista_de_reproduccion_ajena _listaDeReproduccionAjena;
    Lista_de_reproduccion lista;
    iActor_comun bd = new BDPrincipal();

    public Ver_detalle_de_lista_ajena(Lista_de_reproduccion lista) {
        this.lista = lista;
        try {
            Inicializar();
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    protected void PerfilUsuario() {
        // TODO Auto-generated method stub

    }

    public void Seguir_lista() {
        throw new UnsupportedOperationException();
    }

    void Inicializar() throws PersistentException {
        this.getH2Titulo().setText(lista.getNombre());
        if (lista.getCreador().getNick() == ControladorVistas.getUsuario().getNick()) {
            this.getIdCreador().setText(lista.getCreador().getNick() + " (Tú)");
        }else {
            this.getIdCreador().setText(lista.getCreador().getNick());
        }
        this.getEliminar().setVisible(false);
        VerticalLayout layoutCanciones = this.getLayoutListaCanciones().as(VerticalLayout.class);
        orm.bbdd.Cancion[] canciones = bd.cargarCancionesLista(lista.getIdLista());
        for (orm.bbdd.Cancion cancion : canciones) {
            Cancion nueva = new Cancion();
            nueva.setCancion(cancion);
            layoutCanciones.add(nueva);
        }
    }
}