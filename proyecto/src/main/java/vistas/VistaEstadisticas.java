package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.charts.Chart;

/**
 * A Designer generated component for the vista-estadisticas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-estadisticas")
@JsModule("./src/vistas/vista-estadisticas.ts")
public class VistaEstadisticas extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutEstadisticas")
	private HorizontalLayout layoutEstadisticas;
	@Id("h2TituloEst")
	private H2 h2TituloEst;
	@Id("h21masEscuchadas")
	private H2 h21masEscuchadas;
	@Id("layoutEstadisticasMas")
	private HorizontalLayout layoutEstadisticasMas;
	@Id("layoutCancion")
	private Element layoutCancion;
	@Id("h4")
	private H4 h4;
	@Id("h41Titulo")
	private H4 h41Titulo;
	@Id("imgCancion")
	private Image imgCancion;
	@Id("h42Veces")
	private H4 h42Veces;
	@Id("layoutArtista")
	private Element layoutArtista;
	@Id("h43")
	private H4 h43;
	@Id("img1Artista")
	private Image img1Artista;
	@Id("h44Nombre")
	private H4 h44Nombre;
	@Id("h45Horas")
	private H4 h45Horas;
	@Id("layoutAlbum")
	private Element layoutAlbum;
	@Id("h46")
	private H4 h46;
	@Id("img2Album")
	private Image img2Album;
	@Id("h47Nombre")
	private H4 h47Nombre;
	@Id("h48Horas")
	private H4 h48Horas;
	@Id("layoutLista")
	private Element layoutLista;
	@Id("h49")
	private H4 h49;
	@Id("img3Lista")
	private Image img3Lista;
	@Id("h410Nombre")
	private H4 h410Nombre;
	@Id("h411Horas")
	private H4 h411Horas;
	@Id("h22Uso")
	private H2 h22Uso;
	@Id("layoutTiempoUso")
	private HorizontalLayout layoutTiempoUso;
	@Id("layoutUso")
	private Element layoutUso;
	@Id("h412")
	private H4 h412;
	@Id("h413")
	private H4 h413;
	@Id("layoutGrafica")
	private Element layoutGrafica;
	@Id("graficaUso")
	private Chart graficaUso;
	@Id("layoutMedia")
	private Element layoutMedia;
	@Id("h415")
	private H4 h415;
	@Id("h416")
	private H4 h416;

	/**
     * Creates a new VistaEstadisticas.
     */
    public VistaEstadisticas() {
        // You can initialise any data required for the connected UI components here.
    }

}
