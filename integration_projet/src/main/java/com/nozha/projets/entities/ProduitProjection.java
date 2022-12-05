package com.nozha.projets.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Projet.class })
public interface ProduitProjection {
	public String getNomProjet();

}
