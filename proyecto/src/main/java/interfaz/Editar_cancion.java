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
//import com.example.test.WindowController;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import orm.bbdd.Cancion;
import orm.bbdd.Estilo;
import vistas.VistaEditar_cancion;

public class Editar_cancion extends VistaEditar_cancion {
    /*
     * private Label _editarCancionL; private event _anadir_archivo_multimedia;
     * private Label _tituloL; private TextField _tituloTF; private Label
     * _tituloAlbumL; private TextField _tituloAlbumTF; private Label
     * _compositoresL; private TextField _compositoresTF; private Label
     * _productoresL; private TextField _productoresTF; private Label _interpretesL;
     * private TextField _interpretesTF; private Label _estilosL; private Dropdown
     * _estilosD; private Label _ficheroL; private Button _anadirFicheroB; private
     * Button _cancelarB; private Button _confirmarB;
     */
    public Cancion_admin _cancionAdmin;
    private iAdministrador adm = new BDPrincipal();
    private Estilo[] estilos;
    private String pathSong;
    int id;

    public Editar_cancion(Cancion cancion) {

        pathSong = cancion.getRutaImagen();

        Inicializar(cancion);

        this.getBotonEliminar().setVisible(false);
        MemoryBuffer memoryBufferCancion = new MemoryBuffer();
        Upload uploadCancion = this.getUpload();
        uploadCancion.setReceiver(memoryBufferCancion);

        cargarEstilos();

        List<String> nombreEstilos = new Vector<String>(estilos.length);

        for (Estilo estilo : estilos) {
            nombreEstilos.add(estilo.getNombre());
        }

        this.getEstilo().setItems(nombreEstilos);

        this.getConfirmar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                Confirmar();
            }
        });

        this.getCancelar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                Cancelar();
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
    }

    public void Confirmar() {
        orm.bbdd.Estilo estiloSeleccionado = null;
        for (orm.bbdd.Estilo estilo : estilos) {
            if (estilo.getNombre().equals(this.getEstilo().getValue())) {
                estiloSeleccionado = estilo;
                break;
            }
        }
        if (this.getTitulo().getValue().isEmpty()) {
            ControladorVistas.PopUpBasico("No se ha introducido t??tulo de la canci??n");
        }else if (this.getInterpretes().getValue().isEmpty()) {
            ControladorVistas.PopUpBasico("No se ha introducido ning??n artista");
        }else if (estiloSeleccionado == null) {
            ControladorVistas.PopUpBasico("No se ha introducido ning??n estilo");
            /*}else if (pathSong == null || pathSong.equals("")) {
            ControladorVistas.PopUpBasico("No se ha a??adido ninguna canci??n");*/
        }else {
            int comprobacion = adm.editarCancion(this.getTitulo().getValue(), this.getCompositores().getValue().split(","),
                    this.getProductores().getValue().split(","), this.getInterpretes().getValue().toString().split(","),
                    pathSong, estiloSeleccionado.getIdEstilo(), this.getTituloAlbum().getValue(), id);
            if (comprobacion == 1) {
                ControladorVistas.PopUpBasico("Canci??n editada con ??xito");
                Buscar_elemento _buscarElemento = new Buscar_elemento();
                _buscarElemento.getStyle().set("width", "100%");
                ControladorVistas.CambiarContenido(_buscarElemento);
            }else if (comprobacion == -1) {
                ControladorVistas.PopUpBasico("El artista no existe");
            }else {
                ControladorVistas.PopUpBasico("El ??lbum no existe para el artista introducido");
            }
        }
    }

    private void cargarEstilos() {
        estilos = adm.cargarEstilo();
    }

    public void Cancelar() {
        Buscar_elemento _buscarElemento = new Buscar_elemento();
        _buscarElemento.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_buscarElemento);
    }

    public String Anadir_archivo_multimedia(MemoryBuffer memoryBuffer) throws PersistentException {
        InputStream is = memoryBuffer.getInputStream();
        String nameCancion = id + "." + FilenameUtils.getExtension(memoryBuffer.getFileName());
        String UrlCancion = "songs/" + nameCancion;
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
        this.getUpload().setVisible(false);
        this.getBotonEliminar().setVisible(true);
        return UrlCancion;
    }

    public void Comprobar_formato() {
        throw new UnsupportedOperationException();
    }

    void Inicializar(Cancion cancion) {
        this.getTitulo().setValue(cancion.getTitulo());
        this.id = cancion.getIdCancion();
        this.pathSong = cancion.getArchivoMultimedia();
        String productores = "";
        for (int i = 0; i < cancion.getProductores().length; i++) {
            productores += cancion.getProductores()[i];
            if (i != cancion.getProductores().length - 1) {
                productores += ", ";
            }
        }
        this.getProductores().setValue(productores);
        String artistas = "";
        for (int i = 0; i < cancion.artistas.toArray().length; i++) {
            artistas += cancion.artistas.toArray()[i].getNick();
            if (i != cancion.artistas.toArray().length - 1) {
                artistas += ", ";
            }
        }
        this.getInterpretes().setValue(artistas);
        String compositores = "";
        for (int i = 0; i < cancion.getCompositores().length; i++) {
            compositores += cancion.getCompositores()[i];
            if (i != cancion.getCompositores().length - 1) {
                compositores += ", ";
            }
        }
        this.getCompositores().setValue(compositores);
        String album = "";
        for (int i = 0; i < cancion.album.toArray().length; i++) {
            album += cancion.album.toArray()[i].getTitulo();
            if (i != cancion.album.toArray().length - 1) {
                album += ", ";
            }
        }
        this.getTituloAlbum().setValue(album);
    }
}