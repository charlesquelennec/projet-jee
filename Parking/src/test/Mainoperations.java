
package test;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;

import org.hibernate.Transaction;

import jpa.Parking;


public class Mainoperations {
	private static Session s = null;

	public static void main(String[] args) {
		// Ouverture d'une session Hibernate
		s = HibernateUtils.getSession();



		// Affiche le contenu de la table
		testCreate();
		testRead();
		testUpdate();
		testDelete();
		
		
		// Fermeture de la session Hibernate
		s.close();
	}

	// Création d'un Parking
	private static void testCreate() {
	      System.out.println("--------- testCreate ---------");
	 
	      // Création des objets à sauvegarder
	      Parking e1 = new Parking();
	      e1.setNom("Parkin du 8");
	      e1.setAdresse("Rue medron");
	      e1.setPrix(400);
	      
	 
	      Parking e2 = new Parking();
	      e2.setNom("Parkin du 86");
	      e2.setAdresse("Rue Ballard");
	      e2.setPrix(900);
	      
	      Parking e3 = new Parking();
	      e3.setNom("Deletable");
	      e3.setAdresse("Rue Ballard");
	      e3.setPrix(900);
	 
	      // Début de la transaction
	      Transaction tx = s.beginTransaction();
	      // Sauvegarde des objets
	      s.save(e1);
	      s.save(e2);
	      s.save(e3);

	      // Fermeture de la transaction
	      tx.commit();
	
	}

	// Lecture d'un event
	private static void testRead() {
	      System.out.println("--------- testRead ---------");
	 
	      // Récupération du parking d'après son titre
	      Query q = s.createQuery("from Parking where nom= :myTitle");
	      q.setString("myTitle", "Parkin du 8");
	      Parking e = (Parking) q.uniqueResult();
	 
	      // Affichage de l'objet récupéré
	      System.out.println("Parking : [id] = " + e.getId() + "\t" +
	                  "[nom] = " + e.getNom() + "\t" +
	                  "[adresse] = " + e.getAdresse() + "\t" +
	                  "[prix] = " + e.getPrix() + "\t" 
	                  );
	}

	// Modification d'un Parking
	private static void testUpdate() {
	      System.out.println("--------- testUpdate ---------");
	      System.out.println("Avant modification");
	     // print();
	 
	      // Récupération de l'Event d'après son titre
	      Query q = s.createQuery("from Parking where nom= :myTitle");
	      q.setString("myTitle", "Parkin du 86");
	      Parking e = (Parking) q.uniqueResult();
	 
	      // Modifications des attributs de l'objet
	      e.setNom("Nouveau nom");
	      
	 
	      // Prise en compte de la modification
	      Transaction tx = s.beginTransaction();
	      s.update(e);
	      tx.commit();
	 
	      System.out.println("Après modification");
	      //print();
	}

	// Suppression d'un Parking

	private static void testDelete() {
	      System.out.println("--------- testDelete ---------");
	      System.out.println("Avant suppression");
	      //print();
	 
	      // Récupération de l'Event d'après son titre
	      Query q = s.createQuery("from Parking where nom= :myTitle");
	      q.setString("myTitle", "Deletable");
	      Parking e = (Parking) q.uniqueResult();
	 
	      // Enregistrement de la suppression
	      Transaction tx = s.beginTransaction();
	      s.delete(e);
	      tx.commit();
	 
	      System.out.println("Après suppression");
	     // print();
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
