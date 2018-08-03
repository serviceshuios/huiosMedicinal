package com.huios.medical.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "actes_medicaux")
public class ActeMedical extends AbstractActivity {

	
	@ManyToOne
	private DossierMedical dossierMedical;
	
	private String intituleActe;
	private Date dateActe;
	@ManyToOne
	private Service service;
	private String diagnostic;
	private String prescription;
	public DossierMedical getDossierMedical() {
		return dossierMedical;
	}
	public void setDossierMedical(DossierMedical dossierMedical) {
		this.dossierMedical = dossierMedical;
	}
	public String getIntituleActe() {
		return intituleActe;
	}
	public void setIntituleActe(String intituleActe) {
		this.intituleActe = intituleActe;
	}
	public Date getDateActe() {
		return dateActe;
	}
	public void setDateActe(Date dateActe) {
		this.dateActe = dateActe;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public String getDiagnostic() {
		return diagnostic;
	}
	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public ActeMedical() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ActeMedical(Long id, Long version, DossierMedical dossierMedical, String intituleActe, Date dateActe,
			Service service, String diagnostic, String prescription) {
		super(id, version);
		this.dossierMedical = dossierMedical;
		this.intituleActe = intituleActe;
		this.dateActe = dateActe;
		this.service = service;
		this.diagnostic = diagnostic;
		this.prescription = prescription;
	}
	

}
