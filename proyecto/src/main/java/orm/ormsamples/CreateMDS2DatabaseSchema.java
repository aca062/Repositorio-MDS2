/**
 * Licensee: Antonio Jesús Cano Andreu(University of Almeria)
 * License Type: Academic
 */
package orm.ormsamples;

import org.orm.*;

import orm.bbdd.MDS2PersistentManager;

public class CreateMDS2DatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(MDS2PersistentManager.instance());
			MDS2PersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
