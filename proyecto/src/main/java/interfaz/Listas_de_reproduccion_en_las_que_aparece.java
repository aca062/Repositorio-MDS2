package interfaz;

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
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Paginacion_listas_ajenas());
	}
	
	void Inicializar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Paginacion_listas_ajenas());
	}
	
	
}