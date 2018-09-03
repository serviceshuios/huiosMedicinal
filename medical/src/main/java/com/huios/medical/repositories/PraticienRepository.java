package com.huios.medical.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.huios.medical.entities.Praticien;

public interface PraticienRepository extends JpaRepository<Praticien, Long>{

	@Query("select p from Praticien p where p.login=:x and p.mdp=:y")
	Praticien Connexion(@Param("x")String login,@Param("y") String mdp);
	
	@Query("select p from Praticien p where p.nom like :x")
	public Page<Praticien> chercherPraticien(@Param("x")String nom,Pageable pageable);
}
