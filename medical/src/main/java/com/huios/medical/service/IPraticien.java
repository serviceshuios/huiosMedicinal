package com.huios.medical.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import com.huios.medical.entities.Adresse;
import com.huios.medical.entities.Creneau;
import com.huios.medical.entities.Patient;
import com.huios.medical.entities.Payeur;
import com.huios.medical.entities.Praticien;
import com.huios.medical.entities.Rv;
import com.huios.medical.metier.AgendaPraticienJour;

public interface IPraticien {

	     //s'enregistrer
		public Praticien inscription(Praticien c);
	    // se connecter
		public Praticien Connexion(String login, String mdp);
		// création d'un profil 
		public void creationProfil(String nom, String prenom, int age, Adresse adresse);
	    // liste des patients
		public List<Patient> getAllPatients();

		// liste des Praticiens
		public List<Praticien> getAllPraticien();

		// liste des créneaux horaires d'un médecin
		public List<Creneau> getAllCreneaux(long idPraticien);

		// liste des Rv d'un médecin, un jour donné
		public List<Rv> getRvMedecinJour(long idPraticien, Date jour);

		// trouver un patient identifié par son id
		public Patient getPatientById(long id);

		// trouver un praticien identifié par son id
		public Praticien getPraticienById(long id);

		// trouver un Rv identifié par son id
		public Rv getRvById(long id);

		// trouver un créneau horaire identifié par son id
		public Creneau getCreneauById(long id);

		// supprimer un RV
		public void supprimerRv(long idRv);

		// metier
		public AgendaPraticienJour getAgendaMedecinJour(long idPraticien, Date jour);
		
		Rv ajouterRv(Date jour, Creneau creneau, Patient patient, Payeur payeur);
		public void delete(Long id);
		
		public Page<Praticien> chercherPraticien(String nom,Pageable pageable);
}
