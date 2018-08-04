package com.huios.medical.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Embeddable
public class AffiliationPatientId implements Serializable {

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Patient_Id")
	private Patient patient;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Payeur_Id")
	private Payeur payeur;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Payeur getPayeur() {
		return payeur;
	}

	public void setPayeur(Payeur payeur) {
		this.payeur = payeur;
	}

	public AffiliationPatientId(Patient patient, Payeur payeur) {
		super();
		this.patient = patient;
		this.payeur = payeur;
	}

	public AffiliationPatientId() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ApplicationPatientId [patient=" + patient + ", payeur=" + payeur + "]";
	}
}
