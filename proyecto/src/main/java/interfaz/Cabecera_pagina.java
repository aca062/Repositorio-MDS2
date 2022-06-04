package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabecera_pagina;

public class Cabecera_pagina extends VistaCabecera_pagina{
	//private event _cerrar_sesion;
	public Actor_comun _actorComun;
	public Buscar _buscar;

	public Cabecera_pagina() {
		Inicializar();
		this.getLogo().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				Logo();
			}
		});
		this.getVerPerfil().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				Perfil();
			}
		});
		this.getCerrarSesion().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				CerrarSesion();
			}
		});
		this.getBuscador().addKeyDownListener(Key.ENTER, new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                _buscar = new Buscar();
                ControladorVistas.CambiarContenido(_buscar);
            }
		}, KeyModifier.SHIFT);
	}

	protected void Logo() {
		if (ControladorVistas.getTipoUsuario().equals("admin")) {
			Administrador _administrador = new Administrador();
			_administrador.getStyle().set("width", "100%");
			ControladorVistas.CambiarContenido(_administrador);
		}else if (ControladorVistas.getTipoUsuario().equals("artista")) {
			Artista _artista = new Artista();
			_artista.getStyle().set("width", "100%");
			ControladorVistas.CambiarContenido(_artista);
		}else {
			Usuario_registrado _usuario = new Usuario_registrado();
			_usuario.getStyle().set("width", "100%");
			ControladorVistas.CambiarContenido(_usuario);
		}
	}

	protected void Perfil() {
		if (ControladorVistas.getTipoUsuario().equals("admin")) {
			Perfil_administrador _administrador = new Perfil_administrador();
			_administrador.getStyle().set("width", "100%");
			ControladorVistas.CambiarContenido(_administrador);
		}else if (ControladorVistas.getTipoUsuario().equals("artista")) {
			Perfil_artista_propio _artista = new Perfil_artista_propio();
			_artista.getStyle().set("width", "100%");
			ControladorVistas.CambiarContenido(_artista);
		}else {
			Perfil_usuario_registrado _usuario = new Perfil_usuario_registrado();
			_usuario.getStyle().set("width", "100%");
			ControladorVistas.CambiarContenido(_usuario);
		}
	}

	protected void CerrarSesion() {
		Cerrar_sesion();
	}

	void Inicializar() {

	}

	public void Cerrar_sesion() {
		Dialog popup = new Dialog();
		Text cadena = new Text("¿Seguro que desea cerrar la sesión?");
		VerticalLayout dialogLayout = new VerticalLayout(cadena);
        popup.add(dialogLayout);
        Button aceptar = new Button("Aceptar");
        Button cancelar = new Button("Cancelar");
        popup.add(cancelar);
        popup.add(aceptar);
        cancelar.getStyle().set("margin-right", "20px");
        popup.setWidth("30%");
        aceptar.addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				Cabecera_cibernauta cabecera = new Cabecera_cibernauta();
		    	Cibernauta contenido = new Cibernauta();
		    	cabecera.getStyle().set("width", "100%");
		    	cabecera.getStyle().set("height", "100%");
		    	contenido.getStyle().set("width", "100%");
		    	contenido.getStyle().set("height", "100%");
		    	ControladorVistas.CambiarCabecera(cabecera);
		    	ControladorVistas.CambiarContenido(contenido);
			}
		});
        cancelar.addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				popup.close();
			}
		});
        ControladorVistas.PopUpFormularioEditar(popup);
	}

}