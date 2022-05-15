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
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdAlbum", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BBDD_ALBUM_IDALBUM_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BBDD_ALBUM_IDALBUM_GENERATOR", strategy="native")	
	private int idAlbum;
	
	@Column(name="Imagen", nullable=true, length=255)	
	private String imagen;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="FechaEdicion", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaEdicion;
	
	@ManyToMany(targetEntity=Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_Album", joinColumns={ @JoinColumn(name="AlbumIdAlbum") }, inverseJoinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_canciones = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Estadistica.class)	
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
	public final CancionSetCollection canciones = new CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ALBUM_CANCIONES, ORMConstants.KEY_CANCION_ALBUM, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Estadisticas(java.util.Set value) {
		this.ORM_estadisticas = value;
	}
	
	private java.util.Set getORM_Estadisticas() {
		return ORM_estadisticas;
	}
	
	@Transient	
	public final EstadisticaSetCollection estadisticas = new EstadisticaSetCollection(this, _ormAdapter, ORMConstants.KEY_ALBUM_ESTADISTICAS, ORMConstants.KEY_ESTADISTICA_ALBUMS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdAlbum());
	}
	
}
