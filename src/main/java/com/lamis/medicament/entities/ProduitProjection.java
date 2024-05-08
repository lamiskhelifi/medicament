package com.lamis.medicament.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomProd", types = { medicament.class })
public interface medicamentProjection {
public String getNommedicament();
} 
