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
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import orm.bbdd.Actor_Comun;
import orm.bbdd.Actor_ComunDAO;
import orm.bbdd.AlbumDAO;
import orm.bbdd.ArtistaDAO;
import orm.bbdd.Cancion;
import orm.bbdd.CancionDAO;
import vistas.VistaAlta_albumes;

public class Alta_albumes extends VistaAlta_albumes {
    /*
     * private Label _altaAlbumL; private event _anadir_imagen; private Image
     * _imagen; private Button _anadirImagenB; private Label _tituloL; private
     * TextField _tituloTF; private Label _nombreL; private TextField _nombreTF;
     * private Label _fechaEdicionL; private TextField _fechaEdicionTF; private
     * Label _listaCancionL; private Dropdown _listaCancionD; private Button
     * _cancelarB; private Button _confirmarB;
     */
    public Dar_de_alta _darDeAlta = new Dar_de_alta();
    iAdministrador adm = new BDPrincipal();
    String pathFoto = null;

    public Alta_albumes() throws PersistentException {
        Inicializar();
        this.getEliminarFoto().setVisible(false);

        Integer id = AlbumDAO.listAlbumByQuery("true=true", "titulo").length + 1;

        MemoryBuffer memoryBufferFoto = new MemoryBuffer();
        Upload uploadFoto = this.getVaadinUpload();
        uploadFoto.setReceiver(memoryBufferFoto);
        Image foto = this.getImagen();
        foto.setMaxWidth("300px");
        foto.setSrc(
                "https://w7.pngwing.com/pngs/585/475/png-transparent-music-musical-note-computer-icons-musical-note-angle-text-rectangle.png");

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

        uploadFoto.addFinishedListener(e -> {
            try {
                String UrlCarpeta = "./src/main/webapp/img/albumes";
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

        this.getEliminarFoto().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                String UrlCarpeta = "./src/main/webapp/img/albumes/";
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
                foto.setSrc(
                        "https://w7.pngwing.com/pngs/585/475/png-transparent-music-musical-note-computer-icons-musical-note-angle-text-rectangle.png");
                pathFoto = null;
            }
        });
    }

    protected void CambiarUploadFoto() {
        this.getVaadinUpload().interruptUpload();
        this.getVaadinUpload().setVisible(true);
        this.getEliminarFoto().setVisible(false);
    }

    protected void Confirmar() {
        if (this.getTitulo().getValue().isEmpty()) {
            ControladorVistas.PopUpBasico("No se ha introducido título del álbum");
        } else if (this.getNombreArtista().getValue().isEmpty()) {
            ControladorVistas.PopUpBasico("No se ha introducido ningún artista");
        } else if (pathFoto == null || pathFoto.equals("")) {
            ControladorVistas.PopUpBasico("No se ha añadido una foto para el álbum");
        } else if (this.getFechaEdicion().isEmpty()) {
            ControladorVistas.PopUpBasico("No se ha añadido una fecha de edición");
        } else {
            try {
                String[] cancionesString = this.getCanciones().getValue().split(",");
                Cancion[] canciones = new Cancion[this.getCanciones().getValue().split(",").length];
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
                    Cancion i = CancionDAO.listCancionByQuery("titulo='" + cancion + "'", "titulo")[0];
                    if (i == null) {
                        throw new Exception();
                    }
                    for (String artista : i.getInterpretes()) {
                        if (actor.getNick().equals(artista.trim())) {
                            correcto = true;
                            canciones[index] = i;
                            break;
                        }
                    }
                    if (!correcto) {
                        throw new Exception();
                    }
                    index++;
                }
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                dateFormat.setLenient(false);
                Date fechaUtil = dateFormat.parse(this.getFechaEdicion().getValue());
                java.sql.Date fecha = new java.sql.Date(fechaUtil.getTime());
                int comprobacion = adm.AltaAlbum(pathFoto, this.getTitulo().getValue(), fecha,
                        this.getNombreArtista().getValue(), canciones);
                if (comprobacion == 1) {
                    ControladorVistas.PopUpBasico("Album añadido con éxito");
                    _darDeAlta.getStyle().set("width", "100%");
                    ControladorVistas.CambiarContenido(_darDeAlta);
                    ControladorVistas.CambiarContenido(_darDeAlta);
                } else if (comprobacion == -1) {
                    ControladorVistas.PopUpBasico("Error al añadir el álbum");
                }
            } catch (ParseException pe) {
                ControladorVistas.PopUpBasico("La fecha introducida no tiene el formato de dd-MM-yyyy");
            } catch (PersistentException exc) {
                ControladorVistas.PopUpBasico("El artista introducido no existe");
            }catch (Exception exc) {
                ControladorVistas.PopUpBasico("La canción introducida no existe o no es del artista introducido");
            }
        }
    }

    protected void Cancelar() {
        _darDeAlta = new Dar_de_alta();
        _darDeAlta.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_darDeAlta);

    }

    public String Anadir_imagen(MemoryBuffer memoryBufferFoto) throws PersistentException {
        int id = AlbumDAO.listAlbumByQuery("true=true", "titulo").length + 1;
        String nameImagen = id + "." + FilenameUtils.getExtension(memoryBufferFoto.getFileName());
        String UrlImagen = "img/albumes/" + nameImagen;
        /*
         * File file = new File(UrlImagen); if (file.exists()) { file.delete(); }
         */
        InputStream is = memoryBufferFoto.getInputStream();
        try {

            OutputStream os = new FileOutputStream("./src/main/webapp/img/albumes/" + nameImagen);
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
            this.getImagen().setMaxWidth("300px");
            this.getImagen().setSrc(UrlImagen);
            this.getVaadinUpload().setVisible(false);
            this.getEliminarFoto().setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "./src/main/webapp/" + UrlImagen;
    }

    void Inicializar() {
        this.getConfirmar().setVisible(true);
        this.getCancelar().setVisible(true);
        this.getFechaEdicion().setVisible(true);
        this.getH2Titulo().setVisible(true);
        this.getTitulo().setVisible(true);
        this.getImagen().setVisible(true);
        this.getNombreArtista().setVisible(true);
    }
}