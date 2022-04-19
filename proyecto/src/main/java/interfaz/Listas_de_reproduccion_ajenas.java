package interfaz;

import interfaz.Perfil_artista_ajeno;
import java.util.Vector;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Ver_listas_ajenas;
import vistas.VistaListas_de_reproduccion_ajenas;

public class Listas_de_reproduccion_ajenas extends VistaListas_de_reproduccion_ajenas{
	/*private Label _tituloL;
	private Button _verTodasB;*/
	public Perfil_ajeno _perfilAjeno;
	public Perfil_artista_ajeno _perfilArtistaAjeno;
	public Vector<Ver_listas_ajenas> _verListasAjenas = new Vector<Ver_listas_ajenas>();
	public Vector<Lista_de_reproduccion_ajena> _listaDeReproduccionAjena = new Vector<Lista_de_reproduccion_ajena>();
	
	public Listas_de_reproduccion_ajenas() {
		Inicializar();
		this.getVerMas().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				VerMas();
			}
		});
	}

	protected void VerMas() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Paginacion_listas_ajenas());
	}
	
	void Inicializar() {
		this.getH1Titulo().setVisible(true);
		this.getVerMas().setVisible(true);
		for(int i = 0;i<3;i++) {
			this.getLayoutListas().add(_listaDeReproduccionAjena.get(i));
		}
	}
}