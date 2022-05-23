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
@Table(name="Acceso_Dato")
public class Acceso_Dato implements Serializable {
	public Acceso_Dato() {
	}
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BBDD_ACCESO_DATO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BBDD_ACCESO_DATO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Contrasena", nullable=true, length=255)	
	private String contrasena;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="TipoUsuario", nullable=true, length=255)	
	private String tipoUsuario;
	
	@Column(name="NumIntentos", nullable=false, length=10)	
	private int numIntentos;
	
	@Column(name="FechaBloqueo", nullable=true, length=255)	
	private String fechaBloqueo;
	
	@OneToOne(mappedBy="acceso_Dato", targetEntity=Actor_Comun.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Actor_Comun usuario;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setTipoUsuario(String value) {
		this.tipoUsuario = value;
	}
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	
	public void setNumIntentos(int value) {
		this.numIntentos = value;
	}
	
	public int getNumIntentos() {
		return numIntentos;
	}
	
	public void setFechaBloqueo(String value) {
		this.fechaBloqueo = value;
	}
	
	public String getFechaBloqueo() {
		return fechaBloqueo;
	}
	
	public void setUsuario(Actor_Comun value) {
		if (this.usuario != value) {
			Actor_Comun lusuario = this.usuario;
			this.usuario = value;
			if (value != null) {
				usuario.setAcceso_Dato(this);
			}
			if (lusuario != null && lusuario.getAcceso_Dato() == this) {
				lusuario.setAcceso_Dato(null);
			}
		}
	}
	
	public Actor_Comun getUsuario() {
		return usuario;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
