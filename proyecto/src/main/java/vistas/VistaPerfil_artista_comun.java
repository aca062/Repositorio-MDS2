package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-perfil_artista_comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil_artista_comun")
@JsModule("./src/vistas/vista-perfil_artista_comun.ts")
public class VistaPerfil_artista_comun extends LitTemplate {



	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutPerfil")
	private Element layoutPerfil;
	@Id("layoutDatosPerfil")
	private HorizontalLayout layoutDatosPerfil;
	@Id("layoutFoto")
	private Element layoutFoto;
	@Id("foto")
	private Image foto;
	@Id("botonEditarFoto")
	private Button botonEditarFoto;
	@Id("layoutDatos")
	private Element layoutDatos;
	@Id("layoutNombreBoton")
	private HorizontalLayout layoutNombreBoton;
	@Id("h5Nombre")
	private H5 h5Nombre;
	@Id("botonDejarSeguir")
	private Button botonDejarSeguir;
	@Id("layoutCorreo")
	private HorizontalLayout layoutCorreo;
	@Id("h5Correo")
	private H5 h5Correo;
	@Id("botonEditarCorreo")
	private Button botonEditarCorreo;
	@Id("layoutSeguidores")
	private Element layoutSeguidores;
	@Id("textoSeguidores")
	private H5 textoSeguidores;
	@Id("numeroSeguidos")
	private H5 numeroSeguidos;
	@Id("layoutSeguidos")
	private Element layoutSeguidos;
	@Id("textoSeguidos")
	private H5 textoSeguidos;
	@Id("numeroSeguidos1")
	private H5 numeroSeguidos1;
	@Id("layoutTusListas")
	private HorizontalLayout layoutTusListas;
	@Id("botonRecibirNotificaciones")
	private Button botonRecibirNotificaciones;
	@Id("tusListas")
	private Element tusListas;
	@Id("botonCrearNuevaLista")
	private Button botonCrearNuevaLista;
	@Id("layoutListasDondeAparece")
	private HorizontalLayout layoutListasDondeAparece;
	@Id("listasDondeAparece")
	private Element listasDondeAparece;
	@Id("layoutInformacionArtista")
	private HorizontalLayout layoutInformacionArtista;
	@Id("layoutCancionesMasEscuchadas")
	private Element layoutCancionesMasEscuchadas;
	@Id("cancionesMasEscuchadas")
	private Element cancionesMasEscuchadas;
	@Id("layoutArtistasSimilares")
	private Element layoutArtistasSimilares;
	@Id("artistasSimilares")
	private Element artistasSimilares;
	@Id("layoutAlbumes")
	private Element layoutAlbumes;
	@Id("albumes")
	private Element albumes;
	@Id("layoutFestivalesConciertos")
	private Element layoutFestivalesConciertos;
	@Id("layoutCabeceraFestivales")
	private HorizontalLayout layoutCabeceraFestivales;
	@Id("h2FestivalesConciertos")
	private H2 h2FestivalesConciertos;
	@Id("botonAnadirFestivalConcierto")
	private Button botonAnadirFestivalConcierto;
	@Id("layoutFestivales")
	private HorizontalLayout layoutFestivales;
	@Id("layoutFestivalesIzq")
	private Element layoutFestivalesIzq;
	@Id("layoutFestivalesDer")
	private Element layoutFestivalesDer;
	@Id("vaadinVerticalLayout14")
	private Element vaadinVerticalLayout14;
	@Id("layoutDarseBaja")
	private HorizontalLayout layoutDarseBaja;
	@Id("botonDarseBaja")
	private Button botonDarseBaja;

	/**
     * Creates a new VistaPerfil_artista_comun.
     */
    public VistaPerfil_artista_comun() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getLayoutPrincipal() {
		return layoutPrincipal;
	}

	public void setLayoutPrincipal(Element layoutPrincipal) {
		this.layoutPrincipal = layoutPrincipal;
	}

	public Element getLayoutPerfil() {
		return layoutPerfil;
	}

	public void setLayoutPerfil(Element layoutPerfil) {
		this.layoutPerfil = layoutPerfil;
	}

	public HorizontalLayout getLayoutDatosPerfil() {
		return layoutDatosPerfil;
	}

	public void setLayoutDatosPerfil(HorizontalLayout layoutDatosPerfil) {
		this.layoutDatosPerfil = layoutDatosPerfil;
	}

	public Element getLayoutFoto() {
		return layoutFoto;
	}

