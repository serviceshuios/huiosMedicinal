package com.huios.medical.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "services")
public class Service extends AbstractActivity {

	private String typeService;
	private String presentationService;
	private int tarifMin;
	private int tarifMax;
	private String priseRdvConseille;
	public String getTypeService() {
		return typeService;
	}
	public void setTypeService(String typeService) {
		this.typeService = typeService;
	}
	public String getPresentationService() {
		return presentationService;
	}
	public void setPresentationService(String presentationService) {
		this.presentationService = presentationService;
	}
	public int getTarifMin() {
		return tarifMin;
	}
	public void setTarifMin(int tarifMin) {
		this.tarifMin = tarifMin;
	}
	public int getTarifMax() {
		return tarifMax;
	}
	public void setTarifMax(int tarifMax) {
		this.tarifMax = tarifMax;
	}
	public String getPriseRdvConseille() {
		return priseRdvConseille;
	}
	public void setPriseRdvConseille(String priseRdvConseille) {
		this.priseRdvConseille = priseRdvConseille;
	}
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(Long id, Long version, String typeService, String presentationService, int tarifMin, int tarifMax,
			String priseRdvConseille) {
		super(id, version);
		this.typeService = typeService;
		this.presentationService = presentationService;
		this.tarifMin = tarifMin;
		this.tarifMax = tarifMax;
		this.priseRdvConseille = priseRdvConseille;
	}
	@Override
	public String toString() {
		return "Service [typeService=" + typeService + ", presentationService=" + presentationService + ", tarifMin="
				+ tarifMin + ", tarifMax=" + tarifMax + ", priseRdvConseille=" + priseRdvConseille + "]";
	}
	
}
