package bbdd;

import java.sql.Date;
import java.util.Vector;

import org.orm.PersistentException;

import orm.bbdd.Evento;

public class BD_Eventos {
	public BDPrincipal _bd_prin_eventos;
	public Vector<Evento> _contiene_eventos = new Vector<Evento>();

	public void anadirEvento(Date aFecha, String aHora, String aLugar, String aFoto) throws PersistentException{
		throw new UnsupportedOperationException();
	}
}