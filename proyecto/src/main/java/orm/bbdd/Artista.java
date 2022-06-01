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
@PrimaryKeyJoinColumn(name="Actor_ComunId", referencedColumnName="Id")
public class Artista extends orm.bbdd.Actor_Comun implements Serializable {
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
		else if (key == ORMConstants.KEY_ARTISTA_ALBUMS) {
			return ORM_albums;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@ManyToMany(targetEntity=orm.bbdd.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_Artista", joinColumns={ @JoinColumn(name="ArtistaActor_ComunId") }, inverseJoinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cancions = new java.util.HashSet();
	
	@ManyToMany(targetEntity=orm.bbdd.Estadistica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Estadistica_Artista", joinColumns={ @JoinColumn(name="ArtistaActor_ComunId") }, inverseJoinColumns={ @JoinColumn(name="EstadisticaId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_estadisticas = new java.util.HashSet();
	
	@OneToMany(mappedBy="artista", targetEntity=orm.bbdd.Evento.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_eventos = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_artistas", targetEntity=orm.bbdd.Estilo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_estilos = new java.util.HashSet();
	
	@OneToMany(mappedBy="artista", targetEntity=orm.bbdd.Album.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_albums = new java.util.HashSet();
	
	private void setORM_Cancions(java.util.Set value) {
		this.ORM_cancions = value;
	}
	
	private java.util.Set getORM_Cancions() {
		return ORM_cancions;
	}
	
	@Transient	
	public final orm.bbdd.CancionSetCollection cancions = new orm.bbdd.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_CANCIONS, ORMConstants.KEY_CANCION_ARTISTAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Estadisticas(java.util.Set value) {
		this.ORM_estadisticas = value;
	}
	
	private java.util.Set getORM_Estadisticas() {
		return ORM_estadisticas;
	}
	
	@Transient	
	public final orm.bbdd.EstadisticaSetCollection estadisticas = new orm.bbdd.EstadisticaSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_ESTADISTICAS, ORMConstants.KEY_ESTADISTICA_ARTISTAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Eventos(java.util.Set value) {
		this.ORM_eventos = value;
	}
	
	private java.util.Set getORM_Eventos() {
		return ORM_eventos;
	}
	
	@Transient	
	public final orm.bbdd.EventoSetCollection eventos = new orm.bbdd.EventoSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_EVENTOS, ORMConstants.KEY_EVENTO_ARTISTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Estilos(java.util.Set value) {
		this.ORM_estilos = value;
	}
	
	private java.util.Set getORM_Estilos() {
		return ORM_estilos;
	}
	
	@Transient	
	public final orm.bbdd.EstiloSetCollection estilos = new orm.bbdd.EstiloSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_ESTILOS, ORMConstants.KEY_ESTILO_ARTISTAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Albums(java.util.Set value) {
		this.ORM_albums = value;
	}
	
	private java.util.Set getORM_Albums() {
		return ORM_albums;
	}
	
	@Transient	
	public final orm.bbdd.AlbumSetCollection albums = new orm.bbdd.AlbumSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_ALBUMS, ORMConstants.KEY_ALBUM_ARTISTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
