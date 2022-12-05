package com.nozha.projets.service;

import java.util.List;

import com.nozha.projets.entities.Employe;
import com.nozha.projets.entities.Projet;

public interface ProjetService {
	Projet saveProjet(Projet p);
	Projet updateProjet(Projet p);
	void deleteProjet(Projet p);
	void deleteProjetById(Long id);
	Projet getProjet(Long id);
	List<Projet> getAllProjets();
	List<Projet> findByNomProjet(String nom);
	List<Projet> findByNomProjetContains(String nom);
	List<Projet> findByNomnomProjet (String nom, String nomProjet);
	List<Projet> findByEmploye (Employe employe);
	List<Projet> findByEmployeIdEmp(Long id);
	List<Projet> findByOrderByNomProjetAsc();
	List<Projet> trierProjetsNomsnomProjet();

}
