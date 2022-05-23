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
@Table(name="Evento")
public class Evento implements Serializable {
	public Evento() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EVENTO_USUARIO) {
			return ORM_usuario;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EVENTO_ARTISTA) {
			this.artista = (Artista) owner;
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
	
	@Column(name="IdEvento", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BBDD_EVENTO_IDEVENTO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BBDD_EVENTO_IDEVENTO_GENERATOR", strategy="native")	
	private int idEvento;
	
	@ManyToOne(targetEntity=Artista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ArtistaActor_ComunId", referencedColumnName="Actor_ComunId", nullable=false) }, foreignKey=@ForeignKey(name="FKEvento779957"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Artista artista;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@Column(name="Fecha", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha;
	
	@Column(name="Hora", nullable=true, length=255)	
	private String hora;
	
	@Column(name="Lugar", nullable=true, length=255)	
	private String lugar;
	
	@ManyToMany(targetEntity=Actor_Comun.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Actor_Comun_Evento", joinColumns={ @JoinColumn(name="EventoIdEvento") }, inverseJoinColumns={ @JoinColumn(name="Actor_ComunId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario = new java.util.HashSet();
	
	private void setIdEvento(int value) {
		this.idEvento = value;
	}
	
	public int getIdEvento() {
		return idEvento;
	}
	
	public int getORMID() {
		return getIdEvento();
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setHora(String value) {
		this.hora = value;
	}
	
	public String getHora() {
		return hora;
	}
	
	public void setLugar(String value) {
		this.lugar = value;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public void setArtista(Artista value) {
		if (artista != null) {
			artista.eventos.remove(this);
		}
		if (value != null) {
			value.eventos.add(this);
		}
	}
	
	public Artista getArtista() {
		return artista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Artista(Artista value) {
		this.artista = value;
	}
	
	private Artista getORM_Artista() {
		return artista;
	}
	
	private void setORM_Usuario(java.util.Set value) {
		this.ORM_usuario = value;
	}
	
	private java.util.Set getORM_Usuario() {
		return ORM_usuario;
	}
	
	@Transient	
	public final Actor_ComunSetCollection usuario = new Actor_ComunSetCollection(this, _ormAdapter, ORMConstants.KEY_EVENTO_USUARIO, ORMConstants.KEY_ACTOR_COMUN_NOTIFICACIONES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdEvento());
	}
	
}
