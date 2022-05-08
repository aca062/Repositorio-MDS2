package interfaz;

import java.util.Vector;
import interfaz.Lista_de_reproduccion_ajena;
import vistas.VistaPaginacion_listas_ajenas;

public class Paginacion_listas_ajenas extends VistaPaginacion_listas_ajenas{
	//private Label _tiuloL;
	public Ver_listas_ajenas _verListasAjenas;
	public Vector<Lista_de_reproduccion_ajena> _listaDeReproduccionAjena = new Vector<Lista_de_reproduccion_ajena>();
	
	public Paginacion_listas_ajenas() {
		Inicializar();
	}
	void Inicializar() {
		this.getLista1().setVisible(false);
		this.getLista2().setVisible(false);
		this.getLista3().setVisible(false);
		this.getLista4().setVisible(false);
		_listaDeReproduccionAjena.add(new Lista_de_reproduccion_ajena());
		_listaDeReproduccionAjena.add(new Lista_de_reproduccion_ajena());
		_listaDeReproduccionAjena.add(new Lista_de_reproduccion_ajena());
		for(int i=0;i<3;i++) {
			this.getLayoutListas().add(_listaDeReproduccionAjena.get(i));
		}
	}
}