package com.nour.university.entities;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity



public class Enseignant {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idEnseignant;
private String nomEnseignant;
private String villeEnseignant;
private int nbclasse;

@JsonIgnore
@OneToMany(mappedBy = "enseignant")
private List<University> universities;




}