package interfaz;

import java.util.Vector;
import interfaz.Lista_de_reproduccion_propia;
import interfaz.Ver_listas_propias;

public class Listas_de_reproduccion_propias {
	private Label _tituloL;
	private Button _verListasPropiasB;
	public Perfil _perfil;
	public Perfil_artista_propio _perfilArtista;
	public Vector<Lista_de_reproduccion_propia> _listaDeReproduccionPropia = new Vector<Lista_de_reproduccion_propia>();
	public Vector<Ver_listas_propias> _verListasPropias = new Vector<Ver_listas_propias>();
}