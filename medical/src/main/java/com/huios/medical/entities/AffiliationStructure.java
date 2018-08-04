package com.huios.medical.entities;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class AffiliationStructure {

	// ManyToMany entre Praticien et Payeur
	// num affiliation, date Affiliation, affiliation active non, ...
	@EmbeddedId
	private AffiliationStructureId affiliationStructureId;
	
	private String numAdherent;
	private Date dateAffiliation;
	private Double prixAffiliation;
	private Boolean actif;
	
	public AffiliationStructure(Payeur payeur, Structure structure)
	{
		this.affiliationStructureId = new AffiliationStructureId(structure, payeur);
	}
	public AffiliationStructureId getAffiliationStructureId() {
		return affiliationStructureId;
	}
	public void setAffiliationStructureId(AffiliationStructureId affiliationStructureId) {
		this.affiliationStructureId = affiliationStructureId;
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
