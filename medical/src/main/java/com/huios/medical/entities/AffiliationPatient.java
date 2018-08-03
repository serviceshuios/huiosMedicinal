package com.huios.medical.entities;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class AffiliationPatient {

	    // ManyToMany entre Patient et Payeur
		// num affiliation, date Affiliation, affiliation active non, ...
	@EmbeddedId
	private AffiliationPatientId affiliationPatientId;
	
	private String numAdherent;
	private Date dateAffiliation;
	private Double prixAffiliation;
	private Boolean actif;
	
	public AffiliationPatient(Patient patient, Payeur payeur) {
		this.affiliationPatientId = new AffiliationPatientId(patient,payeur);
	}
	public AffiliationPatientId getAffiliationPatientId() {
		return affiliationPatientId;
	}
	public void setAffiliationPatientId(AffiliationPatientId affiliationPatientId) {
		this.affiliationPatientId = affiliationPatientId;
	}
	public String getNumAdherent() {
		return numAdherent;
	}
	public void setNumAdherent(String numAdherent) {
		this.numAdherent = numAdherent;
	}
	public Date getDateAffiliation() {
		return dateAffiliation;
	}
	public void setDateAffiliation(Date dateAffiliation) {
		this.dateAffiliation = dateAffiliation;
	}
	public Double getPrixAffiliation() {
		return prixAffiliation;
	}
	public void setPrixAffiliation(Double prixAffiliation) {
		this.prixAffiliation = prixAffiliation;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	
	
}
