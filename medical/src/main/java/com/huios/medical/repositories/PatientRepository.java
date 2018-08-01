package com.huios.medical.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huios.medical.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
