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



}
