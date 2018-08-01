package com.huios.medical.metier;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Rv extends AbstractActivity {
	 private static final long serialVersionUID = 1L;
	 
	 @Temporal(TemporalType.DATE)
	 private Date jour;
	 
	 // un rv est lié à un client 
	 @ManyToOne(fetch = FetchType.LAZY) 
	 @JoinColumn(name = "id_patient")
	 private Patient patient; 
	 
	// un rv est lié à un client
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_creneau")
	 private Creneau creneau; 
	 
     // un rv est lié à un payeur
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_payeur")
	 private Payeur payeur; 
	 
	 
	 // clés étrangères 
	 @Column(name = "id_patient", insertable = false, updatable = false)
	 private long idPatient;
	 @Column(name = "id_creneau", insertable = false, updatable = false) 
	 private long idCreneau; 
	 @Column(name = "id_payeur", insertable = false, updatable = false) 
	 private long idPayeur;
	public Rv() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rv(Long id, Long version, Date jour, Patient patient, Creneau creneau, Payeur payeur) {
		super(id, version);
		this.jour = jour;
		this.patient = patient;
		this.creneau = creneau;
		this.payeur = payeur;
	}
	public Date getJour() {
		return jour;
	}
	public void setJour(Date jour) {
		this.jour = jour;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Creneau getCreneau() {
		return creneau;
	}
	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}
	public Payeur getPayeur() {
		return payeur;
	}
	public void setPayeur(Payeur payeur) {
		this.payeur = payeur;
	}
	public long getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
	}
	public long getIdCreneau() {
		return idCreneau;
	}
	public void setIdCreneau(long idCreneau) {
		this.idCreneau = idCreneau;
	}
	public long getIdPayeur() {
		return idPayeur;
	}
	public void setIdPayeur(long idPayeur) {
		this.idPayeur = idPayeur;
	}
	@Override
	public String toString() {
		return "Rv [jour=" + jour + ", patient=" + patient + ", creneau=" + creneau + ", payeur=" + payeur
				+ ", idPatient=" + idPatient + ", idCreneau=" + idCreneau + ", idPayeur=" + idPayeur + "]";
	}
	 
	 
	 
}
