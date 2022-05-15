/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Antonio Jesús Cano Andreu(University of Almeria)
 * License Type: Academic
 */
package orm.bbdd;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EventoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idEvento;
	public final StringExpression artistaId;
	public final AssociationExpression artista;
	public final StringExpression foto;
	public final DateExpression fecha;
	public final StringExpression hora;
	public final StringExpression lugar;
	public final CollectionExpression usuario;
	
	public EventoCriteria(Criteria criteria) {
		super(criteria);
		idEvento = new IntegerExpression("idEvento", this);
		artistaId = new StringExpression("artista.", this);
		artista = new AssociationExpression("artista", this);
		foto = new StringExpression("foto", this);
		fecha = new DateExpression("fecha", this);
		hora = new StringExpression("hora", this);
		lugar = new StringExpression("lugar", this);
		usuario = new CollectionExpression("ORM_usuario", this);
	}
	
	public EventoCriteria(PersistentSession session) {
		this(session.createCriteria(Evento.class));
	}
	
	public EventoCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createArtistaCriteria() {
		return new ArtistaCriteria(createCriteria("artista"));
	}
	
	public Actor_ComunCriteria createUsuarioCriteria() {
		return new Actor_ComunCriteria(createCriteria("ORM_usuario"));
	}
	
	public Evento uniqueEvento() {
		return (Evento) super.uniqueResult();
	}
	
	public Evento[] listEvento() {
		java.util.List list = super.list();
		return (Evento[]) list.toArray(new Evento[list.size()]);
	}
}

