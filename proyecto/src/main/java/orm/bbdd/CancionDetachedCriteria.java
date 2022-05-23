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

public class CancionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idCancion;
	public final IntegerExpression administradorId;
	public final AssociationExpression administrador;
	public final IntegerExpression estiloId;
	public final AssociationExpression estilo;
	public final StringExpression titulo;
	public final StringExpression archivoMultimedia;
	public final IntegerExpression numReproducciones;
	public final CollectionExpression usuario;
	public final CollectionExpression estadisticas;
	public final CollectionExpression listas_de_reproduccion;
	public final CollectionExpression album;
	public final CollectionExpression artistas;
	
	public CancionDetachedCriteria() {
		super(Cancion.class, CancionCriteria.class);
		idCancion = new IntegerExpression("idCancion", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		estiloId = new IntegerExpression("estilo.idEstilo", this.getDetachedCriteria());
		estilo = new AssociationExpression("estilo", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		archivoMultimedia = new StringExpression("archivoMultimedia", this.getDetachedCriteria());
		numReproducciones = new IntegerExpression("numReproducciones", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
		estadisticas = new CollectionExpression("ORM_estadisticas", this.getDetachedCriteria());
		listas_de_reproduccion = new CollectionExpression("ORM_listas_de_reproduccion", this.getDetachedCriteria());
		album = new CollectionExpression("ORM_album", this.getDetachedCriteria());
		artistas = new CollectionExpression("ORM_artistas", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CancionCriteria.class);
		idCancion = new IntegerExpression("idCancion", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		estiloId = new IntegerExpression("estilo.idEstilo", this.getDetachedCriteria());
		estilo = new AssociationExpression("estilo", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		archivoMultimedia = new StringExpression("archivoMultimedia", this.getDetachedCriteria());
		numReproducciones = new IntegerExpression("numReproducciones", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
		estadisticas = new CollectionExpression("ORM_estadisticas", this.getDetachedCriteria());
		listas_de_reproduccion = new CollectionExpression("ORM_listas_de_reproduccion", this.getDetachedCriteria());
		album = new CollectionExpression("ORM_album", this.getDetachedCriteria());
		artistas = new CollectionExpression("ORM_artistas", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public EstiloDetachedCriteria createEstiloCriteria() {
		return new EstiloDetachedCriteria(createCriteria("estilo"));
	}
	
	public Actor_ComunDetachedCriteria createUsuarioCriteria() {
		return new Actor_ComunDetachedCriteria(createCriteria("ORM_usuario"));
	}
	
	public EstadisticaDetachedCriteria createEstadisticasCriteria() {
		return new EstadisticaDetachedCriteria(createCriteria("ORM_estadisticas"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createListas_de_reproduccionCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("ORM_listas_de_reproduccion"));
	}
	
	public AlbumDetachedCriteria createAlbumCriteria() {
		return new AlbumDetachedCriteria(createCriteria("ORM_album"));
	}
	
	public ArtistaDetachedCriteria createArtistasCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_artistas"));
	}
	
	public Cancion uniqueCancion(PersistentSession session) {
		return (Cancion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cancion[] listCancion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

