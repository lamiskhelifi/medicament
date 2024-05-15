package com.lamis.medicament.dto;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProduitDTO {
	private Long idmedicament;
	private String nommedicament;
	private Double prixmedicament;
	private Date dateCreation;
	private Categorie categorie;

}
