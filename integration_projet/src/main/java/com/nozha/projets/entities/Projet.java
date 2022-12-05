package com.nozha.projets.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Projet {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idProjet;
	private String nomProjet;
	private Date datedebut;
	private Date datefin;
	private String addrese ;
	private String password ;
	@ManyToOne
	private Employe employe;

	public Projet() {
		super();
	}

	public Projet(String nomProjet, Date datedebut, Date datefin, String addrese, String password) {
		super();
		this.nomProjet = nomProjet;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.addrese = addrese;
		this.password = password;
	}

	public Long getIdProjet() {
		return idProjet;
	}

	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}

	public String getnomprojet() {
		return nomProjet;
	}

	public void setnomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public Date getDatefin() {
		return datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}

	public String getAddrese() {
		return addrese;
	}

	public void setAddrese(String addrese) {
		this.addrese = addrese;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	@Override
	public String toString() {
		return "Projet [idProjet=" + idProjet + ", nomProjet=" + nomProjet + ", datedebut=" + datedebut + ", datefin=" + datefin
				+ ", addrese=" + addrese + ", password=" + password + "]";
	}
	
	
	
	
	

}
