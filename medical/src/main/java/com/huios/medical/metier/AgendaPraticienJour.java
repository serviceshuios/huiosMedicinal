package com.huios.medical.metier;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import com.huios.medical.entities.Praticien;

public class AgendaPraticienJour implements Serializable {

	 private static final long serialVersionUID = 1L;
	 
	 // attributs
	 // le praticien
	 private Praticien praticien;
	 // le jour
	 private Date jour;
	 // les créneaux du praticien avec ou sans rendez-vous
	 private CreneauPraticienJour[] creneauxPraticienJour;
	 
	public AgendaPraticienJour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AgendaPraticienJour(Praticien praticien, Date jour, CreneauPraticienJour[] creneauxPraticienJour) {
		super();
		this.praticien = praticien;
		this.jour = jour;
		this.creneauxPraticienJour = creneauxPraticienJour;
	}
	public Praticien getPraticien() {
		return praticien;
	}
	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}
	public Date getJour() {
		return jour;
	}
	public void setJour(Date jour) {
		this.jour = jour;
	}
	public CreneauPraticienJour[] getCreneauxPraticienJour() {
		return creneauxPraticienJour;
	}
	public void setCreneauxPraticienJour(CreneauPraticienJour[] creneauxPraticienJour) {
		this.creneauxPraticienJour = creneauxPraticienJour;
	}
	@Override
	public String toString() {
		return "AgendaPraticienJour [praticien=" + praticien + ", jour=" + jour + ", creneauxPraticienJour="
				+ Arrays.toString(creneauxPraticienJour) + "]";
	}
	 
	 
}
