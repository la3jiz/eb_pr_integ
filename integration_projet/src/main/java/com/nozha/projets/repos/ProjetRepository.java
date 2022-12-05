package com.nozha.projets.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nozha.projets.entities.Employe;
import com.nozha.projets.entities.Projet;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
	
	List<Projet> findByNomProjet(String nom);
	List<Projet> findByNomProjetContains(String nom);
	
	/*@Query("select p from Projet p where p.nomProjet like %?1 and p.addrese > ?2")
	List<Projet> findByNomTitre(String nom, String nomProjet);*/
	
	/*@Query("select p from Projet p where p.nomProjet like %:nom and p.addrese > :addrese")
	List<Projet> findByNomnomProjet (@Param("nom") String nom,@Param("adresse") String addrese);*/

	/*@Query("select p from Projet p where p.employe = ?1")
	List<Projet> findByEmploye (Employe employe);*/
	
	List<Projet> findByEmployeIdEmp(Long id);
	
	List<Projet> findByOrderByNomProjetAsc();
	
	/*@Query("select p from Projet p order by p.nomProjet ASC, p.addrese DESC")
	List<Projet> trierProjetsNomsnomProjet ();*/

}
