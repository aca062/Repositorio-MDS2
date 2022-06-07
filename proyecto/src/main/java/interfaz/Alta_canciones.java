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
import orm.bbdd.CancionDAO;
import orm.bbdd.Estilo;
import vistas.VistaAlta_canciones;

public class Alta_canciones extends VistaAlta_canciones {
    /*
     * private Label _altaCancionL; private event _anadir_archivo_multimedia;
     * private Label _tituloL; private TextField _tituloTF; private Label
     * _tituloAlbumL; private TextField _tituloAlbumTF; private Label
     * _compositoresL; private TextField _compositoresTF; private Label
     * _productoresL; private TextField _productoresTF; private Label _interpretesL;
     * private TextField _interpretesTF; private Label _estilosL; private Dropdown
     * _estilosD; private Label _archivoMultimimediaL; private Button
     * _anadirArchivoMultimediaB; private Button _cancelarB; private Button
     * _confirmarB;
     */
    public Dar_de_alta _darDeAlta = new Dar_de_alta();
    private iAdministrador adm = new BDPrincipal();
    private Estilo[] estilos;

    private String pathSong = null;
    private String pathFoto = null;

    public Alta_canciones() throws PersistentException {
        Inicializar();
        this.getVaadinButton().setVisible(false);

        Integer id = CancionDAO.listCancionByQuery("true=true", "titulo").length + 1;

        this.getBotonEliminar().setVisible(false);

        MemoryBuffer memoryBufferCancion = new MemoryBuffer();
        Upload uploadCancion = this.getVaadinUpload();
        uploadCancion.setReceiver(memoryBufferCancion);

        MemoryBuffer memoryBufferFoto = new MemoryBuffer();
        Upload uploadFoto = this.getVaadinUpload1();
        uploadFoto.setReceiver(memoryBufferFoto);
        Image foto = this.getImg();
        foto.setMaxWidth("300px");
        foto.setSrc("https://w7.pngwing.com/pngs/585/475/png-transparent-music-musical-note-computer-icons-musical-note-angle-text-rectangle.png");

        cargarEstilos();

        List<String> nombreEstilos = new Vector<String>(estilos.length);


        for (Estilo estilo : estilos) {
            nombreEstilos.add(estilo.getNombre());
        }

        this.getDropdown().setItems(nombreEstilos);

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

        uploadCancion.addFinishedListener(e -> {
            String UrlCarpeta = "./src/main/resources/META-INF/resources/songs/";
            File folder = new File(UrlCarpeta);
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    String[] filename = file.getName().split("\\.(?=[^\\.]+$)"); // split filename from it's extension
                    if (filename[0].equalsIgnoreCase(file.getName())) {
                        file.delete();
                    }
                }
            }
            try {
                pathSong = Anadir_archivo_multimedia(memoryBufferCancion);
            } catch (PersistentException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });

