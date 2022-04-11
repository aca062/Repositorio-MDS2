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


}
