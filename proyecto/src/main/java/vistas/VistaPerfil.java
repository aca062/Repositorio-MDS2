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

}
