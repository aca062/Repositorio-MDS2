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
import bbdd.iCibernauta;
import orm.bbdd.Actor_ComunDAO;
import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse {
    /*
     * private Label _emailL; private TextField _emailTF; private Label _nickL;
     * private TextField _nickTF; private Label _passwordL; private TextField
     * _passwordTF; private Label _confirmarPassL; private TextField
     * _confirmarPassTF; private Button _cancelarB; private Button _crearCuentaB;
     * private Button _loginB; private Image _imagen; private Button _anadirFotoB;
     */
    public Login_cibernauta _loginCibernauta;
    public Verificar_e_mail _verificarE_mail;
    iCibernauta cib = new BDPrincipal();
    String pathFoto = null;

    public Registrarse() throws PersistentException {
        Inicializar();
        Integer id = Actor_ComunDAO.listActor_ComunByQuery("true=true", "nick").length + 1;
        // VerticalLayout layoutFoto = this.getLayoutFoto().as(VerticalLayout.class);
        this.getBotonIniciarSesion().setVisible(false);
        MemoryBuffer memoryBuffer = new MemoryBuffer();
        Upload upload = this.getSubidaDeFoto();
        upload.setReceiver(memoryBuffer);
        this.getBotonFoto().setVisible(false);
        Image foto = this.getFotoPerfil();

        this.getBotonCancelar().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                try {
                    Integer id = Actor_ComunDAO.listActor_ComunByQuery("true=true", "nick").length + 1;
                    String UrlCarpeta = "./src/main/resources/META-INF/resources/img/users/";
                    File folder = new File(UrlCarpeta);
                    File[] listOfFiles = folder.listFiles();
                    for (File file : listOfFiles) {
                        if (file.isFile()) {
                            String[] filename = file.getName().split("\\.(?=[^\\.]+$)"); // split filename from it's
                                                                                         // extension
                            System.out.println(filename[0]);
                            System.out.println(filename[1]);
                            if (filename[0].equalsIgnoreCase(id.toString())) {
                                file.delete();
                            }
                        }
                    }
                } catch (PersistentException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                Cancelar();
            }
        });

        this.getBotonCrearCuenta().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                CrearCuenta();
            }
        });

        this.getBotonFoto().addClickListener(new ComponentEventListener() {
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
                pathFoto = Cambiar_Imagen(memoryBuffer);
            } catch (PersistentException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
    }

    protected void CambiarUpload() {
        this.getSubidaDeFoto().interruptUpload();
        this.getSubidaDeFoto().setVisible(true);
        this.getBotonFoto().setVisible(false);

    }

    protected void CrearCuenta() {
        if (this.getNick().getValue().isEmpty() || this.geteMail().getValue().isEmpty()
                || this.getContrasena().getValue().isEmpty() || this.getRepetirContrasena().getValue().isEmpty()) {
            ControladorVistas.PopUpBasico("Alguno de los campos está vacío");
        } else if (!this.getContrasena().getValue().equals(this.getRepetirContrasena().getValue())) {
            ControladorVistas.PopUpBasico("Las dos contraseñas tienen que ser iguales");
        } else {
            int comprobacion = cib.registro(this.geteMail().getValue(), this.getContrasena().getValue(),
                    this.getNick().getValue(), pathFoto);
            if (comprobacion == -1) {
                ControladorVistas.PopUpBasico("El nick introducido ya existe");
            } else if (comprobacion == -2) {
                ControladorVistas.PopUpBasico("El correo introducido ya existe");
            } else {
                ControladorVistas.PopUpBasico("La cuenta se ha creado correctamente");
                /*
                 * _verificarE_mail = new Verificar_e_mail();
                 * _verificarE_mail.getStyle().set("width", "100%");
                 */
                _loginCibernauta = new Login_cibernauta();
                _loginCibernauta.getStyle().set("width", "100%");
                ControladorVistas.CambiarContenido(_loginCibernauta);
            }
        }
    }

    protected void Cancelar() {
        _loginCibernauta = new Login_cibernauta();
        _loginCibernauta.getStyle().set("width", "100%");
        ControladorVistas.CambiarContenido(_loginCibernauta);
    }

    private void Inicializar() {
        // TODO Auto-generated method stub

    }

    public void Validar_contrasena() {
        throw new UnsupportedOperationException();
    }

    public void Filtrar_nick_repetido() {
        throw new UnsupportedOperationException();
    }

    public void Filtro_palabras_malsonantes() {
        throw new UnsupportedOperationException();
    }

    private String Cambiar_Imagen(MemoryBuffer memoryBuffer) throws PersistentException {
        int id = Actor_ComunDAO.listActor_ComunByQuery("true=true", "nick").length + 1;
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
            this.getLayoutFoto().getStyle().set("width", "100%");
            this.getFotoPerfil().setMaxWidth("300px");
            this.getFotoPerfil().setSrc(UrlImagen);
            this.getSubidaDeFoto().setVisible(false);
            this.getBotonFoto().setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "./src/main/resources/META-INF/resources/" + UrlImagen;
    }
}