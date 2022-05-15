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
@Table(name="`Lista de reproduccion`")
public class Lista_de_reproduccion implements Serializable {
	public Lista_de_reproduccion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_LISTA_DE_REPRODUCCION_CANCIONES) {
			return ORM_canciones;
		}
		else if (key == ORMConstants.KEY_LISTA_DE_REPRODUCCION_SEGUIDOR) {
			return ORM_seguidor;
		}
		else if (key == ORMConstants.KEY_LISTA_DE_REPRODUCCION_ESTADISTICAS) {
			return ORM_estadisticas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_LISTA_DE_REPRODUCCION_CREADOR) {
			this.creador = (Actor_Comun) owner;
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
	
	@Column(name="IdLista", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BBDD_LISTA_DE_REPRODUCCION_IDLISTA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BBDD_LISTA_DE_REPRODUCCION_IDLISTA_GENERATOR", strategy="native")	
	private int idLista;
	
	@ManyToMany(targetEntity=Actor_Comun.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Actor_Comun_Lista de reproduccion`", joinColumns={ @JoinColumn(name="`Lista de reproduccionIdLista`") }, inverseJoinColumns={ @JoinColumn(name="Actor_ComunEmail") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguidor = new java.util.HashSet();
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@ManyToMany(targetEntity=Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Cancion_Lista de reproduccion`", joinColumns={ @JoinColumn(name="`Lista de reproduccionIdLista`") }, inverseJoinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_canciones = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Estadistica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Estadistica_Lista de reproduccion`", joinColumns={ @JoinColumn(name="`Lista de reproduccionIdLista`") }, inverseJoinColumns={ @JoinColumn(name="EstadisticaId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_estadisticas = new java.util.HashSet();
	
	@ManyToOne(targetEntity=Actor_Comun.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Actor_ComunEmail", referencedColumnName="Email") }, foreignKey=@ForeignKey(name="FKLista de r82512"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Actor_Comun creador;
	
	private void setIdLista(int value) {
		this.idLista = value;
	}
	
	public int getIdLista() {
		return idLista;
	}
	
	public int getORMID() {
		return getIdLista();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Canciones(java.util.Set value) {
		this.ORM_canciones = value;
	}
	
	private java.util.Set getORM_Canciones() {
		return ORM_canciones;
	}
	
	@Transient	
	public final CancionSetCollection canciones = new CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_LISTA_DE_REPRODUCCION_CANCIONES, ORMConstants.KEY_CANCION_LISTAS_DE_REPRODUCCION, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Seguidor(java.util.Set value) {
		this.ORM_seguidor = value;
	}
	
	private java.util.Set getORM_Seguidor() {
		return ORM_seguidor;
	}
	
	@Transient	
	public final Actor_ComunSetCollection seguidor = new Actor_ComunSetCollection(this, _ormAdapter, ORMConstants.KEY_LISTA_DE_REPRODUCCION_SEGUIDOR, ORMConstants.KEY_ACTOR_COMUN_LISTAS_DE_REPRODUCCION_SEGUIDAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Estadisticas(java.util.Set value) {
		this.ORM_estadisticas = value;
	}
	
	private java.util.Set getORM_Estadisticas() {
		return ORM_estadisticas;
	}
	
	@Transient	
	public final EstadisticaSetCollection estadisticas = new EstadisticaSetCollection(this, _ormAdapter, ORMConstants.KEY_LISTA_DE_REPRODUCCION_ESTADISTICAS, ORMConstants.KEY_ESTADISTICA_LISTA_DE_REPRODUCCION, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setCreador(Actor_Comun value) {
		if (creador != null) {
			creador.listas_de_reproduccion_propias.remove(this);
		}
		if (value != null) {
			value.listas_de_reproduccion_propias.add(this);
		}
	}
	
	public Actor_Comun getCreador() {
		return creador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Creador(Actor_Comun value) {
		this.creador = value;
	}
	
	private Actor_Comun getORM_Creador() {
		return creador;
	}
	
	public String toString() {
		return String.valueOf(getIdLista());
	}
	
}
