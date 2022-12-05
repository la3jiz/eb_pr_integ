package com.nozha.projets.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nozha.projets.entities.Employe;


@Repository
public interface EmployeRepository  extends JpaRepository <Employe, Long> {

	

}
