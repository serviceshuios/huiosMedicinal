package com.huios.medical.metier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient extends Personne {

	private static final long serialVersionUID = 1L;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String titre, String nom, String prenom, String email, String telephone, Date dateNaissance) {
		super(titre, nom, prenom, email, telephone, dateNaissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Patient [toString()=" + super.toString() + "]";
	}

	
}
