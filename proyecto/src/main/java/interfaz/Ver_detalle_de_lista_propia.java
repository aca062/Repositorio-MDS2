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
import bbdd.BD_Listas_de_reproduccion;
import bbdd.iActor_comun;
import orm.bbdd.Lista_de_reproduccion;

public class Ver_detalle_de_lista_propia extends Ver_detalle_de_lista_comun {
	//private event _eliminar_lista;
	public Lista_de_reproduccion_propia _listaDeReproduccionPropia;
	public Modificar_lista _modificarLista;
    iActor_comun bd = new BDPrincipal();
    Lista_de_reproduccion lista;
    BD_Listas_de_reproduccion bdListas = new BD_Listas_de_reproduccion();

	public Ver_detalle_de_lista_propia(Lista_de_reproduccion lista) {
	    this.lista = lista;
		try {
            Inicializar();
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.getEliminar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                Eliminar();
            }
        });
	}

	void Inicializar() throws PersistentException {
	    this.getH2Titulo().setText(lista.getNombre());
	    this.getIdCreador().setVisible(false);
		VerticalLayout layoutCanciones = this.getLayoutListaCanciones().as(VerticalLayout.class);
		orm.bbdd.Cancion[] canciones = bd.cargarCancionesLista(lista.getIdLista());
		for (orm.bbdd.Cancion cancion : canciones) {
		    Cancion nueva = new Cancion();
		    nueva.setCancion(cancion);
		    layoutCanciones.add(nueva);
		}
	}

    public void Eliminar() {
        // Más cosas
        Dialog popup = new Dialog();
        Text advertencia = new Text("¿Seguro que desea eliminar esta lista?");
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
		try {
            bdListas.eliminarLista(lista.getIdLista());
            ControladorVistas.PopUpBasico("La lista se ha eliminado correctamente");
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
        } catch (PersistentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}