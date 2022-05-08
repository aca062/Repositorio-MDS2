package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listas_de_reproduccion_en_las_que_aparece extends Listas_de_reproduccion_ajenas {
	public Perfil_artista_comun _perfilArtistaComun;
	
	public Listas_de_reproduccion_en_las_que_aparece() {
		super();
		Inicializar();
		this.getVerMas().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				VerMas();
			}
		});
	}

	protected void VerMas() {
		Paginacion_listas_ajenas paginacion = new Paginacion_listas_ajenas();
		paginacion.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(paginacion);
	}
	
	void Inicializar() {
		
	}
	
	
}