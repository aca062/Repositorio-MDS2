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
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import bbdd.BDPrincipal;
import bbdd.iActor_comun;
import vistas.VistaPerfil;

public class Perfil extends VistaPerfil {
    /*
     * private event _recibir_notificacion; private Label _nickL; private Label
     * _emailL; private Button _editarEmailB; private Image _imagen; private Label
     * _seguidoresL; private Label _nSeguidoresL; private Label _seguidoL; private
     * Label _nSeguidoL; private Button _recibirNotifiacionB; private Button
     * _crearListaB;
     */
    public Listas_de_reproduccion_propias _listasDeReproduccionPropia;
    public Crear_lista_de_reproduccion _crearListaDeReproduccion;
    iActor_comun bd = new BDPrincipal();
    MemoryBuffer memoryBuffer = new MemoryBuffer();
    Upload foto = new Upload();

    public Perfil() {
        Inicializar();
        this.getBotonEditarCorreo().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                EditarCorreo();
            }
        });
        this.getBotonEditarFotoPerfil().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                EditarFoto();
            }
        });
        this.getBotonEditarFotoPerfil().addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                EditarFoto();
            }
        });
        foto.addFinishedListener(e -> {

            String nameImagen = ControladorVistas.getUsuario().getId() + "."
                    + FilenameUtils.getExtension(memoryBuffer.getFileName());

            if (ControladorVistas.getUsuario().getFoto() == null
                    || ControladorVistas.getUsuario().getFoto().equals("")) {
                try {
                    bd.cambiarFoto(ControladorVistas.getUsuario().getId(), "/img/users/" + nameImagen);
                    ControladorVistas.getUsuario().setFoto(nameImagen);
                } catch (PersistentException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }

            String UrlCarpeta = "./src/main/resources/META-INF/resources/img/users/";
            File folder = new File(UrlCarpeta);
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    String filename = file.getName();
                    if (filename.equalsIgnoreCase(ControladorVistas.getUsuario().getFoto().split("/")[2])) {
                        file.delete();
                    }
                }
            }
            try {
                Cambiar_Imagen(memoryBuffer);
            } catch (PersistentException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
    }

    private void Cambiar_Imagen(MemoryBuffer memoryBuffer2) throws PersistentException {

        InputStream is = memoryBuffer2.getInputStream();

        try {

            OutputStream os = new FileOutputStream(
                    "./src/main/resources/META-INF/resources/" + ControladorVistas.getUsuario().getFoto());
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
            this.getFotoPerfil().getStyle().set("width", "100%");
            this.getFotoPerfil().setMaxWidth("300px");
            this.getFotoPerfil().setSrc(ControladorVistas.getUsuario().getFoto());
            this.foto.setVisible(false);
            this.getBotonEditarFotoPerfil().setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void EditarFoto() {
        foto.setVisible(true);
        if (ControladorVistas.getUsuario().getFoto() != null) {
            try {
                bd.cambiarFoto(ControladorVistas.getUsuario().getId(), null);
                ControladorVistas.getUsuario().setFoto(null);
            } catch (PersistentException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            String UrlCarpeta = "./src/main/resources/META-INF/resources/img/users/";
            File folder = new File(UrlCarpeta);
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    String filename = file.getName();
                    if (filename.equalsIgnoreCase(ControladorVistas.getUsuario().getFoto().split("/")[2])) {
                        file.delete();
                    }
                }
            }
        }
        this.getBotonEditarFotoPerfil().setVisible(false);

    }

    public void Recibir_notificacion() {
        throw new UnsupportedOperationException();
    }

    void Inicializar() {
        //this.getLayoutFotoPerfil().as(VerticalLayout.class).add(foto);
        this.getBotonEditarFotoPerfil().setVisible(false);
        foto.setVisible(false);
        this.getTusListas().setVisible(false);
        foto.setReceiver(memoryBuffer);
        _listasDeReproduccionPropia = new Listas_de_reproduccion_propias();
        this.getLayoutTusListas().add(_listasDeReproduccionPropia);
        if (ControladorVistas.getUsuario().getFoto() != null) {
            this.getFotoPerfil().setSrc(ControladorVistas.getUsuario().getFoto());
        } else {
            this.getFotoPerfil()
                    .setSrc("https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png");
        }
        this.getH5Nombre().setText(ControladorVistas.getUsuario().getNick());
        this.getH5Correo().setText(ControladorVistas.getUsuario().getEmail());
        this.getNumeroSeguidores().setText(Integer.toString(ControladorVistas.getUsuario().seguidor.size()));
        this.getNumeroSeguidos().setText(Integer.toString(ControladorVistas.getUsuario().seguido.size()));
    }

    void EditarCorreo() {
        Dialog popup = new Dialog();
        TextField correoNuevo = new TextField("Nuevo correo");
        TextField confirmarCorreo = new TextField("Introduzca de nuevo el correo");
        VerticalLayout dialogLayout = new VerticalLayout(correoNuevo, confirmarCorreo);
        popup.add(dialogLayout);
        Button guardarCambios = new Button("Guardar cambios");
        Button cancelar = new Button("Cancelar");
        popup.add(cancelar);
        popup.add(guardarCambios);
        popup.setWidth("40%");
        correoNuevo.setWidth("100%");
        confirmarCorreo.setWidth("100%");
        cancelar.getStyle().set("margin-right", "20px");
        guardarCambios.addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                ConfirmarEdicionCorreo(correoNuevo.getValue().toString(), confirmarCorreo.getValue().toString(), popup);
            }
        });
        cancelar.addClickListener(new ComponentEventListener() {
            @Override
            public void onComponentEvent(ComponentEvent event) {
                popup.close();
            }
        });
        ControladorVistas.PopUpFormularioEditar(popup);
    }

    void ConfirmarEdicionCorreo(String correo, String correoRepetido, Dialog popup) {
        if (correo.isEmpty() || correoRepetido.isEmpty()) {
            ControladorVistas.PopUpBasico("Uno de los campos está vacío");
        } else {
            if (!correo.equals(correoRepetido)) {
                ControladorVistas.PopUpBasico("Los correos no son iguales");
            } else {
                try {
                    if (!bd.cambiarCorreo(correo, ControladorVistas.getUsuario().getId())) {
                        ControladorVistas.PopUpBasico("El correo introducido está en uso");
                    } else {
                        ControladorVistas.PopUpBasico("Correo cambiado correctamente");
                        this.getH5Correo().setText(correo);
                    }
                } catch (PersistentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                popup.close();
            }
        }
    }
}