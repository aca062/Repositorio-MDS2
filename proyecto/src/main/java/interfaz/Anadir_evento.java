package interfaz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FilenameUtils;
import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import bbdd.iArtista;
import orm.bbdd.Actor_ComunDAO;
import vistas.VistaAnadir_evento;

public class Anadir_evento extends VistaAnadir_evento{
	/*private Label _tituloL;
	private event _anadir_foto;
	private Image _imagen;
	private Button _anadirFotoB;
	private Label _fechaL;
	private TextField _fechaTF;
	private Label _horaL;
	private TextField _horaTF;
	private Label _lugarL;
	private TextField _lugarTF;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Perfil_artista_propio _perfilArtista;
	String pathFoto = null;
	iArtista adm = new BDPrincipal();
	int id;
	
	public Anadir_evento() throws PersistentException {
		Inicializar();
        this.getEliminarFoto().setVisible(false);
        Integer id = Actor_ComunDAO.listActor_ComunByQuery("true=true", "nick").length + 1;
        //VerticalLayout layoutFoto = this.getLayoutFoto().as(VerticalLayout.class);
        MemoryBuffer memoryBuffer = new MemoryBuffer();
        Upload upload = this.getUpload();
        upload.setReceiver(memoryBuffer);
        Image foto = this.getImg();
		this.getCancelar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
		this.getConfirmar().addClickListener(new ComponentEventListener(){
			public void onComponentEvent(ComponentEvent event) {
				try {
					Confirmar();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		this.getEliminarFoto().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                String UrlCarpeta = "./src/main/resources/META-INF/resources/img/events/";
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
                String UrlCarpeta = "./src/main/resources/META-INF/resources/img/events/";
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

	private void Inicializar() {
		// TODO Auto-generated method stub
	}

	protected void Confirmar() throws ParseException {
		if (this.getFecha().isEmpty() || this.getHora().isEmpty() || this.getLugar().isEmpty()) {
			ControladorVistas.PopUpBasico("No se pueden dejar campos en blanco");
		}else {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            dateFormat.setLenient(false);
            Date fechaUtil = dateFormat.parse(this.getFecha().getValue());
            java.sql.Date fecha = new java.sql.Date(fechaUtil.getTime());
			//Se guarda el evento
			adm.anadirEvento(fecha, this.getHora().getValue(), this.getLugar().getValue(), pathFoto);
			_perfilArtista = new Perfil_artista_propio();
			_perfilArtista.getStyle().set("width", "100%");
			ControladorVistas.CambiarContenido(_perfilArtista);
		}
	}

	protected void Cancelar() {
		_perfilArtista = new Perfil_artista_propio();
		_perfilArtista.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_perfilArtista);
	}
	public String Anadir_imagen(MemoryBuffer memoryBuffer) throws PersistentException {
        int id = Actor_ComunDAO.listActor_ComunByQuery("true=true", "nick").length + 1;
        String nameImagen = id + "." + FilenameUtils.getExtension(memoryBuffer.getFileName());
        String UrlImagen = "img/users/" + nameImagen;

        InputStream is = memoryBuffer.getInputStream();
        try {

            OutputStream os = new FileOutputStream("./src/main/resources/META-INF/resources/" + UrlImagen);
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
            this.getImg().setMaxWidth("300px");
            this.getImg().setSrc(UrlImagen);
            this.getUpload().setVisible(false);
            this.getEliminarFoto().setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return UrlImagen;
    }
}