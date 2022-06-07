package interfaz;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

public class Administrador extends Actor_comun {
	//private Button _menuAdministracionB;
	public Perfil_administrador _perfilAdministrador;
	public Menu_administracion _menuAdministracion;

	public Administrador() {
		super();
		this.getBotonAdmin().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				MenuAdministracion();
			}
		});
	}

	void InicializarAdmin() {

	}

	public void MenuAdministracion() {
		_menuAdministracion = new Menu_administracion();
		_menuAdministracion.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_menuAdministracion);
	}
}