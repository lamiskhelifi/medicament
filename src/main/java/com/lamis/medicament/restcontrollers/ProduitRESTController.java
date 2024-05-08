package com.lamis.medicament.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lamis.medicament.entities.medicament;
import com.lamis.medicament.service.medicamentService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class medicamentRESTController {
@Autowired
medicamentService medicamentService;
@RequestMapping(method = RequestMethod.GET)
public List<medicament> getAllProduits() {
return medicamentService.getAllmedicament();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public medicament getmedicamentById(@PathVariable("id") Long id) {
return medicamentService.getmedicament(id);
 }
@RequestMapping(method = RequestMethod.POST)
public Medicament createProduit(@RequestBody Medicament medicament) {
return medicamentService.savemedicament(medicament);
}
@RequestMapping(method = RequestMethod.PUT)
public Medicament updatemedicament(@RequestBody Medicament medicament) {
return medicamentService.updatemedicament(produit);
}
@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deletemedicament(@PathVariable("id") Long id)
{
medicamentService.deletemedicamentById(id);
}
@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
public List<medicament> getmedicamentByCatId(@PathVariable("idCat") Long idCat) {
return medicamentService.findByCategorieIdCat(idCat);
}



}