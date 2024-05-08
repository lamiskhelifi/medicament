package com.lamis.medicament.service;

import java.util.List;

import com.lamis.medicament.entities.Categorie;
import com.lamis.medicament.entities.medicament;
public interface medicamentService {
	medicament savemedicament(medicament p);
	medicament updatemedicament(medicament p);
	void deletemedicament(medicament p);
	void deletemedicamentById(Long id);
	medicament getmedicament(Long id);
	List<medicament> getAllmedicament();
	List<medicament> findByNommedicament(String nom);
	List<medicament> findByNommedicamentContains(String nom);
	List<medicament> findByNomPrix (String nom, Double prix);
	List<medicament> findByCategorie (Categorie categorie);
	List<medicament> findByCategorieIdCat(Long id);
	List<medicament> findByOrderByNommedicamentAsc();
	List<medicament> triermedicamentNomsPrix();
	List<Categorie> getAllCategories();
	}

	
@Override
public List<medicament> findByNommedicament(String nom) {
return medicamentRepository.findByNommedicament(nom);
}
@Override
public List<medicament> findByNommedicamentContains(String nom) {
return medicamentRepository.findByNommedicamentContains(nom);
}
@Override
public List<medicament> findByNomPrix(String nom, Double prix) {
return medicamentRepository.findByNomPrix(nom, prix);
}
@Override
public List<medicament> findByCategorie(Categorie categorie) {
return medicamentRepository.findByCategorie(categorie);
}
@Override
public List<medicament> findByCategorieIdCat(Long id) {
return medicamentRepository.findByCategorieIdCat(id);
}
@Override
public List<medicament> findByOrderByNommedicamentAsc() {
return medicamentRepository.findByOrderByNommedicamentAsc();
}
@Override
public List<medicament> triermedicamentNomsPrix() {
return medicamentRepository.triermedicamentNomsPrix();
}
@Autowired
CategorieRepository categorieRepository;
@Override
public List<Categorie> getAllCategories() {
return categorieRepository.findAll();
}
}