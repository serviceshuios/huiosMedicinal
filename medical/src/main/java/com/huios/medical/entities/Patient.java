package com.huios.medical.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient extends Personne {

	private static final long serialVersionUID = 1L;
	
	private String statutFamilial;
	private String situationProfessionnelle;
	private String groupeSanguin;
	private Byte[] photo;
	
	@ManyToOne
	private Praticien medecinTraitant;

	public String getStatutFamilial() {
		return statutFamilial;
	}

	public void setStatutFamilial(String statutFamilial) {
		this.statutFamilial = statutFamilial;
	}

	public String getSituationProfessionnelle() {
		return situationProfessionnelle;
	}

	public void setSituationProfessionnelle(String situationProfessionnelle) {
		this.situationProfessionnelle = situationProfessionnelle;
	}

	public String getGroupeSanguin() {
		return groupeSanguin;
	}

	public void setGroupeSanguin(String groupeSanguin) {
		this.groupeSanguin = groupeSanguin;
	}

	public Praticien getMedecinTraitant() {
		return medecinTraitant;
	}

	public void setMedecinTraitant(Praticien medecinTraitant) {
		this.medecinTraitant = medecinTraitant;
	}
	
	public Byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String titre, String nom, String prenom, String email, String telephone, Date dateNaissance) {
		super(titre, nom, prenom, email, telephone, dateNaissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Patient [toString()=" + super.toString() + "]";
	}

	
}
