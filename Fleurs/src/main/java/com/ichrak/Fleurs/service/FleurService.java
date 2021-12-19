package com.ichrak.Fleurs.service;
import java.util.List;

import com.ichrak.Fleurs.entities.Categorie;
import com.ichrak.Fleurs.entities.Fleur;
public interface FleurService {
	Fleur saveFleur(Fleur p);
	Fleur updateFleur(Fleur p);
	void deleteFleur(Fleur p);
	void deleteFleurById(Long id);
	Fleur getFleur(Long id);
	List<Fleur> getAllFleurs();
	List<Fleur> findByNomFleur(String nom);
	List<Fleur> findByNomFleurContains(String nom);
	List<Fleur> findByNomPrix (String nom, Double prix);
	List<Fleur> findByCategorie (Categorie categorie);
	List<Fleur> findByCategorieIdCat(Long id);
	List<Fleur> findByOrderByNomFleurAsc();
	List<Fleur> trierFleursNomsPrix();
}
