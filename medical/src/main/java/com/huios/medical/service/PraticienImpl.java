package com.huios.medical.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.huios.medical.entities.Adresse;
import com.huios.medical.entities.Creneau;
import com.huios.medical.entities.Patient;
import com.huios.medical.entities.Payeur;
import com.huios.medical.entities.Praticien;
import com.huios.medical.entities.Rv;
import com.huios.medical.metier.AgendaPraticienJour;
import com.huios.medical.repositories.CreneauRepository;
import com.huios.medical.repositories.PatientRepository;
import com.huios.medical.repositories.PraticienRepository;
import com.huios.medical.repositories.RvRepository;

@Service("metier")
public class PraticienImpl implements IPraticien {

	// repositories 
	@Autowired private PraticienRepository praticienRepository;
	@Autowired private PatientRepository patientRepository; 
	@Autowired private CreneauRepository creneauRepository; 
	@Autowired private RvRepository rvRepository;
	
	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public List<Praticien> getAllPraticien() {
		// TODO Auto-generated method stub
		return praticienRepository.findAll();
	}

	@Override
	public List<Creneau> getAllCreneaux(long idPraticien) {
		// TODO Auto-generated method stub
		return creneauRepository.getAllCreneaux(idPraticien);
	}

	@Override
	public List<Rv> getRvMedecinJour(long idPraticien, Date jour) {
		// TODO Auto-generated method stub
		return rvRepository.getRvMedecinJour(idPraticien, jour);
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
	public Rv ajouterRv(Date jour, Creneau creneau, Patient patient, Payeur payeur) {
		// TODO Auto-generated method stub
		Rv rv = new Rv(jour, patient, creneau, payeur);
		return rvRepository.save(rv);
	}

	@Override
	public void supprimerRv(long idRv) {
		rvRepository.deleteById(idRv);

	}
// agenda du jour du Praticien
	@Override
	public AgendaPraticienJour getAgendaMedecinJour(long idPraticien, Date jour) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Praticien inscription(Praticien p) {
		return praticienRepository.save(p);
	}

	@Override
	public Praticien Connexion(String login, String mdp) {
		return praticienRepository.Connexion(login,mdp);
	}

	@Override
	public void creationProfil(String nom, String prenom, int age, Adresse adresse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		praticienRepository.deleteById(id);
	}

	@Override
	public Page<Praticien> chercherPraticien(String nom, Pageable pageable) {
		// TODO Auto-generated method stub
		return praticienRepository.chercherPraticien(nom, pageable);
	}

}
