package com.ichrak.Fleurs.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ichrak.Fleurs.entities.Categorie;
import com.ichrak.Fleurs.entities.Fleur;
import com.ichrak.Fleurs.repos.FleurRepository;
@Service
public class FleurServiceImpl  implements FleurService {
@Autowired
FleurRepository FleurRepository;

@Override
public Fleur saveFleur(Fleur p) {
	return FleurRepository.save(p);
}

@Override
public Fleur updateFleur(Fleur p) {
	return FleurRepository.save(p);
}

@Override
public void deleteFleur(Fleur p) {
	FleurRepository.delete(p);
	
}

@Override
public void deleteFleurById(Long id) {
	FleurRepository.deleteById(id);
	
}

@Override
public Fleur getFleur(Long id) {
	return FleurRepository.findById(id).get();
}

@Override
public List<Fleur> getAllFleurs() {
	return FleurRepository.findAll();
}

@Override
public List<Fleur> findByNomFleur(String nom) {
	return FleurRepository.findByNomFleur(nom);
}

@Override
public List<Fleur> findByNomFleurContains(String nom) {
	return FleurRepository.findByNomFleurContains(nom);
}

@Override
public List<Fleur> findByNomPrix(String nom, Double prix) {
	return FleurRepository.findByNomPrix(nom, prix);
}

@Override
public List<Fleur> findByCategorie(Categorie categorie) {
	return FleurRepository.findByCategorie(categorie);
}
@Override
public List<Fleur> findByCategorieIdCat(Long id) {
	return FleurRepository.findByCategorieIdCat(id);
}

@Override
public List<Fleur> findByOrderByNomFleurAsc() {
	return FleurRepository.findByOrderByNomFleurAsc();
}

@Override
public List<Fleur> trierFleursNomsPrix() {
	return FleurRepository.trierFleursNomsPrix();
	
}


}