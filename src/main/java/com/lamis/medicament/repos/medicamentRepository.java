package com.lamis.medicament.repos;

import org.springframework.data.repository.JpaRepository;
import com.lamis.medicament.entities.medicament;
public interface medicamentRepository extends JpaRepository<medicament, Long> {

	public interface medicamentRepository extends JpaRepository<medicament, Long> {
		List<medicament> findByNommedicament(String nom);
		 List<medicament> findByNommedicamentContains(String nom);
		}
	@Query("select p from medicament p where p.nommedicament like %?1 and p.prixmedicament > ?2")
	List<medicament> findByNomPrix (String nom, Double prix);

	@Query("select p from medicament p where p.categorie = ?1")
	List<medicament> findByCategorie (Categorie categorie);
	
	List<medicament> findByCategorieIdCat(Long id);
	
	List<medicament> findByOrderByNommedicamentAsc();
	
	@Query("select p from medicament p order by p.nommedicament ASC, p.prixmedicament DESC")
	List<medicament> triermedicamentNomsPrix ();

	@RepositoryRestResource(path = "rest")
	public interface medicamentRepository extends JpaRepository<medicament, Long> {…

	
}
