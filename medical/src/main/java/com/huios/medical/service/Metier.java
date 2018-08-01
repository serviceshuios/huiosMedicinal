package com.huios.medical.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huios.medical.entities.Creneau;
import com.huios.medical.entities.Patient;
import com.huios.medical.entities.Praticien;
import com.huios.medical.entities.Rv;
import com.huios.medical.metier.AgendaPraticienJour;
import com.huios.medical.repositories.CreneauRepository;
import com.huios.medical.repositories.PatientRepository;
import com.huios.medical.repositories.PraticienRepository;
import com.huios.medical.repositories.RvRepository;

@Service("metier")
public class Metier implements IMetier {

	// repositories 
	@Autowired private PraticienRepository praticienRepository;
	@Autowired private PatientRepository patientRepository; 
	@Autowired private CreneauRepository creneauRepository; 
	@Autowired private RvRepository rvRepository;
	
	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Praticien> getAllPraticien() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Creneau> getAllCreneaux(long idPraticien) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rv> getRvMedecinJour(long idPraticien, Date jour) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient getPatientById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Praticien getPraticienById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rv getRvById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Creneau getCreneauById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rv ajouterRv(Date jour, Creneau creneau, Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerRv(long idRv) {
		// TODO Auto-generated method stub

	}

	@Override
	public AgendaPraticienJour getAgendaMedecinJour(long idPraticien, Date jour) {
		// TODO Auto-generated method stub
		return null;
	}

}
