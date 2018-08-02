package com.huios.medical.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "praticiens")
public class Praticien extends Personne {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Specialite spectalite;
	private Byte[] photo;
	@ManyToOne
	private Statut statut;
	
	private MoyenDePaiement moyenDePaiement;
	
	@OneToMany(mappedBy="medecinTraitant")
	private List<Patient> mesPatients;
	
	@ManyToOne
	private Structure structure;

	
	public Praticien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specialite getSpectalite() {
		return spectalite;
	}

	public void setSpectalite(Specialite spectalite) {
		this.spectalite = spectalite;
	}

	public Byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public MoyenDePaiement getMoyenDePaiement() {
		return moyenDePaiement;
	}

	public void setMoyenDePaiement(MoyenDePaiement moyenDePaiement) {
		this.moyenDePaiement = moyenDePaiement;
	}

	public List<Patient> getMesPatients() {
		return mesPatients;
	}

	public void setMesPatients(List<Patient> mesPatients) {
		this.mesPatients = mesPatients;
	}

	public Structure getStructure() {
		return structure;
	}

	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	public Praticien(String titre, String nom, String prenom, String email, String telephone, Date dateNaissance) {
		super(titre, nom, prenom, email, telephone, dateNaissance);
		// TODO Auto-generated constructor stub
	}


	
}
