package com.huios.medical.service;

import java.util.Date;
import java.util.List;

import com.huios.medical.entities.Adresse;
import com.huios.medical.entities.Creneau;
import com.huios.medical.entities.Patient;
import com.huios.medical.entities.Praticien;
import com.huios.medical.entities.Rv;

public interface IPatient {
	
			// CRUD COMPTE
	        //s'enregistrer
			public Boolean inscription(String login, String mdp);
			
		    // se connecter
			public Patient Connexion(String login, String mdp);
			public Patient majPatient(Patient patient);
			// CRUD PROFIL
			// création d'un profil 
			public void creationProfil(String nom, String prenom, int age, Adresse adresse);
			
			// liste des Praticiens
			public List<Praticien> getAllPraticien();
			
			// CRUD RDV
			public Rv prendreRdv(Date laDate,Patient patient,Creneau creneau);
			public Rv updateRv(Rv rv);
			public Rv supprimerRv(Rv rv);
			public List<Rv> mesRv(int idRv);
}
