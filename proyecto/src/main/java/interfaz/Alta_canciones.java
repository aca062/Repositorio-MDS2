package interfaz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.example.test.ControladorVistas;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import bbdd.BDPrincipal;
import bbdd.iAdministrador;
import orm.bbdd.Estilo;
import orm.bbdd.EstiloDAO;
import vistas.VistaAlta_canciones;

public class Alta_canciones extends VistaAlta_canciones{
	/*private Label _altaCancionL;
	private event _anadir_archivo_multimedia;
	private Label _tituloL;
	private TextField _tituloTF;
	private Label _tituloAlbumL;
	private TextField _tituloAlbumTF;
	private Label _compositoresL;
	private TextField _compositoresTF;
	private Label _productoresL;
	private TextField _productoresTF;
	private Label _interpretesL;
	private TextField _interpretesTF;
	private Label _estilosL;
	private Dropdown _estilosD;
	private Label _archivoMultimimediaL;
	private Button _anadirArchivoMultimediaB;
	private Button _cancelarB;
	private Button _confirmarB;*/
	public Dar_de_alta _darDeAlta = new Dar_de_alta();
	private iAdministrador adm = new BDPrincipal();
	private Estilo[] estilos;

	private String pathSong = null;

	public Alta_canciones() throws PersistentException {
		Inicializar();

	    MemoryBuffer memoryBuffer = new MemoryBuffer();
	    Upload upload = this.getVaadinUpload();
        upload.setReceiver(memoryBuffer);
        
        
        cargarEstilos();
        
        List<String> nombreEstilos = new Vector<String>(estilos.length);
        
        for(Estilo estilo : estilos) {
        	nombreEstilos.add(estilo.getNombre());
        }
        
        this.getDropdown().setItems(nombreEstilos);
        
        
		this.getCancelar().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				Cancelar();
			}
		});
		this.getConfirmar().addClickListener(new ComponentEventListener(){
			@Override
            public void onComponentEvent(ComponentEvent event) {
				Confirmar();
			}
		});
		upload.addFinishedListener(e -> {
            String UrlCarpeta = "./src/main/webapp/songs/";
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
            pathSong = Anadir_archivo_multimedia(memoryBuffer);
        });
	}

	private void cargarEstilos() {
		estilos = adm.cargarEstilo();		
	}

	protected void Confirmar() {
		orm.bbdd.Estilo estiloSeleccionado = null;
    	for(orm.bbdd.Estilo estilo : estilos) {
    		if(estilo.getNombre().equals(getDropdown().getValue())) {
    			estiloSeleccionado = estilo;
    			break;
    		}
    	}
	    adm.altaCancion(this.getTitulo().getValue(), this.getCompositores().getValue().split(","), this.getProductores().getValue().split(","), this.getInterpretes().getValue().toString().split(","), pathSong ,estiloSeleccionado.getIdEstilo(), this.getTituloAlbum().getValue());
		_darDeAlta = new Dar_de_alta();
		_darDeAlta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_darDeAlta);
	}

	protected void Cancelar() {
		_darDeAlta = new Dar_de_alta();
		_darDeAlta.getStyle().set("width", "100%");
		ControladorVistas.CambiarContenido(_darDeAlta);

	}

	public String Anadir_archivo_multimedia(MemoryBuffer memoryBuffer) {
	    InputStream is = memoryBuffer.getInputStream();
        String UrlImagen = "./src/main/webapp/songs/"+memoryBuffer.getFileName();
        try {
            OutputStream os = new FileOutputStream("./src/main/webapp/songs/"+memoryBuffer.getFileName());
            byte[] buffer = new byte[1024];
            int bytesRead;
            //read from is to buffer
            while((bytesRead = is.read(buffer)) !=-1){
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            os.flush();
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return UrlImagen;
	}

	public void Comprobar_formato() {
		throw new UnsupportedOperationException();
	}

	void Inicializar() {
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