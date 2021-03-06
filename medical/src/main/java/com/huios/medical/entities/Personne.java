package com.huios.medical.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

//@MappedSuperclass
@Entity
@Table(name = "personnes")
public class Personne extends AbstractActivity{

	private static final long serialVersionUID = 1L; 
	// attributs d'une personne
	@Column(length = 5)
	private String titre;
	@Column(length = 20)
	private String nom;
	@Column(length = 20)
	private String prenom; 
	@Column(length = 20)
	private String email;
	@Column(length = 20)
	private String telephone;
	@Column(length = 20)
	private Date dateNaissance;
	
	private String login;
	private String mdp;
	

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(String titre, String nom, String prenom, String email, String telephone, Date dateNaissance) {
		super();
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.dateNaissance = dateNaissance;
	}

	public Personne(String login, String mdp) {
		super();
		this.login = login;
		this.mdp = mdp;
	}

	public Personne(String titre, String nom, String prenom, String login, String mdp) {
		super();
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
	}

	public String getTitre() {
		return titre;
	}

	public Personne(Long id, Long version, String titre, String nom, String prenom, String email, String telephone,
			Date dateNaissance, String login, String mdp) {
		super(id, version);
		this.titre = titre;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.dateNaissance = dateNaissance;
		this.login = login;
		this.mdp = mdp;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public void setTitre(String titre) {
		this.titre = titre;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Personne [titre=" + titre + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", telephone="
				+ telephone + ", dateNaissance=" + dateNaissance + "]";
	}
	
	
}
