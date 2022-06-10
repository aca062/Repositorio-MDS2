package interfaz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Vector;

import org.apache.commons.io.FilenameUtils;
import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import orm.bbdd.Actor_ComunDAO;
import orm.bbdd.Artista;
import orm.bbdd.Estilo;
import vistas.VistaEditar_artista;

public class Editar_artista extends VistaEditar_artista{
	/*private Label _editarArtistaL;
	private event _anadir_imagen;
	private Image _imagen;
	private Button _anadirFotoB;
	private Label _nickL;
	private TextField _nickTF;
	private Label _passwordL;
	private TextField _passwordTF;
	private Label _confirmarPassL;
	private TextField _confirmarPassTF;
	private Label _emailL;
	private TextField _emailTF;
	private Label _estilosL;
	private Dropdown _estilosD;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Artista_admin _artistaAdmin;
	iAdministrador adm = new BDPrincipal();
    String pathFoto = null;
    private Estilo[] estilos;
    int id;
    Artista artista;

	public Editar_artista(Artista artista) throws PersistentException{

	    this.artista = artista;

	    pathFoto = artista.getFoto();

		Inicializar(artista);

		Integer id = Actor_ComunDAO.listActor_ComunByQuery("true=true", "nick").length + 1;
		this.getEliminarFoto().setVisible(false);
		MemoryBuffer memoryBuffer = new MemoryBuffer();
        Upload upload = this.getUpload();
        upload.setReceiver(memoryBuffer);
        Image foto = this.getImgArtista();

        cargarEstilos();

        List<String> nombreEstilos = new Vector<String>(estilos.length);

        for(Estilo estilo : estilos) {
        	nombreEstilos.add(estilo.getNombre());
        }
        this.getDropdown().setItems(nombreEstilos);

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

		this.getEliminarFoto().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                String UrlCarpeta = "./src/main/resources/META-INF/resources/img/users/";
                File folder = new File(UrlCarpeta);
                File[] listOfFiles = folder.listFiles();
                for (File file : listOfFiles) {
                    if (file.isFile()) {
                        String[] filename = file.getName().split("\\.(?=[^\\.]+$)"); // split filename from it's
                                                                                     // extension
                        if (filename[0].equalsIgnoreCase(id.toString())) {
                            file.delete();
                        }
                    }
                }
                CambiarUpload();
                foto.setMaxWidth("300px");
                foto.setSrc("https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png");
                pathFoto = null;
            }
        });

		upload.addFinishedListener(e -> {
            try {
                String UrlCarpeta = "./src/main/resources/META-INF/resources/img/users/";
                File folder = new File(UrlCarpeta);
                File[] listOfFiles = folder.listFiles();
                for (File file : listOfFiles) {
                    if (file.isFile()) {
                        String[] filename = file.getName().split("\\.(?=[^\\.]+$)"); // split filename from it's
                                                                                     // extension
                        if (filename[0].equalsIgnoreCase(id.toString())) {
                            file.delete();
                        }
                    }
                }
                pathFoto = Anadir_imagen(memoryBuffer);
            } catch (PersistentException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
	}
	protected void CambiarUpload() {
        this.getUpload().interruptUpload();
        this.getUpload().setVisible(true);
        this.getEliminarFoto().setVisible(false);

    }

	protected void Confirmar() {
		orm.bbdd.Estilo estiloSeleccionado = null;
    	for(orm.bbdd.Estilo estilo : estilos) {
    		if(estilo.getNombre().equals(getDropdown().getValue())) {
    			estiloSeleccionado = estilo;
    			break;
    		}
    	}
    	if (this.getNick().getValue().isEmpty() || this.geteMail().getValue().isEmpty()
                || this.getContrasena().getValue().isEmpty() || this.getConfirmarContrasena().getValue().isEmpty()) {
            ControladorVistas.PopUpBasico("Alguno de los campos está vacío");
        } else if (!this.getContrasena().getValue().equals(this.getConfirmarContrasena().getValue())) {
            ControladorVistas.PopUpBasico("Las dos contraseñas tienen que ser iguales");
        } else if (estiloSeleccionado == null) {
            ControladorVistas.PopUpBasico("No se ha seleccionado un estilo");
        } else {
            int comprobacion = adm.editarArtista(this.geteMail().getValue(),this.getContrasena().getValue() , this.getNick().getValue(), pathFoto, id,estiloSeleccionado.getIdEstilo());
            if (comprobacion == -1) {
                ControladorVistas.PopUpBasico("El nick introducido ya existe");
            } else if (comprobacion == -2) {
                ControladorVistas.PopUpBasico("El correo introducido ya existe");
            } else {
                ControladorVistas.PopUpBasico("La cuenta se ha creado correctamente");
                Buscar_elemento _buscarElemento = new Buscar_elemento();
                _buscarElemento.getStyle().set("width", "100%");
                ControladorVistas.CambiarContenido(_buscarElemento);
            }
        }
    }

	public void Cancelar() {
		Buscar_elemento _buscarElemento = new Buscar_elemento();
        _buscarElemento.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_buscarElemento);
	}

	public String Anadir_imagen(MemoryBuffer memoryBuffer) throws PersistentException {
        int id = this.artista.getId();
        String nameImagen = id + "." + FilenameUtils.getExtension(memoryBuffer.getFileName());
        String UrlImagen = "img/users/" + nameImagen;
        /*
         * File file = new File(UrlImagen); if (file.exists()) { file.delete(); }
         */
        InputStream is = memoryBuffer.getInputStream();
        try {

            OutputStream os = new FileOutputStream("./src/main/resources/META-INF/resources/img/users/" + nameImagen);
            byte[] buffer = new byte[1024];
            int bytesRead;
            // read from is to buffer
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            // flush OutputStream to write any buffered data to file
            os.flush();
            os.close();
            this.getImgArtista().setMaxWidth("300px");
            this.getImgArtista().setSrc(UrlImagen);
            this.getUpload().setVisible(false);
            this.getEliminarFoto().setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return UrlImagen;
    }

	public void cargarEstilos() {
    	estilos = adm.cargarEstilo();
    }

	void Inicializar(Artista artista) {
		this.id = artista.getId();
		this.getContrasena().setValue(artista.getContrasena());
		this.pathFoto = artista.getFoto();
		this.getNick().setValue(artista.getNick());
		this.geteMail().setValue(artista.getEmail());
		this.getCancelar().setVisible(true);
		this.getConfirmar().setVisible(true);
		this.getNick().setVisible(true);
		this.getContrasena().setVisible(true);
		this.getConfirmarContrasena().setVisible(true);
		this.geteMail().setVisible(true);
		this.getImgArtista().setVisible(true);
		this.getH2Titulo().setVisible(true);
		}
}