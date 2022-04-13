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

/**
 * A Designer generated component for the vista-perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil")
@JsModule("./src/vistas/vista-perfil.ts")
public class VistaPerfil extends LitTemplate {

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("layoutPerfil")
	private Element layoutPerfil;
	@Id("layoutDatosPerfil")
	private HorizontalLayout layoutDatosPerfil;
	@Id("layoutFotoPerfil")
	private Element layoutFotoPerfil;
	@Id("fotoPerfil")
	private Image fotoPerfil;
	@Id("botonEditarFotoPerfil")
	private Button botonEditarFotoPerfil;
	@Id("layoutDatos")
	private Element layoutDatos;
	@Id("h5Nombre")
	private H5 h5Nombre;
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
	@Id("numeroSeguidores")
	private H5 numeroSeguidores;
	@Id("layoutSeguidos")
	private Element layoutSeguidos;
	@Id("textoSeguidos")
	private H5 textoSeguidos;
	@Id("numeroSeguidos")
	private H5 numeroSeguidos;
	@Id("botonRecibirNotificaciones")
	private Button botonRecibirNotificaciones;
	@Id("layoutTusListas")
	private HorizontalLayout layoutTusListas;
	@Id("tusListas")
	private Element tusListas;
	@Id("botonCrearLista")
	private Button botonCrearLista;
	@Id("layoutDarseBaja")
	private HorizontalLayout layoutDarseBaja;
	@Id("botonDarseBaja")
	private Button botonDarseBaja;

	/**
     * Creates a new VistaPerfil.
     */
    public VistaPerfil() {
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

	public Element getLayoutFotoPerfil() {
		return layoutFotoPerfil;
	}

	public void setLayoutFotoPerfil(Element layoutFotoPerfil) {
		this.layoutFotoPerfil = layoutFotoPerfil;
	}

	public Image getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(Image fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	public Button getBotonEditarFotoPerfil() {
		return botonEditarFotoPerfil;
	}

	public void setBotonEditarFotoPerfil(Button botonEditarFotoPerfil) {
		this.botonEditarFotoPerfil = botonEditarFotoPerfil;
	}

	public Element getLayoutDatos() {
		return layoutDatos;
	}

	public void setLayoutDatos(Element layoutDatos) {
		this.layoutDatos = layoutDatos;
	}

	public H5 getH5Nombre() {
		return h5Nombre;
	}

	public void setH5Nombre(H5 h5Nombre) {
		this.h5Nombre = h5Nombre;
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

	public H5 getNumeroSeguidores() {
		return numeroSeguidores;
	}

	public void setNumeroSeguidores(H5 numeroSeguidores) {
		this.numeroSeguidores = numeroSeguidores;
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

	public H5 getNumeroSeguidos() {
		return numeroSeguidos;
	}

	public void setNumeroSeguidos(H5 numeroSeguidos) {
		this.numeroSeguidos = numeroSeguidos;
	}

	public Button getBotonRecibirNotificaciones() {
		return botonRecibirNotificaciones;
	}

	public void setBotonRecibirNotificaciones(Button botonRecibirNotificaciones) {
		this.botonRecibirNotificaciones = botonRecibirNotificaciones;
	}

	public HorizontalLayout getLayoutTusListas() {
		return layoutTusListas;
	}

	public void setLayoutTusListas(HorizontalLayout layoutTusListas) {
		this.layoutTusListas = layoutTusListas;
	}

	public Element getTusListas() {
		return tusListas;
	}

	public void setTusListas(Element tusListas) {
		this.tusListas = tusListas;
	}

	public Button getBotonCrearLista() {
		return botonCrearLista;
	}

	public void setBotonCrearLista(Button botonCrearLista) {
		this.botonCrearLista = botonCrearLista;
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
