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

public class Lista_de_reproduccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idLista;
	public final CollectionExpression seguidor;
	public final StringExpression nombre;
	public final CollectionExpression canciones;
	public final CollectionExpression estadisticas;
	public final StringExpression creadorId;
	public final AssociationExpression creador;
	
	public Lista_de_reproduccionCriteria(Criteria criteria) {
		super(criteria);
		idLista = new IntegerExpression("idLista", this);
		seguidor = new CollectionExpression("ORM_seguidor", this);
		nombre = new StringExpression("nombre", this);
		canciones = new CollectionExpression("ORM_canciones", this);
		estadisticas = new CollectionExpression("ORM_estadisticas", this);
		creadorId = new StringExpression("creador.email", this);
		creador = new AssociationExpression("creador", this);
	}
	
	public Lista_de_reproduccionCriteria(PersistentSession session) {
		this(session.createCriteria(Lista_de_reproduccion.class));
	}
	
	public Lista_de_reproduccionCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public Actor_ComunCriteria createSeguidorCriteria() {
		return new Actor_ComunCriteria(createCriteria("ORM_seguidor"));
	}
	
	public CancionCriteria createCancionesCriteria() {
		return new CancionCriteria(createCriteria("ORM_canciones"));
	}
	
	public EstadisticaCriteria createEstadisticasCriteria() {
		return new EstadisticaCriteria(createCriteria("ORM_estadisticas"));
	}
	
	public Actor_ComunCriteria createCreadorCriteria() {
		return new Actor_ComunCriteria(createCriteria("creador"));
	}
	
	public Lista_de_reproduccion uniqueLista_de_reproduccion() {
		return (Lista_de_reproduccion) super.uniqueResult();
	}
	
	public Lista_de_reproduccion[] listLista_de_reproduccion() {
		java.util.List list = super.list();
		return (Lista_de_reproduccion[]) list.toArray(new Lista_de_reproduccion[list.size()]);
	}
}

