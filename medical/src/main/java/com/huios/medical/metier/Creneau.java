package com.huios.medical.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "creneaux")
public class Creneau extends AbstractActivity{

	private static final long serialVersionUID = 1L;
	private int hdebut;
	private int mdebut;
	private int hfin;
	private int mfin;
	
	// un créneau est lié  un praticien
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_medecin")
	private Praticien praticien;
	
	//clé étrangère
	@Column(name = "id_medecin", insertable = false, updatable = false)
	private long idMedecin;

	public Creneau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Creneau(int hdebut, int mdebut, int hfin, int mfin, Praticien praticien) {
		this.hdebut = hdebut;
		this.mdebut = mdebut;
		this.hfin = hfin;
		this.mfin = mfin;
		this.praticien = praticien;
	}

	@Override
	public String toString() {
		return "Creneau [hdebut=" + hdebut + ", mdebut=" + mdebut + ", hfin=" + hfin + ", mfin=" + mfin + ", praticien="
				+ praticien + ", idMedecin=" + idMedecin + "]";
	}

	public int getHdebut() {
		return hdebut;
	}

	public void setHdebut(int hdebut) {
		this.hdebut = hdebut;
	}

	public int getMdebut() {
		return mdebut;
	}

	public void setMdebut(int mdebut) {
		this.mdebut = mdebut;
	}

	public int getHfin() {
		return hfin;
	}

	public void setHfin(int hfin) {
		this.hfin = hfin;
	}

	public int getMfin() {
		return mfin;
	}

	public void setMfin(int mfin) {
		this.mfin = mfin;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public long getIdMedecin() {
		return idMedecin;
	}

	public void setIdMedecin(long idMedecin) {
		this.idMedecin = idMedecin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
