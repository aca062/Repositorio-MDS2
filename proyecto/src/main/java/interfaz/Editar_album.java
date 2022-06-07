package interfaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import orm.bbdd.Actor_Comun;
import orm.bbdd.Actor_ComunDAO;
import orm.bbdd.Album;
import orm.bbdd.ArtistaDAO;
import orm.bbdd.Cancion;
import orm.bbdd.CancionDAO;
import vistas.VistaEditar_album;

public class Editar_album extends VistaEditar_album{

	public Album_admin _albumAdmin;
	int id;
	String pathFoto;
    iAdministrador adm = new BDPrincipal();
    public Buscar_administrador busqueda;


	public Editar_album(Album album) {

		Inicializar(album);

		this.getConfirmar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});

		this.getCancelar().addClickListener(new ComponentEventListener(){
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
	}

    public void Confirmar() {
        if (this.getTitulo().getValue().isEmpty()) {
            ControladorVistas.PopUpBasico("No se ha introducido título del álbum");
        } else if (this.getNombreArtista().getValue().isEmpty()) {
            ControladorVistas.PopUpBasico("No se ha introducido ningún artista");
        } else if (this.getFechaEdición().isEmpty()) {
            ControladorVistas.PopUpBasico("No se ha añadido una fecha de edición");
        } else {
            try {
                String[] cancionesString = this.getListaCanciones().getValue().split(",");
                Cancion[] canciones = new Cancion[this.getListaCanciones().getValue().split(",").length];
                int index = 0;
                Actor_Comun actor = Actor_ComunDAO.listActor_ComunByQuery("nick='" + this.getNombreArtista().getValue().trim() + "'", "nick")[0];

                if (actor == null) {
                    throw new PersistentException();
                }
                if (ArtistaDAO.getArtistaByORMID(actor.getId()) == null) {
                    throw new PersistentException();
                }
                for (String cancion : cancionesString) {
                    boolean correcto = false;
                    Cancion i = CancionDAO.listCancionByQuery("titulo='" + cancion.trim() + "'", "titulo")[0];
                    if (i == null) {
                        throw new Exception();
                    }
                    for (String artista : i.getInterpretes()) {
                        if (actor.getNick().equals(artista.trim())) {
                            correcto = true;
                            canciones[index] = i;
                        }
                    }
                    if (!correcto) {
                        throw new Exception();
                    }
                    index++;
                }
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                dateFormat.setLenient(false);
                Date fechaUtil = dateFormat.parse(this.getFechaEdición().getValue());
                java.sql.Date fecha = new java.sql.Date(fechaUtil.getTime());
                int comprobacion = adm.editarAlbum(pathFoto, fecha, this.getTitulo().getValue(), this.getNombreArtista().getValue(), canciones, id);
                if (comprobacion == 1) {
                    ControladorVistas.PopUpBasico("Album añadido con éxito");
                    busqueda = new Buscar_administrador();
                    busqueda.getStyle().set("width", "100%");
                    ControladorVistas.CambiarContenido(busqueda);
                    ControladorVistas.CambiarContenido(busqueda);
                } else if (comprobacion == -1) {
                    ControladorVistas.PopUpBasico("Error al añadir el álbum");
                }
            } catch (ParseException pe) {
                ControladorVistas.PopUpBasico("La fecha introducida no tiene el formato de dd/MM/yyyy");
            } catch (PersistentException exc) {
                ControladorVistas.PopUpBasico("El artista introducido no existe");
            }catch (Exception exc) {
                ControladorVistas.PopUpBasico("La canción introducida no existe o no es del artista introducido");
            }
        }
	}

	public void Cancelar() {
		Buscar_elemento _buscarElemento = new Buscar_elemento();
		_buscarElemento.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_buscarElemento);
	}

	public void Anadir_imagen() {
		throw new UnsupportedOperationException();
	}
	void Inicializar(Album album) {
	    this.getNombreArtista().setValue(album.getArtista().getNick());
	    this.getTitulo().setValue(album.getTitulo());
	    this.getFechaEdición().setValue(album.getFechaEdicion().toString());
        String canciones = "";
        for (int i = 0; i < album.canciones.size(); i++) {
            canciones += album.canciones.toArray()[i];
            if (i != album.canciones.size() - 1) {
                canciones += ", ";
            }
        }
        this.getListaCanciones().setValue(canciones);
		this.id = album.getIdAlbum();
		this.pathFoto = album.getImagen();
		this.getCambiarImagen().setVisible(true);
		this.getImgAlbum().setVisible(true);
		this.getTitulo().setVisible(true);
		this.getH2Titulo().setVisible(true);
		this.getNombreArtista().setVisible(true);
		this.getFechaEdición().setVisible(true);
	}
}