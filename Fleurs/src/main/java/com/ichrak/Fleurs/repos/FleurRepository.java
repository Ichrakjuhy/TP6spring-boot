package com.ichrak.Fleurs.repos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ichrak.Fleurs.entities.Categorie;
import com.ichrak.Fleurs.entities.Fleur;
@RepositoryRestResource(path = "rest")
public interface FleurRepository extends JpaRepository<Fleur, Long> {
	List<Fleur> findByNomFleur(String nom);
	List<Fleur> findByNomFleurContains(String nom);
	@Query("select p from Fleur p where p.nomFleur like %?1 and p.prixFleur > ?2")
	List<Fleur> findByNomPrix (String nom, Double prix);
	@Query("select p from Fleur p where p.categorie = ?1")
	List<Fleur> findByCategorie (Categorie categorie);
	List<Fleur> findByCategorieIdCat(Long id);
	List<Fleur> findByOrderByNomFleurAsc();
	@Query("select p from Fleur p order by p.nomFleur ASC, p.prixFleur DESC")
	List<Fleur> trierFleursNomsPrix ();
}

