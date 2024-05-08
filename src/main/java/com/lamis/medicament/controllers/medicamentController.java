package com.lamis.medicament.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.lamis.produits.entities.medicament;
import com.lamis.medicament.service.medicamentService;
@Controller
public class medicamentController {
	
	@Autowired
	medicamentService medicamentService;
	 @RequestMapping("/Listemedicament")
	public String listemedicament(ModelMap modelMap)
	{
		 Page<medicament> prods = produitService.getAllmedicamenttParPage(page, size);
		 modelMap.addAttribute("medicaments", prods);
		  modelMap.addAttribute("pages", new int[prods.getTotalPages()]);
		 modelMap.addAttribute("currentPage", page);
		 return "listeMedicamentts";
	}
	 @RequestMapping("/showCreate")
	 public String showCreate(ModelMap modelMap)
	 {
	 modelMap.addAttribute("medicament", new medicament());
	 return "formProduit";
	 }
	 @RequestMapping("/saveProduit")
	 public String savemedicament(@Valid medicament produit,
	 BindingResult bindingResult)
	 {
	 if (bindingResult.hasErrors()) return "formmedicament";

	 medicamentService.saveProduit(medicament);
	 return "formProduit";
	 }

	 
	 @RequestMapping("/supprimermedicament")
	 public String supprimermedicament(@RequestParam("id") Long id,
			 ModelMap modelMap,
			 @RequestParam (name="page",defaultValue = "0") int page,
			 @RequestParam (name="size", defaultValue = "2") int size)
	 {
		 medicamentService.deletemedicamentById(id);
		 Page<medicament> prods = medicamentService.getAllmedicamentParPage(page,
				 size);
				 modelMap.addAttribute("medicaments", prods);
				 modelMap.addAttribute("pages", new int[prods.getTotalPages()]);
				 modelMap.addAttribute("currentPage", page);
				 modelMap.addAttribute("size", size);
				 return "listemedicament";
				 }
	  
	 
	 @RequestMapping("/savemedicament")
	 public String savemedicament(@ModelAttribute("medicament") medicament medicament)
	 {
	  medicamentService.savemedicament(medicament);
	 return "createMedicament";
	 }


	 @RequestMapping("/modifiermedicament")
	 public String editermedicament(@RequestParam("id") Long id,ModelMap modelMap)
	 {
     medicament p= medicamentService.getmedicament(id);
	 modelMap.addAttribute("produit", p);
	 modelMap.addAttribute("mode", "edit");
	 return "formmedicament";
	 }
	 @RequestMapping("/showCreate")
	 public String showCreate(ModelMap modelMap)
	 {
	 List<Categorie> cats = medicamentService.getAllCategories();
	 modelMap.addAttribute("medicament", new medicament());
	 modelMap.addAttribute("mode", "new");
	 modelMap.addAttribute("categories", cats);
	 return "formmedicament";
	 }
	 @RequestMapping("/modifiermedicament")
	 public String editerProduit(@RequestParam("id") Long id,ModelMap modelMap)
	 {
	 medicament p= medicamentService.getmedicament(id);
	 List<Categorie> cats = medicamentService.getAllCategories();
	 modelMap.addAttribute("medicament", p);
	 modelMap.addAttribute("mode", "edit");
	 modelMap.addAttribute("categories", cats);
	 return "formmedicament";
	 }

	
	
@RequestMapping("/myView")
public String myView()
{
return "myView";
}


}
