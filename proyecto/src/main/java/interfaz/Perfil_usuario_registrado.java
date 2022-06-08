package interfaz;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import bbdd.iAdministrador;

public class Perfil_usuario_registrado extends Perfil {
	/*private event _dar_de_baja;
	private event _editar_e_mail;
	private Label _emailL;
	private Button _editarB;
	private Button _darBajaB;*/
	public Cibernauta _cibernauta;
	public Usuario_registrado _usuarioRegistrado;
	iAdministrador bd = new BDPrincipal();
	public Perfil_usuario_registrado() {
	    super();
	    this.getBotonDarseBaja().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                DarDeBaja();
            }
        });
	}
	
	protected void Cibernauta() {
		Cabecera_cibernauta cab = new Cabecera_cibernauta();
        _cibernauta = new Cibernauta();
        _cibernauta.getStyle().set("width", "100%");
        cab.getStyle().set("width", "100%");
        ControladorVistas.CambiarCabecera(cab);
        ControladorVistas.CambiarContenido(_cibernauta);
        
    }
	
	public void Dar_de_baja() {
		throw new UnsupportedOperationException();
	}

	public void Editar_e_mail() {
		throw new UnsupportedOperationException();
	}
	public void DarDeBaja() {
		 Dialog popup = new Dialog();
	        Text advertencia = new Text("¿Seguro que desea darse de baja?");
	        VerticalLayout dialogLayout = new VerticalLayout(advertencia);
	        popup.add(dialogLayout);
	        Button confirmar = new Button("Confirmar");
	        Button cancelar = new Button("Cancelar");
	        popup.add(cancelar);
	        popup.add(confirmar);
	        popup.setWidth("40%");
	        cancelar.getStyle().set("margin-right", "20px");
	        confirmar.addClickListener(new ComponentEventListener() {
	            @Override
	            public void onComponentEvent(ComponentEvent event) {
	                Confirmar_Eliminar(popup);
	            }
	        });
	        cancelar.addClickListener(new ComponentEventListener() {
	            @Override
	            public void onComponentEvent(ComponentEvent event) {
	                popup.close();
	            }
	        });
	        ControladorVistas.PopUpFormularioEditar(popup);
	    }
	public void Confirmar_Eliminar(Dialog popup) {
		popup.close();
		ControladorVistas.PopUpBasico("El usuario se ha dado de baja correctamente");
		bd.eliminarUsuario(ControladorVistas.getUsuario().getId());
		Cibernauta();
	}
}