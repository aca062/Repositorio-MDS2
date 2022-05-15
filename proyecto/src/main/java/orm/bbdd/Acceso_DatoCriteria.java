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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Acceso_DatoCriteria extends AbstractORMCriteria {
	public final StringExpression email;
	public final IntegerExpression id;
	public final StringExpression contrasena;
	public final StringExpression tipoUsuario;
	public final IntegerExpression numIntentos;
	public final StringExpression fechaBloqueo;
	public final StringExpression usuarioId;
	public final AssociationExpression usuario;
	
	public Acceso_DatoCriteria(Criteria criteria) {
		super(criteria);
		email = new StringExpression("email", this);
		id = new IntegerExpression("id", this);
		contrasena = new StringExpression("contrasena", this);
		tipoUsuario = new StringExpression("tipoUsuario", this);
		numIntentos = new IntegerExpression("numIntentos", this);
		fechaBloqueo = new StringExpression("fechaBloqueo", this);
		usuarioId = new StringExpression("usuario.email", this);
		usuario = new AssociationExpression("usuario", this);
	}
	
	public Acceso_DatoCriteria(PersistentSession session) {
		this(session.createCriteria(Acceso_Dato.class));
	}
	
	public Acceso_DatoCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public Actor_ComunCriteria createUsuarioCriteria() {
		return new Actor_ComunCriteria(createCriteria("usuario"));
	}
	
	public Acceso_Dato uniqueAcceso_Dato() {
		return (Acceso_Dato) super.uniqueResult();
	}
	
	public Acceso_Dato[] listAcceso_Dato() {
		java.util.List list = super.list();
		return (Acceso_Dato[]) list.toArray(new Acceso_Dato[list.size()]);
	}
}

