package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_cibernauta = new Cibernauta());
	}

	protected void IniciarSesion() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_loginCibernauta = new Login_cibernauta());
	}
	
	void Inicializar() {
		this.getContacto().setVisible(true);
		this.getIniciarSesion().setVisible(true);
		this.getLayoutCabecera().setVisible(true);
		this.getLayoutPrincipal().setVisible(true);
		this.getLogo().setVisible(true);
	}
}