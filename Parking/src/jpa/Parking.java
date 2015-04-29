package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
@Entity
@Table(name="Parking")

public class Parking {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @Column(name="id")
   private Integer id;
   
   @Column(name="nom")
   private String nom;
   
   @Column(name="adresse")
   private String adresse;
   
   @Column(name="prix")
   private Integer prix;
   
 // Getters et setters
   public Parking() {
   }

public Integer getId() {
	return id;
}

public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getAdresse() {
	return adresse;
}


public void setAdresse(String adresse) {
	this.adresse = adresse;
}


public Integer getPrix() {
	return prix;
}


public void setPrix(Integer prix) {
	this.prix = prix;
}
 
   
}