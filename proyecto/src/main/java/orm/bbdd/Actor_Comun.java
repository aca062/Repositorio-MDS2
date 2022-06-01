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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Actor_Comun")
@Inheritance(strategy=InheritanceType.JOINED)
public class Actor_Comun implements Serializable {
	public Actor_Comun() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ACTOR_COMUN_LISTAS_DE_REPRODUCCION_PROPIAS) {
			return ORM_listas_de_reproduccion_propias;
		}
		else if (key == ORMConstants.KEY_ACTOR_COMUN_SEGUIDO) {
			return ORM_seguido;
		}
		else if (key == ORMConstants.KEY_ACTOR_COMUN_CANCION_FAVORITA) {
			return ORM_cancion_favorita;
		}
		else if (key == ORMConstants.KEY_ACTOR_COMUN_LISTAS_DE_REPRODUCCION_SEGUIDAS) {
			return ORM_listas_de_reproduccion_seguidas;
		}
		else if (key == ORMConstants.KEY_ACTOR_COMUN_NOTIFICACIONES) {
			return ORM_notificaciones;
		}
		else if (key == ORMConstants.KEY_ACTOR_COMUN_SEGUIDOR) {
			return ORM_seguidor;
		}
		else if (key == ORMConstants.KEY_ACTOR_COMUN_CANCIONES_REPRODUCIDAS) {
			return ORM_canciones_reproducidas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ACTOR_COMUN_ESTADISTICA) {
			this.estadistica = (orm.bbdd.Estadistica) owner;
		}
		
		else if (key == ORMConstants.KEY_ACTOR_COMUN_ACCESO_DATO) {
			this.acceso_Dato = (orm.bbdd.Acceso_Dato) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORM_BBDD_ACTOR_COMUN_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_BBDD_ACTOR_COMUN_ID_GENERATOR", strategy="native")	
	private int id;
	
	@OneToOne(optional=false, targetEntity=orm.bbdd.Acceso_Dato.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Acceso_DatoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKActor_Comu602152"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.bbdd.Acceso_Dato acceso_Dato;
	
	@OneToOne(optional=false, targetEntity=orm.bbdd.Estadistica.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EstadisticaId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKActor_Comu455406"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.bbdd.Estadistica estadistica;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Contrasena", nullable=true, length=255)	
	private String contrasena;
	
	@Column(name="Nick", nullable=true, length=255)	
	private String nick;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@OneToMany(mappedBy="creador", targetEntity=orm.bbdd.Lista_de_reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_listas_de_reproduccion_propias = new java.util.HashSet();
	
	@ManyToMany(targetEntity=orm.bbdd.Actor_Comun.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Actor_Comun_Actor_Comun", joinColumns={ @JoinColumn(name="Actor_ComunId2") }, inverseJoinColumns={ @JoinColumn(name="Actor_ComunId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguido = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_usuario", targetEntity=orm.bbdd.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cancion_favorita = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_seguidor", targetEntity=orm.bbdd.Lista_de_reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_listas_de_reproduccion_seguidas = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_usuario", targetEntity=orm.bbdd.Evento.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_notificaciones = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_seguido", targetEntity=orm.bbdd.Actor_Comun.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguidor = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM__usuario", targetEntity=orm.bbdd.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_canciones_reproducidas = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setNick(String value) {
		this.nick = value;
	}
	
	public String getNick() {
		return nick;
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	private void setORM_Listas_de_reproduccion_propias(java.util.Set value) {
		this.ORM_listas_de_reproduccion_propias = value;
	}
	
	private java.util.Set getORM_Listas_de_reproduccion_propias() {
		return ORM_listas_de_reproduccion_propias;
	}
	
	@Transient	
	public final orm.bbdd.Lista_de_reproduccionSetCollection listas_de_reproduccion_propias = new orm.bbdd.Lista_de_reproduccionSetCollection(this, _ormAdapter, ORMConstants.KEY_ACTOR_COMUN_LISTAS_DE_REPRODUCCION_PROPIAS, ORMConstants.KEY_LISTA_DE_REPRODUCCION_CREADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setEstadistica(orm.bbdd.Estadistica value) {
		if (this.estadistica != value) {
			orm.bbdd.Estadistica lestadistica = this.estadistica;
			this.estadistica = value;
			if (value != null) {
				estadistica.setUsuario(this);
			}
			if (lestadistica != null && lestadistica.getUsuario() == this) {
				lestadistica.setUsuario(null);
			}
		}
	}
	
	public orm.bbdd.Estadistica getEstadistica() {
		return estadistica;
	}
	
	public void setAcceso_Dato(orm.bbdd.Acceso_Dato value) {
		if (this.acceso_Dato != value) {
			orm.bbdd.Acceso_Dato lacceso_Dato = this.acceso_Dato;
			this.acceso_Dato = value;
			if (value != null) {
				acceso_Dato.setUsuario(this);
			}
			if (lacceso_Dato != null && lacceso_Dato.getUsuario() == this) {
				lacceso_Dato.setUsuario(null);
			}
		}
	}
	
	public orm.bbdd.Acceso_Dato getAcceso_Dato() {
		return acceso_Dato;
	}
	
	private void setORM_Seguido(java.util.Set value) {
		this.ORM_seguido = value;
	}
	
	private java.util.Set getORM_Seguido() {
		return ORM_seguido;
	}
	
	@Transient	
	public final orm.bbdd.Actor_ComunSetCollection seguido = new orm.bbdd.Actor_ComunSetCollection(this, _ormAdapter, ORMConstants.KEY_ACTOR_COMUN_SEGUIDO, ORMConstants.KEY_ACTOR_COMUN_SEGUIDOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Cancion_favorita(java.util.Set value) {
		this.ORM_cancion_favorita = value;
	}
	
	private java.util.Set getORM_Cancion_favorita() {
		return ORM_cancion_favorita;
	}
	
	@Transient	
	public final orm.bbdd.CancionSetCollection cancion_favorita = new orm.bbdd.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ACTOR_COMUN_CANCION_FAVORITA, ORMConstants.KEY_CANCION_USUARIO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Listas_de_reproduccion_seguidas(java.util.Set value) {
		this.ORM_listas_de_reproduccion_seguidas = value;
	}
	
	private java.util.Set getORM_Listas_de_reproduccion_seguidas() {
		return ORM_listas_de_reproduccion_seguidas;
	}
	
	@Transient	
	public final orm.bbdd.Lista_de_reproduccionSetCollection listas_de_reproduccion_seguidas = new orm.bbdd.Lista_de_reproduccionSetCollection(this, _ormAdapter, ORMConstants.KEY_ACTOR_COMUN_LISTAS_DE_REPRODUCCION_SEGUIDAS, ORMConstants.KEY_LISTA_DE_REPRODUCCION_SEGUIDOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Notificaciones(java.util.Set value) {
		this.ORM_notificaciones = value;
	}
	
	private java.util.Set getORM_Notificaciones() {
		return ORM_notificaciones;
	}
	
	@Transient	
	public final orm.bbdd.EventoSetCollection notificaciones = new orm.bbdd.EventoSetCollection(this, _ormAdapter, ORMConstants.KEY_ACTOR_COMUN_NOTIFICACIONES, ORMConstants.KEY_EVENTO_USUARIO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Seguidor(java.util.Set value) {
		this.ORM_seguidor = value;
	}
	
	private java.util.Set getORM_Seguidor() {
		return ORM_seguidor;
	}
	
	@Transient	
	public final orm.bbdd.Actor_ComunSetCollection seguidor = new orm.bbdd.Actor_ComunSetCollection(this, _ormAdapter, ORMConstants.KEY_ACTOR_COMUN_SEGUIDOR, ORMConstants.KEY_ACTOR_COMUN_SEGUIDO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Canciones_reproducidas(java.util.Set value) {
		this.ORM_canciones_reproducidas = value;
	}
	
	private java.util.Set getORM_Canciones_reproducidas() {
		return ORM_canciones_reproducidas;
	}
	
	@Transient	
	public final orm.bbdd.CancionSetCollection canciones_reproducidas = new orm.bbdd.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ACTOR_COMUN_CANCIONES_REPRODUCIDAS, ORMConstants.KEY_CANCION__USUARIO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
