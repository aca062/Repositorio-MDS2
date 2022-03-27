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

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("img")
	private Image img;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("h5")
	private H5 h5;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("h51")
	private H5 h51;
	@Id("vaadinButton2")
	private Button vaadinButton2;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("h52")
	private H5 h52;
	@Id("h53")
	private H5 h53;
	@Id("vaadinVerticalLayout5")
	private Element vaadinVerticalLayout5;
	@Id("h54")
	private H5 h54;
	@Id("vaadinButton3")
	private Button vaadinButton3;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vistaListas_de_reproduccion_propias")
	private VistaListas_de_reproduccion_propias vistaListas_de_reproduccion_propias;
	@Id("vistaListas_de_reproduccion_ajenas")
	private VistaListas_de_reproduccion_ajenas vistaListas_de_reproduccion_ajenas;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("vaadinVerticalLayout6")
	private Element vaadinVerticalLayout6;
	@Id("vistaCanciones_mas_escuchadas")
	private VistaCanciones_mas_escuchadas vistaCanciones_mas_escuchadas;
	@Id("vaadinVerticalLayout7")
	private Element vaadinVerticalLayout7;
	@Id("vistaArtistas_similares")
	private VistaArtistas_similares vistaArtistas_similares;
	@Id("vaadinVerticalLayout8")
	private Element vaadinVerticalLayout8;
	@Id("vistaLista_album")
	private VistaLista_album vistaLista_album;
	@Id("vaadinVerticalLayout9")
	private Element vaadinVerticalLayout9;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;
	@Id("vaadinHorizontalLayout6")
	private HorizontalLayout vaadinHorizontalLayout6;
	@Id("h2")
	private H2 h2;
	@Id("vaadinButton4")
	private Button vaadinButton4;
	@Id("vaadinHorizontalLayout7")
	private HorizontalLayout vaadinHorizontalLayout7;
	@Id("vaadinVerticalLayout10")
	private Element vaadinVerticalLayout10;
	@Id("vaadinHorizontalLayout8")
	private HorizontalLayout vaadinHorizontalLayout8;
	@Id("img1")
	private Image img1;
	@Id("vaadinVerticalLayout11")
	private Element vaadinVerticalLayout11;
	@Id("h55")
	private H5 h55;
	@Id("h56")
	private H5 h56;
	@Id("vaadinHorizontalLayout9")
	private HorizontalLayout vaadinHorizontalLayout9;
	@Id("img2")
	private Image img2;
	@Id("vaadinVerticalLayout12")
	private Element vaadinVerticalLayout12;
	@Id("h57")
	private H5 h57;
	@Id("h58")
	private H5 h58;
	@Id("vaadinVerticalLayout13")
	private Element vaadinVerticalLayout13;
	@Id("vaadinVerticalLayout14")
	private Element vaadinVerticalLayout14;
	@Id("vaadinHorizontalLayout10")
	private HorizontalLayout vaadinHorizontalLayout10;
	@Id("img3")
	private Image img3;
	@Id("vaadinVerticalLayout15")
	private Element vaadinVerticalLayout15;
	@Id("h59")
	private H5 h59;
	@Id("vaadinHorizontalLayout11")
	private HorizontalLayout vaadinHorizontalLayout11;
	@Id("img4")
	private Image img4;
	@Id("vaadinVerticalLayout16")
	private Element vaadinVerticalLayout16;
	@Id("h510")
	private H5 h510;
	@Id("h511")
	private H5 h511;
	@Id("vaadinHorizontalLayout12")
	private HorizontalLayout vaadinHorizontalLayout12;
	@Id("vaadinButton5")
	private Button vaadinButton5;
	@Id("h512")
	private H5 h512;

	/**
     * Creates a new VistaPerfil_artista_comun.
     */
    public VistaPerfil_artista_comun() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public H5 getH5() {
		return h5;
	}

	public void setH5(H5 h5) {
		this.h5 = h5;
	}

	public Button getVaadinButton1() {
		return vaadinButton1;
	}

	public void setVaadinButton1(Button vaadinButton1) {
		this.vaadinButton1 = vaadinButton1;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public H5 getH51() {
		return h51;
	}

	public void setH51(H5 h51) {
		this.h51 = h51;
	}

	public Button getVaadinButton2() {
		return vaadinButton2;
	}

	public void setVaadinButton2(Button vaadinButton2) {
		this.vaadinButton2 = vaadinButton2;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

	public H5 getH52() {
		return h52;
	}

	public void setH52(H5 h52) {
		this.h52 = h52;
	}

	public H5 getH53() {
		return h53;
	}

	public void setH53(H5 h53) {
		this.h53 = h53;
	}

	public Element getVaadinVerticalLayout5() {
		return vaadinVerticalLayout5;
	}

	public void setVaadinVerticalLayout5(Element vaadinVerticalLayout5) {
		this.vaadinVerticalLayout5 = vaadinVerticalLayout5;
	}

	public H5 getH54() {
		return h54;
	}

	public void setH54(H5 h54) {
		this.h54 = h54;
	}

	public Button getVaadinButton3() {
		return vaadinButton3;
	}

	public void setVaadinButton3(Button vaadinButton3) {
		this.vaadinButton3 = vaadinButton3;
	}

	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}

	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}

	public VistaListas_de_reproduccion_propias getVistaListas_de_reproduccion_propias() {
		return vistaListas_de_reproduccion_propias;
	}

	public void setVistaListas_de_reproduccion_propias(
			VistaListas_de_reproduccion_propias vistaListas_de_reproduccion_propias) {
		this.vistaListas_de_reproduccion_propias = vistaListas_de_reproduccion_propias;
	}

	public VistaListas_de_reproduccion_ajenas getVistaListas_de_reproduccion_ajenas() {
		return vistaListas_de_reproduccion_ajenas;
	}

	public void setVistaListas_de_reproduccion_ajenas(
			VistaListas_de_reproduccion_ajenas vistaListas_de_reproduccion_ajenas) {
		this.vistaListas_de_reproduccion_ajenas = vistaListas_de_reproduccion_ajenas;
	}

	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}

	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}

	public Element getVaadinVerticalLayout6() {
		return vaadinVerticalLayout6;
	}

	public void setVaadinVerticalLayout6(Element vaadinVerticalLayout6) {
		this.vaadinVerticalLayout6 = vaadinVerticalLayout6;
	}

	public VistaCanciones_mas_escuchadas getVistaCanciones_mas_escuchadas() {
		return vistaCanciones_mas_escuchadas;
	}

	public void setVistaCanciones_mas_escuchadas(VistaCanciones_mas_escuchadas vistaCanciones_mas_escuchadas) {
		this.vistaCanciones_mas_escuchadas = vistaCanciones_mas_escuchadas;
	}

	public Element getVaadinVerticalLayout7() {
		return vaadinVerticalLayout7;
	}

	public void setVaadinVerticalLayout7(Element vaadinVerticalLayout7) {
		this.vaadinVerticalLayout7 = vaadinVerticalLayout7;
	}

	public VistaArtistas_similares getVistaArtistas_similares() {
		return vistaArtistas_similares;
	}

	public void setVistaArtistas_similares(VistaArtistas_similares vistaArtistas_similares) {
		this.vistaArtistas_similares = vistaArtistas_similares;
	}

	public Element getVaadinVerticalLayout8() {
		return vaadinVerticalLayout8;
	}

	public void setVaadinVerticalLayout8(Element vaadinVerticalLayout8) {
		this.vaadinVerticalLayout8 = vaadinVerticalLayout8;
	}

	public VistaLista_album getVistaLista_album() {
		return vistaLista_album;
	}

	public void setVistaLista_album(VistaLista_album vistaLista_album) {
		this.vistaLista_album = vistaLista_album;
	}

	public Element getVaadinVerticalLayout9() {
		return vaadinVerticalLayout9;
	}

	public void setVaadinVerticalLayout9(Element vaadinVerticalLayout9) {
		this.vaadinVerticalLayout9 = vaadinVerticalLayout9;
	}

	public HorizontalLayout getVaadinHorizontalLayout5() {
		return vaadinHorizontalLayout5;
	}

	public void setVaadinHorizontalLayout5(HorizontalLayout vaadinHorizontalLayout5) {
		this.vaadinHorizontalLayout5 = vaadinHorizontalLayout5;
	}

	public HorizontalLayout getVaadinHorizontalLayout6() {
		return vaadinHorizontalLayout6;
	}

	public void setVaadinHorizontalLayout6(HorizontalLayout vaadinHorizontalLayout6) {
		this.vaadinHorizontalLayout6 = vaadinHorizontalLayout6;
	}

	public H2 getH2() {
		return h2;
	}

	public void setH2(H2 h2) {
		this.h2 = h2;
	}

	public Button getVaadinButton4() {
		return vaadinButton4;
	}

	public void setVaadinButton4(Button vaadinButton4) {
		this.vaadinButton4 = vaadinButton4;
	}

	public HorizontalLayout getVaadinHorizontalLayout7() {
		return vaadinHorizontalLayout7;
	}

	public void setVaadinHorizontalLayout7(HorizontalLayout vaadinHorizontalLayout7) {
		this.vaadinHorizontalLayout7 = vaadinHorizontalLayout7;
	}

	public Element getVaadinVerticalLayout10() {
		return vaadinVerticalLayout10;
	}

	public void setVaadinVerticalLayout10(Element vaadinVerticalLayout10) {
		this.vaadinVerticalLayout10 = vaadinVerticalLayout10;
	}

	public HorizontalLayout getVaadinHorizontalLayout8() {
		return vaadinHorizontalLayout8;
	}

	public void setVaadinHorizontalLayout8(HorizontalLayout vaadinHorizontalLayout8) {
		this.vaadinHorizontalLayout8 = vaadinHorizontalLayout8;
	}

	public Image getImg1() {
		return img1;
	}

	public void setImg1(Image img1) {
		this.img1 = img1;
	}

	public Element getVaadinVerticalLayout11() {
		return vaadinVerticalLayout11;
	}

	public void setVaadinVerticalLayout11(Element vaadinVerticalLayout11) {
		this.vaadinVerticalLayout11 = vaadinVerticalLayout11;
	}

	public H5 getH55() {
		return h55;
	}

	public void setH55(H5 h55) {
		this.h55 = h55;
	}

	public H5 getH56() {
		return h56;
	}

	public void setH56(H5 h56) {
		this.h56 = h56;
	}

	public HorizontalLayout getVaadinHorizontalLayout9() {
		return vaadinHorizontalLayout9;
	}

	public void setVaadinHorizontalLayout9(HorizontalLayout vaadinHorizontalLayout9) {
		this.vaadinHorizontalLayout9 = vaadinHorizontalLayout9;
	}

	public Image getImg2() {
		return img2;
	}

	public void setImg2(Image img2) {
		this.img2 = img2;
	}

	public Element getVaadinVerticalLayout12() {
		return vaadinVerticalLayout12;
	}

	public void setVaadinVerticalLayout12(Element vaadinVerticalLayout12) {
		this.vaadinVerticalLayout12 = vaadinVerticalLayout12;
	}

	public H5 getH57() {
		return h57;
	}

	public void setH57(H5 h57) {
		this.h57 = h57;
	}

	public H5 getH58() {
		return h58;
	}

	public void setH58(H5 h58) {
		this.h58 = h58;
	}

	public Element getVaadinVerticalLayout13() {
		return vaadinVerticalLayout13;
	}

	public void setVaadinVerticalLayout13(Element vaadinVerticalLayout13) {
		this.vaadinVerticalLayout13 = vaadinVerticalLayout13;
	}

	public Element getVaadinVerticalLayout14() {
		return vaadinVerticalLayout14;
	}

	public void setVaadinVerticalLayout14(Element vaadinVerticalLayout14) {
		this.vaadinVerticalLayout14 = vaadinVerticalLayout14;
	}

	public HorizontalLayout getVaadinHorizontalLayout10() {
		return vaadinHorizontalLayout10;
	}

	public void setVaadinHorizontalLayout10(HorizontalLayout vaadinHorizontalLayout10) {
		this.vaadinHorizontalLayout10 = vaadinHorizontalLayout10;
	}

	public Image getImg3() {
		return img3;
	}

	public void setImg3(Image img3) {
		this.img3 = img3;
	}

	public Element getVaadinVerticalLayout15() {
		return vaadinVerticalLayout15;
	}

	public void setVaadinVerticalLayout15(Element vaadinVerticalLayout15) {
		this.vaadinVerticalLayout15 = vaadinVerticalLayout15;
	}

	public H5 getH59() {
		return h59;
	}

	public void setH59(H5 h59) {
		this.h59 = h59;
	}

	public HorizontalLayout getVaadinHorizontalLayout11() {
		return vaadinHorizontalLayout11;
	}

	public void setVaadinHorizontalLayout11(HorizontalLayout vaadinHorizontalLayout11) {
		this.vaadinHorizontalLayout11 = vaadinHorizontalLayout11;
	}

	public Image getImg4() {
		return img4;
	}

	public void setImg4(Image img4) {
		this.img4 = img4;
	}

	public Element getVaadinVerticalLayout16() {
		return vaadinVerticalLayout16;
	}

	public void setVaadinVerticalLayout16(Element vaadinVerticalLayout16) {
		this.vaadinVerticalLayout16 = vaadinVerticalLayout16;
	}

	public H5 getH510() {
		return h510;
	}

	public void setH510(H5 h510) {
		this.h510 = h510;
	}

	public H5 getH511() {
		return h511;
	}

	public void setH511(H5 h511) {
		this.h511 = h511;
	}

	public HorizontalLayout getVaadinHorizontalLayout12() {
		return vaadinHorizontalLayout12;
	}

	public void setVaadinHorizontalLayout12(HorizontalLayout vaadinHorizontalLayout12) {
		this.vaadinHorizontalLayout12 = vaadinHorizontalLayout12;
	}

	public Button getVaadinButton5() {
		return vaadinButton5;
	}

	public void setVaadinButton5(Button vaadinButton5) {
		this.vaadinButton5 = vaadinButton5;
	}

	public H5 getH512() {
		return h512;
	}

	public void setH512(H5 h512) {
		this.h512 = h512;
	}

}
