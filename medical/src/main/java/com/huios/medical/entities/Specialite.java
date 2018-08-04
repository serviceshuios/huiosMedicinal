package com.huios.medical.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "specialites")
public class Specialite extends AbstractActivity{

	private String nomSpecialite;
	@OneToMany
	private List<Praticien> praticiens = new ArrayList<Praticien>();
	
	public String getNomSpecialite() {
		return nomSpecialite;
	}
	public void setNomSpecialite(String nomSpecialite) {
		this.nomSpecialite = nomSpecialite;
	}
	public List<Praticien> getPraticiens() {
		return praticiens;
	}
	public void setPraticiens(List<Praticien> praticiens) {
		this.praticiens = praticiens;
	}
	public Specialite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Specialite(Long id, Long version, String nomSpecialite) {
		super(id, version);
		this.nomSpecialite = nomSpecialite;
	}
	@Override
	public String toString() {
		return "Specialite [nomSpecialite=" + nomSpecialite + ", praticiens=" + praticiens + "]";
	}
	
	
}
