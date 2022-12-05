package com.nozha.sports;



import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nozha.projets.entities.Employe;
import com.nozha.projets.entities.Projet;
import com.nozha.projets.repos.ProjetRepository;


@SpringBootTest
class ProjetsApplicationTests {

	@Autowired
	private ProjetRepository projetRepository;
	
	@Test
	public void testCreateProjet(){
	Projet spo = new Projet("admin",new Date(),new Date(),"123","plateforme");
	projetRepository.save(spo);
	}
	
	@Test
	public void testFindProjet()
	{
	Projet p = projetRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdateProjet()
	{
	Projet p = projetRepository.findById(2L).get();
	p.setnomProjet("site web");
	projetRepository.save(p);
	
	System.out.println(p);
	}
	
	@Test
	public void testDeleteProjet()
	{
		projetRepository.deleteById(3L);
	}
	
	@Test
	public void testFindAllProjets()
	{
		List<Projet> spos = projetRepository.findAll();
		
		for (Projet p:spos)
			 System.out.println(p);
		
	}
	
	
	@Test
	public void testFindProjetByNom()
	{
	List<Projet> spos = projetRepository.findByNomProjet("acrobique");
	
	for (Projet p:spos)
		 System.out.println(p);
	
	}
	
	@Test
	public void testFindProjetByNomContains()
	{
	List<Projet> spos = projetRepository.findByNomProjetContains("P");
	
	for (Projet p:spos)
		 System.out.println(p);
	
	}
	
	@Test
	public void testfindByNomnomProjet()
	{
	List<Projet> spos = projetRepository.findByNomnomProjet("a","b");
		for (Projet p : spos)
			{
				System.out.println(p);
			}
	}
	
	
	@Test
	public void testfindByEmploye()
	{
	Employe cat = new Employe();
	cat.setIdEmp(1L);
	
	List<Projet> spos = projetRepository.findByEmploye(cat);
	for (Projet p : spos)
	{
		System.out.println(p);
	}
	}
	
	@Test
	public void findByEmployeIdEmp()
	{
	List<Projet> spos = projetRepository.findByEmployeIdEmp(1L);
	for (Projet p : spos)
	{
		System.out.println(p);
	}
	}
	
	
	@Test
	public void testfindByOrderByNomProjetAsc()
	{
	List<Projet> spos =  projetRepository.findByOrderByNomProjetAsc();
	for (Projet p : spos)
		{
			System.out.println(p);
		}
	}
	
	@Test
	public void testTrierProjetsNomsnomProjet()
	{
	List<Projet> spos = projetRepository.trierProjetsNomsnomProjet();
	for (Projet p : spos)
	{
	System.out.println(p);
	}
	}
	
	
}
