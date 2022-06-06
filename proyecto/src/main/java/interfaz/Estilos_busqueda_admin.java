package interfaz;

import java.util.Vector;

import orm.bbdd.Estilo;
import vistas.VistaEstilos_busqueda_admin;

public class Estilos_busqueda_admin extends VistaEstilos_busqueda_admin{
	//private Label _tituloL;
	public Buscar_administrador _buscarAdministrador;
	public Vector<Estilo_admin> _estiloAdmin = new Vector<Estilo_admin>();


	public Estilos_busqueda_admin() {
		Inicializar();
	}
	void Inicializar() {
		/*_estiloAdmin.add(new Estilo_admin());
		_estiloAdmin.add(new Estilo_admin());
		_estiloAdmin.add(new Estilo_admin());
		this.getTitulo().setVisible(true);
		for(int i=0;i<3;i++) {
			this.getLayoutEstilo().add(_estiloAdmin.get(i));
		}*/
	}
    public void anadirEstilo(Estilo estilo) {

        _estiloAdmin.add(new Estilo_admin());

        _estiloAdmin.lastElement().setEstilo(estilo);

        this.getLayoutEstilo().add(_estiloAdmin.lastElement());

    }
}