	public void setLayoutFoto(Element layoutFoto) {
		this.layoutFoto = layoutFoto;
	}

	public Image getFoto() {
		return foto;
	}

	public void setFoto(Image foto) {
		this.foto = foto;
	}

	public Button getBotonEditarFoto() {
		return botonEditarFoto;
	}

	public void setBotonEditarFoto(Button botonEditarFoto) {
		this.botonEditarFoto = botonEditarFoto;
	}

	public Element getLayoutDatos() {
		return layoutDatos;
	}

	public void setLayoutDatos(Element layoutDatos) {
		this.layoutDatos = layoutDatos;
	}

	public HorizontalLayout getLayoutNombreBoton() {
		return layoutNombreBoton;
	}

	public void setLayoutNombreBoton(HorizontalLayout layoutNombreBoton) {
		this.layoutNombreBoton = layoutNombreBoton;
	}

	public H5 getH5Nombre() {
		return h5Nombre;
	}

	public void setH5Nombre(H5 h5Nombre) {
		this.h5Nombre = h5Nombre;
	}

	public Button getBotonDejarSeguir() {
		return botonDejarSeguir;
	}

	public void setBotonDejarSeguir(Button botonDejarSeguir) {
		this.botonDejarSeguir = botonDejarSeguir;
	}

	public HorizontalLayout getLayoutCorreo() {
		return layoutCorreo;
	}

	public void setLayoutCorreo(HorizontalLayout layoutCorreo) {
		this.layoutCorreo = layoutCorreo;
	}

	public H5 getH5Correo() {
		return h5Correo;
	}

	public void setH5Correo(H5 h5Correo) {
		this.h5Correo = h5Correo;
	}

	public Button getBotonEditarCorreo() {
		return botonEditarCorreo;
	}

	public void setBotonEditarCorreo(Button botonEditarCorreo) {
		this.botonEditarCorreo = botonEditarCorreo;
	}

	public Element getLayoutSeguidores() {
		return layoutSeguidores;
	}

	public void setLayoutSeguidores(Element layoutSeguidores) {
		this.layoutSeguidores = layoutSeguidores;
	}

	public H5 getTextoSeguidores() {
		return textoSeguidores;
	}

	public void setTextoSeguidores(H5 textoSeguidores) {
		this.textoSeguidores = textoSeguidores;
	}

	public H5 getNumeroSeguidos() {
		return numeroSeguidos;
	}

	public void setNumeroSeguidos(H5 numeroSeguidos) {
		this.numeroSeguidos = numeroSeguidos;
	}

	public Element getLayoutSeguidos() {
		return layoutSeguidos;
	}

	public void setLayoutSeguidos(Element layoutSeguidos) {
		this.layoutSeguidos = layoutSeguidos;
	}

	public H5 getTextoSeguidos() {
		return textoSeguidos;
	}

	public void setTextoSeguidos(H5 textoSeguidos) {
		this.textoSeguidos = textoSeguidos;
	}

	public H5 getNumeroSeguidos1() {
		return numeroSeguidos1;
	}

	public void setNumeroSeguidos1(H5 numeroSeguidos1) {
		this.numeroSeguidos1 = numeroSeguidos1;
	}

	public HorizontalLayout getLayoutTusListas() {
		return layoutTusListas;
	}

	public void setLayoutTusListas(HorizontalLayout layoutTusListas) {
		this.layoutTusListas = layoutTusListas;
	}

	public Button getBotonRecibirNotificaciones() {
		return botonRecibirNotificaciones;
	}

	public void setBotonRecibirNotificaciones(Button botonRecibirNotificaciones) {
		this.botonRecibirNotificaciones = botonRecibirNotificaciones;
	}

	public Element getTusListas() {
		return tusListas;
	}

	public void setTusListas(Element tusListas) {
		this.tusListas = tusListas;
	}

	public Button getBotonCrearNuevaLista() {
		return botonCrearNuevaLista;
	}

	public void setBotonCrearNuevaLista(Button botonCrearNuevaLista) {
		this.botonCrearNuevaLista = botonCrearNuevaLista;
	}

	public HorizontalLayout getLayoutListasDondeAparece() {
		return layoutListasDondeAparece;
	}

	public void setLayoutListasDondeAparece(HorizontalLayout layoutListasDondeAparece) {
		this.layoutListasDondeAparece = layoutListasDondeAparece;
	}

