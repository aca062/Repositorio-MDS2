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
import bbdd.iActor_comun;
import bbdd.iAdministrador;
import orm.bbdd.Actor_ComunDAO;
import orm.bbdd.Estilo;
import orm.bbdd.EstiloDAO;
import vistas.VistaAlta_artistas;

public class Alta_artistas extends VistaAlta_artistas {
    /*
     * private Label _altaArtistaL; private event _anadir_imagen; private Image
     * _imagen; private Button _anadirImagenB; private Label _nickL; private
     * TextField _nickTF; private Label _passwordL; private TextField _passwordTF;
     * private Label _confirmarPassL; private TextField _confirmarPassTF; private
     * Label _emailL; private TextField _emailTF; private Label _estilosL; private
     * Dropdown _estilosD; private Button _cancelarB; private Button _confirmarB;
     */
    public Dar_de_alta _darDeAlta = new Dar_de_alta();
    private orm.bbdd.Artista artista;
    iAdministrador adm = new BDPrincipal();
    String pathFoto = null;
    private Estilo[] estilos;

    @SuppressWarnings("unchecked")
	public Alta_artistas() throws PersistentException {
        Inicializar();
        this.getBotonEliminar().setVisible(false);
        Integer id = Actor_ComunDAO.listActor_ComunByQuery("true=true", "nick").length + 1;
        //VerticalLayout layoutFoto = this.getLayoutFoto().as(VerticalLayout.class);
        MemoryBuffer memoryBuffer = new MemoryBuffer();
        Upload upload = this.getSubirFoto();
        upload.setReceiver(memoryBuffer);
        Image foto = this.getImgArtista();
        
        /*Estilo[] estilos = null;
        estilos = EstiloDAO.listEstiloByQuery(null, null);
        estilos1 = EstiloDAO.listEstiloByQuery(null, null);*/
        cargarEstilos();
        
        List<String> nombreEstilos = new Vector<String>(estilos.length);
        
        for(Estilo estilo : estilos) {
        	nombreEstilos.add(estilo.getNombre());
        }
        this.getDropdown().setItems(nombreEstilos);
        
        /*for (Estilo estilo : EstiloDAO.listEstiloByQuery("true=true", "Nombre")) {
            System.out.println(estilo.getNombre());
            this.getEstilo().add(estilo.getNombre());
            
        }*/

        this.getCancelar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                Cancelar();
            }
        });
        this.getConfirmar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                Confirmar();
            }
        });
        this.getBotonEliminar().addClickListener(new ComponentEventListener() {
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
        this.getSubirFoto().interruptUpload();
        this.getSubirFoto().setVisible(true);
        this.getBotonEliminar().setVisible(false);

    }

    protected void Confirmar() {
    	orm.bbdd.Estilo estiloSeleccionado = null;
    	for(orm.bbdd.Estilo estilo : estilos) {
    		if(estilo.getNombre().equals(getDropdown().getValue())) {
    			estiloSeleccionado = estilo;
    			break;
    		}
    	}
    	adm.altaArtistas(this.geteMail().getValue(), this.getContrasena().getValue(), this.getNick().getValue(), pathFoto,estiloSeleccionado.getIdEstilo());
        _darDeAlta.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_darDeAlta);
    }

    protected void Cancelar() {
        _darDeAlta = new Dar_de_alta();
        _darDeAlta.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_darDeAlta);

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
            this.getImgArtista().setMaxWidth("300px");
            this.getImgArtista().setSrc(UrlImagen);
            this.getSubirFoto().setVisible(false);
            this.getBotonEliminar().setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "./src/main/webapp/" + UrlImagen;
    }

    void Inicializar() {
        this.getCancelar().setVisible(true);
        this.getConfirmar().setVisible(true);
        this.getContrasena().setVisible(true);
        this.getConfirmarContraseña().setVisible(true);
        this.geteMail().setVisible(true);
        this.getH2Titulo().setVisible(true);
        this.getImgArtista().setVisible(true);
        this.getNick().setVisible(true);
    }
    
    public void cargarEstilos() {
    	estilos = adm.cargarEstilo();
    }
    
}