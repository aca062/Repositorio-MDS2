package com.example.test;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import orm.bbdd.Actor_Comun;

public class ControladorVistas {

	private static VerticalLayout layoutContenido;
	private static VerticalLayout layoutCabecera;
	private static VerticalLayout layoutPie;
	private static VerticalLayout layoutReproductor;
	private static AudioPlayer reproductor;
	private static Actor_Comun usuario;
	private static String tipoUsuario;

	protected static void SetCabecera(VerticalLayout layout) {
		layoutCabecera = layout;
		layoutCabecera.getStyle().set("width", "100%");
	}

	protected static void SetReproductor(VerticalLayout layout) {
		layoutReproductor = layout;
		AudioPlayer rep = new AudioPlayer();
		rep.getElement().getStyle().set("width", "100%");
		reproductor = rep;
		layout.add(rep);
		layoutReproductor.getStyle().set("width", "100%");
	}

	public static AudioPlayer GetReproductor() {
	    return reproductor;
	}

	protected static void SetContenido(VerticalLayout layout) {
		layoutContenido = layout;
		layoutContenido.getStyle().set("width", "100%");
	}

	protected static void SetPie(VerticalLayout layout) {
		layoutPie = layout;
		layoutContenido.getStyle().set("width", "100%");
	}

	public static void CambiarCabecera(Component layout) {
		layoutCabecera.removeAll();
		layoutCabecera.add(layout);
	}

	public static void CambiarContenido(Component layout) {
		layoutContenido.removeAll();
		layoutContenido.add(layout);
	}

	public static void CambiarPie(Component layout) {
		layoutPie.removeAll();
		layoutPie.add(layout);
	}

	public static void CambiarUsuario(Actor_Comun user) {
		usuario = user;
	}

	   public static void CambiarTipoUsuario(String user) {
	        tipoUsuario = user;
	    }

	public static Actor_Comun getUsuario() {
		return usuario;
	}

	/*public static void PopUpError(Text mensaje) {
		Dialog popupContent = new Dialog();
		popupContent.add(mensaje);
		Button aceptar = new Button("Aceptar");
		popupContent.add(aceptar);
		layoutContenido.add(popupContent);
		popupContent.open();
	}*/

	public static void PopUpBasico(String mensaje) {
		ConfirmDialog popup = new ConfirmDialog();
		popup.setHeader(mensaje);
		popup.setConfirmText("Aceptar");
		layoutContenido.add(popup);
		popup.open();
	}

	public static void PopUpFormularioEditar(Dialog popup) {
		layoutContenido.add(popup);
		popup.open();
	}

    public static String getTipoUsuario() {
        return tipoUsuario;
    }

    public static void setTipoUsuario(String tipoUsuario) {
        ControladorVistas.tipoUsuario = tipoUsuario;
    }
}