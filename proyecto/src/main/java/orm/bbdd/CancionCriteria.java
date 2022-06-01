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

public class CancionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idCancion;
	public final IntegerExpression administradorId;
	public final AssociationExpression administrador;
	public final IntegerExpression estiloId;
	public final AssociationExpression estilo;
	public final StringExpression titulo;
	public final StringExpression archivoMultimedia;
	public final IntegerExpression numReproducciones;
	public final StringExpression rutaImagen;
	public final CollectionExpression usuario;
	public final CollectionExpression estadisticas;
	public final CollectionExpression _usuario;
	public final CollectionExpression listas_de_reproduccion;
	public final CollectionExpression album;
	public final CollectionExpression artistas;
	
	public CancionCriteria(Criteria criteria) {
		super(criteria);
		idCancion = new IntegerExpression("idCancion", this);
		administradorId = new IntegerExpression("administrador.", this);
		administrador = new AssociationExpression("administrador", this);
		estiloId = new IntegerExpression("estilo.idEstilo", this);
		estilo = new AssociationExpression("estilo", this);
		titulo = new StringExpression("titulo", this);
		archivoMultimedia = new StringExpression("archivoMultimedia", this);
		numReproducciones = new IntegerExpression("numReproducciones", this);
		rutaImagen = new StringExpression("rutaImagen", this);
		usuario = new CollectionExpression("ORM_usuario", this);
		estadisticas = new CollectionExpression("ORM_estadisticas", this);
		_usuario = new CollectionExpression("ORM__usuario", this);
		listas_de_reproduccion = new CollectionExpression("ORM_listas_de_reproduccion", this);
		album = new CollectionExpression("ORM_album", this);
		artistas = new CollectionExpression("ORM_artistas", this);
	}
	
	public CancionCriteria(PersistentSession session) {
		this(session.createCriteria(Cancion.class));
	}
	
	public CancionCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public EstiloCriteria createEstiloCriteria() {
		return new EstiloCriteria(createCriteria("estilo"));
	}
	
	public Actor_ComunCriteria createUsuarioCriteria() {
		return new Actor_ComunCriteria(createCriteria("ORM_usuario"));
	}
	
	public EstadisticaCriteria createEstadisticasCriteria() {
		return new EstadisticaCriteria(createCriteria("ORM_estadisticas"));
	}
	
	public Actor_ComunCriteria create_usuarioCriteria() {
		return new Actor_ComunCriteria(createCriteria("ORM__usuario"));
	}
	
	public Lista_de_reproduccionCriteria createListas_de_reproduccionCriteria() {
		return new Lista_de_reproduccionCriteria(createCriteria("ORM_listas_de_reproduccion"));
	}
	
	public AlbumCriteria createAlbumCriteria() {
		return new AlbumCriteria(createCriteria("ORM_album"));
	}
	
	public ArtistaCriteria createArtistasCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_artistas"));
	}
	
	public Cancion uniqueCancion() {
		return (Cancion) super.uniqueResult();
	}
	
	public Cancion[] listCancion() {
		java.util.List list = super.list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

