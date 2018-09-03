package com.huios.medical.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.huios.medical.entities.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long>{

	@Query("select p from Patient p where p.login=:x and p.mdp=:y")
	Patient Connexion(@Param("x")String login,@Param("y") String mdp);
}
