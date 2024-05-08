package com.lamis.medicament.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class medicament {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMedicament;
	private String nomMedicament;
	private double prixMedicament;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateCreation;

	
	@ManyToOne
	private Categorie categorie;
	
	public medicament() {
		super();
		}
		public medicament(String nomProduit, Double prixProduit, Date dateCreation) {
		super();
		this.nomMedicament = nomMedicament;
		this.prixMedicament = prixMedicament;
		this.dateCreation = dateCreation;
		}
		public Long getIdMedicament() {
			return idMedicament;
			}
			public void setIdMedicament(Long idMedicament) {
			this.idMedicament = idMedicament;
			}
			public String getNomMedicament() {
			return nomMedicament;
			}
			public void setNomMedicament(String nomMedicament) {
			this.nomMedicament = nomMedicament;
			}
			public Double getPrixMedicament() {
			return prixMedicament;
			}
			public void setPrixMedicament(Double prixMedicament) {
			this.prixMedicament = prixMedicament;
			}
			public Date getDateCreation() {
			return dateCreation;
			}
			public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
			}
			@Override
			public String toString() {
			return "Medicament [idMedicament=" + idMedicament + ", nomMedicament=" +
			nomMedicament + ", prixMedicament=" + prixMedicament
			+ ", dateCreation=" + dateCreation + "]";
			}
			}
