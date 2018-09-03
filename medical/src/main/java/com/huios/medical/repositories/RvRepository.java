package com.huios.medical.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.huios.medical.entities.Rv;

public interface RvRepository extends JpaRepository<Rv, Long>{

	//  permet d'avoir les rendez-vous d'un médecin pour un jour donné 
	 @Query("select rv from Rv rv left join fetch rv.patient c left join fetch rv.creneau cr where cr.praticien.id=?1 and rv.jour=?2") 
	 List<Rv> getRvMedecinJour(long idMedecin, Date jour); 
}
