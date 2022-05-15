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

public class EstiloCriteria extends AbstractORMCriteria {
	public final IntegerExpression idEstilo;
	public final StringExpression nombre;
	public final CollectionExpression canciones;
	public final CollectionExpression artistas;
	
	public EstiloCriteria(Criteria criteria) {
		super(criteria);
		idEstilo = new IntegerExpression("idEstilo", this);
		nombre = new StringExpression("nombre", this);
		canciones = new CollectionExpression("ORM_canciones", this);
		artistas = new CollectionExpression("ORM_artistas", this);
	}
	
	public EstiloCriteria(PersistentSession session) {
		this(session.createCriteria(Estilo.class));
	}
	
	public EstiloCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public CancionCriteria createCancionesCriteria() {
		return new CancionCriteria(createCriteria("ORM_canciones"));
	}
	
	public ArtistaCriteria createArtistasCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_artistas"));
	}
	
	public Estilo uniqueEstilo() {
		return (Estilo) super.uniqueResult();
	}
	
	public Estilo[] listEstilo() {
		java.util.List list = super.list();
		return (Estilo[]) list.toArray(new Estilo[list.size()]);
	}
}

