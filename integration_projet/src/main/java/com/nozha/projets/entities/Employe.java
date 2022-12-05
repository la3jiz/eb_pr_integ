package com.nozha.projets.entities;

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
public class Employe {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEmp;
	private String nomEmploye;
	private String Email;
	private String telephone;
	private String addrese ;
	private String password ;
	
	@OneToMany (mappedBy = "employe")
	@JsonIgnore
	private List<Projet> projets;
	
	
}
