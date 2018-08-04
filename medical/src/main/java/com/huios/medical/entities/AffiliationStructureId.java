package com.huios.medical.entities;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Embeddable
public class AffiliationStructureId {

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Structure_Id")
	private Structure structure;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Payeur_Id")
	private Payeur payeur;

	public Structure getStructure() {
		return structure;
	}

	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	public Payeur getPayeur() {
		return payeur;
	}

	public void setPayeur(Payeur payeur) {
		this.payeur = payeur;
	}

	@Override
	public String toString() {
		return "AffiliationStructureId [structure=" + structure + ", payeur=" + payeur + "]";
	}

	public AffiliationStructureId(Structure structure, Payeur payeur) {
		super();
		this.structure = structure;
		this.payeur = payeur;
	}

	public AffiliationStructureId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
