package com.ichrak.Fleurs.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Fleur {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idFleur;
private String nomFleur;
private Double prixFleur;
private Date dateCreation;

@ManyToOne
private Categorie categorie;


public Fleur() {
super();
}
public Fleur(String nomFleur, Double prixFleur, Date dateCreation) {
super();
this.nomFleur = nomFleur;
this.prixFleur = prixFleur;
this.dateCreation = dateCreation;
}
public Long getIdFleur() {
return idFleur;
}
public void setIdFleur(Long idFleur) {
this.idFleur = idFleur;
}
public String getNomFleur() {
return nomFleur;
}
public void setNomFleur(String nomFleur) {
this.nomFleur = nomFleur;
}
public Double getPrixProduit() {
return prixFleur;
}
public void setPrixFleur(Double prixFleur) {
this.prixFleur = prixFleur;
}
public Date getDateCreation() {
return dateCreation;
}
public void setDateCreation(Date dateCreation) {
this.dateCreation = dateCreation;
}
@Override
public String toString() {
return "Fleur [idFleur=" + idFleur + ", nomFleur=" +
nomFleur + ", prixFleur=" + prixFleur
+ ", dateCreation=" + dateCreation + "]";
}
public Categorie getCategorie() {
	return categorie;
}
public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}
}