	public Element getListasDondeAparece() {
		return listasDondeAparece;
	}

	public void setListasDondeAparece(Element listasDondeAparece) {
		this.listasDondeAparece = listasDondeAparece;
	}

	public HorizontalLayout getLayoutInformacionArtista() {
		return layoutInformacionArtista;
	}

	public void setLayoutInformacionArtista(HorizontalLayout layoutInformacionArtista) {
		this.layoutInformacionArtista = layoutInformacionArtista;
	}

	public Element getLayoutCancionesMasEscuchadas() {
		return layoutCancionesMasEscuchadas;
	}

	public void setLayoutCancionesMasEscuchadas(Element layoutCancionesMasEscuchadas) {
		this.layoutCancionesMasEscuchadas = layoutCancionesMasEscuchadas;
	}

	public Element getCancionesMasEscuchadas() {
		return cancionesMasEscuchadas;
	}

	public void setCancionesMasEscuchadas(Element cancionesMasEscuchadas) {
		this.cancionesMasEscuchadas = cancionesMasEscuchadas;
	}

	public Element getLayoutArtistasSimilares() {
		return layoutArtistasSimilares;
	}

	public void setLayoutArtistasSimilares(Element layoutArtistasSimilares) {
		this.layoutArtistasSimilares = layoutArtistasSimilares;
	}

	public Element getArtistasSimilares() {
		return artistasSimilares;
	}

	public void setArtistasSimilares(Element artistasSimilares) {
		this.artistasSimilares = artistasSimilares;
	}

	public Element getLayoutAlbumes() {
		return layoutAlbumes;
	}

	public void setLayoutAlbumes(Element layoutAlbumes) {
		this.layoutAlbumes = layoutAlbumes;
	}

	public Element getAlbumes() {
		return albumes;
	}

	public void setAlbumes(Element albumes) {
		this.albumes = albumes;
	}

	public Element getLayoutFestivalesConciertos() {
		return layoutFestivalesConciertos;
	}

	public void setLayoutFestivalesConciertos(Element layoutFestivalesConciertos) {
		this.layoutFestivalesConciertos = layoutFestivalesConciertos;
	}

	public HorizontalLayout getLayoutCabeceraFestivales() {
		return layoutCabeceraFestivales;
	}

	public void setLayoutCabeceraFestivales(HorizontalLayout layoutCabeceraFestivales) {
		this.layoutCabeceraFestivales = layoutCabeceraFestivales;
	}

	public H2 getH2FestivalesConciertos() {
		return h2FestivalesConciertos;
	}

	public void setH2FestivalesConciertos(H2 h2FestivalesConciertos) {
		this.h2FestivalesConciertos = h2FestivalesConciertos;
	}

	public Button getBotonAnadirFestivalConcierto() {
		return botonAnadirFestivalConcierto;
	}

	public void setBotonAnadirFestivalConcierto(Button botonAnadirFestivalConcierto) {
		this.botonAnadirFestivalConcierto = botonAnadirFestivalConcierto;
	}

	public HorizontalLayout getLayoutFestivales() {
		return layoutFestivales;
	}

	public void setLayoutFestivales(HorizontalLayout layoutFestivales) {
		this.layoutFestivales = layoutFestivales;
	}

	public Element getLayoutFestivalesIzq() {
		return layoutFestivalesIzq;
	}

	public void setLayoutFestivalesIzq(Element layoutFestivalesIzq) {
		this.layoutFestivalesIzq = layoutFestivalesIzq;
	}

	public Element getLayoutFestivalesDer() {
		return layoutFestivalesDer;
	}

	public void setLayoutFestivalesDer(Element layoutFestivalesDer) {
		this.layoutFestivalesDer = layoutFestivalesDer;
	}

	public Element getVaadinVerticalLayout14() {
		return vaadinVerticalLayout14;
	}

	public void setVaadinVerticalLayout14(Element vaadinVerticalLayout14) {
		this.vaadinVerticalLayout14 = vaadinVerticalLayout14;
	}

	public HorizontalLayout getLayoutDarseBaja() {
		return layoutDarseBaja;
	}

	public void setLayoutDarseBaja(HorizontalLayout layoutDarseBaja) {
		this.layoutDarseBaja = layoutDarseBaja;
	}

	public Button getBotonDarseBaja() {
		return botonDarseBaja;
	}

	public void setBotonDarseBaja(Button botonDarseBaja) {
		this.botonDarseBaja = botonDarseBaja;
	}


}
