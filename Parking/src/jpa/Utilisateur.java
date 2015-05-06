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
@Table(name="Utilisateur")

public class Utilisateur {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;

	@Column(name="nom")
	private String nom;

	@Column(name="prenom")
	private String prenom;

	@Column(name="email")
	private String email;

	@Column(name="pseudo")
	private String pseudo;

	@Column(name="password")
	private String password;

	@Column(name="telephone")
	private Integer telephone;


	@Column(name="role")
	private String role;

	@Column(name="preteur")
	private Boolean preteur;

	@Column(name="emprunteur")
	private Boolean emprunteur;

	//Getter et Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getTelephone() {
		return telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getPreteur() {
		return preteur;
	}

	public void setPreteur(Boolean preteur) {
		this.preteur = preteur;
	}

	public Boolean getEmprunteur() {
		return emprunteur;
	}

	public void setEmprunteur(Boolean emprunteur) {
		this.emprunteur = emprunteur;
	}







}