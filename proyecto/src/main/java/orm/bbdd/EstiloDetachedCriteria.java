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

public class EstiloDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idEstilo;
	public final StringExpression nombre;
	public final CollectionExpression canciones;
	public final CollectionExpression artistas;
	
	public EstiloDetachedCriteria() {
		super(orm.bbdd.Estilo.class, orm.bbdd.EstiloCriteria.class);
		idEstilo = new IntegerExpression("idEstilo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		canciones = new CollectionExpression("ORM_canciones", this.getDetachedCriteria());
		artistas = new CollectionExpression("ORM_artistas", this.getDetachedCriteria());
	}
	
	public EstiloDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.bbdd.EstiloCriteria.class);
		idEstilo = new IntegerExpression("idEstilo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		canciones = new CollectionExpression("ORM_canciones", this.getDetachedCriteria());
		artistas = new CollectionExpression("ORM_artistas", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria createCancionesCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_canciones"));
	}
	
	public ArtistaDetachedCriteria createArtistasCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_artistas"));
	}
	
	public Estilo uniqueEstilo(PersistentSession session) {
		return (Estilo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estilo[] listEstilo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estilo[]) list.toArray(new Estilo[list.size()]);
	}
}

