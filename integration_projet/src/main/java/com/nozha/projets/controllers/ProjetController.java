package com.nozha.projets.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nozha.projets.entities.Projet;
import com.nozha.projets.service.ProjetService;

@Controller
public class ProjetController {
	
	
	@Autowired
	ProjetService projetService;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "createProjet";
	}
	
	@RequestMapping("/saveProjet")
	public String saveProjet(@ModelAttribute("projet") Projet projet,
							  @RequestParam("date") String date,
	                          ModelMap modelMap) throws 	ParseException
	{
	//conversion de la date
	SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	Date datedebut = dateformat.parse(String.valueOf(date));
	Date datefin = dateformat.parse(String.valueOf(date));
	projet.setDatedebut(datedebut);
	projet.setDatefin(datefin);
	
	Projet saveProjet = projetService.saveProjet(projet);
	String msg ="projet enregistré avec Id "+saveProjet.getIdProjet();
	modelMap.addAttribute("msg", msg);
	return "createProjet";
	}
	
	@RequestMapping("/ListeProjets")
	public String listeProjets(ModelMap modelMap)
	{
		List<Projet> spos = projetService.getAllProjets();
		modelMap.addAttribute("projetss", spos);
		return "listeProjets";
	}
	
	@RequestMapping("/supprimerProjet")
	public String supprimerProjet(@RequestParam("id") Long id,
	ModelMap modelMap)
	{
		projetService.deleteProjetById(id);
		List<Projet> spos = projetService.getAllProjets();
		modelMap.addAttribute("projets", spos);
	return "listeProjets";
	}
	
	@RequestMapping("/modifierProjet")
	public String editerProjet(@RequestParam("id") Long id,ModelMap modelMap)
	{
	Projet p= projetService.getProjet(id);
	modelMap.addAttribute("sport", p);
	return "editerProjet";
	}
	
	@RequestMapping("/updateProjet")
	public String updateProjet(@ModelAttribute("projet") Projet projet,
	@RequestParam("date") String date,
	ModelMap modelMap) throws ParseException
	{
	//conversion de la date
	SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	Date datedebut = dateformat.parse(String.valueOf(date));
	Date datefin = dateformat.parse(String.valueOf(date));
	projet.setDatedebut(datedebut);
	projet.setDatefin(datefin);
	projetService.updateProjet(projet);
	List<Projet> spos = projetService.getAllProjets();
	modelMap.addAttribute("projets", spos);
	return "listeProjets";
	}
	


}
