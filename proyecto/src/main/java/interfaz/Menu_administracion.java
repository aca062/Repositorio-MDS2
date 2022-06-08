package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaMenu_administracion;

public class Menu_administracion extends VistaMenu_administracion{
	/*private event _editar_numero_canciones_mostradas_al_cibernauta;
	private TextField _editarNumeroCancionesTF;
	private Label _editarNumeroCancionesL;
	private Label _limiteCancionesL;
	private Label _tituloL;
	private Button _buscarElementoB;
	private Button _darAltaB;
	private Label _cancionesMostradasL;
	private Button _editarCancionesB;
	private Label _cancionesMostradasLista;*/
	public Administrador _administrador;
	public Editar_canciones_mostradas_al_cibernauta _editarCancionesMostradasAlCibernauta;
	public Dar_de_alta _darDeAlta;
	public Buscar_elemento _buscarElemento;

	public Menu_administracion() {
		Inicializar();
		this.getBotonBuscarElemento().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				BuscarElemento();
			}
		});
		this.getBotonDarDeAlta().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				DarAlta();
			}
		});
		this.getBotonEditarCanciones().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				EditarCanciones();
			}
		});
		this.getBotonEditarLimite().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				Editar_numero_canciones_mostradas_al_cibernauta();
			}
		});
	}

	void Inicializar() {
		this.getBotonDarDeAlta().setVisible(true);
		this.getBotonEditarCanciones().setVisible(true);
		this.getBotonBuscarElemento().setVisible(true);
		this.getBotonEditarLimite().setVisible(true);
		this.getH2Administracion().setVisible(true);
		this.getH4TextoCancionesMostradas().setVisible(true);
		this.getH4TextoLimite().setVisible(true);
	}
	public void BuscarElemento() {
		_buscarElemento = new Buscar_elemento();
		_buscarElemento.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_buscarElemento);
	}
	public void DarAlta() {
		_darDeAlta = new Dar_de_alta();
		_darDeAlta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_darDeAlta);
	}
	public void Editar_numero_canciones_mostradas_al_cibernauta() {
		Dialog popup = new Dialog();
		TextField numeroMaximo = new TextField("Número máximo de canciones mostradas al cibernauta");
        VerticalLayout dialogLayout = new VerticalLayout(numeroMaximo);
        popup.add(dialogLayout);
        Button guardarCambios = new Button("Guardar cambios");
        Button cancelar = new Button("Cancelar");
        popup.add(cancelar);
        popup.add(guardarCambios);
        popup.setWidth("40%");
        numeroMaximo.setWidth("100%");
        cancelar.getStyle().set("margin-right", "20px");
        guardarCambios.addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				ConfirmarNumeroCanciones(numeroMaximo.getValue().toString(), popup);
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

	void ConfirmarNumeroCanciones(String numero, Dialog popup) {
		//Acceso a la BBDD para cambiar el numero
	    try {
	        int num = Integer.parseInt(numero);
	        //Cambio
	        popup.close();
	    } catch (NumberFormatException e) {
	        ControladorVistas.PopUpBasico("No se ha introducido un número entero válido");
	    }
	}

	public void EditarCanciones() {
		_editarCancionesMostradasAlCibernauta = new Editar_canciones_mostradas_al_cibernauta();
		_editarCancionesMostradasAlCibernauta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_editarCancionesMostradasAlCibernauta);
	}
}