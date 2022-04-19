package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerificar_e_mail;

public class Verificar_e_mail extends VistaVerificar_e_mail{
	/*private Label _tituloL;
	private TextField _instruccionesL;
	private TextField _codigoTF;
	private Button _cancelarB;
	private Button _confirmarB;
	private Button _enviarOtroB;*/
	public Registrarse _registrarse;
	
	public Verificar_e_mail() {
		Inicializar();
		this.getBotonCancelar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
		this.getBotonConfirmar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});
		this.getBotonEnviarOtraVez().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				EnviarOtraVez();
			}
		});
	}

	protected void EnviarOtraVez() {
		//TODO: funcionalidad
	}

	protected void Confirmar() {
		//TODO: funcionalidad
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(new Cibernauta());
	}

	protected void Cancelar() {
		VerticalLayout v1 = this.getLayoutPrincipal().as(VerticalLayout.class);
		v1.removeAll();
		v1.add(_registrarse = new Registrarse());
	}

	private void Inicializar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}