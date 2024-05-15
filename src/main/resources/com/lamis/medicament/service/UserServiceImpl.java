package com.lamis.medicament.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.nadhem.produits.entities.Role;
import com.nadhem.produits.entities.User;
import com.nadhem.produits.repos.RoleRepository;
import com.nadhem.produits.repos.UserRepository;
@Transactional
@Service

public class UserServiceImpl  implements UserService {

	@Autowired
	UserRepository userRep;
	@Autowired
	RoleRepository roleRep;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	@Override
	public User saveUser(User user) {
	user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	return userRep.save(user);
	}
	@Override
	public User addRoleToUser(String username, String rolename) {
	User usr = userRep.findByUsername(username);
	Role r = roleRep.findByRole(rolename);
	usr.getRoles().add(r);
	return usr;
	}
	@Override
	public void deleteAllusers() {
	userRep.deleteAll();
	}
	@Override
	public void deleteAllRoles() {
	roleRep.deleteAll();
	}
	@Override
	public Role addRole(Role role) {
	return roleRep.save(role);
	}
	@Override
	public User findUserByUsername(String username) {
	return userRep.findByUsername(username);
	}
	@Autowired
	ModelMapper modelMapper;
	@Override
	public ProduitDTO convertEntityToDto(Produit produit) {
	ProduitDTO produitDTO = modelMapper.map(produit, ProduitDTO.class);
	 return produitDTO;
	 }
	Tester avec POSTMAN
	Ajouter l’attribut nomCat à la classe ProduitDTO
	private String nomCat;
	Tester avec POSTMAN
	"nomCat": null
	@Override
	public ProduitDTO convertEntityToDto(Produit medicament) {
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
	ProduitDTO medicamentDTO = modelMapper.map(Produit, medicamentDTO.class);
	 produitDTO.setIdmedicament(produit.getIdmedicament());
	 produitDTO.setNommedicament(produit.getNommedicament());
	 produitDTO.setPrixmedicament(produit.getPrixmedicament());
	 produitDTO.setDateCreation(p.getDateCreation());
	 produitDTO.setCategorie(produit.getCategorie());
	 return produitDTO;
	 @Override
	 public medicamentDTO saveProduit(medicamentDTO p) {
	  return convertEntityToDto( medicamentRepository.save(convertDtoToEntity(p)));
	 }
	 @Override
	 public ProduitDTO updatemedicament(medicamentDTO p) {
	  return convertEntityToDto(medicamentRepository.save(convertDtoToEntity(p)))
	 }

	 /*return ProduitDTO.builder()
	.idProduit(produit.getIdProduit())
	.nomProduit(produit.getNomProduit())
	.prixProduit(produit.getPrixProduit())
	.dateCreation(p.getDateCreation())
	.categorie(produit.getCategorie())
	.build();*/
	}
}
