package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_en_las_que_aparece template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_en_las_que_aparece")
@JsModule("./src/vistas/vista-listas_de_reproduccion_en_las_que_aparece.ts")
public class VistaListas_de_reproduccion_en_las_que_aparece extends LitTemplate {

    @Id("layoutPrincipal")
	private Element layoutPrincipal;
	@Id("h1Titulo")
	private H1 h1Titulo;
	@Id("layoutListasPropias")
	private HorizontalLayout layoutListasPropias;
	@Id("vistaLista_de_reproduccion_ajena")
	private Element vistaLista_de_reproduccion_ajena;
	@Id("vistaLista_de_reproduccion_ajena1")
	private Element vistaLista_de_reproduccion_ajena1;
	@Id("vistaLista_de_reproduccion_ajena2")
	private Element vistaLista_de_reproduccion_ajena2;
	@Id("vistaLista_de_reproduccion_ajena3")
	private Element vistaLista_de_reproduccion_ajena3;
	@Id("vistaLista_de_reproduccion_ajena4")
	private Element vistaLista_de_reproduccion_ajena4;
	@Id("layoutBoton")
	private HorizontalLayout layoutBoton;
	@Id("verTodas")
	private Button verTodas;
	/**
     * Creates a new VistaListas_de_reproduccion_en_las_que_aparece.
     */
    public VistaListas_de_reproduccion_en_las_que_aparece() {
        // You can initialise any data required for the connected UI components here.
    }

}
