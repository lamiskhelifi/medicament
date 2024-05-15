package com.lamis.medicament.medicamentRESTCONTROLLER;

public class medicamentRESTCONTROLLER {
	public class ProduitRESTController {
		@Autowired
		medicamentService produitService;
		@RequestMapping(method = RequestMethod.GET)
		public List<ProduitDTO> getAllProduits() {
		return medicamentService.getAllProduits();
		}
		@RequestMapping(value="/{id}",method = RequestMethod.GET)
		public medicamentDTO getProduitById(@PathVariable("id") Long id) {
		return medicamentService.getmedicament(id);
		 }

}
