
package test;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.ArrayList;
import org.hibernate.Transaction;
import jpa.Parking;


public class Mainoperations {private static Session s = null;

public static void main(String[] args) {
      // Ouverture d'une session Hibernate
      s = HibernateUtils.getSession();

      // Lancement des tests successifs
      clean();


      // Fermeture de la session Hibernate
      s.close();
}

// Création d'un Parking
private static void testCreate() {
}

// Lecture d'un Parking
private static void testRead() {
}

// Modification d'un Parking
private static void testUpdate() {
}

// Suppression d'un Parking
private static void testDelete() {
}

// Vide la table Parking de toutes ses entrées
private static void clean() {
    System.out.println("--------- Vide la table events : ---------");
    // Début de la transaction
    Transaction tx = s.beginTransaction();

    // Création de la requête
    Query q = s.createQuery("delete Parking");
    // Exécution de la requête
    q.executeUpdate();

    // Fin de la transaction
    tx.commit();
}



}
