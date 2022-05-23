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
@Table(name="Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="Actor_ComunId", referencedColumnName="Id")
public class Administrador extends Actor_Comun implements Serializable {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMINISTRADOR_CANCIONS) {
			return ORM_cancions;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="NumCanciones", nullable=false, length=10)	
	private int numCanciones;
	
	@OneToMany(mappedBy="administrador", targetEntity=Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cancions = new java.util.HashSet();
	
	public void setNumCanciones(int value) {
		this.numCanciones = value;
	}
	
	public int getNumCanciones() {
		return numCanciones;
	}
	
	private void setORM_Cancions(java.util.Set value) {
		this.ORM_cancions = value;
	}
	
	private java.util.Set getORM_Cancions() {
		return ORM_cancions;
	}
	
	@Transient	
	public final CancionSetCollection cancions = new CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_CANCIONS, ORMConstants.KEY_CANCION_ADMINISTRADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
