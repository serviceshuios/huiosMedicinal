package com.huios.medical.service;

import com.huios.medical.entities.Adresse;
import com.huios.medical.entities.Payeur;

public interface IPayeur {

	// CRUD COMPTE
    //s'enregistrer
	public Boolean inscription(String login, String mdp);
	
    // se connecter
	public Payeur Connexion(String login, String mdp);
	public Payeur majPayeur(Payeur payeur);
	// CRUD PROFIL
	// création d'un profil 
	public void creationProfil(String nom, String prenom, int age, Adresse adresse);
}
