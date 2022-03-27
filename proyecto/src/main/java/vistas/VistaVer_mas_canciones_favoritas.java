package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaLista_de_reproduccion_favoritos;

/**
 * A Designer generated component for the vista-ver_mas_canciones_favoritas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_mas_canciones_favoritas")
@JsModule("./src/vistas/vista-ver_mas_canciones_favoritas.ts")
public class VistaVer_mas_canciones_favoritas extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vistaLista_de_reproduccion_favoritos")
	private VistaLista_de_reproduccion_favoritos vistaLista_de_reproduccion_favoritos;

	/**
     * Creates a new VistaVer_mas_canciones_favoritas.
     */
    public VistaVer_mas_canciones_favoritas() {
        // You can initialise any data required for the connected UI components here.
    }

}
