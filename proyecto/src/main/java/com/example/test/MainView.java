package com.example.test;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfaz.Actor_comun;
import interfaz.Administrador;
import interfaz.Alta_albumes;
import interfaz.Alta_estilos;
import interfaz.Artista;
import interfaz.Artista_admin;
import interfaz.Artistas_recomendados;
import interfaz.Cabecera_cibernauta;
import interfaz.Cancion_admin;
import interfaz.Canciones_busqueda_admin;
import interfaz.Canciones_favoritas;
import interfaz.Canciones_recomendadas;
import interfaz.Cibernauta;
import interfaz.Editar_artista;
import interfaz.Lista_albumes;
import interfaz.Menu_administracion;
import interfaz.Pie_de_pagina;
import interfaz.Ultimas_canciones_reproducidas;
import interfaz.Ver_detalle_album;
import interfaz.Ver_todos_los_albumes;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {
	

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
    public MainView(@Autowired GreetService service) {

    	//Menu_administracion cad = new Menu_administracion();
    	Cabecera_cibernauta cabecera = new Cabecera_cibernauta();
    	Cibernauta contenido = new Cibernauta();
    	/*Actor_comun contenido = new Actor_comun();*/
    	Pie_de_pagina pie = new Pie_de_pagina();
    	VerticalLayout reproductor = new VerticalLayout();
    	reproductor.getStyle().set("width", "100%");   
    	cabecera.getStyle().set("width", "100%");   
    	cabecera.getStyle().set("height", "100%");
    	contenido.getStyle().set("width", "100%");   
    	contenido.getStyle().set("height", "100%");
    	pie.getStyle().set("width", "100%");   
    	pie.getStyle().set("height", "100%");
    	add(cabecera);
    	add(contenido);
    	add(reproductor);
    	add(pie);
    	ControladorVistas.SetCabecera(cabecera.getLayoutPrincipal().as(VerticalLayout.class));
    	ControladorVistas.SetContenido(contenido.getLayoutPrincipal().as(VerticalLayout.class));
    	ControladorVistas.SetReproductor(reproductor);
    	ControladorVistas.SetPie(pie.getLayoutPrincipal().as(VerticalLayout.class));
    	
        // Use TextField for standard text input
        /*TextField textField = new TextField("Your name");
        textField.addThemeName("bordered");

        // Button click listeners can be defined as lambda expressions
        Button button = new Button("Say hello",
                e -> Notification.show(service.greet(textField.getValue())));

        // Theme variants give you predefined extra styles for components.
        // Example: Primary button has a more prominent look.
        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        // You can specify keyboard shortcuts for buttons.
        // Example: Pressing enter in this view clicks the Button.
        button.addClickShortcut(Key.ENTER);

        // Use custom CSS classes to apply styling. This is defined in shared-styles.css.
        addClassName("centered-content");

        add(textField, button);*/
    }

}
