package com.huios.medical.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.huios.medical.entities.Creneau;

public interface CreneauRepository extends JpaRepository<Creneau, Long>{

	 // liste des créneaux horaires d'un médecin 
	@Query("select c from Creneau c where c.praticien.id=:id") 
	List<Creneau> getAllCreneaux(@Param("id")long idMedecin); 
}
