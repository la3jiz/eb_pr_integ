package com.nozha.projets.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nozha.projets.entities.Employe;
import com.nozha.projets.repos.EmployeRepository;
@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")
public class EmployeRESTController {
	
@Autowired
EmployeRepository employeRepository;

@RequestMapping(method=RequestMethod.GET)
public List<Employe> getAllEmployes()
{
return employeRepository.findAll();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Employe getEmployesById(@PathVariable("id") Long id) {
return employeRepository.findById(id).get();
}
}
