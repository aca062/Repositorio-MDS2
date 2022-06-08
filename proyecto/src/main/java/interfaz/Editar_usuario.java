package interfaz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

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
import orm.bbdd.Usuario_Registrado;
import vistas.VistaEditar_usuario;

public class Editar_usuario extends VistaEditar_usuario{

	public Usuario_admin _usuarioAdmin;
	String pathFoto = null;
	iAdministrador adm = new BDPrincipal();
	int id;
	public Editar_usuario(Usuario_Registrado usuario) throws PersistentException {

		Inicializar(usuario);
		
		Integer id = Actor_ComunDAO.listActor_ComunByQuery("true=true", "nick").length + 1;
		this.getEliminarFoto().setVisible(false);
		MemoryBuffer memoryBuffer = new MemoryBuffer();
        Upload upload = this.getUpload();
        upload.setReceiver(memoryBuffer);
        Image foto = this.getImg();

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
                String UrlCarpeta = "./src/main/webapp/img/";
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
                String UrlCarpeta = "./src/main/webapp/img/";
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
		//Más cosas
    	if (this.getNick().getValue().isEmpty() || this.geteMail().getValue().isEmpty()
                || this.getContrasena().getValue().isEmpty() || this.getConfirmarContrasena().getValue().isEmpty()) {
            ControladorVistas.PopUpBasico("Alguno de los campos está vacío");
        } else if (!this.getContrasena().getValue().equals(this.getConfirmarContrasena().getValue())) {
            ControladorVistas.PopUpBasico("Las dos contraseñas tienen que ser iguales");
        } else {
            int comprobacion = adm.editarUsuario(id, this.geteMail().getValue(), this.getContrasena().getValue(), this.getNick().getValue(), pathFoto);
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
        int id = Actor_ComunDAO.listActor_ComunByQuery("true=true", "nick").length + 1;
        String nameImagen = id + "." + FilenameUtils.getExtension(memoryBuffer.getFileName());
        String UrlImagen = "img/" + nameImagen;
        /*
         * File file = new File(UrlImagen); if (file.exists()) { file.delete(); }
         */
        InputStream is = memoryBuffer.getInputStream();
        try {

            OutputStream os = new FileOutputStream("./src/main/webapp/img/" + nameImagen);
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
            //this.getUpload().setVisible(false);
            //this.getEliminarFoto().setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "./src/main/webapp/" + UrlImagen;
    }
	void Inicializar(Usuario_Registrado usuario) {
		this.id = usuario.getId();
		this.pathFoto = usuario.getFoto();
		this.getContrasena().setValue(usuario.getContrasena());
		this.geteMail().setValue(usuario.getEmail());
		this.getNick().setValue(usuario.getNick());
		this.getCancelar().setVisible(true);
		this.getConfirmar().setVisible(true);
		this.getNick().setVisible(true);
		this.getContrasena().setVisible(true);
		this.getConfirmarContrasena().setVisible(true);
		this.geteMail().setVisible(true);
		this.getH2Titulo().setVisible(true);
	}
}