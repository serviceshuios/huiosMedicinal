package com.huios.medical.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "adresses")
public class Adresse extends AbstractActivity{

	private String numRue;
	private String nomRue;
	private String ville;
	private String codePostal;
	private String pays;
	public String getNumRue() {
		return numRue;
	}
	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}
	public String getNomRue() {
		return nomRue;
	}
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	@Override
	public String toString() {
		return "Adresse [numRue=" + numRue + ", nomRue=" + nomRue + ", ville=" + ville + ", codePostal=" + codePostal
				+ ", pays=" + pays + "]";
	}
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Adresse(String numRue, String nomRue, String ville, String codePostal, String pays) {
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.ville = ville;
		this.codePostal = codePostal;
		this.pays = pays;
	}
	
}
