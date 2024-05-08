package com.lamis.medicament.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categorie {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idCat;
private String nomCat;
private String descriptionCat;
@JsonIgnore
	@OneToMany(mappedBy = "categorie")
	private List<medicament> produits;
	
	
	public Categorie() {}
	public Categorie(String nomCat, String descriptionCat, List<medicament> medicament)
	{
	super();
	this.nomCat = nomCat;
	this.descriptionCat = descriptionCat;
	this.medicament = medicament;
	}
	public Long getIdCat() {
	return idCat;
	}
	public void setIdCat(Long idCat) {
	this.idCat = idCat;
	}
	public String getNomCat() {
	return nomCat;
	}
	public void setNomCat(String nomCat) {
	this.nomCat = nomCat;
	}    
	public String getDescriptionCat() {
	return descriptionCat;
	}
	
	public void setDescriptionCat(String descriptionCat) {
	this.descriptionCat = descriptionCat;
	}
	public List<medicament> getmedicament() {
	return medicament;
	}
	public void setmedicament(List<medicament> medicament) {
	this.medicament= medicament;
	} 
	
}
