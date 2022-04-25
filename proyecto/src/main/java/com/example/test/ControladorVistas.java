package com.example.test;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
}