package com.example.test;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class ControladorVistas {

	public static VerticalLayout layoutContenido;
	public static VerticalLayout layoutCabecera;
	public static VerticalLayout layoutPie;
	
	public static void SetCabecera(VerticalLayout layout) {
		layoutCabecera = layout;
		layoutCabecera.getStyle().set("width", "100%");
	}
	
	public static void SetContenido(VerticalLayout layout) {
		layoutContenido = layout;
		layoutContenido.getStyle().set("width", "100%");
	}
	
	public static void SetPie(VerticalLayout layout) {
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
	
	/*public static void PopUpError(Text mensaje) {
		Dialog popupContent = new Dialog();
		popupContent.add(mensaje);
		Button aceptar = new Button("Aceptar");
		popupContent.add(aceptar);
		layoutContenido.add(popupContent);
		popupContent.open();
	}*/
	
	public static void PopUpError(String mensaje) {
		ConfirmDialog popupContent = new ConfirmDialog();
		popupContent.setHeader(mensaje);
		popupContent.setConfirmText("Aceptar");
		layoutContenido.add(popupContent);
		popupContent.open();
	}
}