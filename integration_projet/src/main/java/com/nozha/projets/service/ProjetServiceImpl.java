package com.nozha.projets.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nozha.projets.entities.Employe;
import com.nozha.projets.entities.Projet;
import com.nozha.projets.repos.ProjetRepository;


@Service
public class ProjetServiceImpl implements ProjetService{

	@Autowired
	 private ProjetRepository projetRepository;
	
	@Override
	public Projet saveProjet(Projet p) {
		return projetRepository.save(p);
	}

	@Override
	public Projet updateProjet(Projet p) {
		return projetRepository.save(p);
	}

	@Override
	public void deleteProjet(Projet p) {
		projetRepository.delete(p);
		
	}

	@Override
	public void deleteProjetById(Long id) {
		projetRepository.deleteById(id);
		
	}

	@Override
	public Projet getProjet(Long id) {
		return projetRepository.findById(id).get();
	}

	@Override
	public List<Projet> getAllProjets() {
		
		return projetRepository.findAll();
	}

	@Override
	public List<Projet> findByNomProjet(String nom) {
		
		return projetRepository.findByNomProjet(nom);
	}

	@Override
	public List<Projet> findByNomProjetContains(String nom) {
		
		return projetRepository.findByNomProjetContains(nom);
	}

	@Override
	public List<Projet> findByNomnomProjet(String nom, String nomProjet) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<Projet> findByEmploye(Employe employe) {
		
		return projetRepository.findByEmploye(employe);
	}*/

	@Override
	public List<Projet> findByEmployeIdEmp(Long id) {
	
		return projetRepository.findByEmployeIdEmp(id);
	}

	@Override
	public List<Projet> findByOrderByNomProjetAsc() {
		
		return projetRepository.findByOrderByNomProjetAsc();
	}

	@Override
	public List<Projet> findByEmploye(Employe employe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Projet> trierProjetsNomsnomProjet() {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<Projet> trierProjetsNomsnomProjet() {
	
		return projetRepository.trierProjetsNomsnomProjet();
	}
	*/
	

}
