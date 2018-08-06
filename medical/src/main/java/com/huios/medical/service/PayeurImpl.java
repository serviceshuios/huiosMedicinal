package com.huios.medical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.huios.medical.entities.Adresse;
import com.huios.medical.entities.Payeur;
import com.huios.medical.repositories.PayeurRepository;

@Service
public class PayeurImpl implements IPayeur {

	@Autowired
	private PayeurRepository payeurRepository;
	
	
	public PayeurRepository getPayeurRepository() {
		return payeurRepository;
	}

	public void setPayeurRepository(PayeurRepository payeurRepository) {
		this.payeurRepository = payeurRepository;
	}

	@Override
	public Boolean inscription(String login, String mdp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payeur Connexion(String login, String mdp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payeur majPayeur(Payeur payeur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creationProfil(String nom, String prenom, int age, Adresse adresse) {
		// TODO Auto-generated method stub

	}

}
