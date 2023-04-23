package com.nour.university.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;

import com.nour.university.entities.Enseignant;
import com.nour.university.entities.University;

public interface UniversityService {
University saveUniversity(University u);
University updateUniversity(University u);
void deleteUniversity(University u);
 void deleteUniversityById(Long idUniversity);
 University getUniversity(Long idUniversity);
List<University> getAllUniversity();
Page<University> getAllUniversityParPage(int page, int size);


List<University> findByNomUniversity(String nom);
List<University> findByNomUniversityContains(String nom); 
List<University> findByNomNbEnseigant (String nom, int nbEnseigant);
List<University> findByEnseignant (Enseignant enseignant);
List<University> findByEnseignantIdEnseignant(Long id);
List<University> findByOrderByNomUniversityAsc();
List<University> trierUniversityNomsNbEnseigant();




}
