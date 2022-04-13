package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.button.Button;
import vistas.VistaListas_de_reproduccion_ajenas;

/**
 * A Designer generated component for the vista-perfil_ajeno template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil_ajeno")
@JsModule("./src/vistas/vista-perfil_ajeno.ts")
public class VistaPerfil_ajeno extends LitTemplate {


	
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
	@Id("layoutSeguidores")
	private Element layoutSeguidores;
	@Id("textoSeguidores")
	private H5 textoSeguidores;
	@Id("layoutSeguidos")
	private Element layoutSeguidos;
	@Id("numeroSeguidores")
	private H5 numeroSeguidores;
	@Id("textoSeguidos")
	private H5 textoSeguidos;
	@Id("numeroSeguidos")
	private H5 numeroSeguidos;
	@Id("listasPerfil")
	private Element listasPerfil;

	/**
     * Creates a new VistaPerfil_ajeno.
     */
    public VistaPerfil_ajeno() {
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

	public Element getLayoutSeguidos() {
		return layoutSeguidos;
	}

	public void setLayoutSeguidos(Element layoutSeguidos) {
		this.layoutSeguidos = layoutSeguidos;
	}

	public H5 getNumeroSeguidores() {
		return numeroSeguidores;
	}

	public void setNumeroSeguidores(H5 numeroSeguidores) {
		this.numeroSeguidores = numeroSeguidores;
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

	public Element getListasPerfil() {
		return listasPerfil;
	}

	public void setListasPerfil(Element listasPerfil) {
		this.listasPerfil = listasPerfil;
	}



}
