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

public class AlbumCriteria extends AbstractORMCriteria {
	public final IntegerExpression idAlbum;
	public final IntegerExpression artistaId;
	public final AssociationExpression artista;
	public final StringExpression imagen;
	public final StringExpression titulo;
	public final DateExpression fechaEdicion;
	public final CollectionExpression canciones;
	public final CollectionExpression estadisticas;
	
	public AlbumCriteria(Criteria criteria) {
		super(criteria);
		idAlbum = new IntegerExpression("idAlbum", this);
		artistaId = new IntegerExpression("artista.", this);
		artista = new AssociationExpression("artista", this);
		imagen = new StringExpression("imagen", this);
		titulo = new StringExpression("titulo", this);
		fechaEdicion = new DateExpression("fechaEdicion", this);
		canciones = new CollectionExpression("ORM_canciones", this);
		estadisticas = new CollectionExpression("ORM_estadisticas", this);
	}
	
	public AlbumCriteria(PersistentSession session) {
		this(session.createCriteria(Album.class));
	}
	
	public AlbumCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createArtistaCriteria() {
		return new ArtistaCriteria(createCriteria("artista"));
	}
	
	public CancionCriteria createCancionesCriteria() {
		return new CancionCriteria(createCriteria("ORM_canciones"));
	}
	
	public EstadisticaCriteria createEstadisticasCriteria() {
		return new EstadisticaCriteria(createCriteria("ORM_estadisticas"));
	}
	
	public Album uniqueAlbum() {
		return (Album) super.uniqueResult();
	}
	
	public Album[] listAlbum() {
		java.util.List list = super.list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

