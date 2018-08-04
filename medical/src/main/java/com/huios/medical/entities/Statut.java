package com.huios.medical.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "statuts")
public class Statut extends AbstractActivity {

	private String nomStatut;
	
	@OneToMany
	private List<Praticien> praticiens = new ArrayList<Praticien>();
	
	public String getNomStatut() {
		return nomStatut;
	}
	public void setNomStatut(String nomStatut) {
		this.nomStatut = nomStatut;
	}
	public List<Praticien> getPraticiens() {
		return praticiens;
	}
	public void setPraticiens(List<Praticien> praticiens) {
		this.praticiens = praticiens;
	}
	public Statut() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Statut(String nomStatut) {
		super();
		this.nomStatut = nomStatut;
	}
	
}
