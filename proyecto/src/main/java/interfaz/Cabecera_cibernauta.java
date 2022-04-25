package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.example.test.ControladorVistas;

import vistas.VistaCabecera_cibernauta;

public class Cabecera_cibernauta extends VistaCabecera_cibernauta{
	/*private Button _loginB;
	private Button _logoB;*/
	public Cibernauta _cibernauta;
	public Login_cibernauta _loginCibernauta;
	
	public Cabecera_cibernauta() {
		Inicializar();
		this.getLogo().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Logo();
			}
		});
		this.getIniciarSesion().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				IniciarSesion();
			}
		});
	}

	protected void Logo() {
		_cibernauta = new Cibernauta();
		_cibernauta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_cibernauta);
	}

	protected void IniciarSesion() {
		/*HorizontalLayout v1 = this.getLayoutPrincipal().as(HorizontalLayout.class);
		v1.removeAll();
		v1.add(_loginCibernauta = new Login_cibernauta());*/
		_loginCibernauta = new Login_cibernauta();
		_loginCibernauta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_loginCibernauta);
	}
	
	void Inicializar() {
		this.getIniciarSesion().setVisible(true);
		this.getLayoutPrincipal().setVisible(true);
		this.getLogo().setVisible(true);
	}
}