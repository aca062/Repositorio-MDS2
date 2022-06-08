package bbdd;

import java.sql.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.example.test.ControladorVistas;

import orm.bbdd.Artista;
import orm.bbdd.ArtistaDAO;
import orm.bbdd.Evento;
import orm.bbdd.EventoDAO;
import orm.bbdd.MDS2PersistentManager;

public class BD_Eventos {
    public BDPrincipal _bd_prin_eventos;
    public Vector<Evento> _contiene_eventos = new Vector<Evento>();

    public boolean eliminarEvento(int aIdEvento) throws PersistentException {
        PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
        boolean correcto = false;
        try {
            Evento evento = EventoDAO.getEventoByORMID(aIdEvento);
            correcto = EventoDAO.delete(evento);
            t.commit();
        } catch (Exception e) {
            correcto = false;
            t.rollback();
        }
        return correcto;
    }

    public void anadirEvento(Date aFecha, String aHora, String aLugar, String aFoto) throws PersistentException {
    	PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
    	try {
    		Evento evento = EventoDAO.createEvento();
    		evento.setFecha(aFecha);
    		evento.setHora(aHora);
    		evento.setLugar(aLugar);
    		evento.setFoto(aFoto);
    		Artista artista = ArtistaDAO.loadArtistaByORMID(ControladorVistas.getUsuario().getId());
    		evento.setArtista(artista);
    		EventoDAO.save(evento);
    		t.commit();
    	} catch(PersistentException e){
    		e.printStackTrace();
    	}
    }

    public Evento[] cargarEventos(int id) throws PersistentException {
        return EventoDAO.listEventoByQuery("ArtistaActor_ComunId = '" + id + "'", "IdEvento");
    }
}