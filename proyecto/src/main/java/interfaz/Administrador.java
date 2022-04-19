package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Administrador extends Actor_comun {
	//private Button _menuAdministracionB;
	public Perfil_administrador _perfilAdministrador;
	public Menu_administracion _menuAdministracion = new Menu_administracion();
	
	public Administrador() {
		super();
		this.getBotonAdmin().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				MenuAdministracion();
			}
		});
	}
	
	void InicializarAdmin() {
		
		/*VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_cabecera);
		_cabecera.getStyle().set("width", "100%");*/
		/*this.getBotonAdmin().setVisible(true);
		this.getBotonVerMasEstadisticas().setVisible(true);
		this.getH21Titulo().setVisible(true);
		this.getH2Recomendaciones().setVisible(true);
		this.getH31TituloCancionMas().setVisible(true);
		this.getH32NombreArtistaMas().setVisible(true);
		this.getH33TituloArtistaMas().setVisible(true);
		this.getH3NombreCancionMas().setVisible(true);
		this.getImg1Artista().setVisible(true);
		this.getImgCancionMas().setVisible(true);
		this.getLayoutAdministracion().setVisible(true);
		this.getLayoutArtistaMas().setVisible(true);
		this.getLayoutArtistas().setVisible(true);
		this.getLayoutCanciones().setVisible(true);
		this.getLayoutCancionesFav().setVisible(true);
		this.getLayoutCancionMas().setVisible(true);
		this.getLayoutEstadisticas().setVisible(true);
		this.getLayoutListas().setVisible(true);
		this.getLayoutListasRecomendaciones().setVisible(true);
		this.getLayoutMasEscuchadas().setVisible(true);
		this.getLayoutPrincipal().setVisible(true);
		this.getLayoutRecomendaciones().setVisible(true);
		this.getLayoutTituloEstadisticas().setVisible(true);
		this.getLayoutTituloRecomendaciones().setVisible(true);
		this.getLayoutUltimasCanciones().setVisible(true);
		this.getVistaArtistas_recomendados().setVisible(true);
		this.getVistaCanciones_favoritas().setVisible(true);
		this.getVistaCanciones_recomendadas().setVisible(true);
		this.getVistaListas_de_reproduccion_recomendadas().setVisible(true);
		this.getVistaUltimas_canciones_reproducidas().setVisible(true);*/
	}
	public void MenuAdministracion() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_menuAdministracion);
	}
}