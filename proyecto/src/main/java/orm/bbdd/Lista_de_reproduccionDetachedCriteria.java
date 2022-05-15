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

public class Lista_de_reproduccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idLista;
	public final CollectionExpression seguidor;
	public final StringExpression nombre;
	public final CollectionExpression canciones;
	public final CollectionExpression estadisticas;
	public final StringExpression creadorId;
	public final AssociationExpression creador;
	
	public Lista_de_reproduccionDetachedCriteria() {
		super(Lista_de_reproduccion.class, Lista_de_reproduccionCriteria.class);
		idLista = new IntegerExpression("idLista", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		canciones = new CollectionExpression("ORM_canciones", this.getDetachedCriteria());
		estadisticas = new CollectionExpression("ORM_estadisticas", this.getDetachedCriteria());
		creadorId = new StringExpression("creador.email", this.getDetachedCriteria());
		creador = new AssociationExpression("creador", this.getDetachedCriteria());
	}
	
	public Lista_de_reproduccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Lista_de_reproduccionCriteria.class);
		idLista = new IntegerExpression("idLista", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		canciones = new CollectionExpression("ORM_canciones", this.getDetachedCriteria());
		estadisticas = new CollectionExpression("ORM_estadisticas", this.getDetachedCriteria());
		creadorId = new StringExpression("creador.email", this.getDetachedCriteria());
		creador = new AssociationExpression("creador", this.getDetachedCriteria());
	}
	
	public Actor_ComunDetachedCriteria createSeguidorCriteria() {
		return new Actor_ComunDetachedCriteria(createCriteria("ORM_seguidor"));
	}
	
	public CancionDetachedCriteria createCancionesCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_canciones"));
	}
	
	public EstadisticaDetachedCriteria createEstadisticasCriteria() {
		return new EstadisticaDetachedCriteria(createCriteria("ORM_estadisticas"));
	}
	
	public Actor_ComunDetachedCriteria createCreadorCriteria() {
		return new Actor_ComunDetachedCriteria(createCriteria("creador"));
	}
	
	public Lista_de_reproduccion uniqueLista_de_reproduccion(PersistentSession session) {
		return (Lista_de_reproduccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Lista_de_reproduccion[] listLista_de_reproduccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Lista_de_reproduccion[]) list.toArray(new Lista_de_reproduccion[list.size()]);
	}
}

