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

public class ArtistaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression acceso_DatoId;
	public final AssociationExpression acceso_Dato;
	public final IntegerExpression estadisticaId;
	public final AssociationExpression estadistica;
	public final StringExpression email;
	public final StringExpression contrasena;
	public final StringExpression nick;
	public final StringExpression foto;
	public final CollectionExpression listas_de_reproduccion_propias;
	public final CollectionExpression seguido;
	public final CollectionExpression cancion_favorita;
	public final CollectionExpression listas_de_reproduccion_seguidas;
	public final CollectionExpression notificaciones;
	public final CollectionExpression seguidor;
	public final CollectionExpression canciones_reproducidas;
	public final CollectionExpression cancions;
	public final CollectionExpression estadisticas;
	public final CollectionExpression eventos;
	public final CollectionExpression estilos;
	public final CollectionExpression albums;
	
	public ArtistaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		acceso_DatoId = new IntegerExpression("acceso_Dato.id", this);
		acceso_Dato = new AssociationExpression("acceso_Dato", this);
		estadisticaId = new IntegerExpression("estadistica.id", this);
		estadistica = new AssociationExpression("estadistica", this);
		email = new StringExpression("email", this);
		contrasena = new StringExpression("contrasena", this);
		nick = new StringExpression("nick", this);
		foto = new StringExpression("foto", this);
		listas_de_reproduccion_propias = new CollectionExpression("ORM_listas_de_reproduccion_propias", this);
		seguido = new CollectionExpression("ORM_seguido", this);
		cancion_favorita = new CollectionExpression("ORM_cancion_favorita", this);
		listas_de_reproduccion_seguidas = new CollectionExpression("ORM_listas_de_reproduccion_seguidas", this);
		notificaciones = new CollectionExpression("ORM_notificaciones", this);
		seguidor = new CollectionExpression("ORM_seguidor", this);
		canciones_reproducidas = new CollectionExpression("ORM_canciones_reproducidas", this);
		cancions = new CollectionExpression("ORM_cancions", this);
		estadisticas = new CollectionExpression("ORM_estadisticas", this);
		eventos = new CollectionExpression("ORM_eventos", this);
		estilos = new CollectionExpression("ORM_estilos", this);
		albums = new CollectionExpression("ORM_albums", this);
	}
	
	public ArtistaCriteria(PersistentSession session) {
		this(session.createCriteria(Artista.class));
	}
	
	public ArtistaCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public CancionCriteria createCancionsCriteria() {
		return new CancionCriteria(createCriteria("ORM_cancions"));
	}
	
	public EstadisticaCriteria createEstadisticasCriteria() {
		return new EstadisticaCriteria(createCriteria("ORM_estadisticas"));
	}
	
	public EventoCriteria createEventosCriteria() {
		return new EventoCriteria(createCriteria("ORM_eventos"));
	}
	
	public EstiloCriteria createEstilosCriteria() {
		return new EstiloCriteria(createCriteria("ORM_estilos"));
	}
	
	public AlbumCriteria createAlbumsCriteria() {
		return new AlbumCriteria(createCriteria("ORM_albums"));
	}
	
	public Acceso_DatoCriteria createAcceso_DatoCriteria() {
		return new Acceso_DatoCriteria(createCriteria("acceso_Dato"));
	}
	
	public EstadisticaCriteria createEstadisticaCriteria() {
		return new EstadisticaCriteria(createCriteria("estadistica"));
	}
	
	public Lista_de_reproduccionCriteria createListas_de_reproduccion_propiasCriteria() {
		return new Lista_de_reproduccionCriteria(createCriteria("ORM_listas_de_reproduccion_propias"));
	}
	
	public Actor_ComunCriteria createSeguidoCriteria() {
		return new Actor_ComunCriteria(createCriteria("ORM_seguido"));
	}
	
	public CancionCriteria createCancion_favoritaCriteria() {
		return new CancionCriteria(createCriteria("ORM_cancion_favorita"));
	}
	
	public Lista_de_reproduccionCriteria createListas_de_reproduccion_seguidasCriteria() {
		return new Lista_de_reproduccionCriteria(createCriteria("ORM_listas_de_reproduccion_seguidas"));
	}
	
	public EventoCriteria createNotificacionesCriteria() {
		return new EventoCriteria(createCriteria("ORM_notificaciones"));
	}
	
	public Actor_ComunCriteria createSeguidorCriteria() {
		return new Actor_ComunCriteria(createCriteria("ORM_seguidor"));
	}
	
	public CancionCriteria createCanciones_reproducidasCriteria() {
		return new CancionCriteria(createCriteria("ORM_canciones_reproducidas"));
	}
	
	public Artista uniqueArtista() {
		return (Artista) super.uniqueResult();
	}
	
	public Artista[] listArtista() {
		java.util.List list = super.list();
		return (Artista[]) list.toArray(new Artista[list.size()]);
	}
}

