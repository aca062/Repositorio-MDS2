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

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutAdministracion() {
		return layoutAdministracion;
	}

	public void setLayoutAdministracion(HorizontalLayout layoutAdministracion) {
		this.layoutAdministracion = layoutAdministracion;
	}

	public Button getBotonAdmin() {
		return botonAdmin;
	}

	public void setBotonAdmin(Button botonAdmin) {
		this.botonAdmin = botonAdmin;
	}

	public HorizontalLayout getLayoutUltimasCanciones() {
		return layoutUltimasCanciones;
	}

	public void setLayoutUltimasCanciones(HorizontalLayout layoutUltimasCanciones) {
		this.layoutUltimasCanciones = layoutUltimasCanciones;
	}

	public Element getVistaUltimas_canciones_reproducidas() {
		return vistaUltimas_canciones_reproducidas;
	}

	public void setVistaUltimas_canciones_reproducidas(Element vistaUltimas_canciones_reproducidas) {
		this.vistaUltimas_canciones_reproducidas = vistaUltimas_canciones_reproducidas;
	}

	public Element getVistaCanciones_favoritas() {
		return vistaCanciones_favoritas;
	}

	public void setVistaCanciones_favoritas(Element vistaCanciones_favoritas) {
		this.vistaCanciones_favoritas = vistaCanciones_favoritas;
	}

	public HorizontalLayout getLayoutCancionesFav() {
		return layoutCancionesFav;
	}

	public void setLayoutCancionesFav(HorizontalLayout layoutCancionesFav) {
		this.layoutCancionesFav = layoutCancionesFav;
	}

	public HorizontalLayout getLayoutTituloRecomendaciones() {
		return layoutTituloRecomendaciones;
	}

	public void setLayoutTituloRecomendaciones(HorizontalLayout layoutTituloRecomendaciones) {
		this.layoutTituloRecomendaciones = layoutTituloRecomendaciones;
	}

	public Element getLayoutRecomendaciones() {
		return layoutRecomendaciones;
	}

	public void setLayoutRecomendaciones(Element layoutRecomendaciones) {
		this.layoutRecomendaciones = layoutRecomendaciones;
	}

	public HorizontalLayout getLayoutListasRecomendaciones() {
		return layoutListasRecomendaciones;
	}

	public void setLayoutListasRecomendaciones(HorizontalLayout layoutListasRecomendaciones) {
		this.layoutListasRecomendaciones = layoutListasRecomendaciones;
	}

	public H2 getH2Recomendaciones() {
		return h2Recomendaciones;
	}

	public void setH2Recomendaciones(H2 h2Recomendaciones) {
		this.h2Recomendaciones = h2Recomendaciones;
	}

	public Element getLayoutCanciones() {
		return layoutCanciones;
	}

	public void setLayoutCanciones(Element layoutCanciones) {
		this.layoutCanciones = layoutCanciones;
	}

	public Element getVistaCanciones_recomendadas() {
		return vistaCanciones_recomendadas;
	}

	public void setVistaCanciones_recomendadas(Element vistaCanciones_recomendadas) {
		this.vistaCanciones_recomendadas = vistaCanciones_recomendadas;
	}

	public Element getLayoutArtistas() {
		return layoutArtistas;
	}

	public void setLayoutArtistas(Element layoutArtistas) {
		this.layoutArtistas = layoutArtistas;
	}

	public Element getVistaArtistas_recomendados() {
		return vistaArtistas_recomendados;
	}

	public void setVistaArtistas_recomendados(Element vistaArtistas_recomendados) {
		this.vistaArtistas_recomendados = vistaArtistas_recomendados;
	}

	public Element getLayoutListas() {
		return layoutListas;
	}

	public void setLayoutListas(Element layoutListas) {
		this.layoutListas = layoutListas;
	}

	public Element getVistaListas_de_reproduccion_recomendadas() {
		return vistaListas_de_reproduccion_recomendadas;
	}

	public void setVistaListas_de_reproduccion_recomendadas(Element vistaListas_de_reproduccion_recomendadas) {
		this.vistaListas_de_reproduccion_recomendadas = vistaListas_de_reproduccion_recomendadas;
	}

	public HorizontalLayout getLayoutTituloEstadisticas() {
		return layoutTituloEstadisticas;
	}

	public void setLayoutTituloEstadisticas(HorizontalLayout layoutTituloEstadisticas) {
		this.layoutTituloEstadisticas = layoutTituloEstadisticas;
	}

	public H2 getH21Titulo() {
		return h21Titulo;
	}

	public void setH21Titulo(H2 h21Titulo) {
		this.h21Titulo = h21Titulo;
	}

	public Element getLayoutEstadisticas() {
		return layoutEstadisticas;
	}

	public void setLayoutEstadisticas(Element layoutEstadisticas) {
		this.layoutEstadisticas = layoutEstadisticas;
	}

	public Button getBotonVerMasEstadisticas() {
		return botonVerMasEstadisticas;
	}

	public void setBotonVerMasEstadisticas(Button botonVerMasEstadisticas) {
		this.botonVerMasEstadisticas = botonVerMasEstadisticas;
	}

	public HorizontalLayout getLayoutMasEscuchadas() {
		return layoutMasEscuchadas;
	}

	public void setLayoutMasEscuchadas(HorizontalLayout layoutMasEscuchadas) {
		this.layoutMasEscuchadas = layoutMasEscuchadas;
	}

	public Element getLayoutArtistaMas() {
		return layoutArtistaMas;
	}

	public void setLayoutArtistaMas(Element layoutArtistaMas) {
		this.layoutArtistaMas = layoutArtistaMas;
	}

	public H3 getH33TituloArtistaMas() {
		return h33TituloArtistaMas;
	}

	public void setH33TituloArtistaMas(H3 h33TituloArtistaMas) {
		this.h33TituloArtistaMas = h33TituloArtistaMas;
	}

	public Image getImg1Artista() {
		return img1Artista;
	}

	public void setImg1Artista(Image img1Artista) {
		this.img1Artista = img1Artista;
	}

	public H3 getH32NombreArtistaMas() {
		return h32NombreArtistaMas;
	}

	public void setH32NombreArtistaMas(H3 h32NombreArtistaMas) {
		this.h32NombreArtistaMas = h32NombreArtistaMas;
	}

	public Element getLayoutCancionMas() {
		return layoutCancionMas;
	}

	public void setLayoutCancionMas(Element layoutCancionMas) {
		this.layoutCancionMas = layoutCancionMas;
	}

	public H3 getH31TituloCancionMas() {
		return h31TituloCancionMas;
	}

	public void setH31TituloCancionMas(H3 h31TituloCancionMas) {
		this.h31TituloCancionMas = h31TituloCancionMas;
	}

	public Image getImgCancionMas() {
		return imgCancionMas;
	}

	public void setImgCancionMas(Image imgCancionMas) {
		this.imgCancionMas = imgCancionMas;
	}

	public H3 getH3NombreCancionMas() {
		return h3NombreCancionMas;
	}

	public void setH3NombreCancionMas(H3 h3NombreCancionMas) {
		this.h3NombreCancionMas = h3NombreCancionMas;
	}

}
