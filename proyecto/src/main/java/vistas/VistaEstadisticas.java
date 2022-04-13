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

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public HorizontalLayout getLayoutEstadisticas() {
		return layoutEstadisticas;
	}

	public void setLayoutEstadisticas(HorizontalLayout layoutEstadisticas) {
		this.layoutEstadisticas = layoutEstadisticas;
	}

	public H2 getH2TituloEst() {
		return h2TituloEst;
	}

	public void setH2TituloEst(H2 h2TituloEst) {
		this.h2TituloEst = h2TituloEst;
	}

	public H2 getH21masEscuchadas() {
		return h21masEscuchadas;
	}

	public void setH21masEscuchadas(H2 h21masEscuchadas) {
		this.h21masEscuchadas = h21masEscuchadas;
	}

	public HorizontalLayout getLayoutEstadisticasMas() {
		return layoutEstadisticasMas;
	}

	public void setLayoutEstadisticasMas(HorizontalLayout layoutEstadisticasMas) {
		this.layoutEstadisticasMas = layoutEstadisticasMas;
	}

	public Element getLayoutCancion() {
		return layoutCancion;
	}

	public void setLayoutCancion(Element layoutCancion) {
		this.layoutCancion = layoutCancion;
	}

	public H4 getH4() {
		return h4;
	}

	public void setH4(H4 h4) {
		this.h4 = h4;
	}

	public H4 getH41Titulo() {
		return h41Titulo;
	}

	public void setH41Titulo(H4 h41Titulo) {
		this.h41Titulo = h41Titulo;
	}

	public Image getImgCancion() {
		return imgCancion;
	}

	public void setImgCancion(Image imgCancion) {
		this.imgCancion = imgCancion;
	}

	public H4 getH42Veces() {
		return h42Veces;
	}

	public void setH42Veces(H4 h42Veces) {
		this.h42Veces = h42Veces;
	}

	public Element getLayoutArtista() {
		return layoutArtista;
	}

	public void setLayoutArtista(Element layoutArtista) {
		this.layoutArtista = layoutArtista;
	}

	public H4 getH43() {
		return h43;
	}

	public void setH43(H4 h43) {
		this.h43 = h43;
	}

	public Image getImg1Artista() {
		return img1Artista;
	}

	public void setImg1Artista(Image img1Artista) {
		this.img1Artista = img1Artista;
	}

	public H4 getH44Nombre() {
		return h44Nombre;
	}

	public void setH44Nombre(H4 h44Nombre) {
		this.h44Nombre = h44Nombre;
	}

	public H4 getH45Horas() {
		return h45Horas;
	}

	public void setH45Horas(H4 h45Horas) {
		this.h45Horas = h45Horas;
	}

	public Element getLayoutAlbum() {
		return layoutAlbum;
	}

	public void setLayoutAlbum(Element layoutAlbum) {
		this.layoutAlbum = layoutAlbum;
	}

	public H4 getH46() {
		return h46;
	}

	public void setH46(H4 h46) {
		this.h46 = h46;
	}

	public Image getImg2Album() {
		return img2Album;
	}

	public void setImg2Album(Image img2Album) {
		this.img2Album = img2Album;
	}

	public H4 getH47Nombre() {
		return h47Nombre;
	}

	public void setH47Nombre(H4 h47Nombre) {
		this.h47Nombre = h47Nombre;
	}

	public H4 getH48Horas() {
		return h48Horas;
	}

	public void setH48Horas(H4 h48Horas) {
		this.h48Horas = h48Horas;
	}

	public Element getLayoutLista() {
		return layoutLista;
	}

	public void setLayoutLista(Element layoutLista) {
		this.layoutLista = layoutLista;
	}

	public H4 getH49() {
		return h49;
	}

	public void setH49(H4 h49) {
		this.h49 = h49;
	}

	public Image getImg3Lista() {
		return img3Lista;
	}

	public void setImg3Lista(Image img3Lista) {
		this.img3Lista = img3Lista;
	}

	public H4 getH410Nombre() {
		return h410Nombre;
	}

	public void setH410Nombre(H4 h410Nombre) {
		this.h410Nombre = h410Nombre;
	}

	public H4 getH411Horas() {
		return h411Horas;
	}

	public void setH411Horas(H4 h411Horas) {
		this.h411Horas = h411Horas;
	}

	public H2 getH22Uso() {
		return h22Uso;
	}

	public void setH22Uso(H2 h22Uso) {
		this.h22Uso = h22Uso;
	}

	public HorizontalLayout getLayoutTiempoUso() {
		return layoutTiempoUso;
	}

	public void setLayoutTiempoUso(HorizontalLayout layoutTiempoUso) {
		this.layoutTiempoUso = layoutTiempoUso;
	}

	public Element getLayoutUso() {
		return layoutUso;
	}

	public void setLayoutUso(Element layoutUso) {
		this.layoutUso = layoutUso;
	}

	public H4 getH412() {
		return h412;
	}

	public void setH412(H4 h412) {
		this.h412 = h412;
	}

	public H4 getH413() {
		return h413;
	}

	public void setH413(H4 h413) {
		this.h413 = h413;
	}

	public Element getLayoutGrafica() {
		return layoutGrafica;
	}

	public void setLayoutGrafica(Element layoutGrafica) {
		this.layoutGrafica = layoutGrafica;
	}

	public Chart getGraficaUso() {
		return graficaUso;
	}

	public void setGraficaUso(Chart graficaUso) {
		this.graficaUso = graficaUso;
	}

	public Element getLayoutMedia() {
		return layoutMedia;
	}

	public void setLayoutMedia(Element layoutMedia) {
		this.layoutMedia = layoutMedia;
	}

	public H4 getH415() {
		return h415;
	}

	public void setH415(H4 h415) {
		this.h415 = h415;
	}

	public H4 getH416() {
		return h416;
	}

	public void setH416(H4 h416) {
		this.h416 = h416;
	}

}
