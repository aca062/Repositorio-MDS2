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
@Table(name="Estilo")
public class Estilo implements Serializable {
	public Estilo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ESTILO_CANCIONES) {
			return ORM_canciones;
		}
		else if (key == ORMConstants.KEY_ESTILO_ARTISTAS) {
			return ORM_artistas;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdEstilo", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BBDD_ESTILO_IDESTILO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BBDD_ESTILO_IDESTILO_GENERATOR", strategy="native")	
	private int idEstilo;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@OneToMany(mappedBy="estilo", targetEntity=Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_canciones = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Artista_Estilo", joinColumns={ @JoinColumn(name="EstiloIdEstilo") }, inverseJoinColumns={ @JoinColumn(name="ArtistaActor_ComunEmail") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_artistas = new java.util.HashSet();
	
	private void setIdEstilo(int value) {
		this.idEstilo = value;
	}
	
	public int getIdEstilo() {
		return idEstilo;
	}
	
	public int getORMID() {
		return getIdEstilo();
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
	public final CancionSetCollection canciones = new CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTILO_CANCIONES, ORMConstants.KEY_CANCION_ESTILO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Artistas(java.util.Set value) {
		this.ORM_artistas = value;
	}
	
	private java.util.Set getORM_Artistas() {
		return ORM_artistas;
	}
	
	@Transient	
	public final ArtistaSetCollection artistas = new ArtistaSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTILO_ARTISTAS, ORMConstants.KEY_ARTISTA_ESTILOS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdEstilo());
	}
	
}
