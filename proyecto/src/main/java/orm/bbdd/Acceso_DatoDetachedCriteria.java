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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Acceso_DatoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression contrasena;
	public final StringExpression email;
	public final StringExpression tipoUsuario;
	public final IntegerExpression numIntentos;
	public final StringExpression fechaBloqueo;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	
	public Acceso_DatoDetachedCriteria() {
		super(Acceso_Dato.class, Acceso_DatoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		tipoUsuario = new StringExpression("tipoUsuario", this.getDetachedCriteria());
		numIntentos = new IntegerExpression("numIntentos", this.getDetachedCriteria());
		fechaBloqueo = new StringExpression("fechaBloqueo", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
	}
	
	public Acceso_DatoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Acceso_DatoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		tipoUsuario = new StringExpression("tipoUsuario", this.getDetachedCriteria());
		numIntentos = new IntegerExpression("numIntentos", this.getDetachedCriteria());
		fechaBloqueo = new StringExpression("fechaBloqueo", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
	}
	
	public Actor_ComunDetachedCriteria createUsuarioCriteria() {
		return new Actor_ComunDetachedCriteria(createCriteria("usuario"));
	}
	
	public Acceso_Dato uniqueAcceso_Dato(PersistentSession session) {
		return (Acceso_Dato) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Acceso_Dato[] listAcceso_Dato(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Acceso_Dato[]) list.toArray(new Acceso_Dato[list.size()]);
	}
}

