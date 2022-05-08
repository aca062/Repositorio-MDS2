package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaPerfil;

public class Perfil extends VistaPerfil{
	/*private event _recibir_notificacion;
	private Label _nickL;
	private Label _emailL;
	private Button _editarEmailB;
	private Image _imagen;
	private Label _seguidoresL;
	private Label _nSeguidoresL;
	private Label _seguidoL;
	private Label _nSeguidoL;
	private Button _recibirNotifiacionB;
	private Button _crearListaB;*/
	public Listas_de_reproduccion_propias _listasDeReproduccionPropia;
	public Crear_lista_de_reproduccion _crearListaDeReproduccion;
	
	public Perfil() {
		Inicializar();
		this.getBotonEditarCorreo().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				EditarCorreo();
			}
		});
	}

	public void Recibir_notificacion() {
		throw new UnsupportedOperationException();
	}
	
	void Inicializar() {
		this.getTusListas().setVisible(false);
		_listasDeReproduccionPropia = new Listas_de_reproduccion_propias();
		_listasDeReproduccionPropia.getLayoutListasPropias().add(new Lista_de_reproduccion_propia());
		_listasDeReproduccionPropia.getLayoutListasPropias().add(new Lista_de_reproduccion_propia());
		_listasDeReproduccionPropia.getLayoutListasPropias().add(new Lista_de_reproduccion_propia());
		this.getLayoutTusListas().add(_listasDeReproduccionPropia);
	}
	
	void EditarCorreo() {
		Dialog popup = new Dialog();
		TextField correoNuevo = new TextField("Nuevo correo");
        TextField confirmarCorreo = new TextField("Introduzca de nuevo el correo");
        VerticalLayout dialogLayout = new VerticalLayout(correoNuevo, confirmarCorreo);
        popup.add(dialogLayout);
        Button guardarCambios = new Button("Guardar cambios");
        Button cancelar = new Button("Cancelar");
        popup.add(cancelar);
        popup.add(guardarCambios);
        popup.setWidth("40%");
        correoNuevo.setWidth("100%");
        confirmarCorreo.setWidth("100%");
        cancelar.getStyle().set("margin-right", "20px");
        guardarCambios.addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				ConfirmarEdicionCorreo(correoNuevo.getValue().toString(), confirmarCorreo.getValue().toString(), popup);
			}
		});
        cancelar.addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				popup.close();
			}
		});
        ControladorVistas.PopUpFormularioEditar(popup);
	}
	
	void ConfirmarEdicionCorreo(String correo, String correoRepetido, Dialog popup) {
		if (correo.isEmpty() || correoRepetido.isEmpty()) {
			ControladorVistas.PopUpBasico("Uno de los campos está vacío");
		}else {
			if (!correo.equals(correoRepetido)) {
				ControladorVistas.PopUpBasico("Los correos no son iguales");
			}else {
				//TODO: Hacer que se cambie el correo
				popup.close();
			}
		}
	}
}