package com.huios.medical.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "structures")
public class Structure extends AbstractActivity{
	
	private String typeDeStructure;
	private String nomStructure;
	private Byte[] logo;
	private String descriptionStructure;
	private Byte[] photos;
	private String siteweb;
	private String horairesOuverture;
	private String contact;
	private String telephone;
	@ManyToOne
	private Adresse adresse;
	public List<AffiliationStructure> getAffiliationStructure() {
		return affiliationStructure;
	}
	public void setAffiliationStructure(List<AffiliationStructure> affiliationStructure) {
		this.affiliationStructure = affiliationStructure;
	}
	@OneToMany
	private List<Service> servicesProposes;
	@OneToMany
	private List<Praticien> listeProfessionnels;
	
	@JsonIgnore
	@OneToMany(mappedBy="affiliationStructureId.structure")
	private List<AffiliationStructure> affiliationStructure = new ArrayList<AffiliationStructure>();
	
	public String getTypeDeStructure() {
		return typeDeStructure;
	}
	public void setTypeDeStructure(String typeDeStructure) {
		this.typeDeStructure = typeDeStructure;
	}
	public String getNomStructure() {
		return nomStructure;
	}
	public void setNomStructure(String nomStructure) {
		this.nomStructure = nomStructure;
	}
	public Byte[] getLogo() {
		return logo;
	}
	public void setLogo(Byte[] logo) {
		this.logo = logo;
	}
	public String getDescriptionStructure() {
		return descriptionStructure;
	}
	public void setDescriptionStructure(String descriptionStructure) {
		this.descriptionStructure = descriptionStructure;
	}
	public Byte[] getPhotos() {
		return photos;
	}
	public void setPhotos(Byte[] photos) {
		this.photos = photos;
	}
	public String getSiteweb() {
		return siteweb;
	}
	public void setSiteweb(String siteweb) {
		this.siteweb = siteweb;
	}
	public String getHorairesOuverture() {
		return horairesOuverture;
	}
	public void setHorairesOuverture(String horairesOuverture) {
		this.horairesOuverture = horairesOuverture;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public List<Service> getServicesProposes() {
		return servicesProposes;
	}
	public void setServicesProposes(List<Service> servicesProposes) {
		this.servicesProposes = servicesProposes;
	}
	
	
	public List<Praticien> getListeProfessionnels() {
		return listeProfessionnels;
	}
	public void setListeProfessionnels(List<Praticien> listeProfessionnels) {
		this.listeProfessionnels = listeProfessionnels;
	}
	public Structure() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Structure(Long id, Long version, String typeDeStructure, String nomStructure, Byte[] logo,
			String descriptionStructure, Byte[] photos, String siteweb, String horairesOuverture, String contact,
			String telephone, Adresse adresse, List<Service> servicesProposes, List<Praticien> listeProfessionnels) {
		super(id, version);
		this.typeDeStructure = typeDeStructure;
		this.nomStructure = nomStructure;
		this.logo = logo;
		this.descriptionStructure = descriptionStructure;
		this.photos = photos;
		this.siteweb = siteweb;
		this.horairesOuverture = horairesOuverture;
		this.contact = contact;
		this.telephone = telephone;
		this.adresse = adresse;
		this.servicesProposes = servicesProposes;
		this.listeProfessionnels = listeProfessionnels;
	}
	@Override
	public String toString() {
		return "Structure [typeDeStructure=" + typeDeStructure + ", nomStructure=" + nomStructure + ", logo="
				+ Arrays.toString(logo) + ", descriptionStructure=" + descriptionStructure + ", photos="
				+ Arrays.toString(photos) + ", siteweb=" + siteweb + ", horairesOuverture=" + horairesOuverture
				+ ", contact=" + contact + ", telephone=" + telephone + ", adresse=" + adresse + ", servicesProposes="
				+ servicesProposes + ", listeProfessionnels=" + listeProfessionnels + "]";
	}
	
	
	
}
