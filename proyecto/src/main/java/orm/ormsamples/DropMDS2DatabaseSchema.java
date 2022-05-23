/**
 * Licensee: Antonio Jesús Cano Andreu(University of Almeria)
 * License Type: Academic
 */
package orm.ormsamples;
import orm.bbdd.MDS2PersistentManager;

import org.orm.*;
public class DropMDS2DatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(MDS2PersistentManager.instance());
				MDS2PersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
