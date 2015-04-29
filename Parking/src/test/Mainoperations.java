
package test;
import org.hibernate.Session;

public class Mainoperations {private static Session s = null;

public static void main(String[] args) {
      // Ouverture d'une session Hibernate
      s = HibernateUtils.getSession();

      // Lancement des tests successifs
      testCreate();
      testRead();
      testUpdate();
      testDelete();

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
}

// Affiche le contenu de la table Parking
private static void print() {
}

}
