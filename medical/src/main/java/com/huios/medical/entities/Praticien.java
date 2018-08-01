package com.huios.medical.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "praticiens")
public class Praticien extends Personne {

	private static final long serialVersionUID = 1L;

	public Praticien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Praticien(String titre, String nom, String prenom, String email, String telephone, Date dateNaissance) {
		super(titre, nom, prenom, email, telephone, dateNaissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Praticien [toString()=" + super.toString() + "]";
	}
	
	
}
