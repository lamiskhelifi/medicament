package com.example.medicament;

import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.nadhem.medicament.entities.medicament;
import com.nadhem.medicament.repos.medicamentRepository;
@SpringBootTest
class MedicamentApplicationTests {
@Autowired
private medicamentRepository medicamentRepository;
private medicamentService;

@Test
public void testCreatemedicament() {
medicament prod = new medicament("PC Dell",2200.500,new Date());
medicamentRepository.save(prod);


@Test
public void testFindmedicament()
{
	medicament p = medicamentRepository.findById(1L).get();
	System.out.println(p);
}
@Test
public void testUpdatemedicament()
{
	medicament p = medicamentRepository.findById(1L).get();
	p.setPrixmedicament(1000.0);
	medicamentRepository.save(p);
}
@Test
public void testDeletemedicament()
{
	medicamentRepository.deleteById(1L);;
}

@Test
public void testListerTousmedicament()
{
List<medicament> prods = medicamentRepository.findAll();
for (medicament p : prods)
{
System.out.println(p);
}
}
@Test
public void testFindByNomProduitContains()
{
Page<medicament> prods = medicamentService.getAllmedicamentParPage(0,2);
System.out.println(prods.getSize());
System.out.println(prods.getTotalElements());
System.out.println(prods.getTotalPages());
prods.getContent().forEach(p -> {System.out.println(p.toString());
 });
/*ou bien
for (Produit p : prods)
{
System.out.println(p);
} */
}

@Test
public void testFindByNommedicament()
{
List<medicament> prods = medicamentRepository.findByNommedicament("traitement bio");
for (medicament p : prods)
{
System.out.println(p);
}
}

@Test
public void testFindByNommedicamentContains ()
{
List<medicament> prods=medicamentRepository.findByNommedicamentContains("traitement");
for (medicament p : prods)
{
System.out.println(p);
} }


@Test
public void testfindByNomPrix()
{
List<medicament> prods = medicamentRepository.findByNomPrix("traitement bio", 1000.0);
for (medicament p : prods)
{
System.out.println(p);
}
}

@Test
public void testfindByCategorie()
{
Categorie cat = new Categorie();
cat.setIdCat(1L);
List<medicament> prods = medicamentRepository.findByCategorie(cat);
for (medicament p : prods)
{
System.out.println(p);
}
}

@Test
public void findByCategorieIdCat()
{
List<medicament> prods = medicamentRepository.findByCategorieIdCat(1L);
for (medicament p : prods)
{
System.out.println(p);
}
 }

@Test
public void testfindByOrderByNommedicamentAsc()
{
List<medicament> prods =
medicamentRepository.findByOrderByNommedicamentAsc();
for (medicament p : prods)
{
System.out.println(p);
}
}

@Test
public void testTriermedicamentNomsPrix()
{
List<medicament> prods = medicamentRepository.triermedicamentNomsPrix();
for (medicament p : prods)
{
System.out.println(p);
}
}




}
