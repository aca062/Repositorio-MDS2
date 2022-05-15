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

public class EstadisticaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final DoubleExpression tiempoAnual;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final CollectionExpression artistas;
	public final CollectionExpression cancions;
	public final CollectionExpression lista_de_reproduccion;
	public final CollectionExpression albums;
	
	public EstadisticaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		tiempoAnual = new DoubleExpression("tiempoAnual", this);
		usuarioId = new IntegerExpression("usuario.id", this);
		usuario = new AssociationExpression("usuario", this);
		artistas = new CollectionExpression("ORM_artistas", this);
		cancions = new CollectionExpression("ORM_cancions", this);
		lista_de_reproduccion = new CollectionExpression("ORM_lista_de_reproduccion", this);
		albums = new CollectionExpression("ORM_albums", this);
	}
	
	public EstadisticaCriteria(PersistentSession session) {
		this(session.createCriteria(Estadistica.class));
	}
	
	public EstadisticaCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public Actor_ComunCriteria createUsuarioCriteria() {
		return new Actor_ComunCriteria(createCriteria("usuario"));
	}
	
	public ArtistaCriteria createArtistasCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_artistas"));
	}
	
	public CancionCriteria createCancionsCriteria() {
		return new CancionCriteria(createCriteria("ORM_cancions"));
	}
	
	public Lista_de_reproduccionCriteria createLista_de_reproduccionCriteria() {
		return new Lista_de_reproduccionCriteria(createCriteria("ORM_lista_de_reproduccion"));
	}
	
	public AlbumCriteria createAlbumsCriteria() {
		return new AlbumCriteria(createCriteria("ORM_albums"));
	}
	
	public Estadistica uniqueEstadistica() {
		return (Estadistica) super.uniqueResult();
	}
	
	public Estadistica[] listEstadistica() {
		java.util.List list = super.list();
		return (Estadistica[]) list.toArray(new Estadistica[list.size()]);
	}
}

