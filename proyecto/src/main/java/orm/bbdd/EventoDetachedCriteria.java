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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EventoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idEvento;
	public final IntegerExpression artistaId;
	public final AssociationExpression artista;
	public final StringExpression foto;
	public final DateExpression fecha;
	public final StringExpression hora;
	public final StringExpression lugar;
	public final CollectionExpression usuario;
	
	public EventoDetachedCriteria() {
		super(orm.bbdd.Evento.class, orm.bbdd.EventoCriteria.class);
		idEvento = new IntegerExpression("idEvento", this.getDetachedCriteria());
		artistaId = new IntegerExpression("artista.", this.getDetachedCriteria());
		artista = new AssociationExpression("artista", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		hora = new StringExpression("hora", this.getDetachedCriteria());
		lugar = new StringExpression("lugar", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
	}
	
	public EventoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.bbdd.EventoCriteria.class);
		idEvento = new IntegerExpression("idEvento", this.getDetachedCriteria());
		artistaId = new IntegerExpression("artista.", this.getDetachedCriteria());
		artista = new AssociationExpression("artista", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		hora = new StringExpression("hora", this.getDetachedCriteria());
		lugar = new StringExpression("lugar", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria createArtistaCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("artista"));
	}
	
	public Actor_ComunDetachedCriteria createUsuarioCriteria() {
		return new Actor_ComunDetachedCriteria(createCriteria("ORM_usuario"));
	}
	
	public Evento uniqueEvento(PersistentSession session) {
		return (Evento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Evento[] listEvento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Evento[]) list.toArray(new Evento[list.size()]);
	}
}

