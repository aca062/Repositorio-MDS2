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
@Table(name="Album")
public class Album implements Serializable {
	public Album() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ALBUM_CANCIONES) {
			return ORM_canciones;
		}
		else if (key == ORMConstants.KEY_ALBUM_ESTADISTICAS) {
			return ORM_estadisticas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ALBUM_ARTISTA) {
			this.artista = (orm.bbdd.Artista) owner;
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
	
	@Column(name="IdAlbum", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORM_BBDD_ALBUM_IDALBUM_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_BBDD_ALBUM_IDALBUM_GENERATOR", strategy="native")	
	private int idAlbum;
	
	@ManyToOne(targetEntity=orm.bbdd.Artista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ArtistaActor_ComunId", referencedColumnName="Actor_ComunId", nullable=false) }, foreignKey=@ForeignKey(name="FKAlbum383064"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.bbdd.Artista artista;
	
	@Column(name="Imagen", nullable=true, length=255)	
	private String imagen;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="FechaEdicion", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaEdicion;
	
	@ManyToMany(targetEntity=orm.bbdd.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_Album", joinColumns={ @JoinColumn(name="AlbumIdAlbum") }, inverseJoinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_canciones = new java.util.HashSet();
	
	@ManyToMany(targetEntity=orm.bbdd.Estadistica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Estadistica_Album", joinColumns={ @JoinColumn(name="AlbumIdAlbum") }, inverseJoinColumns={ @JoinColumn(name="EstadisticaId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_estadisticas = new java.util.HashSet();
	
	private void setIdAlbum(int value) {
		this.idAlbum = value;
	}
	
	public int getIdAlbum() {
		return idAlbum;
	}
	
	public int getORMID() {
		return getIdAlbum();
	}
	
	public void setImagen(String value) {
		this.imagen = value;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setFechaEdicion(java.util.Date value) {
		this.fechaEdicion = value;
	}
	
	public java.util.Date getFechaEdicion() {
		return fechaEdicion;
	}
	
	private void setORM_Canciones(java.util.Set value) {
		this.ORM_canciones = value;
	}
	
	private java.util.Set getORM_Canciones() {
		return ORM_canciones;
	}
	
	@Transient	
	public final orm.bbdd.CancionSetCollection canciones = new orm.bbdd.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ALBUM_CANCIONES, ORMConstants.KEY_CANCION_ALBUM, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Estadisticas(java.util.Set value) {
		this.ORM_estadisticas = value;
	}
	
	private java.util.Set getORM_Estadisticas() {
		return ORM_estadisticas;
	}
	
	@Transient	
	public final orm.bbdd.EstadisticaSetCollection estadisticas = new orm.bbdd.EstadisticaSetCollection(this, _ormAdapter, ORMConstants.KEY_ALBUM_ESTADISTICAS, ORMConstants.KEY_ESTADISTICA_ALBUMS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setArtista(orm.bbdd.Artista value) {
		if (artista != null) {
			artista.albums.remove(this);
		}
		if (value != null) {
			value.albums.add(this);
		}
	}
	
	public orm.bbdd.Artista getArtista() {
		return artista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Artista(orm.bbdd.Artista value) {
		this.artista = value;
	}
	
	private orm.bbdd.Artista getORM_Artista() {
		return artista;
	}
	
	public String toString() {
		return String.valueOf(getIdAlbum());
	}
	
}
