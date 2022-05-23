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

public class AlbumDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idAlbum;
	public final IntegerExpression artistaId;
	public final AssociationExpression artista;
	public final StringExpression imagen;
	public final StringExpression titulo;
	public final DateExpression fechaEdicion;
	public final CollectionExpression canciones;
	public final CollectionExpression estadisticas;
	
	public AlbumDetachedCriteria() {
		super(Album.class, AlbumCriteria.class);
		idAlbum = new IntegerExpression("idAlbum", this.getDetachedCriteria());
		artistaId = new IntegerExpression("artista.", this.getDetachedCriteria());
		artista = new AssociationExpression("artista", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		fechaEdicion = new DateExpression("fechaEdicion", this.getDetachedCriteria());
		canciones = new CollectionExpression("ORM_canciones", this.getDetachedCriteria());
		estadisticas = new CollectionExpression("ORM_estadisticas", this.getDetachedCriteria());
	}
	
	public AlbumDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, AlbumCriteria.class);
		idAlbum = new IntegerExpression("idAlbum", this.getDetachedCriteria());
		artistaId = new IntegerExpression("artista.", this.getDetachedCriteria());
		artista = new AssociationExpression("artista", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		fechaEdicion = new DateExpression("fechaEdicion", this.getDetachedCriteria());
		canciones = new CollectionExpression("ORM_canciones", this.getDetachedCriteria());
		estadisticas = new CollectionExpression("ORM_estadisticas", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria createArtistaCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("artista"));
	}
	
	public CancionDetachedCriteria createCancionesCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_canciones"));
	}
	
	public EstadisticaDetachedCriteria createEstadisticasCriteria() {
		return new EstadisticaDetachedCriteria(createCriteria("ORM_estadisticas"));
	}
	
	public Album uniqueAlbum(PersistentSession session) {
		return (Album) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Album[] listAlbum(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

