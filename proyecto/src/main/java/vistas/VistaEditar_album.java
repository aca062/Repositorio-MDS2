package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.H2;

/**
 * A Designer generated component for the vista-editar_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar_album")
@JsModule("./src/vistas/vista-editar_album.ts")
public class VistaEditar_album extends LitTemplate {

    

	@Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h2Titulo")
	private H2 h2Titulo;
	@Id("layoutAlbumes")
	private Element layoutAlbumes;
	@Id("layoutAlbum")
	private HorizontalLayout layoutAlbum;
	@Id("imgAlbum")
	private Image imgAlbum;
	@Id("cambiarImagen")
	private Button cambiarImagen;
	@Id("nombreArtista")
	private TextField nombreArtista;
	@Id("fechaEdición")
	private TextField fechaEdición;
	@Id("titulo")
	private TextField titulo;
	@Id("buscadorCanciones")
	private Select buscadorCanciones;
	@Id("vaadinListBox1")
	private Element vaadinListBox1;
	@Id("vaadinItem3")
	private Element vaadinItem3;
	@Id("vaadinItem4")
	private Element vaadinItem4;
	@Id("vaadinItem5")
	private Element vaadinItem5;
	@Id("listaCanciones")
	private Element listaCanciones;
	@Id("layoutCancion")
	private HorizontalLayout layoutCancion;
	@Id("nombreCancion")
	private Element nombreCancion;
	@Id("eliminar")
	private Button eliminar;
	@Id("layoutCancion1")
	private HorizontalLayout layoutCancion1;
	@Id("nombreCancion1")
	private Element nombreCancion1;
	@Id("eliminar1")
	private Button eliminar1;
	@Id("layoutCancion2")
	private HorizontalLayout layoutCancion2;
	@Id("nombreCancion2")
	private Element nombreCancion2;
	@Id("eliminar2")
	private Button eliminar2;

	/**
     * Creates a new VistaEditar_album.
     */
    public VistaEditar_album() {
        // You can initialise any data required for the connected UI components here.
    }

	

}
