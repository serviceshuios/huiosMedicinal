package com.huios.medical.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dossiers_medicaux")
public class DossierMedical extends AbstractActivity{
//LISTE D'ACTES MEDICAUX
	private static final long serialVersionUID = 1L;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_patient")
	private Patient patient;
	
	private List<Praticien> praticiens;
	
	
}