        uploadFoto.addFinishedListener(e -> {
            try {
                String UrlCarpeta = "./src/main/resources/META-INF/resources/img/canciones/";
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
                pathFoto = Anadir_imagen(memoryBufferFoto);
            } catch (PersistentException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });

        this.getVaadinButton().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                String UrlCarpeta = "./src/main/resources/META-INF/resources/img/canciones/";
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
                CambiarUploadFoto();
                foto.setMaxWidth("300px");
                foto.setSrc("https://w7.pngwing.com/pngs/585/475/png-transparent-music-musical-note-computer-icons-musical-note-angle-text-rectangle.png");
                pathFoto = null;
            }
        });

        this.getBotonEliminar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                String UrlCarpeta = "./src/main/resources/META-INF/resources/songs/";
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
                CambiarUploadCancion();
                pathSong = null;
            }
        });
    }

    protected void CambiarUploadFoto() {
        this.getVaadinUpload1().interruptUpload();
        this.getVaadinUpload1().setVisible(true);
        this.getVaadinButton().setVisible(false);
    }

    protected void CambiarUploadCancion() {
        this.getVaadinUpload().interruptUpload();
        this.getVaadinUpload().setVisible(true);
        this.getBotonEliminar().setVisible(false);
    }

    private void cargarEstilos() {
        estilos = adm.cargarEstilo();
    }

    protected void Confirmar() {
        orm.bbdd.Estilo estiloSeleccionado = null;
        for (orm.bbdd.Estilo estilo : estilos) {
            if (estilo.getNombre().equals(getDropdown().getValue())) {
                estiloSeleccionado = estilo;
                break;
            }
        }
        if (this.getTitulo().getValue().isEmpty()) {
            ControladorVistas.PopUpBasico("No se ha introducido título de la canción");
        }else if (this.getInterpretes().getValue().isEmpty()) {
            ControladorVistas.PopUpBasico("No se ha introducido ningún artista");
        }else if (estiloSeleccionado == null) {
            ControladorVistas.PopUpBasico("No se ha introducido ningún estilo");
        //}else if (pathSong == null || pathSong.equals("")) {
        }else if (pathSong == null || pathSong.equals("")) {
            ControladorVistas.PopUpBasico("No se ha añadido ninguna canción");
        }else {
            int comprobacion = adm.altaCancion(this.getTitulo().getValue(), this.getCompositores().getValue().split(","),
                    this.getProductores().getValue().split(","), this.getInterpretes().getValue().toString().split(","),
                    this.getVaadinTextField().getValue(), estiloSeleccionado.getIdEstilo(), this.getTituloAlbum().getValue());
            if (comprobacion == 1) {
                ControladorVistas.PopUpBasico("Canción añadida con éxito");
                _darDeAlta = new Dar_de_alta();
                _darDeAlta.getStyle().set("width", "100%");
                ControladorVistas.CambiarContenido(_darDeAlta);
            }else if (comprobacion == -1) {
                ControladorVistas.PopUpBasico("El artista no existe");
            }else {
                ControladorVistas.PopUpBasico("El álbum no existe para el artista introducido");
            }
        }
    }

    protected void Cancelar() {
        _darDeAlta = new Dar_de_alta();
        _darDeAlta.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_darDeAlta);

    }

    public String Anadir_imagen(MemoryBuffer memoryBuffer) throws PersistentException {
        int id = CancionDAO.listCancionByQuery("true=true", "titulo").length + 1;
        String nameImagen = id + "." + FilenameUtils.getExtension(memoryBuffer.getFileName());
        String UrlImagen = "img/canciones/" + nameImagen;
        /*
         * File file = new File(UrlImagen); if (file.exists()) { file.delete(); }
         */
        InputStream is = memoryBuffer.getInputStream();
        try {

            OutputStream os = new FileOutputStream("./src/main/resources/META-INF/resources/" + nameImagen);
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
            this.getVaadinUpload1().setVisible(false);
            this.getVaadinButton().setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "./src/main/resources/META-INF/resources/" + UrlImagen;
    }

    public String Anadir_archivo_multimedia(MemoryBuffer memoryBuffer) throws PersistentException {
        int id = CancionDAO.listCancionByQuery("true=true", "titulo").length + 1;
        InputStream is = memoryBuffer.getInputStream();
        String nameCancion = id + "." + FilenameUtils.getExtension(memoryBuffer.getFileName());
        String UrlCancion = "./src/main/resources/META-INF/resources/songs/" + nameCancion;
        try {
            OutputStream os = new FileOutputStream("./src/main/resources/META-INF/resources/songs/" + nameCancion);
            byte[] buffer = new byte[1024];
            int bytesRead;
            // read from is to buffer
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            os.flush();
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        this.getVaadinUpload().setVisible(false);
        this.getBotonEliminar().setVisible(true);
        return UrlCancion;
    }

    public void Comprobar_formato() {
        throw new UnsupportedOperationException();
    }

    void Inicializar() {
        this.getVaadinTextField().setVisible(false);
        this.getCancelar().setVisible(true);
        this.getConfirmar().setVisible(true);
        this.getCompositores().setVisible(true);
        this.getH2Titulo().setVisible(true);
        this.getH4Fichero().setVisible(true);
        this.getH5Requisitos().setVisible(true);
        this.getInterpretes().setVisible(true);
        this.getTituloAlbum().setVisible(true);
        this.getTitulo().setVisible(true);
        this.getProductores().setVisible(true);
    }
}