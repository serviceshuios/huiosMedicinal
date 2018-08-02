package com.huios.medical.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "connexions")
public class Connexion extends AbstractActivity {

	private String login;
	private String mdp;
	
	@OneToOne
	private Personne personne;
	
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
	
	
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Connexion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Connexion(Long id, Long version, String login, String mdp) {
		super(id, version);
		this.login = login;
		this.mdp = mdp;
	}
	
	@Override
	public String toString() {
		return "Connexion [login=" + login + ", mdp=" + mdp + "]";
	}
	
	
	
}
