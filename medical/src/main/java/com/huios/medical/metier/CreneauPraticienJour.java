package com.huios.medical.metier;

import java.io.Serializable;

import com.huios.medical.entities.Creneau;
import com.huios.medical.entities.Rv;

//Associe un créneau horaire et le rendez-vous éventuel pris dans ce créneau 
public class CreneauPraticienJour implements Serializable {

	private static final long serialVersionUID = 1L;
	// champs
	 private Creneau creneau; 
	 private Rv rv;
	 
	
    
	public CreneauPraticienJour() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreneauPraticienJour(Creneau creneau, Rv rv) {
		super();
		this.creneau = creneau;
		this.rv = rv;
	}

	@Override
	public String toString() {
		return "CreneauPatientJour [creneau=" + creneau + ", rv=" + rv + "]";
	}

	public Creneau getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}

	public Rv getRv() {
		return rv;
	}

	public void setRv(Rv rv) {
		this.rv = rv;
	}
	 
}
