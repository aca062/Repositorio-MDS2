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
@Table(name="Artista")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="Actor_ComunEmail", referencedColumnName="Email")
public class Artista extends Actor_Comun implements Serializable {
	public Artista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ARTISTA_CANCIONS) {
			return ORM_cancions;
		}
		else if (key == ORMConstants.KEY_ARTISTA_ESTADISTICAS) {
			return ORM_estadisticas;
		}
		else if (key == ORMConstants.KEY_ARTISTA_EVENTOS) {
			return ORM_eventos;
		}
		else if (key == ORMConstants.KEY_ARTISTA_ESTILOS) {
			return ORM_estilos;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@ManyToMany(targetEntity=Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_Artista", joinColumns={ @JoinColumn(name="ArtistaActor_ComunEmail") }, inverseJoinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cancions = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Estadistica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Estadistica_Artista", joinColumns={ @JoinColumn(name="ArtistaActor_ComunEmail") }, inverseJoinColumns={ @JoinColumn(name="EstadisticaId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_estadisticas = new java.util.HashSet();
	
	@OneToMany(mappedBy="artista", targetEntity=Evento.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_eventos = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_artistas", targetEntity=Estilo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_estilos = new java.util.HashSet();
	
	private void setORM_Cancions(java.util.Set value) {
		this.ORM_cancions = value;
	}
	
	private java.util.Set getORM_Cancions() {
		return ORM_cancions;
	}
	
	@Transient	
	public final CancionSetCollection cancions = new CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_CANCIONS, ORMConstants.KEY_CANCION_ARTISTAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Estadisticas(java.util.Set value) {
		this.ORM_estadisticas = value;
	}
	
	private java.util.Set getORM_Estadisticas() {
		return ORM_estadisticas;
	}
	
	@Transient	
	public final EstadisticaSetCollection estadisticas = new EstadisticaSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_ESTADISTICAS, ORMConstants.KEY_ESTADISTICA_ARTISTAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Eventos(java.util.Set value) {
		this.ORM_eventos = value;
	}
	
	private java.util.Set getORM_Eventos() {
		return ORM_eventos;
	}
	
	@Transient	
	public final EventoSetCollection eventos = new EventoSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_EVENTOS, ORMConstants.KEY_EVENTO_ARTISTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Estilos(java.util.Set value) {
		this.ORM_estilos = value;
	}
	
	private java.util.Set getORM_Estilos() {
		return ORM_estilos;
	}
	
	@Transient	
	public final EstiloSetCollection estilos = new EstiloSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_ESTILOS, ORMConstants.KEY_ESTILO_ARTISTAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
