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

public class EstadisticaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final DoubleExpression tiempoAnual;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final CollectionExpression artistas;
	public final CollectionExpression cancions;
	public final CollectionExpression lista_de_reproduccion;
	public final CollectionExpression albums;
	
	public EstadisticaDetachedCriteria() {
		super(Estadistica.class, EstadisticaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		tiempoAnual = new DoubleExpression("tiempoAnual", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		artistas = new CollectionExpression("ORM_artistas", this.getDetachedCriteria());
		cancions = new CollectionExpression("ORM_cancions", this.getDetachedCriteria());
		lista_de_reproduccion = new CollectionExpression("ORM_lista_de_reproduccion", this.getDetachedCriteria());
		albums = new CollectionExpression("ORM_albums", this.getDetachedCriteria());
	}
	
	public EstadisticaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, EstadisticaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		tiempoAnual = new DoubleExpression("tiempoAnual", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		artistas = new CollectionExpression("ORM_artistas", this.getDetachedCriteria());
		cancions = new CollectionExpression("ORM_cancions", this.getDetachedCriteria());
		lista_de_reproduccion = new CollectionExpression("ORM_lista_de_reproduccion", this.getDetachedCriteria());
		albums = new CollectionExpression("ORM_albums", this.getDetachedCriteria());
	}
	
	public Actor_ComunDetachedCriteria createUsuarioCriteria() {
		return new Actor_ComunDetachedCriteria(createCriteria("usuario"));
	}
	
	public ArtistaDetachedCriteria createArtistasCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_artistas"));
	}
	
	public CancionDetachedCriteria createCancionsCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_cancions"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createLista_de_reproduccionCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("ORM_lista_de_reproduccion"));
	}
	
	public AlbumDetachedCriteria createAlbumsCriteria() {
		return new AlbumDetachedCriteria(createCriteria("ORM_albums"));
	}
	
	public Estadistica uniqueEstadistica(PersistentSession session) {
		return (Estadistica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estadistica[] listEstadistica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estadistica[]) list.toArray(new Estadistica[list.size()]);
	}
}

