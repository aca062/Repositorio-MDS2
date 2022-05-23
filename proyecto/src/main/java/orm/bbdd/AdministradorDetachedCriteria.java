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

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final IntegerExpression numCanciones;
	public final CollectionExpression cancions;
	
	public AdministradorDetachedCriteria() {
		super(Administrador.class, AdministradorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		acceso_DatoId = new IntegerExpression("acceso_Dato.id", this.getDetachedCriteria());
		acceso_Dato = new AssociationExpression("acceso_Dato", this.getDetachedCriteria());
		estadisticaId = new IntegerExpression("estadistica.id", this.getDetachedCriteria());
		estadistica = new AssociationExpression("estadistica", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		listas_de_reproduccion_propias = new CollectionExpression("ORM_listas_de_reproduccion_propias", this.getDetachedCriteria());
		seguido = new CollectionExpression("ORM_seguido", this.getDetachedCriteria());
		cancion_favorita = new CollectionExpression("ORM_cancion_favorita", this.getDetachedCriteria());
		listas_de_reproduccion_seguidas = new CollectionExpression("ORM_listas_de_reproduccion_seguidas", this.getDetachedCriteria());
		notificaciones = new CollectionExpression("ORM_notificaciones", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		numCanciones = new IntegerExpression("numCanciones", this.getDetachedCriteria());
		cancions = new CollectionExpression("ORM_cancions", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, AdministradorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		acceso_DatoId = new IntegerExpression("acceso_Dato.id", this.getDetachedCriteria());
		acceso_Dato = new AssociationExpression("acceso_Dato", this.getDetachedCriteria());
		estadisticaId = new IntegerExpression("estadistica.id", this.getDetachedCriteria());
		estadistica = new AssociationExpression("estadistica", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		listas_de_reproduccion_propias = new CollectionExpression("ORM_listas_de_reproduccion_propias", this.getDetachedCriteria());
		seguido = new CollectionExpression("ORM_seguido", this.getDetachedCriteria());
		cancion_favorita = new CollectionExpression("ORM_cancion_favorita", this.getDetachedCriteria());
		listas_de_reproduccion_seguidas = new CollectionExpression("ORM_listas_de_reproduccion_seguidas", this.getDetachedCriteria());
		notificaciones = new CollectionExpression("ORM_notificaciones", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		numCanciones = new IntegerExpression("numCanciones", this.getDetachedCriteria());
		cancions = new CollectionExpression("ORM_cancions", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria createCancionsCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_cancions"));
	}
	
	public Acceso_DatoDetachedCriteria createAcceso_DatoCriteria() {
		return new Acceso_DatoDetachedCriteria(createCriteria("acceso_Dato"));
	}
	
	public EstadisticaDetachedCriteria createEstadisticaCriteria() {
		return new EstadisticaDetachedCriteria(createCriteria("estadistica"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createListas_de_reproduccion_propiasCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("ORM_listas_de_reproduccion_propias"));
	}
	
	public Actor_ComunDetachedCriteria createSeguidoCriteria() {
		return new Actor_ComunDetachedCriteria(createCriteria("ORM_seguido"));
	}
	
	public CancionDetachedCriteria createCancion_favoritaCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_cancion_favorita"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createListas_de_reproduccion_seguidasCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("ORM_listas_de_reproduccion_seguidas"));
	}
	
	public EventoDetachedCriteria createNotificacionesCriteria() {
		return new EventoDetachedCriteria(createCriteria("ORM_notificaciones"));
	}
	
	public Actor_ComunDetachedCriteria createSeguidorCriteria() {
		return new Actor_ComunDetachedCriteria(createCriteria("ORM_seguidor"));
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

