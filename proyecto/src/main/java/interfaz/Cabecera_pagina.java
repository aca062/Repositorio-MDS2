package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabecera_pagina;

public class Cabecera_pagina extends VistaCabecera_pagina{
	//private event _cerrar_sesion;
	public Actor_comun _actorComun;
	public Buscar _buscar;
	
	public Cabecera_pagina() {
		Inicializar();
		this.getVerPerfil().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Perfil();
			}
		});
		this.getCerrarSesion().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				CerrarSesion();
			}
		});
	}

	protected void Perfil() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		//Depende del tipo de usuario
		v1.add(_actorComun = new Actor_comun());
	}

	protected void CerrarSesion() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		HorizontalLayout v2 = this.getLayoutCabecera();
		HorizontalLayout v3 = this.getLayoutContacto();
		v1.removeAll();
		v2.removeAll();
		v3.removeAll();
		v1.add(new Cibernauta());
		v2.add(new Cabecera_cibernauta());
	}
	
	void Inicializar() {
		
	}
	
	public void Cerrar_sesion() {
		throw new UnsupportedOperationException();
	}
	
}