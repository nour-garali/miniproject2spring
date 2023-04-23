package com.nour.university.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nour.university.entities.Enseignant;
import com.nour.university.entities.University;

public interface UniversityRepository extends JpaRepository<University, Long> {
	List<University> findByNomUniversity(String nom);
	List<University> findByNomUniversityContains(String nom); 
	
	@Query("select u from University u where u.nomUiversity like %?1 and u.nbEnseigant > ?2")
	List<University> findByNomNbEnseigant (String nom, int nbEnseigant);
	
	@Query("select u from University u where p.enseignant = ?1")
	List<University> findByEnseignant (Enseignant enseignant);
	
	
	List<University> findByEnseignantIdEnseignant(Long id);
	
	List<University> findByOrderByNomUniversityAsc();
	
	@Query("select u from University u order by u.nomUiversity ASC, u.nbEnseigant DESC")
	List<University> trierUniversityNomsNbEnseigant();

	
	
	
	
}
