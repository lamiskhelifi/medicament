package com.lamis.medicament.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.nadhem.produits.entities.Produit;
import com.nadhem.produits.repos.ProduitRepository;

@Service
public class medicamentServiceImpl implements ProduitService{
	@Autowired
	medicamentRepository medicamentRepository;
	@Override
	public medicament savemedicament(medicament p) {
	return medicamentRepository.save(p);
	
	}
	@Override
	public medicament updatemedicament(medicament p) {
	return medicamentRepository.save(p);
	}
	@Override
	public void deletemedicament(medicament p) {
		medicamentRepository.delete(p);
	}
	 @Override
	public void deletemedicamentById(Long id) {
		 medicamentRepository.deleteById(id);
	}
	@Override
	public medicament getmedicament(Long id) {
	return medicamentRepository.findById(id).get();
	}
	@Override
	public List<medicament> getAllmedicament() {
	return medicamentRepository.findAll();
	}
	@Override
	public Page<medicament> getAllmedicamentParPage(int page, int size) {
	return medicamentRepository.findAll(PageRequest.of(page, size));
	}


	
}
