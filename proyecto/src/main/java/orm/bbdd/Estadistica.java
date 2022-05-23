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
@Table(name="Estadistica")
public class Estadistica implements Serializable {
	public Estadistica() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ESTADISTICA_ARTISTAS) {
			return ORM_artistas;
		}
		else if (key == ORMConstants.KEY_ESTADISTICA_CANCIONS) {
			return ORM_cancions;
		}
		else if (key == ORMConstants.KEY_ESTADISTICA_LISTA_DE_REPRODUCCION) {
			return ORM_lista_de_reproduccion;
		}
		else if (key == ORMConstants.KEY_ESTADISTICA_ALBUMS) {
			return ORM_albums;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ESTADISTICA_USUARIO) {
			this.usuario = (Actor_Comun) owner;
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
	@GeneratedValue(generator="BBDD_ESTADISTICA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BBDD_ESTADISTICA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="TiempoAnual", nullable=false)	
	private double tiempoAnual;
	
	@ElementCollection	
	@CollectionTable(name="Estadistica_tiempoSemana", joinColumns={ @JoinColumn(name="EstadisticaId") })	
	@org.hibernate.annotations.IndexColumn(name="EstadisticaIndex")	
	@Column(name="TiempoSemana", nullable=false)	
	private double[] tiempoSemana;
	
	@OneToOne(mappedBy="estadistica", targetEntity=Actor_Comun.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Actor_Comun usuario;
	
	@ManyToMany(mappedBy="ORM_estadisticas", targetEntity=Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_artistas = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_estadisticas", targetEntity=Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cancions = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_estadisticas", targetEntity=Lista_de_reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_lista_de_reproduccion = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_estadisticas", targetEntity=Album.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_albums = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setTiempoAnual(double value) {
		this.tiempoAnual = value;
	}
	
	public double getTiempoAnual() {
		return tiempoAnual;
	}
	
	public void setTiempoSemana(double[] value) {
		this.tiempoSemana = value;
	}
	
	public double[] getTiempoSemana() {
		return tiempoSemana;
	}
	
	public void setUsuario(Actor_Comun value) {
		if (this.usuario != value) {
			Actor_Comun lusuario = this.usuario;
			this.usuario = value;
			if (value != null) {
				usuario.setEstadistica(this);
			}
			if (lusuario != null && lusuario.getEstadistica() == this) {
				lusuario.setEstadistica(null);
			}
		}
	}
	
	public Actor_Comun getUsuario() {
		return usuario;
	}
	
	private void setORM_Artistas(java.util.Set value) {
		this.ORM_artistas = value;
	}
	
	private java.util.Set getORM_Artistas() {
		return ORM_artistas;
	}
	
	@Transient	
	public final ArtistaSetCollection artistas = new ArtistaSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTADISTICA_ARTISTAS, ORMConstants.KEY_ARTISTA_ESTADISTICAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Cancions(java.util.Set value) {
		this.ORM_cancions = value;
	}
	
	private java.util.Set getORM_Cancions() {
		return ORM_cancions;
	}
	
	@Transient	
	public final CancionSetCollection cancions = new CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTADISTICA_CANCIONS, ORMConstants.KEY_CANCION_ESTADISTICAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Lista_de_reproduccion(java.util.Set value) {
		this.ORM_lista_de_reproduccion = value;
	}
	
	private java.util.Set getORM_Lista_de_reproduccion() {
		return ORM_lista_de_reproduccion;
	}
	
	@Transient	
	public final Lista_de_reproduccionSetCollection lista_de_reproduccion = new Lista_de_reproduccionSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTADISTICA_LISTA_DE_REPRODUCCION, ORMConstants.KEY_LISTA_DE_REPRODUCCION_ESTADISTICAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Albums(java.util.Set value) {
		this.ORM_albums = value;
	}
	
	private java.util.Set getORM_Albums() {
		return ORM_albums;
	}
	
	@Transient	
	public final AlbumSetCollection albums = new AlbumSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTADISTICA_ALBUMS, ORMConstants.KEY_ALBUM_ESTADISTICAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
