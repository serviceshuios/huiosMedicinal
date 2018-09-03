package com.huios.medical.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "payeurs")
public class Payeur extends Personne {

	private static final long serialVersionUID = 1L;

	private TypePayeur typePayeur;
	private Byte[] logo;
	private String ficheDescriptive;
	private String siteWeb;
	private Byte[] photo;
	@ManyToOne
	private Adresse adresse;
	
	@JsonIgnore
	@OneToMany(mappedBy="affiliationPatientId.payeur")
	private List<AffiliationPatient> affiliationPatient = new ArrayList<AffiliationPatient>();
	
	public List<AffiliationPatient> getAffiliationPatient() {
		return affiliationPatient;
	}
	public void setAffiliationPatient(List<AffiliationPatient> affiliationPatient) {
		this.affiliationPatient = affiliationPatient;
	}
	public List<AffiliationStructure> getAffiliationStructure() {
		return affiliationStructure;
	}
	public void setAffiliationStructure(List<AffiliationStructure> affiliationStructure) {
		this.affiliationStructure = affiliationStructure;
	}
	@JsonIgnore
	@OneToMany(mappedBy="affiliationStructureId.payeur")
	private List<AffiliationStructure> affiliationStructure = new ArrayList<AffiliationStructure>();
	
	public Payeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypePayeur getTypePayeur() {
		return typePayeur;
	}
	public void setTypePayeur(TypePayeur typePayeur) {
		this.typePayeur = typePayeur;
	}
	public Byte[] getLogo() {
		return logo;
	}
	public void setLogo(Byte[] logo) {
		this.logo = logo;
	}
	public String getFicheDescriptive() {
		return ficheDescriptive;
	}
	public void setFicheDescriptive(String ficheDescriptive) {
		this.ficheDescriptive = ficheDescriptive;
	}
	public String getSiteWeb() {
		return siteWeb;
	}
	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}
	public Byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Payeur(String titre, String nom, String prenom, String email, String telephone, Date dateNaissance,
			TypePayeur typePayeur, Byte[] logo, String ficheDescriptive, String siteWeb, Byte[] photo) {
		super(titre, nom, prenom, email, telephone, dateNaissance);
		this.typePayeur = typePayeur;
		this.logo = logo;
		this.ficheDescriptive = ficheDescriptive;
		this.siteWeb = siteWeb;
		this.photo = photo;
	}
	public Payeur(String login, String mdp) {
		super(login, mdp);
		// TODO Auto-generated constructor stub
	}

	
}
