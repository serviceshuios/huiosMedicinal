package com.huios.medical.metier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "payeurs")
public class Payeur extends Personne {

	private static final long serialVersionUID = 1L;

	public Payeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payeur(String titre, String nom, String prenom, String email, String telephone, Date dateNaissance) {
		super(titre, nom, prenom, email, telephone, dateNaissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Payeur [toString()=" + super.toString() + "]";
	}
	
	
}
