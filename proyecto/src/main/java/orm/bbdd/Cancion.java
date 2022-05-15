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
@Table(name="Cancion")
public class Cancion implements Serializable {
	public Cancion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CANCION_USUARIO) {
			return ORM_usuario;
		}
		else if (key == ORMConstants.KEY_CANCION_ESTADISTICAS) {
			return ORM_estadisticas;
		}
		else if (key == ORMConstants.KEY_CANCION_LISTAS_DE_REPRODUCCION) {
			return ORM_listas_de_reproduccion;
		}
		else if (key == ORMConstants.KEY_CANCION_ALBUM) {
			return ORM_album;
		}
		else if (key == ORMConstants.KEY_CANCION_ARTISTAS) {
			return ORM_artistas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CANCION_ESTILO) {
			this.estilo = (Estilo) owner;
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
	
	@Column(name="IdCancion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BBDD_CANCION_IDCANCION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BBDD_CANCION_IDCANCION_GENERATOR", strategy="native")	
	private int idCancion;
	
	@ManyToOne(targetEntity=Estilo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EstiloIdEstilo", referencedColumnName="IdEstilo", nullable=false) }, foreignKey=@ForeignKey(name="FKCancion161308"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Estilo estilo;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="ArchivoMultimedia", nullable=true, length=255)	
	private String archivoMultimedia;
	
	@Column(name="NumReproducciones", nullable=false, length=10)	
	private int numReproducciones;
	
	@ElementCollection	
	@CollectionTable(name="Cancion_compositores", joinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.IndexColumn(name="CancionIndex")	
	@Column(name="Compositores", nullable=true, length=255)	
	private String[] compositores;
	
	@ElementCollection	
	@CollectionTable(name="Cancion_productores", joinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.IndexColumn(name="CancionIndex")	
	@Column(name="Productores", nullable=true, length=255)	
	private String[] productores;
	
	@ElementCollection	
	@CollectionTable(name="Cancion_interpretes", joinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.IndexColumn(name="CancionIndex")	
	@Column(name="Interpretes", nullable=true, length=255)	
	private String[] interpretes;
	
	@ManyToMany(targetEntity=Actor_Comun.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Actor_Comun_Cancion", joinColumns={ @JoinColumn(name="CancionIdCancion") }, inverseJoinColumns={ @JoinColumn(name="Actor_ComunEmail") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Estadistica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Estadistica_Cancion", joinColumns={ @JoinColumn(name="CancionIdCancion") }, inverseJoinColumns={ @JoinColumn(name="EstadisticaId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_estadisticas = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_canciones", targetEntity=Lista_de_reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_listas_de_reproduccion = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_canciones", targetEntity=Album.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_album = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_cancions", targetEntity=Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_artistas = new java.util.HashSet();
	
	private void setIdCancion(int value) {
		this.idCancion = value;
	}
	
	public int getIdCancion() {
		return idCancion;
	}
	
	public int getORMID() {
		return getIdCancion();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setCompositores(String[] value) {
		this.compositores = value;
	}
	
	public String[] getCompositores() {
		return compositores;
	}
	
	public void setProductores(String[] value) {
		this.productores = value;
	}
	
	public String[] getProductores() {
		return productores;
	}
	
	public void setArchivoMultimedia(String value) {
		this.archivoMultimedia = value;
	}
	
	public String getArchivoMultimedia() {
		return archivoMultimedia;
	}
	
	public void setNumReproducciones(int value) {
		this.numReproducciones = value;
	}
	
	public int getNumReproducciones() {
		return numReproducciones;
	}
	
	public void setInterpretes(String[] value) {
		this.interpretes = value;
	}
	
	public String[] getInterpretes() {
		return interpretes;
	}
	
	private void setORM_Usuario(java.util.Set value) {
		this.ORM_usuario = value;
	}
	
	private java.util.Set getORM_Usuario() {
		return ORM_usuario;
	}
	
	@Transient	
	public final Actor_ComunSetCollection usuario = new Actor_ComunSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_USUARIO, ORMConstants.KEY_ACTOR_COMUN_CANCION_FAVORITA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Estadisticas(java.util.Set value) {
		this.ORM_estadisticas = value;
	}
	
	private java.util.Set getORM_Estadisticas() {
		return ORM_estadisticas;
	}
	
	@Transient	
	public final EstadisticaSetCollection estadisticas = new EstadisticaSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_ESTADISTICAS, ORMConstants.KEY_ESTADISTICA_CANCIONS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Listas_de_reproduccion(java.util.Set value) {
		this.ORM_listas_de_reproduccion = value;
	}
	
	private java.util.Set getORM_Listas_de_reproduccion() {
		return ORM_listas_de_reproduccion;
	}
	
	@Transient	
	public final Lista_de_reproduccionSetCollection listas_de_reproduccion = new Lista_de_reproduccionSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_LISTAS_DE_REPRODUCCION, ORMConstants.KEY_LISTA_DE_REPRODUCCION_CANCIONES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Album(java.util.Set value) {
		this.ORM_album = value;
	}
	
	private java.util.Set getORM_Album() {
		return ORM_album;
	}
	
	@Transient	
	public final AlbumSetCollection album = new AlbumSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_ALBUM, ORMConstants.KEY_ALBUM_CANCIONES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEstilo(Estilo value) {
		if (estilo != null) {
			estilo.canciones.remove(this);
		}
		if (value != null) {
			value.canciones.add(this);
		}
	}
	
	public Estilo getEstilo() {
		return estilo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Estilo(Estilo value) {
		this.estilo = value;
	}
	
	private Estilo getORM_Estilo() {
		return estilo;
	}
	
	private void setORM_Artistas(java.util.Set value) {
		this.ORM_artistas = value;
	}
	
	private java.util.Set getORM_Artistas() {
		return ORM_artistas;
	}
	
	@Transient	
	public final ArtistaSetCollection artistas = new ArtistaSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_ARTISTAS, ORMConstants.KEY_ARTISTA_CANCIONS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdCancion());
	}
	
}
