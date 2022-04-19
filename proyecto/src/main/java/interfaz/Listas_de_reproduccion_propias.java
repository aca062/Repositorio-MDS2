package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Lista_de_reproduccion_propia;
import interfaz.Ver_listas_propias;
import vistas.VistaListas_de_reproduccion_propias;

public class Listas_de_reproduccion_propias extends VistaListas_de_reproduccion_propias{
	/*private Label _tituloL;
	private Button _verListasPropiasB;*/
	public Perfil _perfil;
	public Perfil_artista_propio _perfilArtista;
	public Vector<Lista_de_reproduccion_propia> _listaDeReproduccionPropia = new Vector<Lista_de_reproduccion_propia>();
	public Vector<Ver_listas_propias> _verListasPropias = new Vector<Ver_listas_propias>();
	
	public Listas_de_reproduccion_propias() {
		super();
		Inicializar();
		this.getVerTodas().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				VerTodas();
			}
		});
	}

	protected void VerTodas() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Paginacion_listas_propias());
	}
	
	private void Inicializar() {
		
	}
	
}