package com.huios.medical.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.huios.medical.entities.Creneau;

public interface CreneauRepository extends JpaRepository<Creneau, Long>{

	 // liste des créneaux horaires d'un médecin 
	@Query("select c from Creneau c where c.praticien.id=?1") 
	Iterable<Creneau> getAllCreneaux(long idMedecin); 
}
