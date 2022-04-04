package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import vistas.VistaUltimas_canciones_reproducidas;
import vistas.VistaCanciones_favoritas;
import com.vaadin.flow.component.html.H2;
import vistas.VistaCanciones_recomendadas;
import vistas.VistaArtistas_recomendados;
import vistas.VistaListas_de_reproduccion_recomendadas;

/**
 * A Designer generated component for the vista-actor_comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-actor_comun")
@JsModule("./src/vistas/vista-actor_comun.ts")
public class VistaActor_comun extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutAdministracion")
	private HorizontalLayout layoutAdministracion;
	@Id("botonAdmin")
	private Button botonAdmin;
	@Id("layoutUltimasCanciones")
	private HorizontalLayout layoutUltimasCanciones;
	@Id("vistaUltimas_canciones_reproducidas")
	private Element vistaUltimas_canciones_reproducidas;
	@Id("vistaCanciones_favoritas")
	private Element vistaCanciones_favoritas;
	@Id("layoutCancionesFav")
	private HorizontalLayout layoutCancionesFav;
	@Id("layoutTituloRecomendaciones")
	private HorizontalLayout layoutTituloRecomendaciones;
	@Id("layoutRecomendaciones")
	private Element layoutRecomendaciones;
	@Id("layoutListasRecomendaciones")
	private HorizontalLayout layoutListasRecomendaciones;
	@Id("h2Recomendaciones")
	private H2 h2Recomendaciones;
	@Id("layoutCanciones")
	private Element layoutCanciones;
	@Id("vistaCanciones_recomendadas")
	private Element vistaCanciones_recomendadas;
	@Id("layoutArtistas")
	private Element layoutArtistas;
	@Id("vistaArtistas_recomendados")
	private Element vistaArtistas_recomendados;
	@Id("layoutListas")
	private Element layoutListas;
	@Id("vistaListas_de_reproduccion_recomendadas")
	private Element vistaListas_de_reproduccion_recomendadas;
	@Id("layoutTituloEstadisticas")
	private HorizontalLayout layoutTituloEstadisticas;
	@Id("h21Titulo")
	private H2 h21Titulo;
	@Id("layoutEstadisticas")
	private Element layoutEstadisticas;
	@Id("botonVerMasEstadisticas")
	private Button botonVerMasEstadisticas;
	@Id("layoutMasEscuchadas")
	private HorizontalLayout layoutMasEscuchadas;
	@Id("layoutArtistaMas")
	private Element layoutArtistaMas;
	@Id("h33TituloArtistaMas")
	private H3 h33TituloArtistaMas;
	@Id("img1Artista")
	private Image img1Artista;
	@Id("h32NombreArtistaMas")
	private H3 h32NombreArtistaMas;
	@Id("layoutCancionMas")
	private Element layoutCancionMas;
	@Id("h31TituloCancionMas")
	private H3 h31TituloCancionMas;
	@Id("imgCancionMas")
	private Image imgCancionMas;
	@Id("h3NombreCancionMas")
	private H3 h3NombreCancionMas;

	/**
     * Creates a new VistaActor_comun.
     */
    public VistaActor_comun() {
        // You can initialise any data required for the connected UI components here.
    }

}
