package com.lamis.medicament.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lamis.medicament.entities.Categorie;
public interface CategorieRepository extends JpaRepository<Categorie, Long>
{
}
