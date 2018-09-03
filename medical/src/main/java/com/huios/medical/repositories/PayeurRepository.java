package com.huios.medical.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.huios.medical.entities.Payeur;
public interface PayeurRepository extends JpaRepository<Payeur, Long>{

	@Query("select p from Payeur p where p.login=:x and p.mdp=:y")
	Payeur Connexion(@Param("x")String login,@Param("y") String mdp);
}
