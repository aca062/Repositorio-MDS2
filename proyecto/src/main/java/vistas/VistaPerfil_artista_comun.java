package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H5;
import vistas.VistaListas_de_reproduccion_propias;
import vistas.VistaListas_de_reproduccion_ajenas;
import vistas.VistaCanciones_mas_escuchadas;
import vistas.VistaArtistas_similares;
import vistas.VistaLista_album;
import com.vaadin.flow.component.html.H2;

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
	@Id("festivalConcierto1")
	private HorizontalLayout festivalConcierto1;
	@Id("fechaFestivalConcierto1")
	private Image fechaFestivalConcierto1;
	@Id("datosFestivalConcierto1")
	private Element datosFestivalConcierto1;
	@Id("horaFestivalConcierto1")
	private H5 horaFestivalConcierto1;
	@Id("lugarFestivalConcierto1")
	private H5 lugarFestivalConcierto1;
	@Id("festivalConcierto11")
	private HorizontalLayout festivalConcierto11;
	@Id("fechaFestivalConcierto11")
	private Image fechaFestivalConcierto11;
	@Id("datosFestivalConcierto11")
	private Element datosFestivalConcierto11;
	@Id("lugarFestivalConcierto11")
	private H5 lugarFestivalConcierto11;
	@Id("horaFestivalConcierto11")
	private H5 horaFestivalConcierto11;
	@Id("layoutFestivalesDer")
	private Element layoutFestivalesDer;
	@Id("vaadinVerticalLayout14")
	private Element vaadinVerticalLayout14;
	@Id("festivalConcierto3")
	private HorizontalLayout festivalConcierto3;
	@Id("fechaFestivalConcierto3")
	private Image fechaFestivalConcierto3;
	@Id("datosFestivalConcierto3")
	private Element datosFestivalConcierto3;
	@Id("horaFestivalConcierto3")
	private H5 horaFestivalConcierto3;
	@Id("lugarFestivalConcierto3")
	private H5 lugarFestivalConcierto3;
	@Id("festivalConcierto4")
	private HorizontalLayout festivalConcierto4;
	@Id("fechaFestivalConcierto4")
	private Image fechaFestivalConcierto4;
	@Id("datosFestivalConcierto4")
	private Element datosFestivalConcierto4;
	@Id("horaFestivalConcierto4")
	private H5 horaFestivalConcierto4;
	@Id("lugarFestivalConcierto4")
	private H5 lugarFestivalConcierto4;
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

	public HorizontalLayout getFestivalConcierto1() {
		return festivalConcierto1;
	}

	public void setFestivalConcierto1(HorizontalLayout festivalConcierto1) {
		this.festivalConcierto1 = festivalConcierto1;
	}

	public Image getFechaFestivalConcierto1() {
		return fechaFestivalConcierto1;
	}

	public void setFechaFestivalConcierto1(Image fechaFestivalConcierto1) {
		this.fechaFestivalConcierto1 = fechaFestivalConcierto1;
	}

	public Element getDatosFestivalConcierto1() {
		return datosFestivalConcierto1;
	}

	public void setDatosFestivalConcierto1(Element datosFestivalConcierto1) {
		this.datosFestivalConcierto1 = datosFestivalConcierto1;
	}

	public H5 getHoraFestivalConcierto1() {
		return horaFestivalConcierto1;
	}

	public void setHoraFestivalConcierto1(H5 horaFestivalConcierto1) {
		this.horaFestivalConcierto1 = horaFestivalConcierto1;
	}

	public H5 getLugarFestivalConcierto1() {
		return lugarFestivalConcierto1;
	}

	public void setLugarFestivalConcierto1(H5 lugarFestivalConcierto1) {
		this.lugarFestivalConcierto1 = lugarFestivalConcierto1;
	}

	public HorizontalLayout getFestivalConcierto11() {
		return festivalConcierto11;
	}

	public void setFestivalConcierto11(HorizontalLayout festivalConcierto11) {
		this.festivalConcierto11 = festivalConcierto11;
	}

	public Image getFechaFestivalConcierto11() {
		return fechaFestivalConcierto11;
	}

	public void setFechaFestivalConcierto11(Image fechaFestivalConcierto11) {
		this.fechaFestivalConcierto11 = fechaFestivalConcierto11;
	}

	public Element getDatosFestivalConcierto11() {
		return datosFestivalConcierto11;
	}

	public void setDatosFestivalConcierto11(Element datosFestivalConcierto11) {
		this.datosFestivalConcierto11 = datosFestivalConcierto11;
	}

	public H5 getLugarFestivalConcierto11() {
		return lugarFestivalConcierto11;
	}

	public void setLugarFestivalConcierto11(H5 lugarFestivalConcierto11) {
		this.lugarFestivalConcierto11 = lugarFestivalConcierto11;
	}

	public H5 getHoraFestivalConcierto11() {
		return horaFestivalConcierto11;
	}

	public void setHoraFestivalConcierto11(H5 horaFestivalConcierto11) {
		this.horaFestivalConcierto11 = horaFestivalConcierto11;
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

	public HorizontalLayout getFestivalConcierto3() {
		return festivalConcierto3;
	}

	public void setFestivalConcierto3(HorizontalLayout festivalConcierto3) {
		this.festivalConcierto3 = festivalConcierto3;
	}

	public Image getFechaFestivalConcierto3() {
		return fechaFestivalConcierto3;
	}

	public void setFechaFestivalConcierto3(Image fechaFestivalConcierto3) {
		this.fechaFestivalConcierto3 = fechaFestivalConcierto3;
	}

	public Element getDatosFestivalConcierto3() {
		return datosFestivalConcierto3;
	}

	public void setDatosFestivalConcierto3(Element datosFestivalConcierto3) {
		this.datosFestivalConcierto3 = datosFestivalConcierto3;
	}

	public H5 getHoraFestivalConcierto3() {
		return horaFestivalConcierto3;
	}

	public void setHoraFestivalConcierto3(H5 horaFestivalConcierto3) {
		this.horaFestivalConcierto3 = horaFestivalConcierto3;
	}

	public H5 getLugarFestivalConcierto3() {
		return lugarFestivalConcierto3;
	}

	public void setLugarFestivalConcierto3(H5 lugarFestivalConcierto3) {
		this.lugarFestivalConcierto3 = lugarFestivalConcierto3;
	}

	public HorizontalLayout getFestivalConcierto4() {
		return festivalConcierto4;
	}

	public void setFestivalConcierto4(HorizontalLayout festivalConcierto4) {
		this.festivalConcierto4 = festivalConcierto4;
	}

	public Image getFechaFestivalConcierto4() {
		return fechaFestivalConcierto4;
	}

	public void setFechaFestivalConcierto4(Image fechaFestivalConcierto4) {
		this.fechaFestivalConcierto4 = fechaFestivalConcierto4;
	}

	public Element getDatosFestivalConcierto4() {
		return datosFestivalConcierto4;
	}

	public void setDatosFestivalConcierto4(Element datosFestivalConcierto4) {
		this.datosFestivalConcierto4 = datosFestivalConcierto4;
	}

	public H5 getHoraFestivalConcierto4() {
		return horaFestivalConcierto4;
	}

	public void setHoraFestivalConcierto4(H5 horaFestivalConcierto4) {
		this.horaFestivalConcierto4 = horaFestivalConcierto4;
	}

	public H5 getLugarFestivalConcierto4() {
		return lugarFestivalConcierto4;
	}

	public void setLugarFestivalConcierto4(H5 lugarFestivalConcierto4) {
		this.lugarFestivalConcierto4 = lugarFestivalConcierto4;
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
