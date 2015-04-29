package test;


import org.hibernate.Session;
import org.hibernate.Transaction;
import jpa.Parking;
 
public class InitDB {
    public static void main(String[] args) {
        // Récupération d'une session Hibernate
        Session s = HibernateUtils.getSession();
 
        // Début de la transaction
        Transaction t = s.beginTransaction();
 
        // Création d'un objet Event
        Parking e = new Parking();
        e.setNom("Titre de l'event 1");
        e.setAdresse("Description de l'évènement 1");
        e.setPrix(12);
        
 
        // Enregistrement de l'event
        s.save(e);
 
        // Fin de la transaction
        t.commit();
 
        // Fermeture de la session Hibernate
        s.close();
    }
}